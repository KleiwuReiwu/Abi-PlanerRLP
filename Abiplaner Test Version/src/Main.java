import java.util.*;

public class Main {

    public static void main(String[] args) {


      Abitur abitur = new Abitur();


      abitur.addFach("Mathe", true, 50, 50);
      abitur.addGradeMuendlich("Mathe", 14, 1);
      abitur.addGradeMuendlich("Mathe", 14, 1);
      abitur.addGradeMuendlich("Mathe", 7, 1);
      abitur.addGradeMuendlich("Mathe", 15, 1);

      abitur.addGradeKlausur("Mathe", 11, 1);
      abitur.addGradeKlausur("Mathe", 8, 1);

      abitur.fachInformation("Mathe");










    }
}
