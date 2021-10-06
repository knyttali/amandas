package se.dagstrings;

public class LabD7 {
    public void Run() {
        System.out.println("Program starts: Skriv för och efternamn: ");
        String firstNlast = System.console().readLine();

        String[] words = firstNlast.split(" ");
        String firstName = words[0];
        String lastName = words[1];

        String doneFirst = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        String doneLast = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        System.out.println(doneFirst + " " + doneLast);
    }
}
/**
 * Du har en sträng tex
 * 
 * string namn="kurt andersson";
 * 
 * eller
 * 
 * string namn="leif stefan holmberg";
 * 
 * Skriv kod så att förnamn och efternamn i variabeln i en ny variabel
 * (caseName) börjar med stora bokstäver.
 * 
 * Resultatet skall bli så här "Kurt Andersson"
 */