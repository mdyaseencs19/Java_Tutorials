/******************************************************************************
    Java Program To Multiply an Integer By 4 Without Using the '*' Operator.
*******************************************************************************/

/*******************************************************************************************************************************************************************************************
+ --------------------------- +
|    Pseudocode:              |
+ --------------------------- +
    
    Collect the input from the User.
    Left Shift the given input By 2. (Left Shift By 1 {i.e., a = a<<1 } is nothing but Multiplication by 2, Similarly Left Shift By 3 is nothing but Multiplication by 8 and so on). 
    Finally Print the Result.
    
*******************************************************************************************************************************************************************************************/

import java.util.Scanner;

public class Multiplication_Of_an_Int_By_4_Without_Using_the_*_Operator
{
	public static void main(String[] args) 
  {
		int a;
		System.out.println("Multiplication of an Integer By 4 Without Using '*' Operator : ");
		System.out.print("Enter an Integer : ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		a = a << 2;
		System.out.print(""+a);
	}
}

/*********************************************
+ ----------------------- +
|   Output:               |
+ ----------------------- +
Multiplication of an Integer By 4 Without Using '*' Operator :                                                           
Enter an Integer : 5                                                                                                     
20                                                                                                                       
                                                                                                                         
...Program finished with exit code 0                                                                                     
Press ENTER to exit console.
*********************************************/
