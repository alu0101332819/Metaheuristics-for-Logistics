package test.java.menus;

import java.util.Scanner;

import main.java.abstracts.problem.ILoadingProblems;
import main.java.concrete.Problems.containerBPP.BPPcontainerProblem;
import main.java.concrete.metaheuristics.containerBPP.BPPGrasp;
import main.java.concrete.metaheuristics.containerBPP.BPPGreedy;
import main.java.concrete.metaheuristics.containerBPP.BPPHillClimbing;
import main.java.concrete.metaheuristics.containerBPP.BPPSimulatedAnnealing;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BPPcontainerViewTest {

    @Test
    public void testHillClimbingBPP() {
        // Create a mock ILoadingProblems object or use a real one if applicable
        ILoadingProblems mockBPPProblem = new BPPHillClimbing();

        // Redirect System.out for testing purposes
        System.setOut(new java.io.ByteArrayOutputStream());

        // Call the method you want to test
        BPPcontainerView.hillClimbingBPP(mockBPPProblem);

        // Add assertions based on the expected behavior
        // For example, check if the output matches your expectations
        assertEquals("ExpectedOutput", System.out.toString().trim());

        // Reset System.out to avoid interference with other tests
        System.setOut(System.out);
    }

    // Similarly, you can write tests for other methods like simulatedAnnealingBPP, greedyBPP, graspBPP, etc.
}

