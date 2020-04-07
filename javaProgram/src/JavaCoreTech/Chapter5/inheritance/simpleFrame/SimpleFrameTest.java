package JavaCoreTech.Chapter5.inheritance.simpleFrame;


import java.awt.*;
import javax.swing.*;

public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            SimpleFrame frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setUndecorated(false);
            frame.setTitle("myFirstFrame!");
            frame.setLocation(100,100);
            //frame.setBounds(10,10,10,10);
            frame.setVisible(true);
            Container contentPane = frame.getContentPane();
        });
    }
}

class SimpleFrame extends JFrame{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    public SimpleFrame(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();

        setSize(screenSize.width/2,screenSize.height/2);
        setLocationByPlatform(true);

    }
}