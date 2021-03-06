package cn.tju.Juane;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.hamcrest.core.AllOf;
import org.junit.Before;
import org.junit.Test;

public class TestHomework3 {
	
	ByteArrayOutputStream out;
    PrintStream ps;

    
    public Homework3 primes = new Homework3();
    int [] print = {2, 3, 5};
    
    @Before
    public void setUp(){
        out = new ByteArrayOutputStream();
        ps = new PrintStream(out);
        System.setOut(ps);
    }
    
    @Test
    public void test() throws IOException {
        out.flush();
        primes.printPrimes(3); 
        assertEquals("Prime: 2\r\nPrime: 3\r\nPrime: 5\r\n", out.toString());

 }
}
