public class Main {

    public static void main(String[] args) {

       Fach Mathe = new Fach("Mathe", true, 66.66, 33.33);

       Mathe.addKlausur(15);
       Mathe.addKlausur(13);
       Mathe.addKlausur(11);
       Mathe.addKlausur(8);

       Mathe.addMuendlich(12);
       Mathe.addMuendlich(10);
       Mathe.addMuendlich(8);

       System.out.println(Mathe.gesamtDurchschnitt());






    }
}
