import java.util.*;

public class Snake_Ladder{
	
	static Scanner sc=new Scanner(System.in);
	static ArrayList<String> ss=new ArrayList<>();
	
	
public static void addPlace(String str,String[][] b,String sym,ArrayList<String > ss){
	for(int i=0;i<b.length-1;i++){
		for(int j=0;j<b.length-1;j++){
			
			if(ss.contains(b[i][j])){
				continue;
			}
				if(b[i][j].equals(str)){
					b[i][j]=sym;
				}
			
		}
	}
}
	
	public static void play(String[][] b,int n){
	String temp="1",temp1="1",player1="a",player2 ="b";
	int l=n-1,k=0,l1=n-1,k1=0;
	int sum1=1,sum2=1;
	int count=0;
	boolean boo=false;
	while(!boo){
		if(count%2==0){
	System.out.println("please enter the number between 1-6");
	int number=sc.nextInt();
	if(number<=6){
	sum1=sum1+number;
	for(int i=n-1;i>0;i--){
		for(int j=0;j<n;j++){
			String str=Integer.toString(sum1);
		if(	str.equals(b[i][j])){
			b[l][k]=temp;
			temp=b[i][j];
			b[i][j]=player1;
			l=i;
			k=j;
		}
		}
	}
		if(sum1==100){
			System.out.println("player 1 wins the match");
			boo=true;
		}
		count++;
		}else{
			System.out.println("please enter the number between 1-6");
		}
		}else if(count%2==1){
	System.out.println("please enter the number between 1-6");
	int number1=sc.nextInt();
	if(number1<=6){
	sum2=sum2+number1;
	for(int i=n-1;i>0;i--){
		for(int j=0;j<n;j++){
			String str1=Integer.toString(sum2);
		if(	str1.equals(b[i][j])){
			b[l1][k1]=temp1;
			temp1=b[i][j];
			b[i][j]=player2;
			l1=i;
			k1=j;
		}
		}
		}if(sum2==100){
			System.out.println("player 2 wins the match");
			boo=true;
		}
	}else{
       System.out.println("please enter the number between 1-6");
		}
		
		count--;
	}
		for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			System.out.print(b[i][j]+" ");
	}
	System.out.println();
	}
	}
	}
	
	public static void main(String[] args){
		
	int n=sc.nextInt();
	String[][] b=new String[n][n];
	
	int num=100;
	for(int i=0;i<n;i++){
		if(i%2==0){
			
			for(int j=0;j<n;j++){
				String s=Integer.toString(num);
				b[i][j]=s;
				num--;
		}
		num++;
	}else{
		for(int j=0;j<n;j++){
			String s=Integer.toString(num);
		b[i][j]=s;
		num++;
		}
		num--;
	}
	num-=10;
	}
	ss.add("s1");
	ss.add("s2");
	ss.add("s3");
	ss.add("s4");
	ss.add("s5");
	ss.add("s6");
	ss.add("s7");
	ss.add("l1");
	ss.add("s8");
	ss.add("l2");
	ss.add("l3");
	ss.add("l4");
	ss.add("l5");
	ss.add("l6");
	ss.add("l7");
	
	addPlace("40",b,"s1",ss);
	addPlace("3",b,"s1",ss);
	addPlace("43",b,"s2",ss);
	addPlace("18",b,"s2",ss);
	addPlace("27",b,"s3",ss);
	addPlace("5",b,"s3",ss);
	addPlace("31",b,"s4",ss);
	addPlace("54",b,"s4",ss);
	addPlace("53",b,"s5",ss);
	addPlace("89",b,"s5",ss);
	addPlace("66",b,"s6",ss);
	addPlace("45",b,"s6",ss);
	addPlace("76",b,"s7",ss);
	addPlace("58",b,"s7",ss);
	addPlace("99",b,"s8",ss);
	addPlace("41",b,"s8",ss);
	
	addPlace("4",b,"l1",ss);
	addPlace("25",b,"l1",ss);
	addPlace("46",b,"l2",ss);
	addPlace("13",b,"l2",ss);
	addPlace("49",b,"l3",ss);
	addPlace("33",b,"l3",ss);
	addPlace("69",b,"l4",ss);
	addPlace("50",b,"l4",ss);
	addPlace("63",b,"l5",ss);
	addPlace("42",b,"l5",ss);
	addPlace("81",b,"l6",ss);
	addPlace("62",b,"l6",ss);
	addPlace("92",b,"l7",ss);
	addPlace("74",b,"l7",ss);
	
	
	boolean f=false;
	while(!f){
		System.out.println("1.play"+"\n2.exit"+"\n.please enter he option");
		int swi=sc.nextInt();
		switch(swi){
			case 1:
			play(b,n);
			break;
			case 2:
			f=true;
			break;
			default:
			System.out.println("please enter the valid option");
			break;
		}			
	}
	}
}