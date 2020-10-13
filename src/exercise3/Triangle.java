package exercise3;

import java.util.Scanner;

public class Triangle {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);


System.out.println("Input the sides of Triangle");

double a = input.nextDouble();
double b = input.nextDouble();
double c = input.nextDouble();
if (a <= 0 || b <= 0 || c <= 0)
System.out.println("Values are not correct!");  

while (int a, b, c > 0);

if(a >= (b+c) || c >= (b+a) || b >= (a+c) )
System.out.println( "Not a Triangle");
else if(a==b && b==c)
System.out.println( "Triangle is Equilateral");
else if (((a * a) + (b * b)) == (c * c) || ((a * a) + (c * c)) == (b * b) || ((c * c) + (b * b)) == (a * a))
System.out.println( "Right Triangle");
else if(a!=b && b!=c && c!=a)
System.out.println( "Triangle is scalene" );
else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
System.out.println( " Triangle is isosceles");
}
}


