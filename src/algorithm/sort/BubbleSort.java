package algorithm.sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description  冒泡排序
 * @author XBen
 * @Date 2021-03-03 00：00:00
 */
public class BubbleSort {
    public static  int[] bubbleSortMethod(int[] array ){
        for(int i=0;i< array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp  = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
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
        System.out.println("排序后数组为："+Arrays.toString(bubbleSortMethod(array)));
    }



}
