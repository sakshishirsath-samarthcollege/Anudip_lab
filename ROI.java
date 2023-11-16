package Example;

public class ROI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age;
		char gender;
		double roi;
		System.out.println("Enter Your Age=");
		age=sc.nextInt();
		System.out.println("Enter Your Gender(M / f)=");
		gender=sc.next().charAt(0);
		if(age>=60)
		{
			if(gender == 'M')
			{
				roi=7.0;
			}
			else if(gender == 'F')
			{
				roi=7.5;
			}
			else
			{
				System.out.println("Invalid Gender");
				return;
			}
		}
		else
		{
			roi=5.0;
		}
		System.out.println("Your Rate Of Interest  is :"+roi+"%");
	}

}
