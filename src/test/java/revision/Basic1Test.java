package revision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Basic1Test {

    Basic1 bb = new Basic1();
    @Test
    public void twoMustReturnEven(){
        assertEquals(2+" is an even number", bb.evenOddNumber(2));
    }

    @Test
    public void threeMustReturnOdd(){
        assertEquals(3+" is an odd number", bb.evenOddNumber(3));
    }

    @Test
    public void EightyOneMustReturnOdd(){
        assertEquals(81+" is an odd number", bb.evenOddNumber(81));
    }

}