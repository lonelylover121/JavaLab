import java.util.*;
public class AreaCircle{
	
public static double AreaCircle(double radius) {
double pi=3.14;
return pi*radius*radius;
}
public static void main(String[] args){

Scanner input= new Scanner(System.in);
System.out.println("Enter the Radius:");
float radius=input.nextFloat();
System.out.println("Area of Given Radius:"+AreaCircle(radius));


}
}
