package Searching_Techniques;
import java.util.*;
public class linear_search {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("LINEAR SEARCH");
			//Get the number of elements in the array
			System.out.print("Enter the number of elements in the array:");
			
			int n = sc.nextInt();
			try {
			boolean found = false;//element to check
			int index = 0; //To store the index of found element
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
			System.out.println();
			//Get the element to be searched in the array
			System.out.print("Enter the element to be searched in the array: ");
			int search = sc.nextInt();
			System.out.println();
			//searching and displaying the index of the searched element
			for(int i = 0; i<n;i++) {
				if(search == arr[i]) {
					found =true;
					index = i;
				}
			}
			
			if(found) {
				System.out.print("The found element is in the index "+index);
			}else {
				System.out.print("The element given does not exist in the array");
			}
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
