package com.rama.Solutions;

import java.math.BigInteger;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnvVarsAll {public static void main(String[] args){
	if(args.length > 0){
		String value = System.getenv(args[0]);
		if (value != null) {
		System.out.println(args[0].toUpperCase() + " = " + value);
		} else {
		System.out.println("No such environment variable exists");
		}
		} else {
		Map<String, String> vars = System.getenv();
		for(String var : vars.keySet()){
		System.out.println(var + " = " + vars.get(var));
		}
		}

	String one = "Hello";
	String two = "Java7";
	//StringBuffer buffer = new StringBuffer(null);
	//StringBuilder sb=new StringBuilder(null);
	/*System.out.println(sb);
*/	/*buffer.append(one).append("").append(two);
	String result = buffer.toString();
	System.out.println(result);*/
	String str1="I love 7!";
	Pattern pattern = Pattern.compile("I love .*[ 0-9]!");
	Matcher matcher = pattern.matcher(str1);
	 boolean result = matcher.matches();
	 System.out.println(result);
	 
	

String	str = "I love Java 6!";
	boolean result1 = str.matches("I love Java [0-9]!");
	System.out.println(result1);
	
	System.out.println(addNumbers(new BigInteger[]{new BigInteger("123"),new BigInteger("143"),new BigInteger("456")}));
		}

/**
* Accepts an unlimited number of values and
* returns the sum.
*
* @param nums
* @return Sum of numbers
*/
public static BigInteger addNumbers(BigInteger[] nums){
BigInteger result = new BigInteger("0");
for (BigInteger num:nums){
result = result.add(num);
}
return result;
}
		}