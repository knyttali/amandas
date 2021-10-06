package se.dagstrings;

public class LabD5 {
    public void Run(){
        System.out.println("skriv in en mening: ");
        String mening = System.console().readLine();

        System.out.println("skriv in en position som ett tal: ");
        int position = Integer.parseInt(System.console().readLine());

        if(position < 0 || position > mening.length()){
            System.out.println("Felmeddelande");
        }else {
            System.out.println(mening.charAt(position));
        }
    }
}
/**Be användare mata in ett ord eller en mening. 

Fråga användaren: ange en position: och mata in ett tal

Ta fram det tecken som finns i strängen på den positionen

OBS: Felkontroller...<0 eller > length ska ge felmeddelande och ny inmatning
*/