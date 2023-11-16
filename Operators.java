package Example;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1,num2,choice,res;
		System.out.println("\n1]Arithmetic operator\n2]Logical Operator\n3]Relational Operator\n4]Bitwise Operator\n5]Conditional Operator\n6]Assignment Operator");
		System.out.println("Enter Your Choice=");
		choice=sc.nextInt();
		
		switch(choice)
		{
			case 1://arithmetic operator
				System.out.println("Enter the value of first number=");
				num1=sc.nextInt();
				System.out.println("Enter the value of second number=");
				num2=sc.nextInt();
				res=num1+num2;
				System.out.println("Addition Of num1 and num2="+res);
				res=num1-num2;
				System.out.println("Substraction Of num1 and num2="+res);
				res=num1*num2;
				System.out.println("Multiplication Of num1 and num2="+res);
				res=num1%num2;
				System.out.println("Mod Of num1 and num2="+res);
				res=num1/num2;
				System.out.println("Division Of num1 and num2="+res);
				break;
			case 2://logical operator
				System.out.println("Enter the value of first number=");
				num1=sc.nextInt();
				System.out.println("Enter the value of second number=");
				num2=sc.nextInt();
				if(num1>=10 && num2<=20)
				{
					System.out.println("The Value oF Num1 and Num2 is between 10 and 20");
				}
				else if(num1>=1 || num2<=9)
				{
					System.out.println("The Value oF Num1 and Num2 is between 10 and 20");
				}
				else
				{
					System.out.println("Enter Value Between 10 To 20");
				}
				break;
			case 3://relational operator
				int variable_1,variable_2,variable_3;
				System.out.println("Enter Value of first variable=");
				variable_1=sc.nextInt();
				System.out.println("Enter Value of second variable=");
				variable_2=sc.nextInt();
				System.out.println("(variable 1 == variable 2)="+(variable_1==variable_2));
				System.out.println("(variable 1 != variable 2)="+(variable_1!=variable_2));
				System.out.println("(variable 1 > variable 2)="+(variable_1>variable_2));
				System.out.println("(variable 1 < variable 2)="+(variable_1<variable_2));
				System.out.println("(variable 1 >= variable 2)="+(variable_1>=variable_2));
				System.out.println("(variable 1 <= variable 2)="+(variable_1<=variable_2));
				break;
			case 4://bitwise operator
				int a,b,c;
				System.out.println("Enter Value of a=");
				a=sc.nextInt();
				System.out.println("Enter Value of b=");
				b=sc.nextInt();
				c=a&b;
				System.out.println("a&b="+c);
				c=a|b;
				System.out.println("a|b="+c);
				c=a^b;
				System.out.println("a^b="+c);
				c=~a;
				System.out.println("~a="+c);
				break;
			case 5://conditional operator
				int x,y;
				System.out.println("Enter the value of x=");
				x=sc.nextInt();
				System.out.println("Enter the value of y=");
				y=sc.nextInt();
				if(x>y && x<y)
					System.out.println(x>y && x<y);
				else if(x>y || x<y)
					System.out.println(x>y || x>y);
					break;
			case 6://Assignment Operator
				int a1=10;
				a1+=10;
				System.out.println("a="+a1);
				a1-=10;
				System.out.println("a="+a1);
				a1*=10;
				System.out.println("a="+a1);
				break;
			default:
				System.out.println("Please Enter Valid Case");		
		}
	}

}
