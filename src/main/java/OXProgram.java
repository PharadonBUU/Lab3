/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author informatics
 */
class OXProgram {

    static Object checkWin(String[] table, String currentPlayer) {
        if(checkRow1(table, currentPlayer)) return true;
        if(checkRow2(table, currentPlayer)) return true;
        if(checkRow3(table, currentPlayer)) return true;


        return false;
    }

    private static boolean checkRow1(String[] table, String currentPlayer) {
        return table[0].equals(currentPlayer)&&table[1].equals(currentPlayer)&&table[2].equals(currentPlayer);
    }
    
    private static boolean checkRow2(String[] table, String currentPlayer) {
        return table[3].equals(currentPlayer)&&table[4].equals(currentPlayer)&&table[5].equals(currentPlayer);
    }
    
    private static boolean checkRow3(String[] table, String currentPlayer) {
        return table[6].equals(currentPlayer)&&table[7].equals(currentPlayer)&&table[8].equals(currentPlayer);
    }
    
    
}
