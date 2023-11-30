import java.util.*;
import java.io.*;


class Product{

    String productname;
    double productprice;
    int productavailable;

	public Product(){
		
      }
       public  void setProductname(String product){
         this.productname=product;
      }
       public  void setProductprice(double price){
         this.productprice=price;
      }
       public void setProductAvailable(int available){
          this.productavailable=available;
      } 
       public String getProductname(){
		return productname;
      }
	public double getProductprice(){
		return productprice;
      }
	public int getProductAvailable(){
                return productavailable;
      }
}
class Admin{ 
Scanner sc=new Scanner(System.in);

String adminId;
String adminPassword;



	public Admin(String adminId,String adminPassword){
		this.adminId=adminId;
		this.adminPassword=adminPassword;
	}

		public void addProduct(){
			boolean b =false;
                     while(!b){
			 	System.out.println("please enter 1 for adding ,2 for exiting");	
				int i=sc.nextInt();	
					switch(i){
  					case 1:
					    Product p=new Product();
					    String name = sc.next();
						p.setProductname(name);
						double cost=sc.nextDouble();
						p.setProductprice(cost);
						int available=sc.nextInt();
						p.setProductAvailable(available);
						ShoppingApplication.pal.add(p);
						System.out.println("product added here ....have a good day");
					  break;
  					case 2:
					    b=true;
					  break;
					default :
						System.out.println("please select valid number to continue");
                                        }
                     }
	}

		public void addCoupon(){
			for(Product a:ShoppingApplication.pal){
				if(a.productprice>2500){
				System.out.println("There is an offer of 25% for ");
					a.productprice=(a.productprice/25)*100;
				}
		}
	}
		public void shoppingHistory(){

		for(Product u:ShoppingApplication.ual){
			System.out.println(u);
		}
	}
		public void quantityAvailable(){
				System.out.println("please enter the product name to search for available quantity");
					String search=sc.next();
			for(Product a:ShoppingApplication.pal){
					if(search.equalsIgnoreCase(a.productname)){
				System.out.println("product : "+a.productname+" Available Quantity : "+a.productavailable);
					}
 		}
	}


}

class User{

String userId;
String userPassword;

Scanner sc= new Scanner(System.in);

    public User(String userId,String userPassword){
	this.userId=userId;
	this.userPassword=userPassword;
    }

		public void showProductList(){
		for(Product a:ShoppingApplication.pal){
                    System.out.println("product : "+a.productname+" Price : "+a.productprice+" Available stock : "+a.productavailable);
             }
	}
		public void searchProduct(){
			for(Product a:ShoppingApplication.pal){
				System.out.println("please enter the product name want to search");
					String search=sc.next();
						if(search.equalsIgnoreCase(a.productname)){
                                                         System.out.println("product : "+a.productname+" Price : "+a.productprice+" Available stock : "+a.productavailable);
						}else{
							System.out.println("sorry for inconvenience ...yor searching product is not available");
						}
			}
	}
		public void addToCart(){
			for(Product a:ShoppingApplication.pal){
			System.out.println("please enter the product name ");
				String search=sc.next();
       				if(search.equalsIgnoreCase(a.productname)){
					System.out.println("please enter number of count you want");
						int count =sc.nextInt();
					if(count <= a.productavailable){
						ShoppingApplication.ual.add(a);
					}else{
						System.out.println("stock out of order ..please wait till new available comes ..thanks");	
					}
				}else{
					System.out.println("please enter the correct product name ");
				}
			}

	}
		public void orderProduct(){



	}
		public void cancelOrder(ArrayList<Product> ual){
		    for(Product u:ShoppingApplication.ual){
				System.out.println("please enter the product name that to be cancelled");
				String cancel=sc.next();
				if(cancel.equalsIgnoreCase(u.productname)){
					ual.remove(u.productname);
					System.out.println("product removed successfully");
				}else{
					System.out.println("please enter the correct product name to b cancelled");

				}
		    }
	}
		public void makePayment(){
			System.out.println("please enter 1 for online payment ,2 for cash on delivery ,3 for emi option");
				int n=sc.nextInt();
					if(n==1){
						System.out.println("Your payment hasbeen made to your upi id  please check and pay ");
					}else if(n==2){
						System.out.println("Your payment hasbeen made to your cash on delivery please check and pay ");
					}else if(n==3){
						System.out.println("Your payment hasbeen made to your emi option please check and pay ");
					}else{
						System.out.println("please enter the correct number to make payment");

					}
		}


}

public class ShoppingApplication{

 static ArrayList<Product> ual=new ArrayList<>();
ArrayList<Admin> aal=new ArrayList<Admin>();
static ArrayList<Product> pal=new ArrayList<Product>();



	public static void main(String args[]){


try{
	File adminfile=new File("C:\\Users\\Administrator\\Desktop\\FileHandling\\ShoppingApplication\\Adminfile.txt");
         
          adminfile.createNewFile();
}catch(Exception e){}
		Admin ad=new Admin("Admin","123");
		User user=new User("User","123");
		Scanner sc=new Scanner(System.in);
			boolean b=false,a=false,u=false;
				while(!b){

					System.out.println(" please select 1 if User,2 if Admin, 3 to exit");
						int n=sc.nextInt();
							switch(n){
								case 1:
									System.out.println("please enter userId And password");
										String id=sc.next();
										String password=sc.next();	
											if(user.userId.equals(id) && user.userPassword.equals(password)){
												while(!u){
												
												System.out.println("please 1 for showing product");
											       System.out.println("please 2 for searching by product name");
											      System.out.println("please 3 for add to cart ");
											     System.out.println("please 4 for order the product");
											    System.out.println("please 5 for cancel the order");
											  System.out.println("please 6 for making payment");
										       	 System.out.println("please 7 for exiting ");
												
												System.out.println("\n please select the option to enter");
												int option=sc.nextInt();
												
												switch(option){

												case 1:
												    user.showProductList();
  												     break;
												case 2:
												    user.searchProduct();
  												     break;
												case 3:
												    user.addToCart();
  												     break;
												case 4:
												    user.orderProduct();
  												     break;
												case 5:
												    user.cancelOrder(ual);
  												     break;
												case 6:
												     user.makePayment();
  												     break;
												case 7:
												        u=true;
  												     break;
												default:
												       System.out.println("please select correct choice to continue \n ");
  												     break;




                                                                                                   }
                                                                                        }

											}else{
												System.out.println("please enter correct user Id and Password \n");
											}								
									break;
								case 2:
									System.out.println("please enter AdminId And password");
										String ID=sc.next();
										String Password=sc.next();	
											if(ad.adminId.equals(ID) && ad.adminPassword.equals(Password)){

												while(!a){
												
												System.out.println("please select 1 for Adding product");
											       System.out.println("please select 2 for Adding coupon for user");
											      System.out.println("please select 3 for shopping history for product ");
											     System.out.println("please select 4 for quantity available");
										       	    System.out.println("please select 5 for exiting ");
												
												System.out.println("\n please select the option to enter");
												int option=sc.nextInt();
												
												switch(option){

												case 1:
												     ad.addProduct();
  												     break;
												case 2:
												     ad.addCoupon();
  												     break;
												case 3:
												     ad.shoppingHistory();
  												     break;
												case 4:
												     ad.quantityAvailable();
  												     break;
												case 5:
												        a=true;
  												     break;
												default:
												       System.out.println("please select correct choice to continue \n");
  												     break;




                                                                                                   }
                                                                                        }
					
											}else{
												System.out.println("please enter correct Admin Id and Password \n");
											}			
									break;
								case 3:
									b=true;
	
									break;
								default:
									System.out.println("please enter the correct option to continue \n");





						}

				}

	}
}

