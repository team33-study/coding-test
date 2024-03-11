package 박상용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day1_2 {
    public static void main(String[] args) throws IOException {
        //baekjoon 1652: 누울 자리를 찾아라
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //입력받기
        int num = Integer.parseInt(st.nextToken());
        String[] map = new String[num];
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            map[i] = st.nextToken();
        }
        StringBuilder sb = new StringBuilder();
        String[] rotate_map = new String[num];
        // x,y좌표 교환형식의 회전하여 세로 비교할 map생성
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                sb.append(map[j].charAt(i));
            }
            rotate_map[i] = sb.toString();
            sb.delete(0,sb.capacity());
        }
        int row = 0;
        int col = 0;
        //split으로 각 열을 분할 하여 2이상의 크기면 누울 수 있다고 판단.
        for (int i = 0; i < num; i++) {
            String[] str = map[i].split("X");
            for (int j = 0; j < str.length; j++) {
                if (str[j].length()>=2){
                    row++;
                }
            }
        }
        for (int i = 0; i<num;i++){
            String[] str = rotate_map[i].split("X");
            for (int j = 0; j < str.length; j++) {
                if (str[j].length()>=2){
                    col++;
                }
            }
        }
        System.out.println(row + " "+col);
    }
}
