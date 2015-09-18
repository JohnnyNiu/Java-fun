package com.johnnyniu.number;

import java.math.BigDecimal;

/**
 * Find PI to the Nth Digit –
 * Enter a number and have the program generate PI up to that many decimal places. Keep a limit to how far the program will go.
 * Created by xiaomingniu on 3/04/15.
 */
public class PiDisplayer {
    public String display(int digits){
        String PiStr = String.valueOf(Math.PI);

        if(digits>PiStr.length()-1 || digits<1) {
            throw new IllegalArgumentException("The program is going too far");
        }
        if(digits > 1) {
            return PiStr.substring(0,digits+1);
        } else {
            return PiStr.substring(0,digits);
        }
    }
}
