package recursion;

public class re02Pow {
    

    static double myPow(int x,int n){

        if(n==0) return 1;
        if(n<0) {
            x=1/x;
            n=-n;
        }
        double halfPow = myPow(x, n / 2);
        
        // Multiply the result by itself to get x^n
        double result = halfPow * halfPow;
        
        // If n is odd, multiply the result by x once more
        if (n % 2 != 0) {
            result *= x;
        }
        
        return result;
    }



    


    public static void main(String args[]){
        System.out.println(myPow(2,3));
        
    }
}
