public class Practice {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.factorial(4));
        System.out.println(recursion.bunnyEars(4));
        System.out.println(recursion.fibonacci(5));
        ArrayPractice arrayPractice = new ArrayPractice();
        int[] array = {2,4,5,6,7,9};
        System.out.println(arrayPractice.countEvens(array));
        System.out.println((arrayPractice.bigDiff(array)));
        System.out.println(arrayPractice.centeredAverage(array));

    }
    public boolean sleepIn(boolean weekday, boolean vacation) {
        //set case for the only false outcome
        if (weekday == true && vacation == false) {
            return false;
            //otherwise always return true
        } else {
            return true;
        }
    }
    public int diff21(int n) {
        //if n is less than 21 return 21 - n
        if (n <= 21){
            return 21-n;
            //all other cases n > 21, subtract 2 from n, multiply result by 2
        } else {
            return  (n - 21) * 2;
        }
    }

}
