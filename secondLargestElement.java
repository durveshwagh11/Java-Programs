public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,7,4,2,7,8,8,9};
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for (int i : arr){
            if(i > largest){
                slargest = largest;
                largest = i;
            } else if (i > slargest && i < largest){
                slargest = i;
            }
        }
        System.out.println(slargest);
    }
}
