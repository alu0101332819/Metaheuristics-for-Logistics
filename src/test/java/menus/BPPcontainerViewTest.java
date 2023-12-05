package test.java.menus;

import java.util.Scanner;

import main.java.abstracts.problem.ILoadingProblems;
import main.java.concrete.Problems.containerBPP.BPPcontainerProblem;
import main.java.concrete.metaheuristics.containerBPP.BPPGrasp;
import main.java.concrete.metaheuristics.containerBPP.BPPGreedy;
import main.java.concrete.metaheuristics.containerBPP.BPPHillClimbing;
import main.java.concrete.metaheuristics.containerBPP.BPPSimulatedAnnealing;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BPPcontainerViewTest {

    private BPPcontainerView bppContainerView;
    private Scanner mockScanner;

    @BeforeEach
    void setUp() {
        bppContainerView = new BPPcontainerView();
        mockScanner = mock(Scanner.class);
    }

    @Test
    void testRunExitOption() {
        // Arrange
        InputStream in = new ByteArrayInputStream("exit".getBytes());
        System.setIn(in);

        // Act
        assertDoesNotThrow(() -> bppContainerView.run(mockScanner, null));

        // Assert
        verify(mockScanner, times(1)).nextLine();
    }

    @Test
    void testRunHillClimbingOption() {
        // Arrange
        InputStream in = new ByteArrayInputStream("1\nexit".getBytes());
        System.setIn(in);

        // Act
        assertDoesNotThrow(() -> bppContainerView.run(mockScanner, null));

        // Assert
        verify(mockScanner, times(2)).nextLine();
        verify(mockScanner, times(1)).nextInt();
    }

    // Add similar tests for other options (Simulated Annealing, Greedy, Grasp)
}
