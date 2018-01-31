/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfassignment;

/**
 *
 * @author INT102
 */
public class Answer {
    public static void main(String[] args) {
        int[] score = {100, 30, 60, 1, 80};
        int[] scoreOutRange={-1, 1, 3, 50};
        int[] score2 = {2,1,0,50};
        int [] result = findMinMax(scoreOutRange);
        System.out.println(result);
    }
    public static int[] findMinMax (int[]score)    {
        int[]result = new int[2];
        int min =score[0];
        int max = score[0];
        for(int i=0;i<score.length;i++){
            if(score[i]<0 || score[i]>100){
                return null;
            }else{
                if(score[i]<min){
                    min = score[i];
                }
                if(max<score[i]){
                    max=score[i];
                }
            }
        }
        result[0]= min;
        result[1]= max;
        return result;
    }
}
