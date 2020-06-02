package com.javafortesters;

//import com.javafortesters.domainobject.CollectionsSamples;
import org.junit.Test;

import static com.javafortesters.domainobject.CollectionsSamples.*;
import static org.junit.Assert.*;

public class CollectionsTest {

    @Test
    public void anIntegerArrayAllowsDuplicates() {
        printArrayElements(ARRAY_WITH_DUPLICATED_ELEMENTS);

        assertSame("Index 0 and 1 are the same (int=0)",
                ARRAY_WITH_DUPLICATED_ELEMENTS[0],
                ARRAY_WITH_DUPLICATED_ELEMENTS[1]);
        assertNotSame("Index 0 and 2 are not the same (int=0, 1)",
                ARRAY_WITH_DUPLICATED_ELEMENTS[0],
                ARRAY_WITH_DUPLICATED_ELEMENTS[2]);
    }

    @Test
    public void anIntegerArraySizeIsNotZero() {
        assertTrue("Array size is bigger than 0", ARRAY_WITH_DUPLICATED_ELEMENTS.length > 0);
    }

    @Test
    public void setDoesNotAllowDuplicateElements() {
        addMultipleElementsToSet(genericSet, 10, "test");

        assertEquals("Set collection does not allow duplicates", 1, genericSet.size());
    }

    @Test
    public void CanReplaceElementInAList() {
        prepareAnInvalidWeekDaysNamesList(); // Index 3 = Wednesday
        workdays.set(3, "Thursday");

        assertEquals("Index #3 should be Thursday", "Thursday", workdays.get(3));
    }

}