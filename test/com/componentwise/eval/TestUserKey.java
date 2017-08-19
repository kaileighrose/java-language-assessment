package com.componentwise.eval;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by kmccrea on 8/18/17.
 */
public class TestUserKey {
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    public void testUserKey() {
        UserKey b1 = new UserKey(“Bill Smith”, “BSMITH”);
        UserKey b2 = new UserKey(“Bill Smith”, “BSMITH”);
        UserKey b3 = new UserKey(“Susan Smith”, “SSMITH”);
        UserKey b4 = new UserKey(null,null);

        System.out.println( b1.equals(b1) );  // prints true
        System.out.println( b1.equals(b2) );  // prints true
        System.out.println( b1.equals(b3) );  // prints false
        System.out.println( b1.equals(null) ); // prints false
        System.out.println( b1.equals(“Some String”) ); // prints false
        System.out.println( b4.equals(b1) ); // prints false

        java.util.Hashtable ht = new java.util.Hashtable();

        ht.put(b1,”Some Data”);

        String s = (String) ht.get(b2);

        System.out.println( s.equals(“Some Data”) );  // prints true

    }

}
