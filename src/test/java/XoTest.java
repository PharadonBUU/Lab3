/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author informatics
 */
public class XoTest {

    public XoTest() {
    }

    @Test
    public void testCheckWinNoPlayBY_O() {
        String[] table = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String currentPlayer = "O";
        assertEquals(false, OXProgram.checkWin(table, currentPlayer));
    }
    
    @Test
    public void testCheckWinRow1BY_O_output_true() {
        String[] table = {"O", "O", "O", "4", "5", "6", "7", "8", "9"};
        String currentPlayer = "O";
        assertEquals(true, OXProgram.checkWin(table, currentPlayer));

    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
