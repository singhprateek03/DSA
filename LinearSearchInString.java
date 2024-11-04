public class LinearSearchInString {
    public static void main(String[] args) {
        String name = "Alex";
        char target = 'e';

    }

    static boolean linearSearchString(String str, char target){
        if (str.length() == 0){ // str.length()-> is a function
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){      // str.charAt(i) -> It stores target character
                return true;
            }
        }
        return false;
    }
}
