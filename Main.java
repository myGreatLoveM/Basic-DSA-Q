public class Main{
    public static void main(String[] args) {
       int a = fibo(6);
       System.out.println(a); 
    }

    public static int fibo(int n) {
        
        if (n < 2) { // n==0 || n==1
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
}