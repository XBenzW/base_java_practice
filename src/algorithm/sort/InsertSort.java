package algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description
 * @author XBen
 * @date 2021-03-03
 */
public class InsertSort {
    public static int[] insertSort(int array[]){
        for(int i=1;i< array.length;i++){
            int preIndex = i-1;
            int current  = array[i];
            while(preIndex>=0&&array[preIndex]>current){
                array[preIndex+1] = array[preIndex];
                preIndex --;
            }
            array[preIndex+1 ] = current;
        }
        return  array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        for(int i=0;i<num;i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("排序前数组为："+ Arrays.toString(array));
        System.out.println("排序后数组为："+Arrays.toString(insertSort(array)));
    }

}
