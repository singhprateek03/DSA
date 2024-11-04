public class LinearSearchInArray {
    public static void main(String[] args) {
    int[] nums = {10, 45, 15, 78, 48, 65, 14, 65, 32, 86, 18, 60, 98};
    int target = 14;
    int ans = linearSearch(nums, target);
        System.out.print("Index: "+ans+"\t");
    int element = linearSearch2(nums, target);
        System.out.print("Element: "+element);
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target){
        if (arr.length==0){ // arr.length -> It is a variable
            return -1;
        }

        // run for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = index
            int element = arr[index];
            if (element == target){
                return element;
            }
        }
        return -1;
    }
    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }

        // run for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = index
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
