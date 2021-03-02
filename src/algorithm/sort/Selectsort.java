package algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description  选择排序
 * @author Xben
 * @Date 2021-03-03
 */
public class Selectsort {
    public static int[] selectSort(int []array){
        for(int i=0;i< array.length-1;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i] ;
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        for(int i=0;i<num;i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("排序前数组为："+ Arrays.toString(array));
        System.out.println("排序后数组为："+Arrays.toString(selectSort(array)));
    }
}
