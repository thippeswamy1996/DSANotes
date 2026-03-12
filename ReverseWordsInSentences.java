public class ReverseWordsInSentences{
    public static void main(String[] args) {
        String sentence = "Java is very powerful";
        String[] words = sentence.split(" ");
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }

        System.out.println(reversed.trim());
    }
}
