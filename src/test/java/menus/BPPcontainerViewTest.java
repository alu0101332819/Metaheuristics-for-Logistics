package test.java.menus;

import java.util.Scanner;

import main.java.abstracts.problem.ILoadingProblems;
import main.java.concrete.Problems.containerBPP.BPPcontainerProblem;
import main.java.concrete.metaheuristics.containerBPP.BPPGrasp;
import main.java.concrete.metaheuristics.containerBPP.BPPGreedy;
import main.java.concrete.metaheuristics.containerBPP.BPPHillClimbing;
import main.java.concrete.metaheuristics.containerBPP.BPPSimulatedAnnealing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BPPcontainerViewTest {

    @Test
    void testHillClimbingBPP() {
        // Create a BPPcontainerProblem instance for testing
        BPPcontainerProblem problem = new BPPcontainerProblem();

        // Call the method under test
        BPPcontainerView.hillClimbingBPP(problem);

        // Example: Check if the solution is not null after applying hill climbing
        assertNotNull(problem.getSolution());

        // Example: Check if the solution meets some criteria (adjust based on your requirements)
        assertTrue(problem.getSolution().isValid());

        // Example: Check if the solution has a non-negative priority (adjust based on your requirements)
        assertTrue(problem.getSolution().priority() >= 0);
    }

    @Test
    void testSimulatedAnnealingBPP() {
        // Create a BPPcontainerProblem instance for testing
        BPPcontainerProblem problem = new BPPcontainerProblem();

        // Call the method under test
        BPPcontainerView.simulatedAnnealingBPP(problem);

        // Example: Check if the solution is not null after applying simulated annealing
        assertNotNull(problem.getSolution());

        // Example: Check if the solution meets some criteria (adjust based on your requirements)
        assertTrue(problem.getSolution().isValid());

        // Example: Check if the solution has a non-negative priority (adjust based on your requirements)
        assertTrue(problem.getSolution().priority() >= 0);
    }

    @Test
    void testGreedyBPP() {
        // Create a BPPcontainerProblem instance for testing
        BPPcontainerProblem problem = new BPPcontainerProblem();

        // Call the method under test
        BPPcontainerView.greedyBPP(problem);

        // Add assertions based on the expected behavior

        // Example: Check if the solution is not null after applying the greedy algorithm
        assertNotNull(problem.getSolution());

        // Example: Check if the solution meets some criteria (adjust based on your requirements)
        assertTrue(problem.getSolution().isValid());

        // Example: Check if the solution has a non-negative priority (adjust based on your requirements)
        assertTrue(problem.getSolution().priority() >= 0);
    }

    @Test
    void testGraspBPP() {
        // Create a BPPcontainerProblem instance for testing
        BPPcontainerProblem problem = new BPPcontainerProblem();

        // Call the method under test
        BPPcontainerView.graspBPP(problem);

        // Example: Check if the solution is not null after applying the GRASP algorithm
        assertNotNull(problem.getSolution());

        // Example: Check if the solution meets some criteria (adjust based on your requirements)
        assertTrue(problem.getSolution().isValid());

        // Example: Check if the solution has a non-negative priority (adjust based on your requirements)
        assertTrue(problem.getSolution().priority() >= 0);
    }
}
