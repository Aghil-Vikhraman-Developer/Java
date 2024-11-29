package Sorting_Techniques;

//SELECTION SORT
/*
 * 
 * COMPLEXITY
 * TIME : O(n^2)
 * SPACE : O(n)
 */
import java.util.*;
public class bubble_sort {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			try {
				System.out.println("BUBBLE SORT");
				//Get the number of elements in the array
				System.out.print("Enter the number of elements in the array:");
				int n = sc.nextInt();
				//Initialization if the array
				int[] arr = new int[n];
				System.out.println();
				
				//Getting the data for the array
				System.out.print("Enter the data into the array: ");
				for(int i = 0; i<n;i++) { 
					arr[i] = sc.nextInt();
				}
				System.out.println();
				
				//Displaying elements in the array
				System.out.print("Elements in the array: ");
				for(int i = 0; i<n;i++) { 
					System.out.print(arr[i]+" ");
				}
				
				//sorting the elements
				for(int i = 0 ; i<n;i++) {
					for(int j = 0;j<n-1;j++) {
						if(arr[j]<arr[j+1]) {
							//Swapping
							int temp = arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;
						}
					}
				}
				
				System.out.println();
				System.out.println("After Sort");
				for(int i = 0; i<n;i++) { 
					System.out.print(arr[i]+" ");
				}
			}catch(Exception e) {
				
			}
		}
	}
}
