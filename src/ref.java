import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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
    private JButton h1b;
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
    private JSpinner room2;
    private JSpinner room3;
    private JSpinner room4;
    private JSpinner room1;
    private JSpinner personNumber;
    private JPanel inp;
    private JPanel test2;
    private JButton reviewButton;
    private JLabel hotelLocation;
    private JButton h2t;
    private JButton h3t;
    private JButton h4t;
    private JButton h5t;
    private JButton h6t;
    private JButton h7t;
    private JButton h8t;
    private JButton h9t;
    private JButton h10t;

    private String firstName;
    private String lastName;
    private String phone;
    private int pNum;
    private Date checkin;
    private Date checkout;
    private int room1Num;
    private int room2Num;
    private int room3Num;
    private int room4Num;
    private String currentHotel;
    private String currentAddr;


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
                reset();
                resetDate();
            }
        });
        reviewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputChecker();
                orderPreview();
            }
        });
        h1b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
                currentHotel = "Royal hotel";
                currentAddr = "Soccer Rd No.111";
                hotelLabel.setText(currentHotel);
                hotelLocation.setText(currentAddr);
            }
        });
        h2t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHotel = "NOLITA Hotel";
                currentAddr = "Laight St No.6";
                hotelLabel.setText(currentHotel);
                hotelLocation.setText(currentAddr);
            }
        });
        h3t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHotel = "Goat Hotel";
                currentAddr = "Goat St No.1";
                hotelLabel.setText(currentHotel);
                hotelLocation.setText(currentAddr);
            }
        });
        h4t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHotel = "ROMA Hotel";
                currentAddr = "Sleep St No.7";
                hotelLabel.setText(currentHotel);
                hotelLocation.setText(currentAddr);
            }
        });
        h5t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHotel = "Beans Hotel";
                currentAddr = "Net Rd No.12";
                hotelLabel.setText(currentHotel);
                hotelLocation.setText(currentAddr);
            }
        });
        h6t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHotel = "Big Hotel";
                currentAddr = "Huge St No.55";
                hotelLabel.setText(currentHotel);
                hotelLocation.setText(currentAddr);
            }
        });
        h7t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHotel = "Small Hotel";
                currentAddr = "Small Rd No.31";
                hotelLabel.setText(currentHotel);
                hotelLocation.setText(currentAddr);
            }
        });
        h8t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHotel = "Cheng Hotel";
                currentAddr = "Small Rd No.24";
                hotelLabel.setText(currentHotel);
                hotelLocation.setText(currentAddr);
            }
        });
        h9t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHotel = "Focus Hotel";
                currentAddr = "Charlie St No.1";
                hotelLabel.setText(currentHotel);
                hotelLocation.setText(currentAddr);
            }
        });
        h10t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHotel = "Last Hotel";
                currentAddr = "First Rd No.212";
                hotelLabel.setText(currentHotel);
                hotelLocation.setText(currentAddr);
            }
        });
    }
    public void reset(){
        hotelLabel.setText("");
        hotelLocation.setText("");
        firstNametext.setText("");
        lastnametext.setText("");
        phonetext.setText("");
        personNumber.setValue(0);
        orderPreviewer.setText("");
        room1.setValue(0);
        room2.setValue(0);
        room3.setValue(0);
        room4.setValue(0);
    }
    public void resetDate(){
        checkInDate.setText("");
        checkOutDate.setText("");
    }
    public void inputChecker(){
        loadData();
        try {
            if (currentHotel==null){
                JOptionPane.showMessageDialog(null,"Please select a hotel");
                return;
            }
            if (checkin.compareTo(checkout)>0){
                JOptionPane.showMessageDialog(null,"Check-in date should before check-out date");
                return;
            }

        }catch (Exception e){

        }

        if (phone==null||firstName==null||lastName==null||pNum<=0){
            JOptionPane.showMessageDialog(null,"Invalid Input!");
            return;
        }
        if (phone.length()!=8&&phone.length()!=11){
            JOptionPane.showMessageDialog(null,"phone number in valid");
            return;
        }
    }


    public void loadData(){
        try {
            phone =phonetext.getText();
            firstName = firstNametext.getText();
            lastName = lastnametext.getText();
            pNum = (int)personNumber.getValue();
            DateFormat format = new SimpleDateFormat("yyyy-MM-d", Locale.ENGLISH);
            checkin = format.parse(checkInDate.getText());
            checkout = format.parse(checkOutDate.getText());
            room1Num = (int)room1.getValue();
            room2Num = (int)room2.getValue();
            room3Num = (int)room3.getValue();
            room4Num = (int)room4.getValue();

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
        long from1 = checkout.getTime();
        long to1 = checkin.getTime();
        int days = (int) ((from1-to1) / (1000 * 60 * 60 * 24));
        String msg =
                "Order Preview"+newline
                        +"Hotel: "+ currentHotel+newline
                        +"Address: "+ currentAddr+newline
                +"Full Name: "+firstName+" "+lastName+newline
                +"Phone: "+phone+newline
                +"Customer Number: "+ pNum+newline
                +"total day:"+days+newline
                +"Check-in Date"+checkInDate.getText()+newline
                +"Check-out Date"+checkOutDate.getText()+newline;
        orderPreviewer.append(msg);
        if (room1Num>0){
            orderPreviewer.append("Single One Bed Room: "+ room1Num+newline);
        }
        if (room2Num>0){
            orderPreviewer.append("Double One Bed Room: "+ room1Num+newline);
        }
        if (room3Num>0){
            orderPreviewer.append("Double Two Bed Room: "+ room1Num+newline);
        }
        if (room4Num>0){
            orderPreviewer.append("Family Four Bed Room: "+ room1Num+newline);
        }
        int totalPrice = room1Num*31+room2Num*39+room3Num*50+room4Num*75;
        orderPreviewer.append("Total price: "+totalPrice+newline);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
