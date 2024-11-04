public class LinearSearchInRange {
    public static void main(String[] args) {
    int[] arr = {10, 5, 545, 6, 98, 48, 15, 65, 69, 47, 103,};
    int target = 15;
        System.out.println(linearSearch(arr, target,3,7));
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length==0){
            return -1;
        }

        // run for loop
        for (int index = start; index <= end; index++) {
            // check for element at every index if it is = index
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
