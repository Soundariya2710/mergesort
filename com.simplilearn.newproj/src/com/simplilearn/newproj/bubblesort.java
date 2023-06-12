package com.simplilearn.newproj;

public class bubblesort {

	static void print (int a[]) //function to print array elements  
    {  
        int n = a.length;  
        int i;  
        for (i = 0; i < n; i++)  
        {  
            System.out.print(a[i] + " ");  
        }         
    }  
    static void bubbleSort (int a[])    // function to implement bubble sort  
    {  
        int n = a.length;  
        int i, j, temp;  
        for (i = 0; i < n; i++)  
        {  
            for (j = i + 1; j < n; j++)  
            {  
                if (a[j] < a[i])  
                {  
                    temp = a[i];  //12  10::: temp=12
                    a[i] = a[j];  //10
                    a[j] = temp;  //10  12
                }  
            }  
        }  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {35, 10, 31, 11, 26};    
	    Bubble b1 = new Bubble();  
	    System.out.println("Before sorting array elements are - ");    
	    b1.print(a);  
	    b1.bubbleSort(a);  
	    System.out.println();  
	    System.out.println("Before sorting array elements are - ");    
	    b1.print(a);  
	    b1.bubbleSort(a);  
	    System.out.println();  
	    System.out.println("After sorting array elements are - ");    
	    b1.print(a);  
	        
	}    
	} 
	}

}
