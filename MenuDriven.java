import java.util.*;

class MenuDriven
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int row, col;
		System.out.print("Enter row and col in one line: ");
		row = Integer.parseInt(sc.next());
		col = Integer.parseInt(sc.next());
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];

		System.out.print("Enter value of arr1 in one line: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr1[i][j] = Integer.parseInt(sc.next());
			}
		}

		System.out.print("Enter value of arr2 in one line: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr2[i][j] = Integer.parseInt(sc.next());
			}
		}

		System.out.println("Select operation");
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for multiplication");
		System.out.println("Enter 3 for transpose");
		System.out.print("operation: ");
		int option = sc.nextInt();

		switch(option)
		{

			case 1: addition(arr1, arr2); break;
			case 2: multiplication(arr1, arr2); break;
			case 3: transpose(arr1); break;
			default: System.out.println("Enter valid input");
		}
		sc.close();

	}

	static void addition(int[][] arr1, int[][] arr2)
	{
		int[][] arr3 = new int[2][2];
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				arr3[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		display(arr3);
	}

	static void multiplication(int[][] arr1, int[][] arr2)
	{
		int[][] arr3 = new int[2][2];
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				arr3[i][j] = 0;
				for(int k=0; k < arr2.length; k++)
				{
					arr3[i][j] += arr1[i][k]*arr2[k][j];
				}
			}
		}
		display(arr3);
	}

	static void transpose(int[][] arr)
	{
		int[][] arr3 = new int[arr.length][arr[1].length];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[1].length; j++)
			{
				arr3[i][j] = arr[j][i];
			}
		}
		System.out.println("Before transpose");
		display(arr);
		System.out.println("after transpose");
		display(arr3);
	}

	static void display(int[][] arr)
	{
		for(int[] i: arr)
		{
			for(int j: i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
}