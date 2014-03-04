/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.okruss.prestamo.classes;
import java.io.*;
import javax.swing.*;
import jxl.write.*;
import jxl.*;

/**
 *
 * @author tecnico2
 */
public class ExcelExport
{
     private File file;
     private JTable table;
     private String nombreTab;
     public String host="";
     public ExcelExport(JTable table,File file,String nombreTab)
    {
    this.file=file;
    this.table=table;
    this.nombreTab=nombreTab;
    }

     public boolean export()
    {
         conex cone = new conex();
         host=cone.server;
         JFileChooser explorer = new JFileChooser();
         int resp;
         resp=explorer.showSaveDialog(explorer);//JFileChooser de nombre RealizarBackupMySQL
         if (resp==JFileChooser.APPROVE_OPTION) {//Si el usuario presiona aceptar; se genera el Backup
            try
        {
        //Nuestro flujo de salida para apuntar a donde vamos a escribir
        DataOutputStream out=new DataOutputStream(new FileOutputStream(String.valueOf(explorer.getSelectedFile().toString())+".xls"));

        //Representa nuestro archivo en excel y necesita un OutputStream para saber donde va locoar los datos
        WritableWorkbook w = Workbook.createWorkbook(out);
        //Como excel tiene muchas hojas esta crea o toma la hoja
        //Coloca el nombre del "tab" y el indice del tab
        WritableSheet s = w.createSheet(nombreTab, 0);
        //Agrego el nombre de las columnas
        for(int i=0;i< table.getColumnCount();i++)
        {
            for(int j=0;j<1;j++)
            {
                Object objeto=table.getColumnName(i);
                s.addCell(new Label(i, j, String.valueOf(objeto)));
            }
        }
        //Agregamos todo el contenido de la base de datos
        for(int i=0;i< table.getColumnCount();i++)
        {
            for(int j=0;j<table.getRowCount();j++)
            {
                Object objeto=table.getValueAt(j,i);
                s.addCell(new Label(i, j+1, String.valueOf(objeto)));
            }
        }
        //Escribimos el archivo
        w.write();
        //Cerramos el WritableWorkbook y DataOutputStream
        w.close();
        out.close();
        //si todo sale bien salimos de aqui con un true :D
        return true;
        }
        //    Si llegamos hasta aqui algo salio mal
    catch(IOException ex){ex.printStackTrace();}
    catch(WriteException ex){ex.printStackTrace();}
    }
         else if (resp==JFileChooser.CANCEL_OPTION)
         {
            JOptionPane.showMessageDialog(null,"El usuario ah cancelado"
                    + "la generación del respaldo.");
        }
    return false;
    }
}

