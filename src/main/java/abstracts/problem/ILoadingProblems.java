package main.java.abstracts.problem;

import java.util.List;

import main.java.concrete.Problems.containerBPP.Item;

public interface ILoadingProblems {
	void instancesFromText();
	int getCapacity();
	Item getItem(int index);
	List<Item> getItems();
	int getNumItems();
	String toString();
	double pesoItems();
	String toString(boolean outputitems);
}
