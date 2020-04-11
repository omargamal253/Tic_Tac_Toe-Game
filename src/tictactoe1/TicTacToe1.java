/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe1;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author ayman
 */
public class TicTacToe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        tow_player n =new tow_player();
       // n.setLocationRelativeTo(null);
        //n.setVisible(true);
        n.setResizable(false);
        n.who_is_win();
        TicTacToe_finish f=new TicTacToe_finish();
        page2 p= new page2();
        f.setVisible(true);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        p.setLocationRelativeTo(null);
        n.setLocationRelativeTo(null);
        try {
            File myfile1 =new File("avatar.jpg");
            Image img1=ImageIO.read(myfile1);
            p.setIconImage(img1);

        } catch (IOException ex) {
            Logger.getLogger(TicTacToe1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            File myfile=new File("icon.png");
            Image img =ImageIO.read(myfile);
            f.setIconImage(img);
            
        } catch (Exception ex) {
            Logger.getLogger(TicTacToe1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
