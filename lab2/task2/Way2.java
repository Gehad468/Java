public class Way2 {
    private String word;
    private String paragraph;

    // Constructor
    public Way2(String paragraph, String word) {
        this.word = word;
        this.paragraph = paragraph;
    }

    // Method
    public void occurrence() {
        int index = paragraph.indexOf(word);// return first index 
        int count = 0;
        while (index != -1) {
            count++;
            index = paragraph.indexOf(word, index + word.length());
        }
        System.out.println("Number of occurrences of the word " + word + " in the paragraph: " + count);
    }

    public static void main(String[] args) {
        Way2 w = new Way2("Hello World He hello Hlo", "Hello");
        w.occurrence();
    }
}
