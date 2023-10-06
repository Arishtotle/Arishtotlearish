public class Student{

String roll_no,phone,address;

public Student(String roll_no,String phone,String address){
this.roll_no=roll_no;
this.phone=phone;
this.address=address;
}


public static void main (String[] args){




Student Sam=new Student("212","9566569783","Guduvancherry");
Student John=new Student("213","9566569782","Pondy");
System.out.println(Sam.phone);
}
}
