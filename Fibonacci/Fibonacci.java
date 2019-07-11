class Fibonacci{
    //returns the nth fibonacci number (assuming the first fibonacci number is 0 as opposed to 1)
    static int fib(int n){
        return (n<=2)? n-1 : fib(n-1) + fib(n-2);
    }
}