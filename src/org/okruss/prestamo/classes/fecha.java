package org.okruss.prestamo.classes;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author tecnico2
 */
public class fecha {
    public String fecha="";
    public String semana="";
    public  String obtenerfecha()
    {
        Calendar cal = Calendar.getInstance();
        int a= cal.get(Calendar.YEAR);
        int m= (cal.get(Calendar.MONTH))+1;
        int d = cal.get(Calendar.DAY_OF_MONTH);   //dia del mes
        fecha=""+a+"-"+m+"-"+d;
        return fecha;
     }

    public String obtenerSemana()
    {
        Calendar cal = Calendar.getInstance();
        int sem= cal.get(Calendar.WEEK_OF_YEAR);
        semana=""+sem;
        return semana;
    }
}
