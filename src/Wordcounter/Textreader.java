package Wordcounter;
import java.util.Scanner;
public class Textreader {
    static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        CharacterCounter counter=new CharacterCounter();
        System.out.println("write text.write stop when you finish.");
        while (true){
            String input= scan.nextLine();
            //check if stop
            if (counter.isStop(input)){
                break;
            }
                //send line to logic class
                counter.addLine(input);

        }
        //print results
        System.out.println("Lines:"+counter.getNumberOFlines());
        System.out.println("characters:"+counter.getNumberOFcharachter());
        System.out.println("words:"+counter.getNumberOfwords());
        scan.close();
    }
}
