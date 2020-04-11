/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author computer center
 */
public class tow_player extends javax.swing.JFrame {
    


   static int count =0 ;
   static int playerx=0;
   static int playero=0;
      static boolean play=true;

   private void tow_player(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handling code here:
        this.setLocationRelativeTo(null);
   }
   
    public tow_player() {
        
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
    }
   
    public void rest(){
        x1.setText("  ");
        x2.setText("  ");
        x3.setText("  ");
        x4.setText("  ");
        x5.setText("  ");
        x6.setText("  ");
        x7.setText("  ");
        x8.setText("  ");
        x9.setText("  ");
       /////////////////////////   
          x1.setForeground(Color.white);
          x2.setForeground(Color.white);
          x3.setForeground(Color.white);
          x4.setForeground(Color.white);
          x5.setForeground(Color.white);
          x6.setForeground(Color.white);
          x7.setForeground(Color.white);
          x8.setForeground(Color.white);
          x9.setForeground(Color.white);
          screen.setText(" ");
       
                    screen.setText(" ");
        play=true;

        count=0;

    }
    public void who_is_win(){
        if(player_x_win()){
            player_x_win();
            screen.setText(" X winner");
            ++playerx;
          String x= Integer.toString(playerx);
            player_x.setText(x);
            
        }
        else if(player_o_win()){
            player_o_win();
            screen.setText("O winner");
            ++playero;
          String o= Integer.toString(playero);
            player_o.setText(o);
            
        }
    }
    
        public void game_finsh(){
         if(player_x_win() || player_o_win()  ){
              play=false ;
         }
    }
    
    public boolean  player_x_win(){
        
        if (" x".equals(x1.getText()) &&" x".equals(x2.getText()) && " x".equals(x3.getText()))
        {   
          x1.setForeground(Color.PINK);
          x2.setForeground(Color.PINK);
          x3.setForeground(Color.PINK);
            return true ;
        }
        
        
       else if (" x".equals(x4.getText()) &&" x".equals(x5.getText()) && " x".equals(x6.getText())) 
           {   
          x4.setForeground(Color.PINK);
          x5.setForeground(Color.PINK);
          x6.setForeground(Color.PINK);
            return true ;
           }
        
       else if (" x".equals(x7.getText()) &&" x".equals(x8.getText()) && " x".equals(x9.getText()))
           {   
          x7.setForeground(Color.PINK);
          x8.setForeground(Color.PINK);
          x9.setForeground(Color.PINK);
            return true ;
           }
        
     else if (" x".equals(x1.getText()) &&" x".equals(x4.getText()) && " x".equals(x7.getText()))
           {   
          x1.setForeground(Color.PINK);
          x4.setForeground(Color.PINK);
          x7.setForeground(Color.PINK);
            return true ;
           }
     else if (" x".equals(x2.getText()) &&" x".equals(x5.getText()) && " x".equals(x8.getText()))
           {   
          x2.setForeground(Color.PINK);
          x5.setForeground(Color.PINK);
          x8.setForeground(Color.PINK);
            return true ;
           }
     
        else if (" x".equals(x3.getText()) &&" x".equals(x6.getText()) && " x".equals(x9.getText()))
           {   
          x3.setForeground(Color.PINK);
          x6.setForeground(Color.PINK);
          x9.setForeground(Color.PINK);
            return true ;
           }
        
        
       else if (" x".equals(x1.getText()) &&" x".equals(x5.getText()) && " x".equals(x9.getText())) 
       {   
          x1.setForeground(Color.PINK);
          x5.setForeground(Color.PINK);
          x9.setForeground(Color.PINK);
            return true ;
        }
        
       else if (" x".equals(x3.getText()) &&" x".equals(x5.getText()) && " x".equals(x7.getText()))
           {   
          x3.setForeground(Color.PINK);
          x5.setForeground(Color.PINK);
          x7.setForeground(Color.PINK);
            return true ;
        }
        
        else return false ;
        
        
    }
    
   public boolean  player_o_win(){
        
        if (" o".equals(x1.getText()) &&" o".equals(x2.getText()) && " o".equals(x3.getText()))
        {   
          x1.setForeground(Color.PINK);
          x2.setForeground(Color.PINK);
          x3.setForeground(Color.PINK);
            return true ;
        }
        
        
       else if (" o".equals(x4.getText()) &&" o".equals(x5.getText()) && " o".equals(x6.getText())) 
           {   
          x4.setForeground(Color.PINK);
          x5.setForeground(Color.PINK);
          x6.setForeground(Color.PINK);
            return true ;
           }
        
       else if (" o".equals(x7.getText()) &&" o".equals(x8.getText()) && " o".equals(x9.getText()))
           {   
          x7.setForeground(Color.PINK);
          x8.setForeground(Color.PINK);
          x9.setForeground(Color.PINK);
            return true ;
           }
        
     else if (" o".equals(x1.getText()) &&" o".equals(x4.getText()) && " o".equals(x7.getText()))
           {   
          x1.setForeground(Color.PINK);
          x4.setForeground(Color.PINK);
          x7.setForeground(Color.PINK);
            return true ;
           }
     else if (" o".equals(x2.getText()) &&" o".equals(x5.getText()) && " o".equals(x8.getText()))
           {   
          x2.setForeground(Color.PINK);
          x5.setForeground(Color.PINK);
          x8.setForeground(Color.PINK);
            return true ;
           }
     
        else if (" o".equals(x3.getText()) &&" o".equals(x6.getText()) && " o".equals(x9.getText()))
           {   
          x3.setForeground(Color.PINK);
          x6.setForeground(Color.PINK);
          x9.setForeground(Color.PINK);
            return true ;
           }
        
        
       else if (" o".equals(x1.getText()) &&" o".equals(x5.getText()) && " o".equals(x9.getText())) 
       {   
          x1.setForeground(Color.PINK);
          x5.setForeground(Color.PINK);
          x9.setForeground(Color.PINK);
            return true ;
        }
        
       else if (" o".equals(x3.getText()) &&" o".equals(x5.getText()) && " o".equals(x7.getText())) 
       {   
          x3.setForeground(Color.PINK);
          x5.setForeground(Color.PINK);
          x7.setForeground(Color.PINK);
            return true ;
        }
            
        
        else return false ;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        player_x = new javax.swing.JLabel();
        player_o = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        screen = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        x6 = new javax.swing.JLabel();
        x5 = new javax.swing.JLabel();
        x7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        x8 = new javax.swing.JLabel();
        x2 = new javax.swing.JLabel();
        x3 = new javax.swing.JLabel();
        x9 = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        x4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel17.setText("zero");

        jLabel3.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" x");

        jTextArea1.setBackground(new java.awt.Color(255, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("player x winner");
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel14.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        jLabel14.setText("player  X");

        jLabel16.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        jLabel16.setText("player  O");

        player_x.setText("zero");

        player_o.setText("zero");

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setText("again");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        screen.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        screen.setForeground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(player_x)
                    .addComponent(player_o)
                    .addComponent(screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player_x)
                .addGap(37, 37, 37)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player_o)
                .addGap(44, 44, 44)
                .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        x6.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        x6.setForeground(new java.awt.Color(255, 255, 255));
        x6.setText("  ");
        x6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x6MouseClicked(evt);
            }
        });

        x5.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        x5.setForeground(new java.awt.Color(255, 255, 255));
        x5.setText("  ");
        x5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x5MouseClicked(evt);
            }
        });

        x7.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        x7.setForeground(new java.awt.Color(255, 255, 255));
        x7.setText("  ");
        x7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x7MouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        x8.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        x8.setForeground(new java.awt.Color(255, 255, 255));
        x8.setText("  ");
        x8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x8MouseClicked(evt);
            }
        });

        x2.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        x2.setForeground(new java.awt.Color(255, 255, 255));
        x2.setText("  ");
        x2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x2MouseClicked(evt);
            }
        });

        x3.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        x3.setForeground(new java.awt.Color(255, 255, 255));
        x3.setText("  ");
        x3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x3MouseClicked(evt);
            }
        });

        x9.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        x9.setForeground(new java.awt.Color(255, 255, 255));
        x9.setText("  ");
        x9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x9MouseClicked(evt);
            }
        });

        x1.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        x1.setForeground(new java.awt.Color(255, 255, 255));
        x1.setText("  ");
        x1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                x1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        x1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x1MouseClicked(evt);
            }
        });

        x4.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        x4.setForeground(new java.awt.Color(255, 255, 255));
        x4.setText("  ");
        x4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(x7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(x6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(x9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(x8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleParent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleParent(jPanel2);

        pack();
    }// </editor-fold>                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    rest();        // TODO add your handling code here:
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
                 this.dispose();
        page2 p= new page2();
        p.setVisible(true);
        p.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      
    }                                        

    private void x1AncestorAdded(javax.swing.event.AncestorEvent evt) {                                 
        // TODO add your handling code here:
       
    }                                

    private void x1MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
         
      if(play){   
                if("  ".equals(x1.getText()) )
                {  
                    game_finsh();
                  if(play){  
                count++;
               if(count%2==1) 
                x1.setText(" x");
               else x1.setText(" o");

                
                who_is_win();
                  }
                }
            }                               
    }
    private void x2MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
         
         if(play){   
                if("  ".equals(x2.getText()) )
                {  
                    game_finsh();
                  if(play){  
                count++;
               if(count%2==1) 
                x2.setText(" x");
               else x2.setText(" o");

                
                who_is_win();
                  }
                }
            }
    }                               

    private void x3MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if(play){   
                if("  ".equals(x3.getText()) )
                {  
                    game_finsh();
                  if(play){  
                count++;
               if(count%2==1) 
                x3.setText(" x");
               else x3.setText(" o");

                
                who_is_win();
                  }
                }
            }
    }                               

    private void x4MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if(play){   
                if("  ".equals(x4.getText()) )
                {  
                    game_finsh();
                  if(play){  
                count++;
               if(count%2==1) 
                x4.setText(" x");
               else x4.setText(" o");

                
                who_is_win();
                  }
                }
            }
    }                               

    private void x5MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if(play){   
                if("  ".equals(x5.getText()) )
                {  
                    game_finsh();
                  if(play){  
                count++;
               if(count%2==1) 
                x5.setText(" x");
               else x5.setText(" o");

                
                who_is_win();
                  }
                }
            }
    }                               

    private void x6MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if(play){   
                if("  ".equals(x6.getText()) )
                {  
                    game_finsh();
                  if(play){  
                count++;
               if(count%2==1) 
                x6.setText(" x");
               else x6.setText(" o");

                
                who_is_win();
                  }
                }
            }    
    }                               

    private void x7MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if(play){   
                if("  ".equals(x7.getText()) )
                {  
                    game_finsh();
                  if(play){  
                count++;
               if(count%2==1) 
                x7.setText(" x");
               else x7.setText(" o");

                
                who_is_win();
                  }
                }
            }
    }                               

    private void x8MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if(play){   
                if("  ".equals(x8.getText()) )
                {  
                    game_finsh();
                  if(play){  
                count++;
               if(count%2==1) 
                x8.setText(" x");
               else x8.setText(" o");

                
                who_is_win();
                  }
                }
            }
    }                               

    private void x9MouseClicked(java.awt.event.MouseEvent evt) {                                
        
          if(play){   
                if("  ".equals(x9.getText()) )
                {  
                    game_finsh();
                  if(play){  
                count++;
               if(count%2==1) 
                x9.setText(" x");
               else x9.setText(" o");

                
                who_is_win();
                  }
                }
            }
          
             }                               

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(tow_player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(tow_player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(tow_player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(tow_player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new tow_player().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel player_o;
    private javax.swing.JLabel player_x;
    private javax.swing.JLabel screen;
    private javax.swing.JLabel x1;
    private javax.swing.JLabel x2;
    private javax.swing.JLabel x3;
    private javax.swing.JLabel x4;
    private javax.swing.JLabel x5;
    private javax.swing.JLabel x6;
    private javax.swing.JLabel x7;
    private javax.swing.JLabel x8;
    private javax.swing.JLabel x9;
    // End of variables declaration                   
}


