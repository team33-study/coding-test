package 윤성혁;

public class K번째수 {
    public int solution(int[][] arr, int k) {
        int answer = 0;
        int temp[] = new int[16];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                temp[sum]+= arr[i][j];
                sum++;
            }
        }

        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp.length; j++){
                if(temp[i] < temp[j]){
                    int temp2 = temp[i];
                    temp[i] = temp[j];
                    temp[j] = temp2;
                }
            }
        }
        return answer = temp[k-1];
    }


}
