package junitSample;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static void main(String args[]){
		List<String> results = doFizzBuzz();
		for(String result : results) System.out.println(result);
	}

	static public String isFizzBuzz(int i){
		if(i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
		if(i % 5 == 0) return "Buzz";
		if(i % 3 == 0) return "Fizz";
		return Integer.toString(i);
	}

	static public List<String> doFizzBuzz(){
		List<String> result = new ArrayList<String>();
		for(int i = 1; i <= 100; i++) result.add(isFizzBuzz(i));
		return result;
	}
}
