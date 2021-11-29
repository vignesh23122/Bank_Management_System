
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Srivignesh
 */
public class Mainpage extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    /**
     * Creates new form MyPage
     */
    public Mainpage() {
        super("Main Page");
        initComponents();
     //   conn=javaconnect.ConnecrDb();
        Calender();
        Account();
        Table1();
        Table2();
        
        
       
        
    }
    //----------------------------DEPOSIT-----------------------//
    public void Deposit(){
      String sql = "insert into TRANSACTION(DATE,ACCOUNT_NO,BALANCE,DEPOSIT,TOTAL) values (?,?,?,?,?)";   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField2.getText());       
            pst.setString(2, jTextField13.getText());
            pst.setString(3, jTextField16.getText());
             pst.setString(4, jTextField17.getText());
             pst.setString(5, jTextField18.getText());
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    //--------------------------------WITHDRAWL-----------------------------//
    public void Withdrawl(){
      String sql = "insert into TRANSACTION(DATE,ACCOUNT_NO,BALANCE,WITHDRAW,TOTAL) values (?,?,?,?,?)";   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField2.getText());           
            pst.setString(2, jTextField27.getText());
            pst.setString(3, jTextField30.getText());
             pst.setString(4, jTextField31.getText());
             pst.setString(5, jTextField32.getText());
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    //--------------------------TRANSFER-----------------------------//
    public void Withdrawl1(){
      String sql = "insert into TRANSACTION(DATE,ACCOUNT_NO,BALANCE,WITHDRAW,TOTAL) values (?,?,?,?,?)";   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField2.getText());           
            pst.setString(2, jTextField19.getText());
            pst.setString(3, jTextField22.getText());
             pst.setString(4, jTextField23.getText());
             pst.setString(5, jTextField24.getText());
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
   public void Deposit1(){
      String sql = "insert into TRANSACTION(DATE,ACCOUNT_NO,BALANCE,DEPOSIT,TOTAL) values (?,?,?,?,?)";   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField2.getText());       
           pst.setString(2, (String) jComboBox1.getSelectedItem());
            pst.setString(3, jTextField25.getText());
             pst.setString(4, jTextField23.getText());
             pst.setString(5, jTextField26.getText());
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
   //-----------------------------TRANSACTION ENDS----------------------//
    
   

    public void Calender(){
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        jTextField2.setText(+day+"-"+(month+1)+"-"+year);
    }
   
    
    
    public void Table1(){
        try{
          String sql="select Acc,Name,DOB,ACC_TYPE,GENDER,MOB From ACCOUNT";
          Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
          pst=conn.prepareStatement(sql);
          rs=pst.executeQuery();
          jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    
    public void Table2(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
          String sql="SELECT `ID`, `Date`, `Account_No`, `Balance`, `Deposit`, `Withdraw`, `Total` FROM `transaction` WHERE `account_no`=? ";
          pst=conn.prepareStatement(sql);
           pst.setString(1, jTextField21.getText());
          rs=pst.executeQuery();
          jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        kButton5 = new com.k33ptoo.components.KButton();
        jLabel3 = new javax.swing.JLabel();
        kButton6 = new com.k33ptoo.components.KButton();
        kButton7 = new com.k33ptoo.components.KButton();
        jLabel49 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        kButton8 = new com.k33ptoo.components.KButton();
        kButton9 = new com.k33ptoo.components.KButton();
        kButton10 = new com.k33ptoo.components.KButton();
        kButton11 = new com.k33ptoo.components.KButton();
        jLabel50 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        kButton12 = new com.k33ptoo.components.KButton();
        kButton13 = new com.k33ptoo.components.KButton();
        kButton14 = new com.k33ptoo.components.KButton();
        kButton15 = new com.k33ptoo.components.KButton();
        kButton16 = new com.k33ptoo.components.KButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        kButton17 = new com.k33ptoo.components.KButton();
        kButton18 = new com.k33ptoo.components.KButton();
        kButton19 = new com.k33ptoo.components.KButton();
        kButton20 = new com.k33ptoo.components.KButton();
        jLabel52 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel44 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        kButton29 = new com.k33ptoo.components.KButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        jTextField35 = new javax.swing.JTextField();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jButton18 = new javax.swing.JButton();
        kButton21 = new com.k33ptoo.components.KButton();
        kButton22 = new com.k33ptoo.components.KButton();
        kButton23 = new com.k33ptoo.components.KButton();
        kButton24 = new com.k33ptoo.components.KButton();
        kButton25 = new com.k33ptoo.components.KButton();
        kButton26 = new com.k33ptoo.components.KButton();
        kButton27 = new com.k33ptoo.components.KButton();
        kButton28 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Date of birth");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Nationality");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jTextField3.setEditable(false);
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField3.setOpaque(false);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 155, -1));

        jTextField4.setEditable(false);
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField4.setOpaque(false);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 155, -1));

        jTextField5.setEditable(false);
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField5.setOpaque(false);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 155, -1));

        jTextField6.setEditable(false);
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField6.setOpaque(false);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 155, -1));

        jTextField7.setEditable(false);
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField7.setOpaque(false);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 155, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Account Type");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Caste");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Mobile");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Security Question");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jTextField8.setEditable(false);
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField8.setOpaque(false);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 150, -1));

        jTextField9.setEditable(false);
        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField9.setOpaque(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 151, -1));

        jTextField10.setEditable(false);
        jTextField10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField10.setOpaque(false);
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 151, -1));

        jTextField11.setEditable(false);
        jTextField11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField11.setOpaque(false);
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 151, -1));

        jTextField12.setEditable(false);
        jTextField12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField12.setOpaque(false);
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 149, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Answer");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 68, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Account No");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 93, -1));

        kButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/search.gif"))); // NOI18N
        kButton5.setText("Search");
        kButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton5.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton5.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton5.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton5.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 80, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Profile");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 80, 32));

        kButton6.setText("Edit");
        kButton6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton6.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton6.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton6.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton6.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 60, 40));

        kButton7.setText("save");
        kButton7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton7.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton7.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton7.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton7.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 60, 40));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/icons8-forward-50.png"))); // NOI18N
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 40, 40));

        jTabbedPane1.addTab("Profile", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Account Number");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 98, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Name");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 146, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Micr_Number");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 188, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Available Balance");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 230, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Deposit Amount");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 281, -1, -1));
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 103, 156, -1));

        jTextField14.setEditable(false);
        jPanel2.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 151, 156, -1));

        jTextField15.setEditable(false);
        jPanel2.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 193, 156, -1));

        jTextField16.setEditable(false);
        jPanel2.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 233, 156, -1));
        jPanel2.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 286, 74, -1));

        jTextField18.setEditable(false);
        jPanel2.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 286, 76, -1));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel42.setText("Deposit");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 30, 100, 39));

        kButton8.setText("Search");
        kButton8.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton8.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton8.setkHoverColor(new java.awt.Color(0, 0, 0));
        kButton8.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton8.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton8.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 75, 30));

        kButton9.setText("Total");
        kButton9.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton9.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton9.setkHoverColor(new java.awt.Color(0, 0, 0));
        kButton9.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton9.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton9.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 75, 30));

        kButton10.setText("Deposit");
        kButton10.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton10.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton10.setkHoverColor(new java.awt.Color(0, 0, 0));
        kButton10.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton10.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton10.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 75, 30));

        kButton11.setText("Clear");
        kButton11.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton11.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton11.setkHoverColor(new java.awt.Color(0, 0, 0));
        kButton11.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton11.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton11.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 70, 30));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/icons8-forward-50.png"))); // NOI18N
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, -1, -1));

        jTabbedPane1.addTab("Deposit", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Account No");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 141, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Name");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 185, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Available Balance");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 227, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Transfer Amount");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 274, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Credit Account");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 316, -1, -1));
        jPanel3.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 146, 133, -1));

        jTextField20.setEditable(false);
        jPanel3.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 190, 133, -1));

        jTextField22.setEditable(false);
        jPanel3.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 232, 133, -1));
        jPanel3.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 279, 78, -1));

        jTextField24.setEditable(false);
        jPanel3.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 279, 66, -1));

        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 320, 134, -1));

        jTextField25.setEditable(false);
        jPanel3.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 321, 54, -1));

        jTextField26.setEditable(false);
        jPanel3.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 321, 56, -1));

        kButton12.setText("Search");
        kButton12.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton12.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton12.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton12.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton12.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(kButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 78, 30));

        kButton13.setText("Show");
        kButton13.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton13.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton13.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton13.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton13.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(kButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 78, 30));

        kButton14.setText("Transfer");
        kButton14.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton14.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton14.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton14.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton14.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(kButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 78, 30));

        kButton15.setText("Total");
        kButton15.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton15.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton15.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton15.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton15.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton15ActionPerformed(evt);
            }
        });
        jPanel3.add(kButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 78, 30));

        kButton16.setText("Clear");
        kButton16.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton16.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton16.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton16.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton16.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton16ActionPerformed(evt);
            }
        });
        jPanel3.add(kButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 80, 30));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel43.setText("Transfer Amount");
        jPanel3.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 180, 50));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/icons8-forward-50.png"))); // NOI18N
        jPanel3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 120, -1, -1));

        jTabbedPane1.addTab("Transfer", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Account No");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 132, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("Name");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 182, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("Available Balance");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 224, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("Amount");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 266, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setText("Total");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 312, -1, -1));
        jPanel4.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 135, 135, -1));

        jTextField28.setEditable(false);
        jPanel4.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 187, 135, -1));

        jTextField30.setEditable(false);
        jPanel4.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 229, 135, -1));
        jPanel4.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 271, 135, -1));

        jTextField32.setEditable(false);
        jPanel4.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 317, 135, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setText("Withdraw Money");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 39, 203, 33));

        kButton17.setText("Withdraw");
        kButton17.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton17.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton17.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton17.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton17.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton17ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 70, 30));

        kButton18.setText("Show");
        kButton18.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton18.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton18.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton18.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton18.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton18ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 70, 30));

        kButton19.setText("Search");
        kButton19.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton19.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton19.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton19.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton19.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton19ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 70, 30));

        kButton20.setText("Clear");
        kButton20.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton20.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton20.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton20.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton20.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton20ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 70, 30));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/icons8-forward-50.png"))); // NOI18N
        jPanel4.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 170, 60, -1));

        jTabbedPane1.addTab("Withdrawl", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 59, 690, 369));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel44.setText("Customers List");
        jPanel5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 160, 30));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/icons8-forward-50.png"))); // NOI18N
        jPanel5.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 220, -1, -1));

        jTabbedPane1.addTab("Customer List", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setAutoscrolls(false);
        jScrollPane2.setViewportView(jTable2);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 690, 350));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel45.setText("Transaction details");
        jPanel6.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 200, 30));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/icons8-forward-50.png"))); // NOI18N
        jPanel6.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 260, -1, -1));

        jLabel48.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel48.setText("Account no");
        jPanel6.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 110, 20));
        jPanel6.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 100, 30));

        kButton29.setText("Search");
        kButton29.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton29.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton29.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton29.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton29.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton29ActionPerformed(evt);
            }
        });
        jPanel6.add(kButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 60, 30));

        jTabbedPane1.addTab("Transaction", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setText("Account No");
        jPanel7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setText("Name");
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setText("MICR No.");
        jPanel7.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setText("Rate of Interest (%)");
        jPanel7.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("Available balance");
        jPanel7.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setText("Mod balance");
        jPanel7.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel38.setText("Nomination Registered");
        jPanel7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 160, 30));

        jTextField34.setEditable(false);
        jPanel7.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 160, 30));

        jTextField36.setEditable(false);
        jPanel7.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 160, 30));

        jTextField37.setEditable(false);
        jPanel7.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 160, 30));

        jTextField38.setEditable(false);
        jPanel7.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 160, 30));

        jTextField39.setEditable(false);
        jPanel7.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 160, 30));

        jTextField40.setEditable(false);
        jPanel7.add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 160, 30));

        kButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/search.gif"))); // NOI18N
        kButton2.setText("Search");
        kButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton2.setkForeGround(new java.awt.Color(51, 51, 51));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 80, 40));

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel46.setText("View the Balance");
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 210, 30));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/icons8-forward-50.png"))); // NOI18N
        jPanel7.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 320, 40, 40));

        jTabbedPane1.addTab("View Balance", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel39.setText("Old Pin");
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 119, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel40.setText("Enter New Pin");
        jPanel8.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 122, -1));

        jTextField41.setEditable(false);
        jPanel8.add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 172, 30));
        jPanel8.add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 170, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setText("Account No");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, 30));

        kButton1.setBorder(null);
        kButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/search.gif"))); // NOI18N
        kButton1.setText("Search");
        kButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton1.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton1.setkPressedColor(new java.awt.Color(204, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 80, 40));
        jPanel8.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 170, 30));

        kButton3.setBorder(null);
        kButton3.setText("Change");
        kButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton3.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton3.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton3.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton3.setkPressedColor(new java.awt.Color(204, 255, 255));
        kButton3.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 70, 40));

        kButton4.setBorder(null);
        kButton4.setText("Clear");
        kButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        kButton4.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton4.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton4.setkHoverStartColor(new java.awt.Color(153, 255, 255));
        kButton4.setkPressedColor(new java.awt.Color(204, 255, 255));
        kButton4.setkStartColor(new java.awt.Color(128, 234, 175));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 70, 40));

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel47.setText("Change Pin");
        jPanel8.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 230, 30));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/icons8-forward-50.png"))); // NOI18N
        jPanel8.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 370, 50, 40));

        jTabbedPane1.addTab("Change pin", jPanel8);

        jPanel10.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 780, 490));

        kGradientPanel2.setkEndColor(new java.awt.Color(171, 250, 250));
        kGradientPanel2.setkStartColor(new java.awt.Color(227, 204, 161));

        jTextField2.setEditable(false);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Date");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel41.setText("UNI Bank Limited");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/icons8-logout-rounded-up-40.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(26, 26, 26)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))))
        );

        jPanel10.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 80));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 780, 550));

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(245, 207, 153));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/icons8-go-back-24.png"))); // NOI18N
        jButton18.setBorder(null);
        jButton18.setBorderPainted(false);
        jButton18.setOpaque(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 32));

        kButton21.setText("View Balance");
        kButton21.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        kButton21.setkEndColor(new java.awt.Color(255, 204, 204));
        kButton21.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton21.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton21.setkHoverStartColor(new java.awt.Color(241, 197, 142));
        kButton21.setkStartColor(new java.awt.Color(70, 234, 217));
        kButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton21ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 120, -1));

        kButton22.setText("Profile");
        kButton22.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        kButton22.setkEndColor(new java.awt.Color(255, 204, 204));
        kButton22.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton22.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton22.setkHoverStartColor(new java.awt.Color(241, 197, 142));
        kButton22.setkStartColor(new java.awt.Color(70, 234, 217));
        kButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton22ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, -1));

        kButton23.setText("Deposit");
        kButton23.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        kButton23.setkEndColor(new java.awt.Color(255, 204, 204));
        kButton23.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton23.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton23.setkHoverStartColor(new java.awt.Color(241, 197, 142));
        kButton23.setkStartColor(new java.awt.Color(70, 234, 217));
        kButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton23ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 120, -1));

        kButton24.setText("Transfer");
        kButton24.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        kButton24.setkEndColor(new java.awt.Color(255, 204, 204));
        kButton24.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton24.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton24.setkHoverStartColor(new java.awt.Color(241, 197, 142));
        kButton24.setkStartColor(new java.awt.Color(70, 234, 217));
        kButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton24ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 120, -1));

        kButton25.setText("Withdrawl");
        kButton25.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        kButton25.setkEndColor(new java.awt.Color(255, 204, 204));
        kButton25.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton25.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton25.setkHoverStartColor(new java.awt.Color(241, 197, 142));
        kButton25.setkStartColor(new java.awt.Color(70, 234, 217));
        kButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton25ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 120, -1));

        kButton26.setText("Customer list");
        kButton26.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        kButton26.setkEndColor(new java.awt.Color(255, 204, 204));
        kButton26.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton26.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton26.setkHoverStartColor(new java.awt.Color(241, 197, 142));
        kButton26.setkStartColor(new java.awt.Color(70, 234, 217));
        kButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton26ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 120, -1));

        kButton27.setText("Change Pin");
        kButton27.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        kButton27.setkEndColor(new java.awt.Color(255, 204, 204));
        kButton27.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton27.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton27.setkHoverStartColor(new java.awt.Color(241, 197, 142));
        kButton27.setkStartColor(new java.awt.Color(70, 234, 217));
        kButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton27ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 120, -1));

        kButton28.setText("Transaction");
        kButton28.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        kButton28.setkEndColor(new java.awt.Color(255, 204, 204));
        kButton28.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton28.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton28.setkHoverStartColor(new java.awt.Color(241, 197, 142));
        kButton28.setkStartColor(new java.awt.Color(70, 234, 217));
        kButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton28ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 120, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 550));

        setSize(new java.awt.Dimension(909, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
            String a1=(String) jComboBox1.getSelectedItem();
            String sql="select * from BALANCES where ACC=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, a1);
            rs=pst.executeQuery();
            if(rs.next()){
                String add=rs.getString("BALANCE");
                jTextField25.setText(add);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
       Employee_dashboard E = new Employee_dashboard();
       E.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        String sql="select * from ACCOUNT where Acc=?";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
           pst=conn.prepareStatement(sql);
           pst.setString(1, jTextField35.getText());
           rs=pst.executeQuery();
           if(rs.next()){
               String add1=rs.getString("Pin");
               jTextField41.setText(add1);
               
               rs.close();
               pst.close();
           }
           else{
               JOptionPane.showMessageDialog(null, "Enter Correct Account Number");
           }
           jTextField42.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                
            }
        }
        
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
         try{
            String value1=jTextField35.getText();
            String value2=jTextField42.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
            String sql="update ACCOUNT set PIN='"+value2+"' where ACC='"+value1+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Pin Successfully Changed");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
        jTextField42.setText("");
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
         String sql="select * from BALANCES where ACC=?";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
            pst=conn.prepareStatement(sql);
            pst.setString(1, jTextField33.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("NAME");
                jTextField34.setText(add1);
               // String add2=rs.getString("ACC");
               //jTextField35.setText(add2);
                String add3=rs.getString("MICR_NO");
                jTextField36.setText(add3);
                String add4=rs.getString("BALANCE");
                jTextField38.setText(add4);
                jTextField37.setText("4 %");
                jTextField39.setText("Rs 0.00");
                jTextField40.setText("No");
            }
            else{
                JOptionPane.showMessageDialog(null, "Account number is wrong");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter the Account Number");
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        boolean a = jTable1.isEditing();
        
        if(a==false){
            JOptionPane.showMessageDialog(null, "You can't edit this table");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        // TODO add your handling code here:
        String sql="select * from ACCOUNT where ACC=?";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
           pst=conn.prepareStatement(sql);
           pst.setString(1, jTextField1.getText());
           rs=pst.executeQuery();
           if(rs.next()){
               String add1=rs.getString("NAME");
               jTextField3.setText(add1);            
               String add3=rs.getString("DOB");
               jTextField4.setText(add3);
               String add4=rs.getString("ACC_TYPE");
               jTextField9.setText(add4);
               String add5=rs.getString("NATIONALITY");
               jTextField5.setText(add5);
               String add6=rs.getString("CASTE");
               jTextField10.setText(add6);
               String add7=rs.getString("GENDER");
               jTextField6.setText(add7);
               String add8=rs.getString("MOB");
               jTextField11.setText(add8);
               String add9=rs.getString("ADDRESS");
               jTextField7.setText(add9);
               String add10=rs.getString("SEC_Q");
               jTextField12.setText(add10);
               String add11=rs.getString("SEC_A");
               jTextField8.setText(add11);
               rs.close();
               pst.close();
           }
           else{
               JOptionPane.showMessageDialog(null, "Enter Correct Account Number");
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_kButton5ActionPerformed

    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
        // TODO add your handling code here:
        jTextField5.setEditable(true);
        jTextField6.setEditable(true);
        jTextField7.setEditable(true);
        jTextField10.setEditable(true);
        jTextField11.setEditable(true);
        jTextField12.setEditable(true);
        jTextField8.setEditable(true);
    }//GEN-LAST:event_kButton6ActionPerformed

    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed
        // TODO add your handling code here:
         try{
          String value1=jTextField5.getText();
          String value2=jTextField6.getText();
          String value3=jTextField7.getText();
          String value4=jTextField10.getText();
          String value5=jTextField11.getText();
          String value6=jTextField12.getText();
          String value7=jTextField1.getText();
           String value8=jTextField8.getText();
          Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
          String sql="update ACCOUNT set NATIONALITY='"+value1+"',GENDER='"+value2+"',ADDRESS='"+value3+"',CASTE='"+value4+"',MOB='"+value5+"',SEC_Q='"+value6+"',SEC_A='"+value8+"' where ACC='"+value7+"'";
          pst=conn.prepareStatement(sql);
          pst.execute();
          JOptionPane.showMessageDialog(null, "Profile Updated");
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField10.setEditable(false);
        jTextField11.setEditable(false);
        jTextField12.setEditable(false);
        jTextField8.setEditable(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_kButton7ActionPerformed

    private void kButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton8ActionPerformed
        // TODO add your handling code here:
        String sql="select * from BALANCES where Acc=?";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
            pst=conn.prepareStatement(sql);
            pst.setString(1, jTextField13.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("NAME");
                jTextField14.setText(add1);
                String add2=rs.getString("MICR_NO");
                jTextField15.setText(add2);
                String add3=rs.getString("BALANCE");
                jTextField16.setText(add3);
                rs.close();
                pst.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "Enter Correct Account number");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_kButton8ActionPerformed

    private void kButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton9ActionPerformed
        // TODO add your handling code here:
        try{
            String a1=jTextField16.getText();
            String a2=jTextField17.getText();
            int sum=Integer.parseInt(a1)+Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jTextField18.setText(sum1);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter the Amount");
        }
    }//GEN-LAST:event_kButton9ActionPerformed

    private void kButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton10ActionPerformed
        // TODO add your handling code here:
       
        try{
            String value1=jTextField13.getText();
            String value2=jTextField18.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
            String sql="update BALANCES set BALANCE='"+value2+"' where ACC='"+value1+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();          
            JOptionPane.showMessageDialog(null, "Sucessfully Deposited");
            Deposit();
            
            jTextField17.setText("");
            jTextField18.setText("");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Make sure You Entered correctly");
        }
    }//GEN-LAST:event_kButton10ActionPerformed

    private void kButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton11ActionPerformed
        // TODO add your handling code here:
        jTextField17.setText("");
    }//GEN-LAST:event_kButton11ActionPerformed

    private void kButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton12ActionPerformed
        // TODO add your handling code here:
         String sql="select * from BALANCES where ACC=?";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
            pst=conn.prepareStatement(sql);
            pst.setString(1, jTextField19.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("NAME");
                jTextField20.setText(add1);
                //String add2=rs.getString("ACC");
               // jTextField21.setText(add2);
                String add3=rs.getString("BALANCE");
                jTextField22.setText(add3);
                rs.close();
                pst.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "Enter Correct Account Number");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter the Account Number");
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_kButton12ActionPerformed

    private void kButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton15ActionPerformed
        // TODO add your handling code here:
         try{
            String a1=jTextField22.getText();
            String a2=jTextField23.getText();
            int sum=Integer.parseInt(a1)-Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jTextField24.setText(sum1);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter the correct amount");
        }
    }//GEN-LAST:event_kButton15ActionPerformed

    private void kButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton13ActionPerformed
        // TODO add your handling code here:
      
        
         try{
             
            String a1=jTextField23.getText();
            String a2=jTextField25.getText();
              if(jComboBox1.getSelectedItem() == jTextField19.getText()){
                 System.out.println("Equals");
                 
             }
            int sum=Integer.parseInt(a1)+Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jTextField26.setText(sum1);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Choose the correct Account Number");
        }
    }//GEN-LAST:event_kButton13ActionPerformed

    private void kButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton14ActionPerformed
        // TODO add your handling code here:
        TransferD();
        TransferC();
        Withdrawl1();
        Deposit1();
        
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");



    }//GEN-LAST:event_kButton14ActionPerformed

    private void kButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton19ActionPerformed
        // TODO add your handling code here:
         String sql="select * from BALANCES where ACC=?";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
            pst=conn.prepareStatement(sql);
            pst.setString(1, jTextField27.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("NAME");
                jTextField28.setText(add1);
                //String add2=rs.getString("ACC");
                //jTextField29.setText(add2);
                String add3=rs.getString("BALANCE");
                jTextField30.setText(add3);
                rs.close();
                pst.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "Enter Correct Name");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_kButton19ActionPerformed

    private void kButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton18ActionPerformed
        // TODO add your handling code here:
         try{
            String a1=jTextField30.getText();
            String a2=jTextField31.getText();
            int sum=Integer.parseInt(a1)-Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jTextField32.setText(sum1);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter the amount");
        }
    }//GEN-LAST:event_kButton18ActionPerformed

    private void kButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton17ActionPerformed
        // TODO add your handling code here:
        try{
            String a1=jTextField27.getText();
            String a2=jTextField32.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
            String sql="update BALANCES set BALANCE='"+a2+"' where ACC='"+a1+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Withdraw Successful");
            Withdrawl();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_kButton17ActionPerformed

    private void kButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton16ActionPerformed
        // TODO add your handling code here:
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");
       
    }//GEN-LAST:event_kButton16ActionPerformed

    private void kButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton22ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_kButton22ActionPerformed

    private void kButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton23ActionPerformed
        // TODO add your handling code here:
                jTabbedPane1.setSelectedIndex(1);

    }//GEN-LAST:event_kButton23ActionPerformed

    private void kButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton24ActionPerformed
        // TODO add your handling code here:
                jTabbedPane1.setSelectedIndex(2);

    }//GEN-LAST:event_kButton24ActionPerformed

    private void kButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton25ActionPerformed
        // TODO add your handling code here:
                jTabbedPane1.setSelectedIndex(3);

    }//GEN-LAST:event_kButton25ActionPerformed

    private void kButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton26ActionPerformed
        // TODO add your handling code here:
                jTabbedPane1.setSelectedIndex(4);

    }//GEN-LAST:event_kButton26ActionPerformed

    private void kButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton28ActionPerformed
        // TODO add your handling code here:
                jTabbedPane1.setSelectedIndex(5);

    }//GEN-LAST:event_kButton28ActionPerformed

    private void kButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton21ActionPerformed
        // TODO add your handling code here:
                jTabbedPane1.setSelectedIndex(6);

    }//GEN-LAST:event_kButton21ActionPerformed

    private void kButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton27ActionPerformed
        // TODO add your handling code here:
                jTabbedPane1.setSelectedIndex(7);

    }//GEN-LAST:event_kButton27ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton20ActionPerformed
        // TODO add your handling code here:
        jTextField31.setText("");
    }//GEN-LAST:event_kButton20ActionPerformed

    private void kButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton29ActionPerformed
        // TODO add your handling code here:
        Table2();
    }//GEN-LAST:event_kButton29ActionPerformed
    
    public void Account(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
            String sql="select * from BALANCES";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                String account=rs.getString("ACC");
                jComboBox1.addItem(account);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter the Transferable amount");
        }
    }
     public void TransferC(){
     try{
         String value1=(String) jComboBox1.getSelectedItem();
         String value2=jTextField26.getText();
         Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
         String sql="update BALANCES set BALANCE='"+value2+"' where ACC='"+value1+"'";
         pst=conn.prepareStatement(sql);
         pst.execute();
         JOptionPane.showMessageDialog(null, "Seuccesfully Transfered");
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
 }
 
 public void TransferD(){
     try{
        String value1=jTextField19.getText(); 
        String value2=jTextField24.getText();
        Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","");
        String sql="update BALANCES set BALANCE='"+value2+"' where ACC='"+value1+"'";
        pst=conn.prepareStatement(sql);
        pst.execute();
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
 }
    
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton18;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton10;
    private com.k33ptoo.components.KButton kButton11;
    private com.k33ptoo.components.KButton kButton12;
    private com.k33ptoo.components.KButton kButton13;
    private com.k33ptoo.components.KButton kButton14;
    private com.k33ptoo.components.KButton kButton15;
    private com.k33ptoo.components.KButton kButton16;
    private com.k33ptoo.components.KButton kButton17;
    private com.k33ptoo.components.KButton kButton18;
    private com.k33ptoo.components.KButton kButton19;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton20;
    private com.k33ptoo.components.KButton kButton21;
    private com.k33ptoo.components.KButton kButton22;
    private com.k33ptoo.components.KButton kButton23;
    private com.k33ptoo.components.KButton kButton24;
    private com.k33ptoo.components.KButton kButton25;
    private com.k33ptoo.components.KButton kButton26;
    private com.k33ptoo.components.KButton kButton27;
    private com.k33ptoo.components.KButton kButton28;
    private com.k33ptoo.components.KButton kButton29;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KButton kButton6;
    private com.k33ptoo.components.KButton kButton7;
    private com.k33ptoo.components.KButton kButton8;
    private com.k33ptoo.components.KButton kButton9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables

    private boolean isSelected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
