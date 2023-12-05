package test.java.concrete.Problems.containerBPP;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import main.java.concrete.Problems.containerBPP.BPPcontainerProblem;
import main.java.concrete.Problems.containerBPP.Item;
import main.java.abstracts.problem.ILoadingProblems;
import main.java.abstracts.problem.Problem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class BPPcontainerProblemTest {

    @Test
    void testConstructorWithFilename() {
        String filename = "BPP_1.txt"; // Provide a test file name
        BPPcontainerProblem bppContainerProblem = new BPPcontainerProblem(filename);
        // Add assertions based on the expected behavior of the constructor
        assertEquals(0, bppContainerProblem.getCapacity());
        assertEquals(0, bppContainerProblem.getNumItems());
    }

    @Test
    void testConstructorWithCapacityAndItems() {
        int capacity = 10;
        List<Item> items = new ArrayList<>();
        items.add(new Item(3, 5));
        items.add(new Item(2, 3));

        BPPcontainerProblem bppContainerProblem = new BPPcontainerProblem(capacity, items);
        // Add assertions based on the expected behavior of the constructor
        assertEquals(capacity, bppContainerProblem.getCapacity());
        assertEquals(items.size(), bppContainerProblem.getNumItems());
    }

    @Test
    void testInstancesFromText() {
        String textInstances = "10:3-5,2-3";
        BPPcontainerProblem bppContainerProblem = new BPPcontainerProblem();
        bppContainerProblem.setTextInstances(textInstances);
        bppContainerProblem.instancesFromText();
        // Add assertions based on the expected behavior of instancesFromText
        assertEquals(10, bppContainerProblem.getCapacity());
        assertEquals(2, bppContainerProblem.getNumItems());
    }

    @Test
    void testGetCapacity() {
        int capacity = 15;
        BPPcontainerProblem bppContainerProblem = new BPPcontainerProblem(capacity, new ArrayList<>());
        // Add assertions based on the expected behavior of getCapacity
        assertEquals(capacity, bppContainerProblem.getCapacity());
    }

    @Test
    void testGetItem() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(3, 5));
        items.add(new Item(2, 3));

        BPPcontainerProblem bppContainerProblem = new BPPcontainerProblem(10, items);
        // Add assertions based on the expected behavior of getItem
        assertEquals(items.get(0), bppContainerProblem.getItem(0));
        assertEquals(items.get(1), bppContainerProblem.getItem(1));
    }

    @Test
    void testGetItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(3, 5));
        items.add(new Item(2, 3));

        BPPcontainerProblem bppContainerProblem = new BPPcontainerProblem(10, items);
        // Add assertions based on the expected behavior of getItems
        assertEquals(items, bppContainerProblem.getItems());
    }

    @Test
    void testGetNumItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(3, 5));
        items.add(new Item(2, 3));

        BPPcontainerProblem bppContainerProblem = new BPPcontainerProblem(10, items);
        // Add assertions based on the expected behavior of getNumItems
        assertEquals(items.size(), bppContainerProblem.getNumItems());
    }

    @Test
    void testToString() {
        int capacity = 15;
        BPPcontainerProblem bppContainerProblem = new BPPcontainerProblem(capacity, new ArrayList<>());
        // Add assertions based on the expected behavior of toString
        assertEquals("{ CAPACITY = " + capacity + " }", bppContainerProblem.toString());
    }

    @Test
    void testPesoItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(3, 5));
        items.add(new Item(2, 3));

        BPPcontainerProblem bppContainerProblem = new BPPcontainerProblem(10, items);
        // Add assertions based on the expected behavior of pesoItems
        assertEquals(3.0 + 2.0, bppContainerProblem.pesoItems());
    }

    @Test
    void testToStringWithOutputItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(3, 5));
        items.add(new Item(2, 3));

        BPPcontainerProblem bppContainerProblem = new BPPcontainerProblem(10, items);
        // Add assertions based on the expected behavior of toString with outputItems
        assertTrue(bppContainerProblem.toString(true).contains(items.get(0).toString()));
        assertTrue(bppContainerProblem.toString(true).contains(items.get(1).toString()));
    }

    @Test
    void testToStringWithoutOutputItems() {
        int capacity = 15;
        BPPcontainerProblem bppContainerProblem = new BPPcontainerProblem(capacity, new ArrayList<>());
        // Add assertions based on the expected behavior of toString without outputItems
        assertEquals("{ CAPACITY = " + capacity + " }", bppContainerProblem.toString(false));
    }
}
