//Abhiraj Anand  SAP_ID:590024872
public class Sample {
    public static void main(String[] args) {

        int x = 15, y = 4;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y));
        System.out.println("Modulus: " + (x % y));

        int a = 10;
        System.out.println("Unary Operators:");
        System.out.println("Original a: " + a);
        System.out.println("Post-increment a++: " + (a++));
        System.out.println("After Post-increment a: " + a);
        System.out.println("Pre-decrement --a: " + (--a));

        int b = 20;
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        boolean val1 = true, val2 = false;
        System.out.println("Logical Operators:");
        System.out.println("val1 && val2 = " + (val1 && val2));
        System.out.println("val1 || val2 = " + (val1 || val2));
        System.out.println("!val1 = " + (!val1));

        int num1 = 5;
        int num2 = 3; 
        System.out.println("Bitwise Operators:");
        System.out.println("num1 & num2 = " + (num1 & num2));   
        System.out.println("num1 | num2 = " + (num1 | num2));   
        System.out.println("num1 ^ num2 = " + (num1 ^ num2));   
        System.out.println("~num1 = " + (~num1));               
        System.out.println("num1 << 1 = " + (num1 << 1));       
        System.out.println("num1 >> 1 = " + (num1 >> 1));     
    }
}
