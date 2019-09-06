package com.javafortesters;

import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import com.marvel.Characters;
import com.marvel.Gods;

/**
 * Check classes of objects
 * @version 1.0 2019-09-06
 * @author Adam K.
 */

public class CheckClassTest {
    @Test
    public void checkIfClassOfAnObjectIsCorrect() {
        // Create 1 object of Characters from com.marvel
        Characters characterToTest = new Characters();
        System.out.println("characterToTest object is instanceOf of superclass Characters: " + characterToTest.getClass()); //expected superclass Characters
        System.out.println(characterToTest instanceof Characters);

        // Create 1 object of Gods from com.marvel
        Gods godToTest = new Gods(1,"Test","Test","Test","Test","Test");
        System.out.println("godToTest object is instanceOf of subclass Gods: " + godToTest.getClass()); //expected subclass Gods of superclass Characters
        System.out.println(godToTest instanceof Gods);

        // Create 1 object of Object from java.lang.Object
        Object object = new Object();
        System.out.println("object instanceOf of superclass Object: " + object.getClass()); //expected superclass Object
        System.out.println(object instanceof Object);

        // Verify & Validate
        assertTrue("characterToTest object instanceOf of superclass Characters", characterToTest instanceof Characters);
        assertTrue("godToTest object instanceOf of subclass Gods", godToTest instanceof Gods);
        assertTrue("object instanceOf of superclass Object", object instanceof Object);
    }
}