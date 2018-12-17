import java.util.ArrayList;

public class Abitur {

    ArrayList<Fach> Faecher = new ArrayList<Fach>();

    public void addFach(String name, boolean leistungskurs, double gewichtungKlausur, double gewichtungMuendlich){
        Fach fach = new Fach();
        fach.setName(name);
        fach.setLeistungskurs(leistungskurs);
        fach.setGewichtungKlausur(gewichtungKlausur / 100.00);
        fach.setGewichtungMuendlich(gewichtungMuendlich / 100.00);
        Faecher.add(fach);

    }


    public void addGradeKlausur(String fachName, int notenpunkte, int halbjahr){

        Fach x = new Fach();
        for(int i = 0; i < Faecher.size(); i++){
            x = Faecher.get(i);
            if(fachName.equals(x.getName())){
                x.addKlausur(notenpunkte, halbjahr);
            }



        }
    }

    public void addGradeMuendlich(String fachName, int notenpunkte, int halbjahr){
        Fach x = new Fach();
        for(int i = 0; i < Faecher.size(); i++){
            x = Faecher.get(i);
            if(fachName.equals(x.getName())){
                x.addMuendlich(notenpunkte, halbjahr);
            }
        }
    }

    public void fachInformation(String fachName){

        Fach x = new Fach();

        for(int i = 0; i < Faecher.size(); i++){
            x = Faecher.get(i);

            if(fachName.equals(x.getName())){
                System.out.println("Fach wurde gefunden!");
                System.out.println("Fach: " + x.getName());
                System.out.println("Gewichtung Muendlich: " +  x.getGewichtungMuendlich());
                System.out.println("Gewichtung Klausur: " +    x.getGewichtungKlausur());
                System.out.println("Durchschnitt Halbjahr1: " + x.durchschnittHalbjarX(1));
                System.out.println("Durchschnitt Halbjahr2: " + x.durchschnittHalbjarX(2));
                System.out.println("Durchschnitt Halbjahr3: " + x.durchschnittHalbjarX(3));
                System.out.println("Durchschnitt Halbjahr4: " + x.durchschnittHalbjarX(4));
            }
        }
    }








}
