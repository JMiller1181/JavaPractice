public class Recursion {
    public Recursion(){

    }
    public int factorial(int n) {
        //if statement to make sure I don't multiply by 0
        if(n > 0){
            //n multiplied by value of n-1
            n = n * factorial(n - 1);
            // else statement to end the recursion
        } else{
            n = 1;
        }
        return n;
    }
    public int bunnyEars(int bunnies) {
        //if statement to make sure it only runs at values above 0
        if(bunnies > 0){
            //recursive call
            bunnyEars(bunnies - 1);
        }
        //return double the amount of bunnies(two ears each)
        return bunnies + bunnies;
    }
    public int fibonacci(int n) {
        //set base case for 0
        if (n == 0) {
            return 0;
            //set base case for 1
        } else if(n == 1) {
            return 1;
            //the result needs to be the two cases before it added together
        } else {
            return (fibonacci(n-1) + fibonacci(n-2));
        }
    }

}
