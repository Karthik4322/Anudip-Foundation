class Copy{

static int  multiply(int x, int y){

return x*y;

}
static float multiply(int x, float y){
 
return x*y;

}
static float multiply(int x, int y, float z){

return x*y*z;

}

public static void main(String args[]){

System.out.println(Copy.multiply(3,2));
System.out.println(Copy.multiply(3,9.5f));
System.out.println(Copy.multiply(4,4,5.5f));

}
}