package test.java.menus;

import java.util.Scanner;

import main.java.abstracts.problem.ILoadingProblems;
import main.java.concrete.Problems.containerBPP.BPPcontainerProblem;
import main.java.concrete.metaheuristics.containerBPP.BPPGrasp;
import main.java.concrete.metaheuristics.containerBPP.BPPGreedy;
import main.java.concrete.metaheuristics.containerBPP.BPPHillClimbing;
import main.java.concrete.metaheuristics.containerBPP.BPPSimulatedAnnealing;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BPPcontainerViewTest {

    @Test
    void testHillClimbingBPP() {
        ILoadingProblems mockBPPProblem = mock(ILoadingProblems.class);
        BPPcontainerView.hillClimbingBPP(mockBPPProblem);
        // Add assertions based on the expected behavior of hillClimbingBPP
        // For example: verify(mockBPPProblem, times(1)).someMethod();
    }

    @Test
    void testSimulatedAnnealingBPP() {
        ILoadingProblems mockBPPProblem = mock(ILoadingProblems.class);
        BPPcontainerView.simulatedAnnealingBPP(mockBPPProblem);
        // Add assertions based on the expected behavior of simulatedAnnealingBPP
        // For example: verify(mockBPPProblem, times(1)).someMethod();
    }

    @Test
    void testGreedyBPP() {
        ILoadingProblems mockBPPProblem = mock(ILoadingProblems.class);
        BPPcontainerView.greedyBPP(mockBPPProblem);
        // Add assertions based on the expected behavior of greedyBPP
        // For example: verify(mockBPPProblem, times(1)).someMethod();
    }

    @Test
    void testGraspBPP() {
        ILoadingProblems mockBPPProblem = mock(ILoadingProblems.class);
        BPPcontainerView.graspBPP(mockBPPProblem);
        // Add assertions based on the expected behavior of graspBPP
        // For example: verify(mockBPPProblem, times(1)).someMethod();
    }

    @Test
    void testRunWithDataFile() {
        String dataFile = "testFile.txt"; // Provide a test file name
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn(dataFile, "exit");
        InputStream sysInBackup = System.in;
        try {
            System.setIn(new ByteArrayInputStream(dataFile.getBytes()));
            BPPcontainerView.run(mockScanner, null);
            // Add assertions based on the expected behavior of run
        } finally {
            System.setIn(sysInBackup);
        }
    }

    @Test
    void testRunWithNoDataFile() {
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("exit");
        InputStream sysInBackup = System.in;
        try {
            System.setIn(new ByteArrayInputStream("exit".getBytes()));
            BPPcontainerView.run(mockScanner, "testFile.txt");
            // Add assertions based on the expected behavior of run
        } finally {
            System.setIn(sysInBackup);
        }
    }
}

