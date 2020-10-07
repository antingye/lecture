package com.ldan.antingye.insert;

import com.ldan.antingye.utils.NumberUtils;

import java.util.Arrays;

import static com.ldan.antingye.constant.SortConstants.RANGE;
import static com.ldan.antingye.constant.SortConstants.SIZE;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = NumberUtils.getArray(SIZE, RANGE);
        System.out.println(Arrays.toString(sort(array)));
    }

    /**
     * 插入排序
     *
     * @param array 待排序数组
     * @return array
     */
    public static int[] sort(int[] array) {
        int temp;
        for (int i =1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }
}

