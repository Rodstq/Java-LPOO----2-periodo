import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
       JFrame f = new JFrame();

      JLabel l1;
      l1=new JLabel("Mostrar IP.");
      l1.setBounds(100,180, 100,30);

      f.add(l1); // adding label1 to JFrame

     final JTextField tf=new JTextField();
        String host=tf.getText();
        String ip=java.net.InetAddress.getByName(host).getHostAddress();

        tf.setBounds(100,210, 200,40); // creating TextField

        JButton b=new JButton("Iniciar");//creating instance of JButton INICIAR
        b.setBounds(220,410,120, 40);// x-axis, y-axis, width, height
        b.addActionListener(e -> tf.setText(" Ip do Host é :  " + ip));

        f.add(b);//adding button in JFrame
        f.add(tf); // adding TextField in JFrame

        JButton b2 = new JButton("Pausar");
        b2.setBounds(40, 410, 120,40); //x-axis, y-axis, width, height

        f.add(b2); // adding button in JFrame


        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}
