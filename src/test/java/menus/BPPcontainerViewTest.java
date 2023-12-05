package test.java.menus;

import java.util.Scanner;

import main.java.abstracts.problem.ILoadingProblems;
import main.java.concrete.Problems.containerBPP.BPPcontainerProblem;
import main.java.concrete.metaheuristics.containerBPP.BPPGrasp;
import main.java.concrete.metaheuristics.containerBPP.BPPGreedy;
import main.java.concrete.metaheuristics.containerBPP.BPPHillClimbing;
import main.java.concrete.metaheuristics.containerBPP.BPPSimulatedAnnealing;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class BPPcontainerViewTest {

    @Test
    void testRun() {
        String input = "BPP_1.txt\n1\nexit";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Scanner mockScanner = mock(Scanner.class);
        Mockito.when(mockScanner.nextLine()).thenReturn("BPP_1.txt", "exit");

        // Assuming createBPPcontainerProblem returns a mock of ILoadingProblems for testing
        ILoadingProblems mockBPPProblem = mock(ILoadingProblems.class);
        Mockito.when(BPPcontainerView.createBPPcontainerProblem("BPP_1.txt")).thenReturn(mockBPPProblem);

        // Call the run method
        BPPcontainerView.run(mockScanner, null);

        // Add assertions based on the expected behavior
        // For example, you can check if certain methods were called on mockBPPProblem
        Mockito.verify(mockBPPProblem, Mockito.times(1)).instancesFromText();

        // Reset System.in to its original value
        System.setIn(System.in);
    }
}
