public class reverseString {
    public static void main(String[] args) {
        String input = "HELLO DURVESH WAGH";
        String[] word = input.split(" ");
        String reversedString = "";

        for (String w : word){
            String reverse = " ";
            for (int i = w.length() - 1; i >= 0 ; i--) {
                reverse = reverse + w.charAt(i);
            }
            reversedString = reversedString + reverse;
        }
        System.out.println(reversedString);
    }

}
