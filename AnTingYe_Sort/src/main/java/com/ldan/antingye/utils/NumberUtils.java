package com.ldan.antingye.utils;

import java.util.Random;

/**
 * 随机数组产生类
 */
public class NumberUtils {

    /**
     *
     *
     * @param size 数组大小
     * @param range 数据范围
     * @return array
     */
    public static int[] getArray(Integer size,Integer range) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(range);
        }
        return array;
    }
}
