package lab;

public class Runner {

	public static void main(String[] args) {
		
		int[][] arr1 = ArrayAnalysis.createRandom(6, 3, -2, 10);
		int[][] arr2 = ArrayAnalysis.createRandom(3, 5, -4, 15);
		
		System.out.println("Array 1");
		ArrayAnalysis.printArray(arr1);
	
		System.out.println("Sum Total: " + ArrayAnalysis.sumTotal(arr1));
		System.out.println("Average: " + ArrayAnalysis.average(arr1));
		System.out.println("Min: " + ArrayAnalysis.findMin(arr1));
		System.out.println("Max: " + ArrayAnalysis.findMax(arr1));
		System.out.println();

		System.out.println("Array 2");
		ArrayAnalysis.printArray(arr2);

		System.out.println("Sum Total: " + ArrayAnalysis.sumTotal(arr2));
		System.out.println("Average: " + ArrayAnalysis.average(arr2));
		System.out.println("Min: " + ArrayAnalysis.findMin(arr2));
		System.out.println("Max: " + ArrayAnalysis.findMax(arr2));
		System.out.println();

		System.out.println("The different between the two arrays is: ");
		int[][] dif = ArrayAnalysis.diffArrays(arr1, arr2);
		if(dif == null) {
			System.out.print("null (Arrays are not the same size)");
		} else {
			ArrayAnalysis.printArray(dif);
		}
		System.out.println();

		System.out.println("Moving the array around");
		ArrayAnalysis.transposeRow(arr1, 3);
		ArrayAnalysis.printArray(arr1);
		System.out.println();

		int[][][] arr3D = new int[3][4][5];
		for (int i = 0; i < arr3D.length; i++) {
			arr3D[i] = ArrayAnalysis.createRandom(4, 5, -40, 40);
		}

		System.out.println("Sum of the 3D array: " + ArrayAnalysis.sum3D(arr3D));
		System.out.println("Average of the 3D array: " + ArrayAnalysis.average3D(arr3D));

		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
