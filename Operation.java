package Example;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\n1]greater than between three numbers  \n2]even or odd \n3]vowel or not \n4]divisible by 5 or not");
		System.out.println("Enter Your Choice=");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1://Find out greater between 3 Number
			int num1,num2,num3;
			System.out.println("Enter first Number=");
			num1=sc.nextInt();
			System.out.println("Enter Second Number=");
			num2=sc.nextInt();
			System.out.println("Enter Third number=");
			num3=sc.nextInt();
			int max=Math.max(num1,Math.max(num2, num3));
			System.out.println("The greatest number is :"+max);
			break;
		case 2://Check given no is even or odd
			int number;
			System.out.println("Enter the Number=");
			number=sc.nextInt();
			if(number % 2==0)
			{
				System.out.println("Number is even");
			}
			else
			{
				System.out.println("Number is odd");
			}
			break;
		case 3://Check the given character is vowel or not
			char ch;
			System.out.println("Enter Your Character=");
			ch=sc.next().charAt(0);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U')
				System.out.println("The Character Is Vowel");
			else
				System.out.println("The character is not vowel");
			break;
		case 4://check the given no is divisible by 5 or not
			int no;
			System.out.println("Enter the Number=");
			no=sc.nextInt();
			if(no % 5 == 0)
			{
				System.out.println("Number Is Divisible By 5");
			}
			else
			{
				System.out.println("Nmber Is Not Divisible By 5");
			}
			break;
		}
	}

}
