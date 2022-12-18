import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {

    @Test(expected = NumberFormatException.class)
    public void Empty() throws Exception{
        Class.Decode("");
    }

    @Test
    public void FirstPlus(){
        assertEquals(Integer.valueOf(14), Class.Decode("+14"));
    }

    @Test
    public void FirstMinus(){
        assertEquals(Integer.valueOf(-14), Class.Decode("-14"));
    }

    @Test(expected = NumberFormatException.class)
    public void SecondMinus(){
        Class.Decode("2-");
    }

    @Test(expected = NumberFormatException.class)
    public void SecondPlus(){
        Class.Decode("2+");
    }

    @Test
    public void StartsWithNullX(){
        assertEquals(Integer.valueOf(18), Class.Decode("0x12"));
    }

    @Test
    public void StartsWithSharp(){
        assertEquals(Integer.valueOf(18), Class.Decode("#12"));
    }

    @Test
    public void StartsWithNull(){
        assertEquals(Integer.valueOf(13), Class.Decode("015"));
    }

    @Test(expected = NumberFormatException.class)
    public void StrangeThings(){
        Class.Decode("00ss");
    }

    @Test
    public void IntMinValue(){
        String l = String.valueOf(Integer.MIN_VALUE);
        assert(Integer.MIN_VALUE == Class.Decode(l));
    }
}