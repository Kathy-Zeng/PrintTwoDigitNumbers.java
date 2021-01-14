// Kathy Zeng
// 1/7/21
// PrintTwoDigitNumbers.java
// Program uses nested loops to print a table of two digit numbers from 10 to 99.

public class PrintTwoDigitNumbers
{
	public PrintTwoDigitNumbers()
	{
	}

	public static void main(String[] args)
	{
		PrintTwoDigitNumbers ptdn = new PrintTwoDigitNumbers();
		ptdn.findIt();
	}

	public void findIt()
	{
		System.out.println("\n\n\n");
		System.out.println("\tWelcome to PrintTwoDigitNumbers\nThis program" +
		" prints the numbers from 10 to 99 in a table\n");
		printNumbers();
		System.out.println("\n\n\n");
	}

	// Uses nested loops to print two digit numbers. The outer loop prints the
	// tens digit. The inner loop prints the units digit.
	 public void printNumbers()
	 {
		for(int outer = 1; outer < 10; outer++)
		{
			for(int inner = 0; inner < 10; inner++)
			{
				System.out.print(outer + "" + inner + "\t");
			}
			System.out.println();
	        }
	 }
}

