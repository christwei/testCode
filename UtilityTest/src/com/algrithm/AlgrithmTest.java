package com.algrithm;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class AlgrithmTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    
	    
        
	    int[] arr = {15,12,126,17,10,32};
		//bubbleSort(arr);
		//OptimizedBubbleSort(arr);
	    optionSort(arr);
	    //int[] arr1 = {12, 15, 17, 10, 32, 126}; 
	    //stepwiseSort(arr1);
	}
	
	/**
     * 未经过优化
     * 
     */
	static void bubbleSort(int[] array) {
		
		int temp;
		int[] tempArr = array.clone();
		for (int i = 0; i < array.length; i++) {
		    System.out.println(Arrays.toString(tempArr)+"第"+String.valueOf(i+1)+"次比较---------------------------------");
			for (int j = 0 ;j < array.length-1; j++) {
				if (array[j+1] < array[j]) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
				System.out.println(Arrays.toString(array));
			}
			
		}
		
	}
	
	/**
     * 经过优化冒泡排序
     * 
     */
	static void OptimizedBubbleSort(int[] array) {
	    int temp;
	    int[] tempArr = array.clone();
	    
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(tempArr.clone())+"第"+String.valueOf(i+1)+"次比较---------------------------------");
            for (int j = 0 ;j < array.length-1-i; j++) {
                if (array[j+1] < array[j]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
                System.out.println(Arrays.toString(array));
            }
        }
	}
	
	// 逐步分解
	static void stepwiseSort(int[] array) {
	    int i = 0;
	    int temp;
	    if (array[i+1] < array[i]) {
            temp = array[i+1];
            array[i+1] = array[i];
            array[i] = temp;
        }
	    
	    i++;
	    
	    System.out.println(Arrays.toString(array));
	    
	    if (array[i+1] < array[i]) {
            temp = array[i+1];
            array[i+1] = array[i];
            array[i] = temp;
        }
	    
        i++;
        
        System.out.println(Arrays.toString(array));
        
        if (array[i+1] < array[i]) {
            temp = array[i+1];
            array[i+1] = array[i];
            array[i] = temp;
        }
         i++;
        
        System.out.println(Arrays.toString(array));
        
        if (array[i+1] < array[i]) {
            temp = array[i+1];
            array[i+1] = array[i];
            array[i] = temp;
        }
        i++;
        
        System.out.println(Arrays.toString(array));
	    
        if (array[i+1] < array[i]) {
            temp = array[i+1];
            array[i+1] = array[i];
            array[i] = temp;
        }
        
         i++;
        
        System.out.println(Arrays.toString(array));
        
        
        System.out.println("分割线--------------------------");
        
	}
	
	// 选择排序
    static void optionSort(int[] array) {
           int  index;
           
           for (int i = 1; i < array.length; i++) {
               System.out.println("第"+String.valueOf(i)+"次比较---------------------------------");
               index = 0;
               
               for (int j = 1; j <= array.length - i; j++) {
                   if (array[j] > array[index]) {
                       index = j;
                   }
               }
               
               // 交换当前最后一个数[array.length - i]与最大值[index]的位置
               int temp = array[array.length - i];
               array[array.length - i] = array[index];
               array[index] = temp;
               
               System.out.println(Arrays.toString(array));
               
           }
    }
}
