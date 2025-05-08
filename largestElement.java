public class largestElement {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,7,4,2,7,8,8};
        int largest = 0;

        for (int i : arr){
            if (i > largest){
                largest = i;
            }
        }
        System.out.println(largest);
    }
}
