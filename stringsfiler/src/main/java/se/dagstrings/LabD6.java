package se.dagstrings;

public class LabD6 {
    public void Run() {
        System.out.println("Program starts: Skriv för och efternamn: ");
        String firstNlast = System.console().readLine();

        String[] words = firstNlast.split(" ");
        String first = words[0];
        String last = words[1];
        char firstIn = first.charAt(0);
        char lastIn = last.charAt(0);
        
        System.out.println("Output: " + Character.toUpperCase(firstIn) + "." + Character.toUpperCase(lastIn));
    }
}
/**
 * D6 - Initialer
 * 
 * Write a function to convert a name into initials. You can assume the program
 * takes in two words with one space in between them. The output should be two
 * capital letters with a dot separating them.
 * 
 * It should look like this:
 * 
 * Program Starts: Please enter name: Sam Smith
 * 
 * Output: S.S
 */