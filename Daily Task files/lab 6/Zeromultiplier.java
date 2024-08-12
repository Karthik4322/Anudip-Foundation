class Calculator{
int Multiply(int x, int y){

this.a = x;
this.b = y;
int c = a*b;
return c;
}

float Multiply(int x, float y){

this.l = x;
this.m = y;
float n = l*m;
return n;
}

float Multiply(int x, int y, float z){

this.p = x;
this.q = y;
this.r = z;
float s = p * q * r ;
return s;
}
}
class Zeromultiplier{
public static void main(String args[]){

Calculator calc = new Calculator();
System.out.println(+calc.Multiply(4,2));
System.out.println(+calc.Multiply(5,0.5f));
System.out.println(+calc.Multiply(2,4,6.5f));
}
}