import javax.swing.*;
import java.awt.*;

public class ref extends JFrame{
    private JPanel BookingPanel;
    private JPanel map;
    private JPanel infoPanel;
    private JLabel selectHotelName;
    private JLabel hotelLabel;
    private JScrollPane reservation;
    private JLabel mapLabel;
    private JPanel titlePanel;
    private JPanel row1;
    private JPanel row2;
    private JPanel row3;
    private JPanel row4;
    private JPanel row5;
    private JLabel selectTitle;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox peopleBox1;
    private JButton button1;
    private JLabel img1;
    private JTextArea textArea1;
    private JButton confirmButton;
    private JButton resetButton;
    private JPanel test;
    private JTextField checkInDate;
    private JTextField checkOutDate;
    private JPanel checkInPanel;
    private JPanel checkOutPanel;

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
//        textArea2.append("testtest"+newline+"dsfavvvdsafasfd;slajfsdjaf;lkjs;lfjl;asjffasfaf");
//        changeText();
        setimage();
        setmap();
        setPeopleBox1();

        setDataChooser(checkInDate, checkInPanel);
        setDataChooser(checkOutDate, checkOutPanel);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1300,1000);
//        this.pack();
    }



    public void setPeopleBox1(){
        for (int i = 1; i < 10; i++) {
            peopleBox1.addItem(i);
        }

    }

    public void setmap(){
        ImageIcon locationMap=new ImageIcon("src/map.png");
        locationMap.setImage(locationMap.getImage().getScaledInstance(500, 900, Image.SCALE_DEFAULT));
        mapLabel.setIcon(locationMap);
    }

    public void setimage(){
        ImageIcon locationMap=new ImageIcon("src/hotelImage/img1.png");
        locationMap.setImage(locationMap.getImage().getScaledInstance(150, 100, Image.SCALE_DEFAULT));
        img1.setIcon(locationMap);
    }
    public void setDataChooser(JTextField textField1, JPanel panel){
        DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
        dateChooser1.register(textField1);
        textField1.setText("Click to select date");
        textField1.setSize(new Dimension(200,10));
        panel.add(dateChooser1);

    }

    public void changeText(){
        //room type title
        JLabel roomType=new JLabel("Room Type");
        reservation.add(roomType);

        //single rooms
        JLabel singleRooms=new JLabel("Single room");
        reservation.add(singleRooms);

        //double room one double bed
        JLabel doubleRooms1=new JLabel("Double room");
        reservation.add(doubleRooms1);

        //single room two single beds
        JLabel doubleRooms2=new JLabel("Double room");
        doubleRooms2.setBounds(5, 50, 100, 100);
        reservation.add(doubleRooms2);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
