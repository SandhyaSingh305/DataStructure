package sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){
        int[] ar = {2,1,4,3,6,3,7,4,21,20};
        int[] ar1 = {9,8,7,6,5,4,3,2,1,21,23,41,22};
        int temp=0;
        for(int i=0;i<ar1.length;i++){
            System.out.println(Arrays.toString(ar1));
            for(int j=0;j<ar1.length-1-i;j++){
                if(ar1[j]>ar1[j+1]){
                  temp = ar1[j+1];
                  ar1[j+1] = ar1[j];
                  ar1[j] = temp;
                }
            }

        }
    }

}
