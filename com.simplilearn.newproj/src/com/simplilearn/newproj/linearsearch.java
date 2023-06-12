package com.simplilearn.newproj;

public class linearsearch {

	
	static	int  LinearSearch1(int a[], int val) {  
			for (int i = 0; i < a.length; i++)  
			    {  
			        if (a[i] == val)  
			        return i;  
			    }  
			  return -1;  
			}  
			public static void main(String args[]){ 
				//LinearSearch1 ls=new LinearSearch1();
			  int a[] = {70, 40, 30, 11, 57, 41, 25, 14, 52}; // given array  
			  int val = 41; // value to be searched  
			   int res = LinearSearch1(a,val); // Store result  
				
			  if (res == -1)  
			  System.out.println("Element is not present in the array");  
			  else  
			  System.out.println("Element is present at  " +res+ "  position ");  
			 
			
			}

	}


