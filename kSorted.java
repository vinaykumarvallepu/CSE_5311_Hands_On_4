import java.util.*; 

class kSorted{ 
	static final int N = 4; 

	
	static void mergeArrays(int arr1[], int arr2[], int N1, 
							int N2, int arr3[]) 
	{ 
		int i = 0, j = 0, k = 0; 

		while (i < N1 && j < N2) { 
			
			if (arr1[i] < arr2[j]) 
				arr3[k++] = arr1[i++]; 
			else
				arr3[k++] = arr2[j++]; 
		} 

		while (i < N1) 
			arr3[k++] = arr1[i++]; 

		
		while (j < N2) 
			arr3[k++] = arr2[j++]; 
	} 

	static void printSorted(int arr[], int size) 
	{ 
		for (int i = 0; i < size; i++) 
			System.out.print(arr[i] + " "); 
	} 

	
	static void KArrays(int arr[][], int i, int j, 
							int output[]) 
	{ 
		if (i == j) { 
			for (int p = 0; p < N; p++) 
				output[p] = arr[i][p]; 
			return; 
		} 

		if (j - i == 1) { 
			mergeArrays(arr[i], arr[j], N, N, output); 
			return; 
		} 

		int[] out1 = new int[N * (((i + j) / 2) - i + 1)]; 
		int[] out2 = new int[N * (j - ((i + j) / 2))]; 

		 
		KArrays(arr, i, (i + j) / 2, out1); 
		KArrays(arr, (i + j) / 2 + 1, j, out2); 

		
		mergeArrays(out1, out2, N * (((i + j) / 2) - i + 1), 
					N * (j - ((i + j) / 2)), output); 
	} 

	
	public static void main(String[] args) 
	{ 

		int arr[][] = { { 1,3,5,7}, 
						{ 2,4,6,8}, 
						{ 0,9,10,11} }; 

		int K = arr.length; 
		int[] output = new int[N * K]; 

		KArrays(arr, 0, 2, output); 

		System.out.print("Merged and Sorted array is "+ "\n"); 
        printSorted(output, N * K); 
	} 
} 


