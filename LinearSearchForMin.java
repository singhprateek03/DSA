public class LinearSearchForMin {
    public static void main(String[] args) {
        int[] arr = {10, 5, 545, 6, 98, 48, 15, 65, 69, 47, 103,};
        System.out.println("Smallest value: "+min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
