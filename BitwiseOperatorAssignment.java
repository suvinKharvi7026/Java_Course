class BitwiseOperatorAssignment{
public static void main(String[] args){
int i=400;
int j=800;
System.out.println(i>j && ++i<j);
System.out.println("i :"+i);
System.out.println(i<j & ++i>j);
System.out.println("i :"+i);

System.out.println(i!=j || i++ !=j);
System.out.println("j :"+j);
System.out.println(i!=j | j++!=i);
System.out.println("j :"+j);

}
}