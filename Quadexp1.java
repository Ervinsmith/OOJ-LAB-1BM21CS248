import java.util.Scanner;
import java.lang.Math;

class Quadexp1{
public static void main(String args[]){ Scanner ss = new Scanner(System.in);
System.out.println("Enter the co-efficients of a,b,c"); int a =ss.nextInt();
int b =ss.nextInt(); int c =ss.nextInt();
int disc = (b*b)-(4*a*c); double r1,r2,r3,r4,r5;

if(disc>0){
r1=(-b+(Math.sqrt(disc)))/(2*a);
 
r2=(-b-(Math.sqrt(disc)))/(2*a);
System.out.println("The Roots are real and different:\n" + r1
+"\n" + r2);
}
else if(disc==0){ r3=(-b)/(2*a);
System.out.println("The roots are real and equal:\n" + r3);
}
else{
System.out.println("The roots are imaginary, no real solution"); double d;
d = Math.abs(disc); r4=(-b)/(2*a);
r5=(Math.sqrt(d))/(2*a);
System.out.println("The roots are:\n" + r4 + "+i" + r5); System.out.println("The roots are:\n" + r4 + "-i" + r5);
}
}
}
