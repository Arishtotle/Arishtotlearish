import java.util.*;

class User{

String userName;
int userId;
	public User(String userName,int userId){
		this.userName=usrName;
		this.userId=userId;
	}
public String getUserName(){
return userName;
}
public int getUserId(){
return userId;
}
}

class Function{


               public void createPost(){
              
                  
              


                   }      
		public void follow(){



               }

                public void unfollow(){



		}

                public void getNewsFeed(){



                }
                public void deletepost(){



		}
}

public class FaceBook{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

			ArrayList<User> user=new ArrayList<User>();



			boolean b=false;
		while(!b){
                    System.out.println("please enter 1 for create new post");
                     System.out.println("please enter 2 for follower of the account ");
                      System.out.println("please enter 3 for unFollow the account ");
                       System.out.println("please enter 4 for gettig the newsFeed ");
                        System.out.println("please enter 5 for  deleting the post ");
                         System.out.println("please enter 6 for exiting ");
		      int n=sc.nextInt();
			

			switch(n){
		case 1:
			System.out.println(" please enter userName and userID ");
			String	name=sc.next();
				int id=sc.nextInt();
					if(user.userName==name && user.userId==id){
                                            fun.createpost();
					}else{
                                      System.out.println("Please enter correct userNAme And user ID");
                    		}
                          break;
               case 2:
			System.out.println(" please enter userName and userID ");
			String	name=sc.next();
				int id=sc.nextInt();
					if(user.userName==name && user.userId==id){
                                            fun.createpost();
					}else{
                                      System.out.println("Please enter correct userNAme And user ID");
                    		}
                   
                          break;
               case 3:
			System.out.println(" please enter userName and userID ");
			String	name=sc.next();
				int id=sc.nextInt();
					if(user.userName==name && user.userId==id){
                                            fun.createpost();
					}else{
                                      System.out.println("Please enter correct userNAme And user ID");
                    		}

                   
                          break;
               case 4:
			System.out.println(" please enter userName and userID ");
			String	name=sc.next();
				int id=sc.nextInt();
					if(user.userName==name && user.userId==id){
                                            fun.createpost();
					}else{
                                      System.out.println("Please enter correct userNAme And user ID");
                    		}

                    
                          break;
               case 5:
			System.out.println(" please enter userName and userID ");
			String	name=sc.next();
				int id=sc.nextInt();
					if(user.userName==name && user.userId==id){
                                            fun.createpost();
					}else{
                                      System.out.println("Please enter correct userNAme And user ID");
                    		}

                    
                          break;

               case 6:
                    b=true;
                          break;
                   
		default :
			System.out.println("please select the correct option");
                          break;
  			}
	
		}
	}
}
