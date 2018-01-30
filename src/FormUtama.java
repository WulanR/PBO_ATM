
import java.awt.Dimension;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milo Nestlea
 */
public class FormUtama extends JFrame{
    public FormUtama(){
        super ("Form Utama");
        initComponents();
    }
    
    private void initComponents(){
        setPreferredSize(new Dimension(400,200));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
