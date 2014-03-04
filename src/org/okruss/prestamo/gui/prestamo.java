/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.okruss.prestamo.gui;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;
import org.okruss.prestamo.classes.conex;
import org.okruss.prestamo.classes.dias;

/**
 *
 * @author Laptop2
 */
public class prestamo extends javax.swing.JFrame {
    Statement stmt = null;
    conex cone = new conex();
    dias d = new dias();
    DecimalFormat df2 = new DecimalFormat( "¤ #,###,###,##0.00" );
    /**
     * Creates new form prestamo
     */
    public prestamo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        feCorte = new datechooser.beans.DateChooserDialog();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtClave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtProd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        total = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        feCorte.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRESTAMO");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRESTAMOS");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CLAVE");

        jtClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtClaveKeyReleased(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PRODUCTOR");

        jtProd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtProdKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtClave, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtProd)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("PRÉSTAMO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CLAVE", "LOTE", "TABLA", "PRODUCTOR", "SUPERFICIE"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATOS GENERALES");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "FECHA", "MONTO", "CLAVE PROD", "PRODUCTOR", "CATEGORÍA", "FECHA DE CORTE"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PRÉSTAMOS");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DETALLES");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACCIONES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jButton2.setText("CALCULAR INTERESES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Otro panel para lo que se ofrezca", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        total.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤ #,##0.00 ¤¤"))));

        area.setColumns(20);
        area.setRows(5);
        jScrollPane3.setViewportView(area);

        jLabel7.setText("TOTAL:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(total))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtClaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtClaveKeyReleased
        // TODO add your handling code here:
       
                   try
        {
            stmt=(Statement) cone.conexion();
            stmt.getConnection();
            stmt.executeUpdate("use cnc");
            ResultSet rs=stmt.executeQuery("Select cve,lte,tba,prod,sup from est where cve like '%"+jtClave.getText()+"%'");

            ResultSetMetaData mD = rs.getMetaData();
            int ncol=mD.getColumnCount();
            Object label [] = new Object [ncol];
            for (int i=0;i<ncol;i++)
            {
                label[i]=mD.getColumnLabel(i+1);
            }

            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setRowCount(0);
            modelo.setColumnIdentifiers(label);
            while(rs.next())
            {
                Object [] fila = new Object [ncol];
                for (int i=0;i<ncol;i++)
                {
                    fila[i]=rs.getObject(i+1);
                }
                modelo.addRow(fila);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error:"+e.getMessage());
            e.printStackTrace();
        }          
                
    }//GEN-LAST:event_jtClaveKeyReleased

    private void jtProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtProdKeyReleased
        // TODO add your handling code here:
      
                   try
        {
            stmt=(Statement) cone.conexion();
            stmt.getConnection();
            stmt.executeUpdate("use cnc");
            ResultSet rs=stmt.executeQuery("Select cve,lte,tba,prod,sup from est where prod like '%"+jtProd.getText()+"%'");

            ResultSetMetaData mD = rs.getMetaData();
            int ncol=mD.getColumnCount();
            Object label [] = new Object [ncol];
            for (int i=0;i<ncol;i++)
            {
                label[i]=mD.getColumnLabel(i+1);
            }

            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setRowCount(0);
            modelo.setColumnIdentifiers(label);
            while(rs.next())
            {
                Object [] fila = new Object [ncol];
                for (int i=0;i<ncol;i++)
                {
                    fila[i]=rs.getObject(i+1);
                }
                modelo.addRow(fila);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error:"+e.getMessage());
            e.printStackTrace();
        }          
                
    }//GEN-LAST:event_jtProdKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nomb="", cveProd="",sup="";
        alta_pres alta = new alta_pres();
        if (jTable1.getSelectedRows().length==0)
        {
            System.out.println("Porfavor selecciona un productor.");
        }
        else
        {
            sup=jTable1.getValueAt(jTable1.getSelectedRow(),4).toString();
            cveProd=jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
            nomb=jTable1.getValueAt(jTable1.getSelectedRow(),3).toString();
            alta.setVisible(true);
            alta.setLocationRelativeTo(null);
            alta.jtCve.setText(cveProd);
            alta.jtNom.setText(nomb);
            alta.jtGpo.setText(sup);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        final JProgressBar barraProgreso = new JProgressBar(0, 1000);
        final JDialog dialogoProgreso = new JDialog(this, "Procesando...");
        dialogoProgreso.getContentPane().add(barraProgreso);
        dialogoProgreso.pack();
        dialogoProgreso.setLocationRelativeTo(null);
        
        final javax.swing.SwingWorker worker;
        worker = new javax.swing.SwingWorker() {
            
            @Override
            protected Void doInBackground() throws Exception {
//                dialogoProgreso.setVisible(true);
//                barraProgreso.setVisible(true);
//                barraProgreso.setIndeterminate(true);
                   try
        {
            String cve="";
            cve=jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
            stmt=(Statement) cone.conexion();
            stmt.getConnection();
            stmt.executeUpdate("use cnc");
            ResultSet rs=stmt.executeQuery("Select * from prestamo where cveprod= '"+cve+"' order by fecha asc");

            ResultSetMetaData mD = rs.getMetaData();
            int ncol=mD.getColumnCount();
            Object label [] = new Object [ncol];
            for (int i=0;i<ncol;i++)
            {
                label[i]=mD.getColumnLabel(i+1);
            }

            DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
            modelo.setRowCount(0);
            //modelo.setColumnIdentifiers(label);
            while(rs.next())
            {
                Object [] fila = new Object [ncol];
                for (int i=0;i<ncol;i++)
                {
                    fila[i]=rs.getObject(i+1);
                }
                modelo.addRow(fila);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error:"+e.getMessage());
            e.printStackTrace();
        }          
                return null;
            }

            @Override
            protected void done() {
                barraProgreso.setIndeterminate(false);;
                barraProgreso.setVisible(false);
                dialogoProgreso.setVisible(false);
            }
        };
        worker.execute();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Cálculo del total del préstamo
        //Obtengo la fecha actual y la guardo en la variable 
        //ho en el formato yyy-MM-dd
        Calendar c = Calendar.getInstance();
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH)+1);
        String annio = Integer.toString(c.get(Calendar.YEAR));
        String ho=annio+"-"+mes+"-"+dia;
        //***************************************************
        //Muestro un dateChooser para que el usuario selecciones una
        //fecha de corte y la guardo en la variable "fechaCorte".
        String fechaCorte="";
        feCorte.showDialog(null);
        fechaCorte=feCorte.getSelectedDate().get(Calendar.YEAR)+"-"+(feCorte.getSelectedDate().get(Calendar.MONTH)+1)+"-"+feCorte.getSelectedDate().get(Calendar.DAY_OF_MONTH);
        //******************************************************
        //Obtengo la clave del productor seleccionado en la tabla
        String clave=jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
        //Limpia la área de texto donde muestro los detalles del préstamo.
        area.setText("");
        //Variable "nrow" que uso para derectar el número de prestamos
        int nrow=0;
        //Consulto la BD pidiento fecha y monto de prestamo de dicha clave
        try
        {
            stmt=(Statement) cone.conexion();
            stmt.getConnection();
            stmt.executeUpdate("use cnc");
            ResultSet rs=stmt.executeQuery("Select fecha,mont from prestamo where cveprod='"+clave+"'");
            //Cuento los registros generados por la consulta
            while(rs.next())
            {
                nrow++;
            }
            if(nrow>1)//SI HAY MAS DE UN PRESTAMOOOOOOOOOOOOOOOOOOOOOOOOOOOO
            {
                //agrego al área de texto el número de prestamos detectados.
            area.append(nrow+" PRÉSTAMOS DETECTADOS");
            area.append("\n");
            //creo un Formato de FEchas para manejar las fecha.
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            //Creo una variable tipo Date "hoy# y parseo el String con la fecha de hoy
            //y la fecha de corte que selecciono el usuario.
            Date fc=df.parse(fechaCorte);
            Date hoy = df.parse(ho);
            //Creo un vector para guardar fechas, montos y días trancurridos entre préstamos.
            Date fechas [] = new Date[nrow];
            Double montos [] = new Double[nrow];
            int dias [] = new int[nrow];
            //Consutlo a la BD pidiendo los datos fecha y monto para guardarlos en el vector.
            ResultSet rs1=stmt.executeQuery("Select fecha,mont from prestamo where cveprod='"+clave+"' order by fecha asc");
            int x=0;
            while(rs1.next())
            {
                fechas[x]=(Date)df.parse(rs1.getString(1));
//                System.out.println(df.format(fechas[x]));
                montos[x]=Double.parseDouble(rs1.getString(2));
                x++;
            }
            //Recorro el vector de fechas e imprimo datos de los prestamos
            //Calculo los días transcurridos entre préstamos y los guardo
            //en el vector de días.
            for (int y=0;y<fechas.length;y++)
            {
            System.out.println("*********************************************");
            System.out.println("Id Préstamo  "+(y+1));
            System.out.println("Autorizado el día: "+df.format(fechas[y]));
            System.out.println("Monto: "+df2.format(montos[y]));
                if(y<(fechas.length)-1)
                {
                    System.out.println("DÍAS TRANSCURRIDOS: "+d.getDias(fechas[y], fechas[y+1]));
                    dias[y]=(d.getDias(fechas[y], fechas[y+1]));
                    System.out.println("*********************************************");
                }
                //si es el último préstamo detectado o el único prestamo, entonces
                //calculamos los días con la fecha de corte seleccionada por el usuario.
                else
                {
                    System.out.println("Días transcurridos: "+(d.getDias(fechas[y], fc)+1));
                    dias[y]=(d.getDias(fechas[y], fc)+1);
                    System.out.println("*********************************************");
                }
            }
            //TEMPORAL!! IMPRIMO LOS DIAS PASADOS 
            System.out.println("/////DESDE VECTOR DIAS\\\\\\");
            for(int d=0;d<dias.length;d++)
            {
                System.out.println("día:"+dias[d]);
            }
            //***************************************************
            //Cálculamos el interes generado por los préstamos según su día.
            System.out.println("*****Deuda Total*****");
            double tot=0;//Variable temporal donde almaceno y calculo el interes.
            double tot1=0;//Variable donde guardo el total de la deuda.
            double tot2=0;//Variable donde guardo el total de la deduda por préstamo.
            for(int a=0;a<fechas.length;a++)
            {
                tot=montos[a]+tot1;
                tot2=montos[a];
                for(int b=0;b<dias[a];b++)
                {
                    
                    tot=tot+(tot*.000483871);
                    
                    tot2=tot2+(tot2*.000483871);
                    
                    System.out.println("D"+(b+1)+" "+tot);
                }
                tot1=tot;
                System.out.println("Fecha: "+df.format(fechas[a])+" Monto: "+montos[a]+" Días: "+dias[a]+" Monto Calculado: "+df2.format(tot2)+" Interes= "+df2.format((tot2-montos[a])));
                area.append("ID: "+(a+1));
                area.append("\n");
                area.append("FEHA DE AUT:"+df.format(fechas[a]));
                area.append("\n");;
                area.append("MONTO: "+df2.format(montos[a])+"\n");
                area.append("DÍAS: "+((dias[a])+1)+"\n");
                area.append("MONTO REAL: "+df2.format(tot2)+"\n");
                area.append("******************\n");
                
            }
            System.out.println("Deuda Total: "+tot1);
            
            System.out.println("*********************");
            total.setValue((Object)tot1);
                
            }
            if(nrow==1)//UN SOLO PRESTAMOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
            {
                //agrego al área de texto el número de prestamos detectados.
            area.append(nrow+" PRÉSTAMO DETECTADO");
            area.append("\n");
            //creo un Formato de FEchas para manejar las fecha.
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            //Creo una variable tipo Date "hoy# y parseo el String con la fecha de hoy
            //y la fecha de corte que selecciono el usuario.
            Date fc=df.parse(fechaCorte);
            Date hoy = df.parse(ho);
            //Creo un vector para guardar fechas, montos y días trancurridos entre préstamos.
            Date fechas [] = new Date[nrow];
            Double montos [] = new Double[nrow];
            int dias [] = new int[nrow];
            //Consutlo a la BD pidiendo los datos fecha y monto para guardarlos en el vector.
            ResultSet rs1=stmt.executeQuery("Select fecha,mont from prestamo where cveprod='"+clave+"' order by fecha asc");
            int x=0;
            while(rs1.next())
            {
                fechas[x]=(Date)df.parse(rs1.getString(1));
//                System.out.println(df.format(fechas[x]));
                montos[x]=Double.parseDouble(rs1.getString(2));
                x++;
            }
            //Recorro el vector de fechas e imprimo datos de los prestamos
            //Calculo los días transcurridos entre préstamos y los guardo
            //en el vector de días.
            for (int y=0;y<fechas.length;y++)
            {
            System.out.println("*********************************************");
            System.out.println("Id Préstamo  "+(y+1));
            System.out.println("Autorizado el día: "+df.format(fechas[y]));
            System.out.println("Monto: "+df2.format(montos[y]));
                System.out.println("FECHAAAAAAAAAAAAAAAS"+fechas.length);
                //calculamos los días con la fecha de corte seleccionada por el usuario.
                
                
                    System.out.println("Días transcurridos: "+(d.getDias(fechas[y], fc)+1));
                    dias[y]=(d.getDias(fechas[y], fc)+1);
                    System.out.println("*********************************************");
                
            }
            //TEMPORAL!! IMPRIMO LOS DIAS PASADOS 
            System.out.println("/////DESDE VECTOR DIAS\\\\\\");
            for(int d=0;d<dias.length;d++)
            {
                System.out.println("día:"+dias[d]);
            }
            //***************************************************
            //Cálculamos el interes generado por los préstamos según su día.
            System.out.println("*****Deuda Total*****");
            double tot=0;//Variable temporal donde almaceno y calculo el interes.
            double tot1=0;//Variable donde guardo el total de la deuda.
            double tot2=0;//Variable donde guardo el total de la deduda por préstamo.
            for(int a=0;a<fechas.length;a++)
            {
                tot=montos[a]+tot1;
                tot2=montos[a];
                for(int b=0;b<dias[a];b++)
                {
                    
                    tot=tot+(tot*.000483871);
                    
                    tot2=tot2+(tot2*.000483871);
                    
//                    System.out.println("D"+(b+1)+" "+tot);
                }
                tot1=tot;
                System.out.println("Fecha: "+df.format(fechas[a])+" Monto: "+montos[a]+" Días: "+dias[a]+" Monto Calculado: "+df2.format(tot2)+" Interes= "+df2.format((tot2-montos[a])));
                area.append("ID: "+(a+1));
                area.append("\n");
                area.append("FEHA DE AUT:"+df.format(fechas[a]));
                area.append("\n");;
                area.append("MONTO: "+df2.format(montos[a])+"\n");
                area.append("DÍAS: "+dias[a]+"\n");
                area.append("MONTO REAL: "+df2.format(tot2)+"\n");
                area.append("******************\n");
                
            }
            System.out.println("Deuda Total: "+tot1);
            
            System.out.println("*********************");
            total.setValue((Object)tot1);
            }
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error:"+e.getMessage());
            e.printStackTrace();
        }        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTable1KeyTyped

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
         final JProgressBar barraProgreso = new JProgressBar(0, 1000);
        final JDialog dialogoProgreso = new JDialog(this, "Procesando...");
        dialogoProgreso.getContentPane().add(barraProgreso);
        dialogoProgreso.pack();
        dialogoProgreso.setLocationRelativeTo(null);
        
        final javax.swing.SwingWorker worker;
        worker = new javax.swing.SwingWorker() {
            
            @Override
            protected Void doInBackground() throws Exception {
//                dialogoProgreso.setVisible(true);
//                barraProgreso.setVisible(true);
//                barraProgreso.setIndeterminate(true);
                   try
        {
            String cve="";
            cve=jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
            stmt=(Statement) cone.conexion();
            stmt.getConnection();
            stmt.executeUpdate("use cnc");
            ResultSet rs=stmt.executeQuery("Select * from prestamo where cveprod= '"+cve+"' order by fecha asc");

            ResultSetMetaData mD = rs.getMetaData();
            int ncol=mD.getColumnCount();
            Object label [] = new Object [ncol];
            for (int i=0;i<ncol;i++)
            {
                label[i]=mD.getColumnLabel(i+1);
            }

            DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
            modelo.setRowCount(0);
//            modelo.setColumnIdentifiers(label);
            while(rs.next())
            {
                Object [] fila = new Object [ncol];
                for (int i=0;i<ncol;i++)
                {
                    fila[i]=rs.getObject(i+1);
                }
                modelo.addRow(fila);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error:"+e.getMessage());
            e.printStackTrace();
        }          
                return null;
            }

            @Override
            protected void done() {
                barraProgreso.setIndeterminate(false);;
                barraProgreso.setVisible(false);
                dialogoProgreso.setVisible(false);
            }
        };
        worker.execute();
    }//GEN-LAST:event_jTable1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                prestamo pres = new prestamo();
                pres.setExtendedState(MAXIMIZED_BOTH);
                pres.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private datechooser.beans.DateChooserDialog feCorte;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jtClave;
    private javax.swing.JTextField jtProd;
    private javax.swing.JFormattedTextField total;
    // End of variables declaration//GEN-END:variables
}
