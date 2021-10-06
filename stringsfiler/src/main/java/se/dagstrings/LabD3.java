package se.dagstrings;

public class LabD3 {
    public void Run() {
        System.out.println("email: ");
        String email = System.console().readLine();
        int langd = email.length();
        int LastIndexOfPunkt = email.lastIndexOf(".");
        int skillnad = langd - LastIndexOfPunkt;

        int position = email.indexOf('@');
        if (position == -1) {
            System.out.println("innehåller inget @");
        }

        if (skillnad <= 4 && skillnad >= 3)  {
            System.out.println("NICE");
        } else {
            System.out.println("ej giltig");
        }
    }
}
/**
 * Be användaren mata in en mailadress. Programmet skall kontrollera att
 * inmatningen är
 * 
 * rätt dvs att det finns ett @ tecken och att det finns en . med 2 eller 3
 * tecken efter.
 * 
 * Meddela användaren om det är rätt eller felaktig adress
 * 
 * @, ._ _ _
 */