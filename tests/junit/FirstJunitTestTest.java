package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstJunitTestTest {

    @Test
    public void getName() {
        System.out.println("First case");
    }

    @Test
    public void setLogim() {
        System.out.println("Login test done");
    }

    @Test
    public void tearclose() {
        System.out.println("driver close");
    }


}