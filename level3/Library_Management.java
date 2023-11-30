import java.util.*;

class Admin{

String adminName;
String adminPass;
static Scanner sc=new Scanner(System.in);
public Admin(String adminName, String adminPass){
this.adminName=adminName;
this.adminPass=adminPass;
}

public static void addBook(List<Book> books){
System.out.println("please enter the book name ");
String name=sc.next();
System.out.println("please enter the book description ");
String descrip=sc.next();
System.out.println("please enter the book author name ");
String author=sc.next();
System.out.println("please enter the book publication name ");
String publication=sc.next();
System.out.println("please enter the book price ");
int price=sc.nextInt();
System.out.println("please enter the book count ");
int count=sc.nextInt();
Book.books.add(new Book(name,descrip,author,publication,price,count));
System.out.println("book added successfully ");
}

public static void removeBook(List<Book> books){
System.out.println("please enter the book name ");
String name=sc.next();

for(Book book:books){
if(name.equals(book.bookName)){
books.remove(book);
System.out.println("Bookname removed Successfully");
break;
}else{
System.out.println("Please enter the correct book name ");
}
}
}

public static void displayBooks(List<Book> books){

for(Book book:Book.books){
System.out.println("Book name "+book.bookName+" Book ID "+book.bookId+" Book description "+book.bookDescription+" Book Author "+book.bookAuthor+" Publication Date "+book.bookPublication+" Book Price "+book.bookPrice+" Book Count Available "+book.bookCount);
}
}

public static void addUser(List<User> users){

System.out.println("please enter the user name ");
String name=sc.next();
System.out.println("please enter the user password");
String password=sc.next();
System.out.println("please enter the user age");
int age=sc.nextInt();
System.out.println("please enter the user gender ");
char gender=sc.next().charAt(0);
System.out.println("please enter the date of joined ");
String joined=sc.next();
User.users.add(new User(name,password,age,gender,joined));
System.out.println("user added successfully ");

}

public static void removeUser(List<User> users){
System.out.println("please enter the user name ");
String name=sc.next();
for(User user:users){
if(name.equals(user.userName)){
users.remove(user);
System.out.println("username removed Successfully");
break;
}else{
System.out.println("Please enter the correct user name ");
}
}
}

public static void displayUser(List<User> users){

for(User user:User.users){

System.out.println("user Id "+user.userId+" user Name "+user.userName+"user password "+user.userPassword+" user age "+user.userAge+" user gender "+user.userGender+" user Date of joined "+user.userJoinedDate);
}
}

}

class Book{

static List<Book> books=new ArrayList<>();

int bookId;
String bookName;
String bookDescription;
String bookAuthor;
String bookPublication;
int bookCount;
int bookPrice;
static int Id=0;
public Book(String bookName,String bookDescription,String bookAuthor,String bookPublication,int bookCount,int bookPrice){
this.bookId=++Id;
this.bookName=bookName;
this.bookDescription=bookDescription;
this.bookAuthor=bookAuthor;
this.bookPublication=bookPublication;
this.bookCount=bookCount;
this.bookPrice=bookPrice;
}

}

class User{

static Scanner sc=new Scanner(System.in);

int userId;
String userName;
String userPassword;
int userAge;
char userGender;
String userJoinedDate;
static int ID=0;
static List<User> users=new ArrayList<User>();
public User(){
}
public User(String userName,String userPassword,int userAge,char userGender,String userJoinedDate){
this.userId=++ID;
this.userName=userName;
this.userPassword=userPassword;
this.userAge=userAge;
this.userGender=userGender;
this.userJoinedDate=userJoinedDate;
}
public static void searchBook(List<Book> books){
for(Book book:Book.books){
System.out.println("please enter the Book Title to find the book");
String name=sc.next();
if(name.equals(book.bookName)){
System.out.println("Book name "+book.bookName+" Book ID "+book.bookId+" Book Author "+book.bookAuthor+" Book description "+book.bookDescription+" Publication Date "+book.bookPublication+" Book Price "+book.bookPrice+" Book Count Available "+book.bookCount);

}else{
System.out.println("please enter the correct book name ");
}
}
}
public static void issueBook(List<Book> books){
for(Book book:Book.books){
System.out.println("please enter the Book Title to find the book");
String name=sc.next();
if(name.equals(book.bookName)){
if(book.bookCount>0){
System.out.println("Book issued Successfully ");
book.bookCount--;
}else{
System.out.println("book stock is not available");
}
}else{
System.out.println("please enter the correct book name to find");
}
}
}
public static void returnBook(List<Book> books){
for(Book book:Book.books){
System.out.println("please enter the Book Title to find the book");
String name=sc.next();
if(name.equals(book.bookName)){
System.out.println("Book returned Successfully");
book.bookCount++;
}else{
System.out.println("please enter correct book number ");
}
}

}

}

public class Library_Management{

    public static void main(String[] args){
	Admin ad=new Admin("Arish","ad@123");
	User user=new User();
	Scanner sc=new Scanner(System.in);

	boolean b=false,u=false,a=false;
		while(!b){
			System.out.println("\n 1.Admin login "+"\n 2.User login "+"\n 3.exit  "+ "\n please select valid option");
				int n=sc.nextInt();
				switch(n){

					case 1:
					System.out.println("please enter the AdminName And AdminPassword to continue");
					String name=sc.next();
					String password=sc.next();
					if(name.equals(ad.adminName) && password.equals(ad.adminPass)){
					while(!a){
					System.out.println("\n 1.Add new Book"+"\n 2.Remove existing book"+"\n 3.View list of Books "+"\n 4.Add new User "+"\n 5.Remove existing User "+" \n 6.View list of Users "+"\n 7.exit "+"\n please select valid option to go ");
					int i=sc.nextInt();
						switch(i){
							case 1:
								ad.addBook(Book.books);
							break;
					
							case 2:
								ad.removeBook(Book.books);
							break;

							case 3:
								ad.displayBooks(Book.books);
							break;
					
							case 4:
								ad.addUser(User.users);
							break;
					
							case 5:
								ad.removeUser(User.users);
							break;
					
							case 6:
								ad.displayUser(User.users);
							break;
					
							case 7:
								a=true;
							break;
					
							default:
								System.out.println("please enter correct option to go");
							break;
						}
					}
					}else{
						System.out.println("please enter the valid Admin name And Admin password");
					}
					break;

					case 2:
					
					System.out.println("please enter the User Name And User Password to continue");
					
					String usename=sc.next();
					String usepassword=sc.next();
					for(User use:User.users){
					if(usename.equals(use.userName) && usepassword.equals(use.userPassword)){
					while(!u){
						System.out.println("\n 1.search book "+"\n 2.Issuse the book "+"\n 3.Return the Book "+"\n 4.exit "+"\n Please enter the valid option to continue");
						int i=sc.nextInt();
							switch(i){
								case 1:
									user.searchBook(Book.books);
									break;

								case 2:
									user.issueBook(Book.books);
									break;
								case 3:
									user.returnBook(Book.books);
									break;
								case 4:
									u=true;
								        break;
								default:
								System.out.println("please enter the valid option to go on");
									break;

							}
					}
					}else{
						System.out.println("please enter the valid User name And User password");
					}}
					break;

					case 3:
						b=true;
					break;

					default:
						System.out.println("please enter correct number to continue");
					break;
				}
			}
		}
}

