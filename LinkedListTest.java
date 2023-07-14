package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListTest {

    @Test
    void testTheThing() {
        assertTrue(true);
    }

    @Test
    void testCanInstantiateLLAndtoString() {
        LinkedList ll = new LinkedList(new Node("HELLLOO"));
        ll.add(new Node("cheese"));
        assertEquals("HELLLOO -> cheese -> NULL", ll.toString());
    }

    @Test
    void testCanInstantiateAndToStringLonger() {
        LinkedList ll = new LinkedList(new Node("HELLLOO"));
        ll.add(new Node("cheese"));
        ll.add(new Node("flowers"));
        ll.add(new Node("butterflies"));
        ll.add(new Node("cheetos"));
        assertEquals("HELLLOO -> cheese -> flowers -> butterflies -> cheetos -> NULL", ll.toString());
    }

    @Test
    void testCanInstantiateAndDeleteToStringLonger() {
        LinkedList ll = new LinkedList(new Node("HELLLOO"));
        ll.add(new Node("cheese"));
        ll.add(new Node("flowers"));
        ll.add(new Node("butterflies"));
        ll.add(new Node("cheetos"));
        assertEquals("HELLLOO -> cheese -> flowers -> butterflies -> cheetos -> NULL", ll.toString());
        ll.delete("butterflies");
        assertEquals("HELLLOO -> cheese -> flowers -> cheetos -> NULL", ll.toString());
    }

    @Test
    void testCanInstantiateAndDeleteToStringLongerAndAddAgainVerify() {
        LinkedList ll = new LinkedList(new Node("HELLLOO"));
        ll.add(new Node("cheese"));
        ll.add(new Node("flowers"));
        ll.add(new Node("butterflies"));
        ll.add(new Node("cheetos"));
        assertEquals("HELLLOO -> cheese -> flowers -> butterflies -> cheetos -> NULL", ll.toString());
        ll.delete("butterflies");
        assertEquals("HELLLOO -> cheese -> flowers -> cheetos -> NULL", ll.toString());
        ll.add(new Node("booterfly"));
        assertEquals("HELLLOO -> cheese -> flowers -> cheetos -> booterfly -> NULL", ll.toString());
    }

    @Test
    void testCanInstantiateAndDeleteToStringLongerAndAddAgainVerifySize() {
        LinkedList ll = new LinkedList(new Node("HELLLOO"));
        ll.add(new Node("cheese"));
        assertEquals(2,ll.size());
        ll.add(new Node("burgs"));
        assertEquals(3,ll.size());
        ll.add(new Node("kit katz"));
        assertEquals(4,ll.size());
        assertEquals("HELLLOO -> cheese -> burgs -> kit katz -> NULL", ll.toString());
        ll.delete("butterflies");
        assertEquals(4,ll.size());
        assertEquals("HELLLOO -> cheese -> burgs -> kit katz -> NULL", ll.toString());
    }

    @Test
    void testCanInstantiateAndDeleteToStringLongerAndAddAgainAndRealDeleteVerifySize() {
        LinkedList ll = new LinkedList(new Node("HELLLOO"));
        ll.add(new Node("cheese"));
        assertEquals(2,ll.size());
        ll.add(new Node("burgs"));
        assertEquals(3,ll.size());
        ll.add(new Node("kit katz"));
        assertEquals(4,ll.size());
        assertEquals("HELLLOO -> cheese -> burgs -> kit katz -> NULL", ll.toString());
        ll.delete("butterflies");
        assertEquals(4,ll.size());
        assertEquals("HELLLOO -> cheese -> burgs -> kit katz -> NULL", ll.toString());
        ll.delete("cheese");
        assertEquals(3,ll.size());
        assertEquals("HELLLOO -> burgs -> kit katz -> NULL", ll.toString());
    }

}
