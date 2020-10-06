package com.ldan.antingye.select;

import com.ldan.antingye.utils.NumberUtils;

import java.util.Arrays;

import static com.ldan.antingye.constant.SortConstants.RANGE;
import static com.ldan.antingye.constant.SortConstants.SIZE;

/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = NumberUtils.getArray(SIZE, RANGE);
        System.out.println(Arrays.toString(sort(array)));
    }

    /**
     * 选择排序
     * @param array 待排序数组
     * @return array
     */
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    //最小值一直在变化,上面条件不能写成 if (array[i] > array[j]);
                    index = j;
                }
            }
            int temp =array[index];
                array[index] = array[i];
                array[i] = temp;
        }
        return array;
    }
}
