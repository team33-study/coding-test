package after_study.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class Day1_1 {
    public static void main(String[] args) throws IOException {
        //baekjoon 1747: 소수&팰린드롬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        int[] num_arr = new int[num * 10];
        for (int i = 0; i < num_arr.length; i++) {
            num_arr[i] = i;
        }
//        int[] prim_num = new int[num];
//        int cnt = 0;
//        int[] palindrom_num = new int[num];
//        int cnt_pal = 0;
        for (int i = 2; i < num_arr.length; i++) {
            if (num_arr[i] != 0){
//                prim_num[cnt++] = num_arr[i];
//                if (num_reverse(prim_num[cnt-1]) == prim_num[cnt-1]){
//                    palindrom_num[cnt_pal++] = prim_num[cnt-1];
//                    if (palindrom_num[cnt_pal-1] >=num){
//                        System.out.println(palindrom_num[cnt_pal-1]);
//                    }
//                }
                if (num_reverse(num_arr[i]) == num_arr[i] && num_arr[i] >= num){
                    //팰린드롬인 소수 확인, 입력한 수보다 큰지 확인
                    System.out.println(num_arr[i]);
                    return;
                }
                for (int j = 2; j < num_arr.length / num_arr[i]; j++) {//에라토스테네스의 체
                    num_arr[j*num_arr[i]] = 0;
                }
            }
        }
    }
    public static int num_reverse(int num){
        int reverse_num = 0;
        while(num != 0){
            reverse_num *=10;
            reverse_num += num%10;
            num /= 10;
        }
        return reverse_num;
    }
}
