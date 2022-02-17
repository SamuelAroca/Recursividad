public class Recursividad {
    public static void main (String[] argv) {
        //System.out.println(f(10));
        //System.out.println(fib_recursivo(7));
        //metodoA('Z');
        //System.out.println(Suma(259));
        //System.out.println(Mcd(36, 24));
    }

    //Factotial
    public static int f(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return f(n-1) * n;
        }
    }
    //Fibonacci
    static long fib_recursivo(int n) { // n >= 0
        if (n == 0 || n == 1)
            return n;
        else
            return fib_recursivo(n-1) + fib_recursivo(n-2);
    }
    //Recursividad indirecta
    static void metodoA(char c) {
        if (c == 'A')
            System.out.print(" " + c);
        else
            metodoB(c);
    }

    static void metodoB(char c) {
        char otro = c;
        metodoA(--c);
        System.out.print(" " + otro);
    }
    //Suma digitos Naturales
    static int Suma(int n){
        int modulo = n%10;
        if (n>9)
            return Suma(n/10) + modulo;
        else
            return n;
    }
    static int Mcd(int m, int n){
        if (n<=m && n%m==0)
            return n;
        else if (m<n)
            return Mcd(n,m);
        else
            return Mcd(n,m%n);
    }//git config --global user.email "samuel.arocad@unac.edu.co"
    //git config --global user.name "Samuel Aroca"
}