import java.util.*;
class InvalidInputException extends Exception
{
	public InvalidInputException(String str)
	{
		super(str);
	} 
}
class User
{
	int userId;
	ArrayList<Integer> post=new ArrayList<Integer>();
	ArrayList<Integer> followers=new ArrayList<Integer>();
	ArrayList<Integer> newsfeed=new ArrayList<Integer>();
	User(int id)
	{
		userId=id;
	}
	public int getuserId()
	{
		return userId;
	}
	public void createPost(int postId,ArrayList<User> user)
	{
		post.add(postId);
		for(int x:followers)
		{
			for(User y:user)
					if(y.userId==x)
		  			{
						y.addnewsfeed(postId);
					}
		}
	}
	public void viewPost()
	{
		System.out.println(post);
	}
	public void addFollower(int id)
	{
		followers.add(id);
		
	}
	public void viewFollowers()
	{
		System.out.println(followers);
	}
	public void addnewsfeed(int id)
	{
		newsfeed.add(id);
	}
	public void showNewsFeed()
	{
		System.out.println(newsfeed);
	}
	public void removeFollower(int id)
	{
		for(int x=0;x<followers.size();x++)
			if(followers.get(x)==id)
			{
				
        			followers.remove(x);
			}
	}
	public void showFollower()
	{
		System.out.println(followers);
	}
	public void deleteNewsFeed(int id)
	{
		for(int x=0;x<newsfeed.size();x++)
			if(newsfeed.get(x)==id)
				newsfeed.remove(x);
	}
	public void deletePost(int id,ArrayList<User> user)
	{
		for(int x=0;x<post.size();x++)
			if(post.get(x)==id)
				post.remove(x);
		for(int x:followers)
		{
			for(User y:user)
					if(y.userId==x)
		  			{
						y.deleteNewsFeed(id);
					}
		}
	}
	public void postList()
	{
		System.out.println(post);
	}
}
public class FacebookDemo
{
	public static void main(String args[]) throws InvalidInputException
	{
		int userId;
		int postId;
		Scanner sc=new Scanner(System.in);
		ArrayList<User> user=new ArrayList<User>();
		user.add(new User(1));
		user.add(new User(2));
		user.add(new User(3));
		boolean b=true;
		while(b)
		{
			System.out.println("Enter your choice");
			System.out.println("1.add post");
			System.out.println("2.Show my posts");
			System.out.println("3.add followers");
			System.out.println("4.show newsfeed");
			System.out.println("5.remove follower");
			System.out.println("6.show followers list");
			System.out.println("7.Delete post");
			System.out.println("8.exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter your UserId [1-3]");
				userId=sc.nextInt();
				if(userId<1 || userId>3)
					throw new InvalidInputException("User not available");
				System.out.println("Enter your PostId");
				postId=sc.nextInt();
				for(User x:user)
					if(x.userId==userId)
		  			{
						x.createPost(postId,user);
						x.viewPost();
					}
				break;
			case 2:
				System.out.println("Enter your UserId");
				userId=sc.nextInt();
				for(User x:user)
					if(x.userId==userId)
		  			{
						x.postList();
					}
				break;
			case 3:
				System.out.println("Enter your UserId");
				userId=sc.nextInt();
				System.out.println("Enter UserId you want to follow");
				int tempId=sc.nextInt();
				for(User x:user)
					if(x.userId==userId)
		  			{
						x.addFollower(tempId);
					}
				break;
			case 4:
				System.out.println("Enter your UserId");
				userId=sc.nextInt();
				for(User x:user)
					if(x.userId==userId)
		  			{
						x.showNewsFeed();
					}
				break;
			case 5:
				System.out.println("Enter your UserId");
				userId=sc.nextInt();
				System.out.println("Enter UserId you want to unfollow");
				int tempId1=sc.nextInt();
				for(User x:user)
					if(x.userId==userId)
		  			{
						x.removeFollower(tempId1);
					}
				break;
			case 6:
				System.out.println("Enter your UserId");
				userId=sc.nextInt();
				for(User x:user)
					if(x.userId==userId)
		  			{
						x.showFollower();
					}
				break;
			case 7:
				System.out.println("Enter your UserId");
				userId=sc.nextInt();
				for(User x:user)
					if(x.userId==userId)
		  			{
						x.viewPost();
					}
				System.out.println("Enter your PostId to delete");
				postId=sc.nextInt();
				for(User x:user)
					if(x.userId==userId)
		  			{
						x.deletePost(postId,user);
					}
				break;
			case 8:
				b=false;
				break;
			default :
				System.out.println("Enter valid option");
			}
		}
		
	}
}