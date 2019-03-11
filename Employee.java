import java.util.Scanner;

public class Employee{
	public static void main(String[] args){
		int id,monthlyBasic,profTax=0;
		double esic;
		String name;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name:");
		name = sc.nextLine();
		
		System.out.println("Enter your ID:");
		id = sc.nextInt();
			
		System.out.println("Enter your monthlyBasic:");
		monthlyBasic=sc.nextInt();
		
		System.out.println("Your annual salary is "+getAnnualBasic(monthlyBasic));
		
		int monthlyGrossSalary=getMonthlyGrossSalary(monthlyBasic);
		System.out.println("Your monthly gross salary is "+monthlyGrossSalary);
		
		System.out.println("Your Annual gross salary is  "+getAnnualGrossSalary(monthlyGrossSalary));
		
		int pf=monthlyBasic/10;
		if(pf>6500){
			pf=6500;
}
		if(monthlyBasic<=5000){
			esic=monthlyBasic*0.0475;
}	
		else{
			esic=0;
}
		if(monthlyBasic<=10000){
			profTax=50;
}
		double monthlyDeduction=getMonthlyDeductions(esic,pf,profTax);
		System.out.println("Your monthlyDeduction is " +monthlyDeduction);
		double takeHomeMonthly=getMonthlyTakeHome(monthlyGrossSalary,monthlyDeduction);
		System.out.println("Your monthly take home salary is " +takeHomeMonthly);
		System.out.println("Anually take home salary is"+" "+getAnnualTakeHome(takeHomeMonthly));

}
	public static int getAnnualBasic(int monthlyBasic){
		return monthlyBasic*12;
}
	public static int getMonthlyGrossSalary(int monthlyGross){
		return monthlyGross+(monthlyGross/2)+1250+800;
}
	public static int getAnnualGrossSalary(int monthlyGross){
		return monthlyGross*12;
}
	public static double getMonthlyDeductions(double e,int p,int t)	
	{
		return t+p+e;
}	
	public static double getMonthlyTakeHome(int mg,double md){
		return mg-md;
}
	public static double getAnnualTakeHome(double mth){
		return mth*12;
}	
	
}	