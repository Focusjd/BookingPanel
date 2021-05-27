import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ref extends JFrame{
    private JPanel BookingPanel;
    private JPanel map;
    private JPanel infoPanel;
    private JLabel selectHotelName;
    private JLabel hotelLabel;
    private JScrollPane reservation;
    private JLabel mapLabel;
    private JPanel titlePanel;
    private JLabel selectTitle;
    private JTextField firstNametext;
    private JTextField lastnametext;
    private JTextField phonetext;
    private JButton button1;
    private JLabel img1;
    private JTextArea orderPreviewer;
    private JButton confirmButton;
    private JButton resetButton;
    private JPanel test;
    private JTextField checkInDate;
    private JTextField checkOutDate;
    private JPanel checkInPanel;
    private JPanel checkOutPanel;
    private JPanel scrolBackground;
    private JLabel img2;
    private JLabel img3;
    private JLabel img4;
    private JLabel img5;
    private JLabel img6;
    private JLabel img7;
    private JLabel img8;
    private JLabel img9;
    private JLabel img10;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner spinner3;
    private JSpinner spinner4;
    private JSpinner spinner5;
    private JSpinner personNumber;
    private JPanel inp;
    private JPanel test2;
    private JButton reviewButton;

    private String firstName;
    private String lastName;
    private int phone;
    private int pNum;


    private final static String newline = "\n";

    public static void main(String[] args) {
        JFrame f = new ref("Focus Hotel Booking");
    }
//    public static void main(String args[]) {
//        DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
//        DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
//        JTextField showDate1 = new JTextField("Click and choose a date");
//        JTextField showDate2 = new JTextField("Click and choose a date");
////  JLabel showDate2 = new JLabel("单击选择日期");
//
//        dateChooser1.register(showDate1);
//        dateChooser2.register(showDate2);
//        showDate1.setBounds(500, 210, 20, 20);
//        showDate2.setBounds(500, 240, 20, 20);
//        JFrame frame=new JFrame("New Frame");
//        frame.add(showDate2);
//        frame.add(showDate1);
//
//        frame.setBounds(100, 100, 500, 500);
//        frame.setVisible(true);
//    }

    public ref(String title){
        super(title);
        JPanel mainPanel = BookingPanel;
        this.setContentPane(mainPanel);

        setimage(img1,"src/hotelImage/img1.png");
        setimage(img2,"src/hotelImage/img2.png");
        setimage(img3,"src/hotelImage/img3.png");
        setimage(img4,"src/hotelImage/img4.png");
        setimage(img5,"src/hotelImage/img5.png");
        setimage(img6,"src/hotelImage/img6.png");
        setimage(img7,"src/hotelImage/img7.png");
        setimage(img8,"src/hotelImage/img8.png");
        setimage(img9,"src/hotelImage/img9.png");
        setimage(img10,"src/hotelImage/img10.png");
        setmap();

        setDataChooser(checkInDate, checkInPanel);
        setDataChooser(checkOutDate, checkOutPanel);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1300,1000);
//        this.pack();
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputChecker();
                JOptionPane.showMessageDialog(null,"Submit successfully");
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNametext.setText("");
                lastnametext.setText("");
                phonetext.setText("");
                personNumber.setValue(0);
                orderPreviewer.setText("");
            }
        });
        reviewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputChecker();
                orderPreview();
            }
        });
    }
    public void inputChecker(){
        loadData();
        if (phone==0||firstName==null||lastName==null||pNum<=0){
            JOptionPane.showMessageDialog(null,"Invalid Input!");
            return;
        }
    }


    public void loadData(){
        try {
            phone =Integer.parseInt(phonetext.getText());
            firstName = firstNametext.getText();
            lastName = lastnametext.getText();
            pNum = (int)personNumber.getValue();
        }catch (Exception e){
            pNum=0;
        }

    }


//    public void setPeopleBox1(){
//        for (int i = 1; i < 10; i++) {
//            peopleBox1.addItem(i);
//        }
//
//    }

    public void setmap(){
        ImageIcon locationMap=new ImageIcon("src/map.png");
        locationMap.setImage(locationMap.getImage().getScaledInstance(500, 900, Image.SCALE_DEFAULT));
        mapLabel.setIcon(locationMap);
    }

    public void setimage(JLabel label,String path){
        ImageIcon locationMap=new ImageIcon(path);
        locationMap.setImage(locationMap.getImage().getScaledInstance(150, 100, Image.SCALE_DEFAULT));
        label.setIcon(locationMap);
    }
    public void setDataChooser(JTextField textField1, JPanel panel){
        DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
        dateChooser1.register(textField1);
        textField1.setText("Click to select date");
        textField1.setSize(new Dimension(200,10));
        panel.add(dateChooser1);

    }

    public void orderPreview(){
        orderPreviewer.setText("");
        String msg =
                "Order Preview"+newline
                +"Full Name: "+firstName+" "+lastName+newline
                +"Phone: "+phone+newline
                +"Customer Number: "+ pNum+newline
                +"Check-in Date"+checkInDate.getText()+newline
                +"Check-out Date"+checkOutDate.getText();
        orderPreviewer.append(msg);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
