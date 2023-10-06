class Parents{

public static  void Eat(){

System.out.println("Finish Lunch Before 3");
}

Public satic void Sleep1(){
System.out.println("Sleep Before 10");
}

Public void Sleep(){
System.out.println("Sleep Before 10");
}

}

Public class Staticdynamicbinding extends Parents{

Public Static  void Sleep1(){
System.out.println("Sleep Before 12");
}

Public void Sleep(){
System.out.println("Sleep Before 12");
}

public static void main(string[] args){

Staticdynamicbinding out=new Staticdynamicbinding();
out.Eat();
out.Sleep();
out.sleep1();
}
}
