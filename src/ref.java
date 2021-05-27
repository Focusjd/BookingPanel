import javax.swing.*;

public class ref extends JFrame{
    private JPanel BookingPanel;
    private JPanel map;
    private JPanel infoPanel;
    private JLabel selectHotelName;
    private JLabel hotelLabel;
    private JScrollPane reservation;
    private JTextArea textArea2;
    private JScrollPane customerChecker;
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
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JScrollPane Hotels;
    private JPanel HotelList;
    private JButton button1;
    private JTextField textField4;

    private final static String newline = "\n";


    public ref(String title){
        super(title);

        JPanel mainPanel = BookingPanel;
        this.setContentPane(mainPanel);
        textArea2.append("testtest"+newline+"dsfavvvdsafasfd;slajfsdjaf;lkjs;lfjl;asjffasfaf");
//        changeText();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1300,1000);
//        this.pack();
    }

    public static void main(String[] args) {
        JFrame f = new ref("Focus Hotel Booking");
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

}
