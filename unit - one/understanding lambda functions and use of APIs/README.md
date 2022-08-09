Given an array of String,write a program to count string whose length is more than three using stream java8
input:["a","hello","world","or","program","examples"]
output:4

program:
package fullstack;

import java.util.Arrays;
import java.util.List;

public class lambdaStream {
	public static void main(String args[]){
		List<String> strList= Arrays.asList("a","hello","world","or","program","examples");
long num = strList.stream()
.filter(x -> x.length()> 3)
.count();
System.out.print(num);
	}
}
