package array;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DATEclass {
public static void main(String[] args) { 
Date a = new Date();
System.out.println(a);
SimpleDateFormat sdf = new SimpleDateFormat ("ww/dd/MM/yyyy");
String dd = sdf.format(a);
System.out.println(dd);







}
}
