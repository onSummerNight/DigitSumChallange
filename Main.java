public class Main {
    public static void main(String[] args) {
        int sumNumber = 32123;

        System.out.println("The sum of digits in number " + sumNumber + " is "+ sumDigits(32123));
    }

    public static int sumDigits(int number){
        int sum = 0;

        if (number < 0){
            return -1;
        } else {
            while (true){
                if (number < 10){
                    sum = sum + number;
                    break;
                } else {
                    sum = sum + (number % 10);
                    number = number / 10;
                }
            }
        }
        return sum;
    }
}
