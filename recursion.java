public class Main{
    public static void main(String[] args){
        walk(3);
        int fact = factorial(6);
        System.out.println(fact);
        int pow = power(2,8);
        System.out.println(pow);
    }

    private static void walk(int steps) {
        if(steps < 1) return; //base case
        System.out.println("You took a step");
        walk(steps - 1);
    }

    private static int factorial(int num) {
        if(num < 1) return 1;
        return num * factorial(num - 1);
    }

    private static int power(int base, int exponent) {
        if(exponent < 1) return 1;
        return base * power(base, exponent - 1);
    }
}
