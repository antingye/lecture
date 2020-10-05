package com.ldan.antingye.bubble;

import com.ldan.antingye.utils.NumberUtils;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    private static final Integer SIZE = 50;
    private static final Integer RANGE = 1000;

    public static void main(String[] args) {
        int[] array = NumberUtils.getArray(SIZE, RANGE);
        System.out.println(Arrays.toString(sort(array)));
    }

    /**
     * 冒泡排序
     *
     * @param array 待排序数组
     * @return 返回值
     */
    public static int[] sort(int[] array) {
        // 中间临时变量
        Integer temp;
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
