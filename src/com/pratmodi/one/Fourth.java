package com.pratmodi.one;

public class Fourth {

	public static void main(String[] args) {

		char[] s = {'#','#','#','#'};
		for(char s1:s) {
			System.out.print(s1);
		}
		System.out.println();
		for(int i=0;i<s.length-1;i++) {
			if(i==0) {
				s[i] = String.valueOf(s).replace('#','*').charAt(i);
				for(char s1:s) {
					System.out.print(s1);
				}
				System.out.println();
				continue;
			}else if(i==1) {
				s[i] =String.valueOf(s).replace('#','*').charAt(i);
				for(char s1:s) {
					System.out.print(s1);
				}
				System.out.println();
				continue;
				
			}else if(i==2) {
				s[i] =String.valueOf(s).replace('#','*').charAt(i);
				for(char s1:s) {
					System.out.print(s1);
				}
				System.out.println();
				continue;
			}
		}
		
	}

}
