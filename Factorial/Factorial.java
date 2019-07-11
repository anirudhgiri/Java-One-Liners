class Factorial{
    //returns the factorial of n
    static int fact(int n){
        return n<=1 ? n : n * fact(n-1);
    }
}