package se.dagstrings;

public class LabD2 {
    public void Run() {
        String changeString = "detta är en sträng du ska ändra";
        System.out.println(changeString);
        changeString = changeString.replace(" ", "*");
     
        int antalStars = 0;
        for (int i = 0; i < changeString.length(); i++){
            if (changeString.charAt(i) == '*'){
                antalStars++;
            }
        }
        System.out.println(changeString);
        System.out.println(antalStars);
    }
}
/**
 * Du har en sträng med texten ”Detta är en sträng som du skall ändra”. Ersätt
 * via kod
 * 
 * alla blanktecken i strängen med tecknet * . Räkna sedan ut via kod hur många
 * 
 * förekomster det finns av tecknet * i strängen.
 * 
 * 
 */