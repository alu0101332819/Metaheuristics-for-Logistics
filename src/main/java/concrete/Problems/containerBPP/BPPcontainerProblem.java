package main.java.concrete.Problems.containerBPP;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import main.java.abstracts.problem.ILoadingProblems;
import main.java.abstracts.problem.Problem;

public class BPPcontainerProblem extends Problem implements ILoadingProblems {

    private int ContainerArea;
    private ArrayList<Item> items;

    public BPPcontainerProblem() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param filename Constructor using text file
     */
    public BPPcontainerProblem(String filename) {
        super();
        this.textInstances = loadDataFromFile(filename);
    }

    public BPPcontainerProblem(int capacity, ArrayList<Item> initialItems) {
        super();
        this.ContainerArea = capacity;
        this.items = initialItems;
    }

    private String loadDataFromFile(String filename) {
        // Reading the file that contains the instances
        char[] buff = new char[1024 * 10];

        try (FileReader file = new FileReader(filename)) {
            file.read(buff);
        } catch (IOException e) {
            System.out.println("Error. " + e.getMessage());
            System.exit(0);
        }
        return new String(buff);
    }

    @Override
    public void instancesFromText() {
        String text = textInstances;
        String[] parts = text.split(":");
        int capacity = Integer.parseInt(parts[0].trim());
        ArrayList<Item> parsedItems = new ArrayList<>();
        String[] strItems = parts[1].trim().split(",");

        for (String item : strItems) {
            String[] attributes = item.split("-");
            parsedItems.add(new Item(Integer.parseInt(attributes[0].trim()), Integer.parseInt(attributes[1].trim())));
        }

        this.items = parsedItems;
        this.ContainerArea = capacity;
    }

    @Override
    public int getCapacity() {
        return this.ContainerArea;
    }

    @Override
    public Item getItem(int index) {
        return this.items.get(index);
    }

    @Override
    public ArrayList<Item> getItems() {
        return this.items;
    }

    @Override
    public int getNumItems() {
        return this.items.size();
    }

    @Override
    public String toString() {
        return "{ CAPACITY = " + this.ContainerArea + " }";
    }

    @Override
    public double pesoItems() {
        double p = 0;

        for (Item item : this.items)
            p += (double) item.getWeight();

        return p;
    }

    @Override
    public String toString(boolean outputItems) {
        StringBuilder str = new StringBuilder();
        if (outputItems) {
            for (Item i : this.items) {
                str.append("\n\t").append(i.toString());
            }
        }
        return this.toString() + str;
    }
}
