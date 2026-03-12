public class BitwiseDemo {
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011
        int x=12;
		 System.out.println(x<<2);
		 System.out.println(a<<b);
        System.out.println("a & b  = " + (a & b));  // 0101 & 0011 = 0001 (1)
        System.out.println("a | b  = " + (a | b));  // 0101 | 0011 = 0111 (7)
		// 0011
        System.out.println("a ^ b  = " + (a ^ b));  // 0101 ^ 0011 = 0110 (6)
        System.out.println("~a     = " + (~a));     // ~0101 = 1010 (-6 in 2's complement)
        System.out.println("a << 1 = " + (a << 1)); // 0101 << 1 = 1010 (10)
        System.out.println("a >> 1 = " + (a >> 1)); // 0101 >> 1 = 0010 (2)
    }
}
/*
Use Cases of Bitwise Operators
Fast Multiplication/Division by 2 → x << 1 (multiply), x >> 1 (divide)

Checking Even/Odd → x & 1 == 0 (Even), x & 1 == 1 (Odd)

Swapping Numbers Without Extra Variable → a = a ^ b; b = a ^ b; a = a ^ b;

Bit Masking → Used in permissions and flags

Efficient Computations → Used in cryptography, networking, and graphics

*/

