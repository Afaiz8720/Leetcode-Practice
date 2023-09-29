package DAY-1 ;

import java.util.Arrays ;
public class arrayNumsSquare
{
  public static int[] solution(int[] arr){
        int[] ans = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            ans[i] = arr[i] * arr[i];
        }
        Arrays.sort(ans);
        return ans ;
    }
    public static void main(String[] args){
        int[] arr = {-4, -1, 0, 3, 10};
        
        int[] answer = solution(arr);
        for (int i = 0 ; i < answer.length ; i++ ){
            System.out.print(answer[i] + " ");
        } 
    }

}