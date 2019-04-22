package com.upupfeng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给出两个数组，一个较长，一个较短，返回长的比短的多出来的数据
 * 场景：工作中，丢数据时，通过比较id查看丢了哪些数据
 * @Date: 2019/4/22 10:02
 */
public class DifferentBetweenTwoArray {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {3,4};
        printDifferent(arr1,arr2);
    }

    public static void printDifferent(Integer[] arr1, Integer[] arr2){
        Integer[] a1,a2;
        if(arr1.length > arr2.length ){
            a1 = arr1;
            a2 = arr2;
        }else{
            a1 = arr2;
            a2 = arr1;
        }

        List a = Arrays.asList(a2);
        List res = new ArrayList<Integer>();

        for (int tmp : a1){
            if(!a.contains(tmp)){
                res.add(tmp);
            }
        }

        res.stream().forEach( tmp -> System.out.println(tmp));


    }


}
