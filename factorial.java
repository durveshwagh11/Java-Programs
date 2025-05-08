public class factorial {

    public static int factorialWithoutRecursion(int n){
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }


    public static int factorialRecursion(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        else return n * factorialRecursion(n -1);
    }


    public static void main(String[] args) {
        System.out.println(factorialRecursion(10));

        System.out.println(factorialWithoutRecursion(5));
    }
}

