
import java.util.ArrayList;


public class Fach {

    //Attribute
    String name;
    boolean leistungskurs;
    double currentDurchschnitt;
    double durchschnittHalbjahr1;
    double durchschnittHalbjahr2;
    double durchschnittHalbjahr3;
    double durchschnittHalbjahr4;
    double gewichtungMuendlich;
    double gewichtungKlausur;

    //Alle Klausuren und Mündliche Noten
    ArrayList<Klausur> Klausuren = new ArrayList<Klausur>();
    ArrayList<Muendlich> Muendlich = new ArrayList<Muendlich>();
    //Die einzelnen Halbjahre
    ArrayList<Klausur> KlausurenHJ1 = new ArrayList<Klausur>();
    ArrayList<Klausur> KlausurenHJ2 = new ArrayList<Klausur>();
    ArrayList<Klausur> KlausurenHJ3 = new ArrayList<Klausur>();
    ArrayList<Klausur> KlausurenHJ4 = new ArrayList<Klausur>();

    ArrayList<Muendlich> MuendlichHJ1 = new ArrayList<Muendlich>();
    ArrayList<Muendlich> MuendlichHJ2 = new ArrayList<Muendlich>();
    ArrayList<Muendlich> MuendlichHJ3 = new ArrayList<Muendlich>();
    ArrayList<Muendlich> MuendlichHJ4 = new ArrayList<Muendlich>();


    //Konstruktor
    /*
    Fach(String name, boolean leistungskurs, double gewichtungKlausur, double gewichtungMuendlich){

        this.name = name;
        this.leistungskurs = leistungskurs;
        this.gewichtungKlausur = gewichtungKlausur / 100;
        this.gewichtungMuendlich = gewichtungMuendlich / 100;

    }
*/


    //Methoden

    public void addKlausur(int notenpunkte, int halbjahr){

        Klausur klausur1 = new Klausur();
        klausur1.setNotenpunkte(notenpunkte);
        klausur1.setHalbjahr(halbjahr);

        switch (halbjahr){
            case 1:  KlausurenHJ1.add(klausur1);
                break;
            case 2:  KlausurenHJ2.add(klausur1);
                break;
            case 3:  KlausurenHJ3.add(klausur1);
                break;
            case 4:  KlausurenHJ4.add(klausur1);
                break;
        }

    }

    public void addMuendlich(int notenpunkte, int halbjahr){

        Muendlich muendlich1 = new Muendlich();
        muendlich1.setNotenpunkte(notenpunkte);
        muendlich1.setHalbjahr(halbjahr);

        switch (halbjahr){
            case 1:  MuendlichHJ1.add(muendlich1);
                break;
            case 2:  MuendlichHJ2.add(muendlich1);
                break;
            case 3:  MuendlichHJ3.add(muendlich1);
                break;
            case 4:  MuendlichHJ4.add(muendlich1);
                break;
        }

    }

    //Berechnet den Durchschnitt vom ausgewählten Halbjahr

    public double durchschnittHalbjarX(int halbjahr){
        Klausur x = new Klausur();
        Muendlich y = new Muendlich();
        double sum = 0;
        double durchschnittKlausur = 0.0;
        double durchschnittMuendlich = 0.0;
        double durchschnitt = 0.0;


                if(halbjahr == 1) {
                    for (int i = 0; i < KlausurenHJ1.size(); i++) {

                        sum += x.getNotenpunkte();

                    }
                    durchschnittKlausur = sum / KlausurenHJ1.size();

                    sum = 0;

                    for (int i = 0; i < MuendlichHJ1.size(); i++) {
                        y = MuendlichHJ1.get(i);
                        sum += y.getNotenpunkte();

                    }

                    durchschnittMuendlich = sum / MuendlichHJ1.size();

                    durchschnitt = (gewichtungKlausur * durchschnittKlausur) + (gewichtungMuendlich * durchschnittMuendlich);

                    return Math.round(durchschnitt * 100.00) / 100.00;

                }
                else if(halbjahr == 2){

                    for (int i = 0; i < KlausurenHJ2.size(); i++) {
                        x = KlausurenHJ2.get(i);
                        sum += x.getNotenpunkte();

                    }
                    durchschnittKlausur = sum / KlausurenHJ2.size();

                    sum = 0;

                    for (int i = 0; i < MuendlichHJ2.size(); i++) {
                        y = MuendlichHJ2.get(i);
                        sum += y.getNotenpunkte();

                    }

                    durchschnittMuendlich = sum / MuendlichHJ2.size();

                    durchschnitt = (gewichtungKlausur * durchschnittKlausur) + (gewichtungMuendlich * durchschnittMuendlich);

                    return Math.round(durchschnitt * 100.00) / 100.00;

                }
                else if(halbjahr == 3){

                    for (int i = 0; i < KlausurenHJ3.size(); i++) {
                        x = KlausurenHJ3.get(i);
                        sum += x.getNotenpunkte();

                    }
                    durchschnittKlausur = sum / KlausurenHJ3.size();

                    sum = 0;

                    for (int i = 0; i < MuendlichHJ3.size(); i++) {
                        y = MuendlichHJ3.get(i);
                        sum += y.getNotenpunkte();

                    }

                    durchschnittMuendlich = sum / MuendlichHJ3.size();

                    durchschnitt = (gewichtungKlausur * durchschnittKlausur) + (gewichtungMuendlich * durchschnittMuendlich);

                    return Math.round(durchschnitt * 100.00) / 100.00;

                }
                else if(halbjahr == 4){

                    for (int i = 0; i < KlausurenHJ4.size(); i++) {
                        x = KlausurenHJ4.get(i);
                        sum += x.getNotenpunkte();

                    }
                    durchschnittKlausur = sum / KlausurenHJ4.size();

                    sum = 0;

                    for (int i = 0; i < MuendlichHJ4.size(); i++) {
                        y = MuendlichHJ4.get(i);
                        sum += y.getNotenpunkte();

                    }

                    durchschnittMuendlich = sum / MuendlichHJ4.size();

                    durchschnitt = (gewichtungKlausur * durchschnittKlausur) + (gewichtungMuendlich * durchschnittMuendlich);

                    return Math.round(durchschnitt * 100.00) / 100.00;

                }



        return 0;
    }


    //Berechnet gesamten Durchschnitt eines


    //Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLeistungskurs() {
        return leistungskurs;
    }

    public void setLeistungskurs(boolean leistungskurs) {
        this.leistungskurs = leistungskurs;
    }

    public double getCurrentDurchschnitt() {
        return currentDurchschnitt;
    }

    public void setCurrentDurchschnitt(double currentDurchschnitt) {
        this.currentDurchschnitt = currentDurchschnitt;
    }

    public double getDurchschnittHalbjahr1() {
        return durchschnittHalbjahr1;
    }

    public void setDurchschnittHalbjahr1(double durchschnittHalbjahr1) {
        this.durchschnittHalbjahr1 = durchschnittHalbjahr1;
    }

    public double getDurchschnittHalbjahr2() {
        return durchschnittHalbjahr2;
    }

    public void setDurchschnittHalbjahr2(double durchschnittHalbjahr2) {
        this.durchschnittHalbjahr2 = durchschnittHalbjahr2;
    }

    public double getDurchschnittHalbjahr3() {
        return durchschnittHalbjahr3;
    }

    public void setDurchschnittHalbjahr3(double durchschnittHalbjahr3) {
        this.durchschnittHalbjahr3 = durchschnittHalbjahr3;
    }

    public double getDurchschnittHalbjahr4() {
        return durchschnittHalbjahr4;
    }

    public void setDurchschnittHalbjahr4(double durchschnittHalbjahr4) {
        this.durchschnittHalbjahr4 = durchschnittHalbjahr4;
    }

    public double getGewichtungMuendlich() {
        return gewichtungMuendlich;
    }

    public void setGewichtungMuendlich(double gewichtungMuendlich) {
        this.gewichtungMuendlich = gewichtungMuendlich;
    }

    public double getGewichtungKlausur() {
        return gewichtungKlausur;
    }

    public void setGewichtungKlausur(double gewichtungKlausur) {
        this.gewichtungKlausur = gewichtungKlausur;
    }



}
