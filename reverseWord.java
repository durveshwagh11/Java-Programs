public class reverseWord {
    public static void main(String[] args) {
        String input = "Durvesh Wagh";
        String[] word = input.split(" ");
        String rev = "";

        for (int i = word.length - 1; i >= 0 ; i--) {
            rev = rev + word[i] + " ";
        }
        System.out.println(rev);
    }
}
