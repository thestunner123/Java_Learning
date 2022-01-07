public class Variable{
int a=20; //instance variable
static int m=30; //static variable
public static void main(String[]args){
int x=120; //local variable
System.out.println(m); //m variable is here.
Variable obj=new Variable();
obj.test();
}
public void test(){
System.out.println(a); //a is available here.
//System.out.println(x);//x is not available here.
}
}