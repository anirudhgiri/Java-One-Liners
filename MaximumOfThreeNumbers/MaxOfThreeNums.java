public class MaxOfThreeNums {
    //returns the biggest of three numbers
    static int max(int a,int b, int c){
        return (a>b) ? (a > c ? a : c) : (b > c ? b : c);
    }
}