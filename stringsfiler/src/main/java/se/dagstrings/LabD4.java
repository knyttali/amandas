package se.dagstrings;

public class LabD4 {
    public void Run() {
        String mening = "Detta är min text som jag matar in";
        System.out.println(mening);
        int i = 0;

        String[] words = mening.split(" ");
        for (String word : words) {
            System.out.println(word);
            i++;
        }
        System.out.println(i);
    }
}
/**
 * Gör ett program där användaren får mata in en mening t ex ”Detta är min text
 * som jag matar in”. Programmet skall räkna ut hur många ord meningen består av
 * och meddela användaren om detta.
 * 
 * OBS: detta är svårt. Vi kör happy case = vi kan förutsätta ett endaste
 * MELLANSLAG mrllan
 */