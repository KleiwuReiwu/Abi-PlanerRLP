import java.util.*;

public class Main {

    public static void main(String[] args) {
   /*
       Fach Mathe = new Fach("Mathe", true, 66.66, 33.33);

       Mathe.addKlausur(15,1);
       Mathe.addKlausur(13,1);
       Mathe.addKlausur(11,1);
       Mathe.addKlausur(8,1);

       Mathe.addMuendlich(12,1);
       Mathe.addMuendlich(10,1);
       Mathe.addMuendlich(8,1);

       Mathe.addKlausur(10,2);
       Mathe.addKlausur(9,2);
       Mathe.addKlausur(5,2);
       Mathe.addKlausur(15,2);

       Mathe.addMuendlich(8,2);
       Mathe.addMuendlich(9,2);
       Mathe.addMuendlich(2,2);

        System.out.println(Mathe.KlausurenHJ1);
   */
   while(true) {
      Abitur abitur = new Abitur();
      int lK;
      boolean leistungskurs;
      double gewichtungKlausur;
      double gewichtungMuendlich;
      int wahl;
      String fach = "";
      int notenpunkte;
      int halbjahr;
      Scanner scan = new Scanner(System.in);


      System.out.println("Was würdest du gerne tun?");
      System.out.println("1: Ein Fach hinzufügen.");
      System.out.println("2: Eine Klausur einem Fach hinzufügen.");
      System.out.println("3: Eine Mündliche Note einem Fach hinzufügen.");
      System.out.println("4: Die Daten über ein Fach ausgeben lassen.");
      wahl = scan.nextInt();

      switch (wahl) {
            case 1:
               String name = "";
               System.out.println("Schulfach: ");
               while(name.equals("")){
                  name = scan.nextLine();
               }

               System.out.println("Leistungskurs? ");
               lK = scan.nextInt();
               if (lK == 1) {
                  leistungskurs = true;
               } else {
                  leistungskurs = false;
               }
               System.out.println("Gewichtung Klausur: ");
               gewichtungKlausur = scan.nextDouble();
               System.out.println("Gewichtung Muendlich: ");
               gewichtungMuendlich = scan.nextDouble();

               abitur.addFach(name, leistungskurs, gewichtungKlausur, gewichtungMuendlich);

               System.out.println("Das Fach wurde erfolgreich hinzugefügt.");
               abitur.idek();
               break;
            case 2:

               System.out.println("Welchem Fach?");
               while(fach.equals("")) {
                  fach = scan.nextLine();
               }
               System.out.println("Wie viele Punkte?");
               notenpunkte = scan.nextInt();
               System.out.println("Welches Halbjahr?");
               halbjahr = scan.nextInt();

               abitur.addGradeKlausur(fach, notenpunkte, halbjahr);

               System.out.println("Die Klausur wurde erfolgreich hinzugefügt.");
               fach = "";
               break;
            case 3:

               System.out.println("Welchem Fach?");
               while(fach.equals("")) {
                  fach = scan.nextLine();
               }
               System.out.println("Wie viele Punkte?");
               notenpunkte = scan.nextInt();
               System.out.println("Welches Halbjahr?");
               halbjahr = scan.nextInt();

               abitur.addGradeMuendlich(fach, notenpunkte, halbjahr);

               fach = "";
               break;
            case 4:
               System.out.println("Welches Fach?");
               while(fach.equals("")) {
                  fach = scan.nextLine();
               }

               abitur.fachInformation(fach);
               fach = "";
               break;
         case 5:
            abitur.meow();
            break;
         }


   }




    }
}
