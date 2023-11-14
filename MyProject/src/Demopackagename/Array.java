
package Demopackagename; 
import java.util.ArrayList;
import java.util.List;
public class Array {
public static void main(String args[])
{
	//String a="abc";
	//int num=Integer.valueOf(a);//numberformatexception
List<String> names = new ArrayList<String>();
   names.add("john");
   names.add("rimel");
   names.add("reka");
   
long count=names.stream().filter(str->str.length()<6).count();
System.out.println("the count of all names less than length 6 are "+count);
}
}
