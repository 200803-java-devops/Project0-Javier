package one;

import static org.junit.Assert.*;

import org.junit.Test;

public class myTests {
    @Test
    public void headertest(){
    Note note = new Note();
    String expected = " ";
    String actual = note.getHeader();
    assertEquals(expected, actual);
    }
}