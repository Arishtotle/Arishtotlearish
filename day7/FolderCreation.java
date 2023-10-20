import java.io.*;

public class FolderCreation{
public static void main(String[] args){

File f=new File ("C:\\Users\\Administrator\\Desktop\\FileHandling\\Day7\\FolderCreation");
boolean p=f.exists();
if(p == false){
f.mkdirs();
p=f.exists();
System.out.println(p);
}
}
}
