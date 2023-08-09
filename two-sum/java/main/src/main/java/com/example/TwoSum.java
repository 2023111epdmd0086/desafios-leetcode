package com.example;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public Integer[] getSum(Integer[] nums, Integer target) {
        List<Integer> posicoesNumeros = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        posicoesNumeros.add(i);
                    }
                }
            }
        }
        return posicoesNumeros.toArray(new Integer[posicoesNumeros.size()]);
    }

}
