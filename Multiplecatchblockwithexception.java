public class Multiplecatchblockwithexception {
public static void main(String args[]) {
try {
int a = args.length;
System.out.println(+a);
int b=10/a;
int c[]= {1};
c[10]=100;
}
catch(ArithmeticException e) {
System.out.println("Divide by zero"+e);
}
catch(ArrayIndexOutOfBoundsException e) {
System.out.println("Array index out of bounds"+e);
}
System.out.println("after try catch blocks");
}
}
