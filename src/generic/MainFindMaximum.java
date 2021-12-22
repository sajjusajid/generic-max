package generic;

public class MainFindMaximum {
	public static void main(String[] args) {
		System.out.println("------------FIND MAXIMUM USING GENERICS-------------");


		FindMaximum ITC1 = new FindMaximum(45 , 38 , 24 ); 
		ITC1.testMaximum();
		FindMaximum ITC2 = new FindMaximum(18, 28, 19 );  
		ITC2.testMaximum();
		FindMaximum ITC3 = new FindMaximum(75, 52, 120 ); 
		ITC3.testMaximum();

		FindMaximum FTC1 = new FindMaximum(15.5f, 12.8f, 9.56f); 
		FTC1.testMaximum();
		FindMaximum FTC2 = new FindMaximum(12.4f, 25.8f, 15.7f );
		FTC2.testMaximum();
		FindMaximum FTC3 = new FindMaximum(14.2f, 18.7f, 28.9f ); 
		FTC3.testMaximum();


		FindMaximum STC1 = new FindMaximum("Apple", "peach", "Banana" ); 
		STC1.testMaximum();
		FindMaximum STC2 = new FindMaximum("ajju", "wajju", "sajju"); 
		STC2.testMaximum();
		FindMaximum STC3 = new FindMaximum("sanat","sajid", "bull");
		STC3.testMaximum();
	}
}


