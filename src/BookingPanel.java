import javax.swing.*;

public class BookingPanel extends JFrame{
    private JPanel mainPanel;
    private JPanel mapPanel;
    private JTextPane titleText;
    private JPanel selectionPanel;

    public BookingPanel(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public void setMapImg(){
        JLabel label = new JLabel();
        ImageIcon img = new ImageIcon("map.png");// 创建图片对象
        label.setIcon(img);
        mapPanel.add(label);
//        add(mapPanel);
    }

    public static void main(String[] args) {
        BookingPanel frame = new BookingPanel("test");
        frame.setVisible(true);
        frame.setMapImg();
    }
}
