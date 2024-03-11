public class word {
    private String word;
    private String paragraph;

    // constructor
    public word(String paragraph, String word) {
        this.word = word;
        this.paragraph = paragraph;
    }
    // method
    public void occurrence() {
        String[] words = paragraph.split(word);
        int count = words.length ; 
        System.out.println("Number of occurrences of the word \"" + word + "\" in the paragraph: " + count);
    }

    public static void main(String[] args) {
        word n = new word("Hello World HEllo hello Hello", "Hello");
        n.occurrence();
    }

}
