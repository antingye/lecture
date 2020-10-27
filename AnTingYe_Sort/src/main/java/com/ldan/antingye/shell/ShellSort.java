package com.ldan.antingye.shell;

import com.ldan.antingye.utils.NumberUtils;

import java.util.Arrays;

import static com.ldan.antingye.constant.SortConstants.RANGE;
import static com.ldan.antingye.constant.SortConstants.SIZE;

/**
 * 希尔排序-插入排序升级版 不稳定,但效率比插排要高
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] array = NumberUtils.getArray(SIZE, RANGE);
        System.out.println(Arrays.toString(sort(array)));

    }
    
    public static int[] sort(int[] array) {
        for (int gap = array.length /2; gap > 0 ; gap /= 2) {
            // 插入排序逻辑,
            for (int i = gap; i < array.length; i+=gap) {
                for (int j = i; j > gap -1 ; j-=gap) {
                    if (array[j] < array[j-gap]) {
                        int temp = array[j];
                        array[j] = array[j-gap];
                        array[j-gap] = temp;
                    }
                }

            }
        }
        return array;
    }
}
