
public class distance{
public static void main(String args[]){
float u=28;//initial velocity
float t=120;//time
float a=27;//acceleration
double s = u * t + (1/2 * a * Math.pow(t,2));  // when you use Math.pow() function, then always remember to store it in "double" data type
System.out.println(s);
}
}
