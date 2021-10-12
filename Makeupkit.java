class Makeupkit{
static String name="lipstick";
static String brand="colorbar";
static int lip_price=210;
static float kajol_price=130;
public static void main(String[] args){
System.out.println(name);
System.out.println(brand);
if(lip_price>200){
System.out.println("Purchase lipstick of rs "+lip_price);
}
if(kajol_price<100){
System.out.println("Purchase kajol of rs "+kajol_price);
}
else{
System.out.println("Kajol was out of range");
}
}
}