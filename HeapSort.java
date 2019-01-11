package sort;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {		
		int[] arr={4,10,3,5,1};
		Maxheapsort(arr,arr.length); // Calling the heap sort function
		System.out.println("Heap Sort:"); //printing the sorted array
		for(int i=0;i<arr.length-1;i++) 
			System.out.print(i+",");
		System.out.print(arr[arr.length-1]);
		
	}
	public static void Maxheapsort(int[] arr,int length)
	{
		if(length<=1) return ;
		
		heaping(arr,length,0); //steps from i till iv
		
		int temp=arr[length-1]; //swapping of point v
		arr[length-1]=arr[0];
		arr[0]=temp;
		
		Maxheapsort(arr,length-1); // step 2
	}
	public static void heaping(int[] arr,int length,int i)
	{
		if(length-i<=2) return ;
		int maxIndex=(arr[i+1]>arr[i+2])?i+1:i+2;
		if(arr[maxIndex]>arr[i])
		{
			int temp=arr[maxIndex];
			arr[maxIndex]=arr[i];
			arr[i]=temp;
		}
		heaping(arr,length,maxIndex);
	}
}
