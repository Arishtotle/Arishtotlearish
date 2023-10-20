import java.io.*;

public class FileCreation{
public static void main(String[] args){

File f=new File ("C:\\Users\\Administrator\\Desktop\\FileHandling\\Day7");
boolean p=f.exists();
if(p == false){
f.mkdirs();
p=f.exists();
System.out.println(p);
}
try{
File file=new File ("C:\\Users\\Administrator\\Desktop\\FileHandling\\Day7\\Newtext.txt");
file.createNewFile();
}catch(Exception e){}

}
}
