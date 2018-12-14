
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


    ArrayList<Klausur> Klausuren = new ArrayList<Klausur>();
    ArrayList<Muendlich> Muendlich = new ArrayList<Muendlich>();

    //Konstruktor

    Fach(String name, boolean leistungskurs, double gewichtungKlausur, double gewichtungMuendlich){

        this.name = name;
        this.leistungskurs = leistungskurs;
        this.gewichtungKlausur = gewichtungKlausur / 100;
        this.gewichtungMuendlich = gewichtungMuendlich / 100;

    }



    //Methoden

    public void addKlausur(int notenpunkte){

        Klausur klausur1 = new Klausur();
        klausur1.setNotenpunkte(notenpunkte);
        klausur1.setHalbjahr(1);
        Klausuren.add(klausur1);

    }

    public void addMuendlich(int notenpunkte){

        Muendlich muendlich1 = new Muendlich();
        muendlich1.setNotenpunkte(notenpunkte);
        Muendlich.add(muendlich1);

    }

    //Berechnet den Durchschnitt aller Klausuren von dem jeweiligem Fach

    public double durchschnittKlausur(ArrayList<Klausur> Klausuren){

        Klausur x = new Klausur();
        double sum = 0;
        double durchschnitt = 0;

        for (int i = 0; i < Klausuren.size(); i++){
            x = Klausuren.get(i);
            sum += x.getNotenpunkte();

        }

        durchschnitt = sum / Klausuren.size();

        return durchschnitt;
    }

    //Berechnet den Durchschnitt aller Mündlichen Noten von dem jeweiligem Fach

    public double durchschnittMuendlich(ArrayList<Muendlich> Muendlich){

        Muendlich x = new Muendlich();
        double sum = 0;
        double durchschnitt = 0;

        for (int i = 0; i < Muendlich.size(); i++){

            x = Muendlich.get(i);
            sum += x.getNotenpunkte();

        }

        durchschnitt = sum / Muendlich.size();

        return durchschnitt;
    }

    //Berechnet gesamten Durchschnitt eines

    public double gesamtDurchschnitt(){

        double durchschnitt = (gewichtungMuendlich * durchschnittMuendlich(Muendlich)) + (gewichtungKlausur * durchschnittKlausur(Klausuren));

        return Math.round(durchschnitt * 100.00) / 100.00;

    }



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
