//Java Program to Find the Largest Among Three Numbers Using If...Else Statement

class Largest
 {

	public static void main(String[] args) {

		int n1 = 2, n2 = 4, n3 = 3;

		if (n1 >= n2 && n1 >= n3)
         {
			System.out.println(n1 + " is the largest number.");
		} else if (n2 >= n1 && n2 >= n3) 
        {
			System.out.println(n2 + " is the largest number.");
		} else
         {
			System.out.println(n3 + " is the largest number.");
		}
	}
}