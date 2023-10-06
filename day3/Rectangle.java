public class Rectangle{
public static void main(String[] args){

RectangleArea rct1=new RectangleArea(4,5);
RectangleArea rct2=new RectangleArea(5,8);

rct1.Area();
System.out.println(rct1.Area());
rct2.Area();
}
}
class RectangleArea{
int l,b;
public RectangleArea(int l,int b){
this.l=l;
this.b=b;
}
public int Area(){
return l*b;
}

}
