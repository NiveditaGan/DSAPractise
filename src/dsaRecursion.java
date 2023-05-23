public class dsaRecursion {

    public static void main(String[] args){
       // int sum = sumOfDigit(4);
       // System.out.println("Print Sum of Values"+sum);
      //  System.out.println("Factorial Number:: "+factorial(5));
        System.out.println("Fibonacci Series:: "+fibonacci(7));

    }

    public static int sumOfDigit(int n){
        int arr[] = {1,2,6,4,8};
        if(n==0)
            return arr[n];
        return arr[n]+sumOfDigit(n-1);

    }

    public static int factorial(int n){
        if(n==1) return n;
        return n*factorial(n-1);
    }

    public static int fibonacci(int n){
        if (n==0 || n==1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
