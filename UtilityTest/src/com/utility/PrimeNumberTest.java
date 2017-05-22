package com.utility;

import java.util.BitSet;

public class PrimeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1000;
		BitSet b = new BitSet(1001);
		int count = 0;
		int i;
		for (i=2; i <= n; i++)  {
			b.set(i);
		}
		
		i=2;
		while (i*i <= n) {
			if (b.get(i)) {
				System.out.println(n+"以内的质数："+i);
				count++;
				int k=2*i;
				while(k <= n){
					b.clear(k);
					k+=i;
				}
			}
			
			i++;
		}
		
		
		
		while (i <= n) {
			if (b.get(i)) {
				System.out.println(n+"以内的质数："+i);
				count++;
			}
			i++;
		}
	}

}
