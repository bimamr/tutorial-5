public class Q5 {
    public static void main(String[] args) {
        String[] sentence = {"java", "programming", "is", "fun"};
        for (int i = sentence.length - 1; i >= 0; i--) {
            String word = sentence[i];
            for (int j = word.length() - 1; j >= 0; j--) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}