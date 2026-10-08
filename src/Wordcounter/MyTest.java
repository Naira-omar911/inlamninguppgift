package Wordcounter;


import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.Callable;

public class MyTest {
    @Test
    public void testStop(){
        CharacterCounter counter=new CharacterCounter();
         Assert.assertTrue((counter.isStop("stop")));

    }
    @Test
    public void numberOflines(){
        CharacterCounter Counter=new CharacterCounter();
        Counter.addLine("My name is nayyra");
        Counter.addLine("I am 37 years old");
       Assert.assertEquals (2,Counter.getNumberOFlines());

    }
    @Test
    public void numberOfwords(){
    CharacterCounter Counter=new CharacterCounter();
             Counter.addLine("My name is nayyra");
             Assert.assertEquals(4,Counter.getNumberOfwords());

       }

}
