package com.javafortesters;

//import com.javafortesters.CollectionsSamples;

import org.junit.*;
import org.junit.rules.Stopwatch;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import static com.javafortesters.CollectionsSamples.*;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //@TestMethodOrder(OrderAnnotation.class) https://www.baeldung.com/junit-5-test-order
public class CollectionsTest {

    @Rule
    public Timeout timeout = Timeout.millis(100);

    @Rule
    public Stopwatch stopwatch = new Stopwatch();

    @BeforeClass
    public static void setup() {
        // GIVEN
        System.out.println("BeforeClass setup method: preparing test harness.");
        //assumeTrue("Must be Windows OS", System.getProperty("os.name").startsWith("Windows"));

        // WHEN
        System.out.println("BeforeClass setup method: preparing test data.");
        //printArrayElements(ARRAY_WITH_DUPLICATED_ELEMENTS);
        //printArrayElements(ARRAY_WITH_DUPLICATED_ELEMENTS_2);
        addMultipleElementsToSet(genericSet, 10, "test");
        prepareAnInvalidWeekDaysNamesList(); // Index 3 = Wednesday

        System.out.println("BeforeClass setup method: DONE.");
    }

    @AfterClass
    public static void teardown() {
        System.out.println("AfterClass teardown method: cleaning up.");
        System.out.println("AfterClass teardown method: DONE.");
    }

    @Test
    public void anIntegerArrayAllowsDuplicates() {
        //printArrayElements(ARRAY_WITH_DUPLICATED_ELEMENTS);
        // THEN
        assertSame("Index 0 and 1 are the same (int=0)",
                ARRAY_WITH_DUPLICATED_ELEMENTS[0],
                ARRAY_WITH_DUPLICATED_ELEMENTS[1]);
        assertNotSame("Index 0 and 2 are not the same (int=0, 1)",
                ARRAY_WITH_DUPLICATED_ELEMENTS[0],
                ARRAY_WITH_DUPLICATED_ELEMENTS[2]);
    }

    @Test
    public void arraysAreEqual() {
        // THEN
        assertArrayEquals("Arrays are equal",
                ARRAY_WITH_DUPLICATED_ELEMENTS,
                ARRAY_WITH_DUPLICATED_ELEMENTS_2);
    }

    @Test
    public void anIntegerArraySizeIsNotZero() {
        // THEN
        assertTrue("Array size is bigger than 0", ARRAY_WITH_DUPLICATED_ELEMENTS.length > 0);
    }

    @Test
    public void setDoesNotAllowDuplicateElements() {
        //addMultipleElementsToSet(genericSet, 10, "test");
        // THEN
        assertEquals("Set collection does not allow duplicates", 1, genericSet.size());
    }

    @Test
    public void canReplaceElementInAList() {
        //prepareAnInvalidWeekDaysNamesList(); // Index 3 = Wednesday
        // WHEN
        workdays.set(3, "Thursday");
        // THEN
        assertEquals("Index #3 should be Thursday", "Thursday", workdays.get(3));
    }
}