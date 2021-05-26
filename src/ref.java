import javax.swing.*;

public class ref extends JFrame{
    private JPanel BookingPanel;
    private JPanel map;
    private JPanel HotelList;
    private JPanel infoPanel;
    private JScrollPane Hotels;
    private JLabel selectHotelName;
    private JLabel hotelLabel;
    private JTextArea aaaaaaaaaTextArea;
    private JScrollPane reservation;
    private JTextArea textArea2;
    private JScrollPane customerChecker;
    private JLabel mapLabel;
    private JButton button1;
    private JTextArea textArea1;

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
