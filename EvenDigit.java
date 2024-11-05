public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(+findNumbers(nums)+" Even number present in the array.");
        System.out.println("Negative value is "+digit(-1000)+" digit");
        System.out.println(digit2(456784));
    }

    // Shortcut to find the digit value
    static int digit2(int num){
        if (num < 0){
            num *= -1;
        }
        return (int)(Math.log10(num))+1;
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int num: nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = digit(num);
     /*
        if(numberOfDigits % 2 == 0){
        return true;
        }
        return false;
     */
        return numberOfDigits % 2 == 0;
    }

    // count number of digits in a number
    static int digit(int num){

        if(num == 0){
            return 1;
        }

        // For negative number
        if (num < 0){
            num *= -1;
        }

        // for positive number
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
