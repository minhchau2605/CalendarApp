/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

import CalendarGUI.lunarToSolar;
import CalendarGUI.solarToLunar;
import javax.swing.JOptionPane;

/**
 *
 * @author Chau Milano
 */
public class checkData extends solarToLunar {

    private static char[] syb = {'~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', ',', '.', '{', '}', '[', ']', ':', ';', '"', '|', '?', '<', '>'};

    public static boolean checkSymbol(String s) {
        boolean check = false;
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < syb.length; j++) {
                if (a[i] == syb[j]) {
                    check = true;
                }
            }
        }
        return check;
    }

    public static boolean checkFormatSolar(int solarDay, int solarMonth, int solarYear) {
        boolean check = false;
        if (solarDay <= 0 || solarDay > 31) {
            check = true;
        }
        if (solarMonth <= 0 || solarMonth > 12) {
            check = true;
        }
        if (solarYear < 1900) {
            check = true;
        }
        return check;
    }

    public static boolean checkFormatLunar(int solarDay, int solarMonth, int solarYear, int leap) {
        boolean check = false;
        if (solarDay <= 0 || solarDay > 31) {
            check = true;
        }
        if (solarMonth <= 0 || solarMonth > 12) {
            check = true;
        }
        if (solarYear < 1900) {
            check = true;
        }
        if (leap != 0 && leap != 1) {
            check = true;
        }
        return check;
    }

    public static void main(String[] args) {
        boolean check2 = checkSymbol("a!");
        //boolean check3 = checkFormat("26", "5", "1996");
        //System.out.println(check1);
    }
}
