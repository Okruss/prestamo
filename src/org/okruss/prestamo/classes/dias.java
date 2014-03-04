/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.okruss.prestamo.classes;

import java.util.Calendar;

/**
 *
 * @author JavierObeth
 */
public class dias {
    
     public int getDias(java.util.Date fInicial, java.util.Date fFinal)
    {
        Calendar ci = Calendar.getInstance();
        ci.setTime(fInicial);

        Calendar cf = Calendar.getInstance();
        cf.setTime(fFinal);

        long ntime = cf.getTimeInMillis() - ci.getTimeInMillis();

        return (int)Math.ceil((double)ntime / 1000 / 3600 / 24);
    }
    
}
