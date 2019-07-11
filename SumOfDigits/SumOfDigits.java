public class SumOfDigits {
  //returns the sum of all the constituent digits of a number
  static int sum(int n){
       return (n/10==0)? n : (n%10 + sum(n/10));
   } 
}