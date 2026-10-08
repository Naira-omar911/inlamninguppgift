package Wordcounter;

public class CharacterCounter {
    //Skriv ett program som läser in text ifrån kommandoraden
    // rad för rad tills användaren skriver ordet stop.
private int numberOFlines=0;
private int numberOFcharachter=0;
private int numberOfwords=0;
//CHECK if stop is included
     public boolean isStop(String text){
         return text.equals("stop");

     }
     //countlines and charachters and words
    public void addLine(String lines){
         numberOFlines++;
         numberOFcharachter+=lines.length();
         //split the text into words
        String[]words=lines.trim().split(" ");
        //count ´words
        numberOfwords+=words.length;
    }

    //getter methods

    public int getNumberOFlines() {
        return numberOFlines;
    }

    public int getNumberOFcharachter() {

         return numberOFcharachter;
    }

    public int getNumberOfwords() {
        return numberOfwords;
    }
}
