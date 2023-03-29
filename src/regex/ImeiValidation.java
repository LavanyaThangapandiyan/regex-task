package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImeiValidation {
	public static boolean isValidimei(String imei)
	{
	String regex = "^[0-9]{15,15}|[,]$";
	Pattern p = Pattern.compile(regex);
	if (imei == null)
	{
	return false;
	}
	Matcher m = p.matcher(imei);
	return m.matches();
	}
	public static void main(String args[])
	{
	String num1 = "353414104815176";
	System.out.println(num1 + ": "+ isValidimei(num1));

	String num2 = "490154203237518";
	System.out.println(num2 + ": "+ isValidimei(num2));

	String num3 = "ab3456789123fg6";
	System.out.println(num3 + ": "+ isValidimei(num3));

	String num4 = "147359845886";
	System.out.println(num4 + ": "+ isValidimei(num4));
	}

}
