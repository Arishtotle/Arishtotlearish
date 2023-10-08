public class BMI_Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter your height in Centi meter");
		double height=sc.nextDouble();
		height=height/100;
		System.out.println(" Enter the weight");
		double Weight=sc.nextDouble();
		double BMI=Weight/(height*height);
		System.out.println("Your BMI is "+BMI+"KG/M2");
		if(BMI<20) {
			System.out.println("You are Unter weight");
		}else if(BMI>20 && BMI<25) {
			System.out.println("You are perfectly fit");
		}else{
			System.out.println("You are over Weighted");
		}
		
	}

}
