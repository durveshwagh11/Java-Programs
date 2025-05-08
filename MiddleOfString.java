public class MiddleOfString {
    public static void main(String[] args) {
        String input = "Durvesh";
        char[] word = input.toCharArray();
        int len = word.length;

        if (len % 2 == 0) {
            // Even length – print two middle characters
            System.out.println(word[len / 2 - 1] + " " + word[len / 2]);
        } else {
            // Odd length – print one middle character
            System.out.println(word[len / 2]);
        }
    }
}
