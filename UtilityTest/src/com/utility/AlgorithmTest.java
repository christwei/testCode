package com.utility;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author Administrator
 * 基本算法实验
 */
public class AlgorithmTest {

    static Logger log = Logger.getLogger("mylog");  
	/**
	 * @param args
	 * 求m个数中最大的n个数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    log.setLevel(Level.INFO); 
	    log.info(System.getProperty("user.home"));
		max5InArrays();
		OptimizeMax5InArrays(100,10);
		
		bucketSorting(30);
	}

	/**
	 * 原型方法
	 * 求m个数中最大的n个数
	 */
	static void max5InArrays(){
		int[] numbers = new int[50];
		
		for (int i = 0; i < 50; i++) {
			Random random = new Random();
			numbers[i] = random.nextInt(100);
			System.out.println("随机数组i："+numbers[i]);
			log.info("随机数组i："+numbers[i]);
		}
		
		//int[] max5 = {0,0,0,0,0};
		ArrayList<Integer> max5List = new ArrayList<Integer>();
		max5List.add(0);
		max5List.add(0);
		max5List.add(0);
		max5List.add(0);
		max5List.add(0);
		//System.out.println("随机数组："+Arrays.asList(numbers).);
        int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (temp < numbers[i]) {
					temp = numbers[i];
					max5List.set(0, temp);
			}
		}
		temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (temp < numbers[i] && !max5List.contains(numbers[i])) {
					temp = numbers[i];
					max5List.set(1, temp);
			}
		}
		
		temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (temp < numbers[i] && !max5List.contains(numbers[i])) {
					temp = numbers[i];
					max5List.set(2, temp);
			}
		}
		
		temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (temp < numbers[i] && !max5List.contains(numbers[i])) {
					temp = numbers[i];
					max5List.set(3, temp);
			}
		}
		
		temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (temp < numbers[i] && !max5List.contains(numbers[i])) {
					temp = numbers[i];
					max5List.set(4, temp);
			}
		}
		
		/*
		for (int i = 0; i < numbers.length; i++) {
			if (temp < numbers[i]) {
				for (int j = 0; j < max5.length-1; j++ ) {
					if (numbers[i] != max5[j]) {
						temp = numbers[i];
						max5[j] = temp;
					}
				}
			}
		}
		*/
		System.out.println("五个最大值之一："+max5List.get(0));
		System.out.println("五个最大值之二："+max5List.get(1));
		System.out.println("五个最大值之三："+max5List.get(2));
		System.out.println("五个最大值之四："+max5List.get(3));
		System.out.println("五个最大值之五："+max5List.get(4));
	}
	
	/**
	 * 优化方法
	 * 求m个数中最大的n个数
	 */
	static void OptimizeMax5InArrays(int m, int n){
		int[] numbers = new int[m];
		
		Random random = new Random();
		for (int i = 0; i < m; i++) {
			
			numbers[i] = random.nextInt(100);
			//System.out.println("随机数组i："+numbers[i]);
		}
		
		//int[] max5 = {0,0,0,0,0};
		ArrayList<Integer> max5List = new ArrayList<Integer>();
		
		for (int j = 0; j < n; j++) {
			max5List.add(0);
		}
		
		//System.out.println("随机数组："+Arrays.asList(numbers).);
		int temp = 0;
		for (int j = 0; j < n; j++) {
        
			for (int i = 0; i < numbers.length; i++) {
				if (temp < numbers[i] && !max5List.contains(numbers[i])) {
						temp = numbers[i];
				}
			}
			max5List.set(j, temp);
			temp = 0;
		}
		
		System.out.println("五个最大值之一："+max5List.get(0));
		System.out.println("五个最大值之二："+max5List.get(1));
		System.out.println("五个最大值之三："+max5List.get(2));
		System.out.println("五个最大值之四："+max5List.get(3));
		System.out.println("五个最大值之五："+max5List.get(4));
	}
	
	/*
	 * 前提为在有序数组中查找
	 *
	 * 
	 */
	static int binarySearchinArrays(int v){
        int[] numbers = new int[50];
        Random random = new Random();
		for (int i = 0; i < 50; i++) {
			
			numbers[i] = i;
		}
		
		int begin=0;
		int end=numbers.length-1;
		while(begin <= end) {
			int mid = (begin+end)/2;
			if (numbers[mid] - v == 0 ) {
				return mid;
			}else if (numbers[mid] - v > 0) {
				end = mid-1;
			} else {
				begin = mid+1;
			}
			
		}
		return -1;
		
	}
	
	/**
	 * 桶排序
	 * @param size
	 */
	static void bucketSorting(int size) {
	    int[] numbers = new int[size];
        
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            
            numbers[i] = random.nextInt(size);
            //System.out.println("随机数组i："+numbers[i]);
        }
        
        System.out.println(Arrays.toString(numbers));
        int[] buckets = new int[50];
        //for(int i = 0; i < 50; i++) {
            for (int j = 1; j <= size; j++) {
                buckets[numbers[j-1]]++;
         //   }
        }
        
        System.out.println(Arrays.toString(buckets));

        int[] finalArrays = new int[size];
        
        int index=0;
        for (int m=0; m<size; m++) {
            for (int n=0; n <buckets[m]; n++) {
                //finalArrays[n]=m;
                //System.out.println("m="+m);
                finalArrays[index]=m;
                index++;
            }
        }
        
        System.out.println(Arrays.toString(finalArrays));
	}
}
