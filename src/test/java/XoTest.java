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
    
    @Test
    public void testCheckWinRow2BY_O_output_true() {
        String[] table = {"1", "2", "3", "O", "O", "O", "7", "8", "9"};
        String currentPlayer = "O";
        assertEquals(true, OXProgram.checkWin(table, currentPlayer));
    }
    
    @Test
    public void testCheckWinRow3BY_O_output_true() {
        String[] table = {"1", "2", "3", "X", "O", "X", "O", "O", "O"};
        String currentPlayer = "O";
        assertEquals(true, OXProgram.checkWin(table, currentPlayer));
    }
    
    @Test
    public void testCheckWinCol1BY_O_output_true() {
        String[] table = {"O", "2", "3", "O", "X", "O", "O", "8", "9"};
        String currentPlayer = "O";
        assertEquals(true, OXProgram.checkWin(table, currentPlayer));
    }
    
    @Test
    public void testCheckWinCol2BY_O_output_true() {
        String[] table = {"1", "O", "3", "X", "O", "X", "7", "O", "9"};
        String currentPlayer = "O";
        assertEquals(true, OXProgram.checkWin(table, currentPlayer));
    }
    
    @Test
    public void testDraw_output_true() {
        String[] table = {"X", "X", "O", "O", "O", "X", "X", "O", "X"};
        String currentPlayer = "O";
        assertEquals(true, OXProgram.checkDraw(table, currentPlayer));
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
