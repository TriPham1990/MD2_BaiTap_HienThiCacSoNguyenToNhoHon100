public class PrintPrimeSmallThan100 {
    public static void main(String[] args) {
        for(int i = 2; i < 100; i++){
                checkPrime(i);
            }
    }

    public static void checkPrime(int number){
        int i = 2;
        boolean check = true;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                check = false;
                break;
            }
            i++;
        }
        if(check){
            System.out.println(number);
        }
    }
}
