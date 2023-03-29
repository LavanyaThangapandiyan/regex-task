package regex;


import java.util.Random;


public class UserName
{
		   int name;
		   String[]userNames= {"Lavanya","raghU","raghuL","rAbik"};
		   String mobiles[]= {"265","176","918","742"};
		   String citys[]= {"Madurai","Chennai","Coimbatore","Trichy"};
		   public UserName()
		   {
			   name=4;
		   }
		   public void generateName()
		   {
			   Random rand=new Random();
			   String userName = userNames[rand.nextInt(name)];
			   String mobile= mobiles[rand.nextInt(name)];
			   String city= citys[rand.nextInt(name)];
			   System.out.println(userName+mobile+"  "+city);	   					
		   }	   
		   
		   public static String isValidUsername(String name,String city,String mob) 
		   {
			   String a=name.replaceAll("^[A-Za-z]{1,3}\\w{2}\\d{3}$1", name);
			   String c=mob.replaceAll("^[A-Za-z]{1,3}\\w{2}\\d{3}$3", mob);
			   String b=city.replaceAll("^[A-Za-z]{1,3}\\w{2}\\d{3}$2", city);
			   String regex = "^[A-Za-z]\\w{5,29}\\d{3}$";
		        
			   return (a+c+b);
		   }
		   public static void main(String[]args)
		   {
			   UserName rng=new UserName();
			   System.out.println("List of Random names");
			   rng.generateName();
		   
		}
		  
}
