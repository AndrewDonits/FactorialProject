public class Main {

    public static void main(String[] args) {
        int num1 = 23;
        System.out.println("Factorial of " + num1 + " is: " + func(num1));

        int num2 = 5;
        System.out.println("Factorial of " + num2 + " is: " + func(num2));

        int num3 = 1;
        System.out.println("Factorial of " + num3 + " is: " + func(num3));

    }

    public static long func (int n) {
        if (n <= 1)
            return n;
        else
            return n * func(n -1);
    }
}
