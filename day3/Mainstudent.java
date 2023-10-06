public class Mainstudent{
public static void main(String[] args){
class Student{
String name;
int roll_no;
public Student(String name,int roll_no){
this.name = name;
this.roll_no = roll_no;
}
}
Student st=new Student("john",2);
System.out.print(st.name);
}
}