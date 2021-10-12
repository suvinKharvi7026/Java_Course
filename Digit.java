import java.util.Scanner;
class Digit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for n");
int n=sc.nextInt();
if(0<=n&&n<=9){
  System.out.println("one");
  }
else if(10<=n&&n<=99){
  System.out.println("two");
  }
else if(100<=n&&n<=999){
  System.out.println("three");
  }
else if(1000<=n&&n<=9999){
  System.out.println("four");
  }
else if(10000<=n&&n<=99999){
  System.out.println("five");
  }
else(n>=100000){
  System.out.println("More than five");
  }
}
}