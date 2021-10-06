package se.dagstrings;

public class Demo {
    public void runDemo() {
        String rad = "a123;panna;123";
        String[] parts = rad.split(";");
        String productID = parts[0];
        String prodName = parts[1];
        String stockLevel = parts[2];
        int i;
        i = 123;
        for (String word : parts){ 
            System.out.println(word);
        }
    }

    public void Run() {
        String mening = "hej jag heter amanda";
        String[] words = mening.split(" ");
        for (String word : words) {
            System.out.print(word);
        }
    }
}
