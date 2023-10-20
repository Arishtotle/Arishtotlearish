import java.io.*;

public class FileRename{
public static void main(String[] args){
try{
File f=new File ("C:\\Users\\Administrator\\Desktop\\FileHandling\\Day7\\Advanced.txt");

File NewName=new File("C:\\Users\\Administrator\\Desktop\\FileHandling\\Day7\\NewText.txt");
boolean p=f.renameTo(NewName);
if(p==true){
System.out.println("rename "+NewName.getName());
}else{
System.out.println("not renamed");
}
}catch(Exception i){}
}
}
