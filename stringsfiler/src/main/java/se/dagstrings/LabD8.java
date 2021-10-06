package se.dagstrings;

public class LabD8 {
    public void Run(){
        System.out.println("Ange spelarnamn: ");
        String spelarNamn = System.console().readLine();

        if(spelarNamn.equalsIgnoreCase("mats sundin")){
            System.out.println("Japp, nr 13 var bäst");
        } else {
            System.out.println("Aldrig hört talas om den spelaren...");
        }
    }
}
/**Gör ett program där man får mata in

Ange spelarnamn:

 

Om man skriver "Mats Sundin" ska du skriva ut "Japp, nr 13 var bäst"
Annars skriver du ut: "Aldrig hört talas om den spelaren..."



'OBS: Jämförelse ska vara Case Insensitive! Dvs skriver man in "mats sundin" så ger det träff liksom "MaTs SuNdIN" eller whatever

 */