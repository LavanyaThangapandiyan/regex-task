package regex;

import java.util.regex.Pattern;

public class IpAddressValidation {
	static String Validate_It(String IP)
	  {
	    String regex="^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$"; // validating IPv4
	    Pattern p = Pattern.compile(regex);
	    if (p.matcher(IP).matches())
	    {
	      return "Valid IPv4";
	    }
	    else
	      return "Invalid IP";
	  }
	  public static void main(String args[])
	  {
	    String IP = "257.120.223.13";
	    System.out.println(Validate_It(IP));
	    
	    IP = "2k33:12a0:3Ea0:0302";
	    System.out.println(Validate_It(IP));
	 
	  }
	}


