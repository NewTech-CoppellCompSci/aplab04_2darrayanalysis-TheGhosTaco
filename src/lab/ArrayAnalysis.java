package lab;

/*
 * See the link for lab explanation
 * https://docs.google.com/document/d/1QGhcNy-QOFT-J1rOHgeXKv81b5yz0LfEpL_Dl3PPff8/edit#
 * 
 * 
 */

public class ArrayAnalysis {

	
	//#1
	public static int[][] createRandom(int row, int column, int min, int max){
		int[][] array = new int[row][column];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				array[i][j] = (int)(Math.random() * (max - min));
			}
		}

		return array;
	}
	
	
	//#2
	public static void printArray(int[][] arr)  {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	
	}
	
	
	//#3
	public static int sumTotal(int[][] arr) {
	
		int sumTotal = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sumTotal += arr[i][j];
			}
		}
		
		return sumTotal;
	}
	
	
	//#4
	public static double average(int[][] arr) {
		
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length;) {
				return (double)sumTotal(arr) / (arr.length * arr[i].length);
			}
		}
		
		return 0;
	}
	
	
	//#5
	public static int findMin(int[][] arr) {
		int min = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}
	
	
	//#6
	public static int findMax(int[][] arr) {
		
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
		
	}
	
	
	//#7
	public static int[][] diffArrays(int[][] arr1, int[][] arr2){
		
		if(arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
			return null;
		}

		// Run the code if the arrays are the same size
		int[][] diff = new int[arr1.length][arr1[0].length];
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				if(arr1[i][j] > arr2[i][j]) {
					diff[i][j] = arr1[i][j] - arr2[i][j];
				}
				else {
					diff[i][j] = arr2[i][j] - arr1[i][j];
				}
			}
		}

		return diff;
	}
	
	
	//#8
	public static int[][] transposeRow(int[][] arr1, int dist){
		
		int[][] transposed = arr1.clone();
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				transposed[i][j] = arr1[(i+ dist) % arr1[i].length][j];
			}
		}


		return transposed;
	}
	
	
	//#9
	public static int sum3D(int[][][] arr) {
		
		int sum = 0;

		for(int i = 0; i < arr.length; i++) {
			sum += sumTotal(arr[i]);
		}

		return sum;
	}
	
	
	//#10
	public static double average3D(int[][][] arr) {
		
		double average3D = (double) sum3D(arr);
		int length = 0;

		length += arr.length;
		length *= arr[0].length;
		length *= arr[0][0].length;
		
		return average3D / length;
	}
	
	
	
	
	
	
}
