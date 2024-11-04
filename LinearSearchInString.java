import java.util.Arrays;

public class LinearSearchInString {
    public static void main(String[] args) {
        String name = "Alex";
        char target = 'e';
//        System.out.println(linearSearchString(name,target));
//        System.out.println(linearSearchString2(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));  // Arrays.toString() -> it change String into array like; [A, l, e, x]
    }

    static boolean linearSearchString2(String str, char target){
        if (str.length()==0){
            return false;
        }
        // for each
        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
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
