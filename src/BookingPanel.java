import javax.swing.*;
import java.awt.*;

public class BookingPanel extends JFrame{
    private JPanel mainPanel;
    private JPanel mapPanel;
    private JTextPane titleText;
    private JPanel selectionPanel;
    private JPanel divisionLine;

    private JScrollPane scrollPane;

    public BookingPanel(String title, int w, int h, int x, int y){
        super(title);

//        this.setContentPane(mainPanel);
        this.setBackground(Color.PINK);
        initComponent();

        this.setSize(w,h);
        this.setLocation(x,y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
//        this.pack(); //this will change the frame size according to the current frame component
        this.setVisible(true);
    }

    private void initComponent(){
        this.setLayout(new BorderLayout());
        mapPanel = new JPanel();
        selectionPanel = new JPanel();
        divisionLine =new JPanel();

        mapPanel.setBackground(Color.pink);
//        scrollPane = new JScrollPane(setImg("src/map.png"),ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        mapPanel.setPreferredSize(new Dimension(1000, 100));
        mapPanel.add(setImg("src/map.png"));
        JScrollPane scrollPane = new JScrollPane(mapPanel);
        scrollPane.scrollRectToVisible(new Rectangle(0,0,100,100));
        this.add(scrollPane);
//        this.add(mapPanel);

        divisionLine.setBackground(Color.ORANGE);
        divisionLine.setSize(5,this.getHeight());
//        divisionLine.setBounds(mapPanel.getWidth(),0,this.getWidth()/20,this.getHeight());

        selectionPanel.setLayout(new BoxLayout(selectionPanel, BoxLayout.PAGE_AXIS));
        selectionPanel.add(setTitleText("Focusing Hotel Booking System"));


//        this.add(divisionLine, BorderLayout.CENTER);
        this.add(mapPanel, BorderLayout.WEST);
        this.add(selectionPanel, BorderLayout.CENTER);
//        this.add(new JButton("center"), BorderLayout.CENTER);

    }

    private JTextPane setTitleText(String titleName){
        JTextPane text = new JTextPane();
        text.setText(titleName);

        return text;
    }

    private JLabel setImg(String imgLocation){
        JLabel label = new JLabel();
        ImageIcon img = new ImageIcon(imgLocation);
        label.setIcon(img);

//        label.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
//        mainPanel = new JPanel();
//        mainPanel.setLayout();
        return label;
    }

    public static void main(String[] args) {
        BookingPanel frame = new BookingPanel("test window", 800, 600, 300, 300);
    }
}
