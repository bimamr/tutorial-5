public class Q4 {
    public static void main(String[] args) {
        String[] sentence = {"the", "cat", "in", "the", "hat"};
        int count = 0;
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i].equals("the")) {
                count++;
            }
        }
        System.out.println(count);
    }
}