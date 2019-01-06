package Server;

import Common.Form;

import javax.swing.*;
import java.util.ArrayList;

public class ServerFrame extends JFrame {
    ArrayList<Form> forms;
    public ServerFrame() {
        super( "Server" );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocation(50,50);
        setVisible(true);
        createConnection(4321);
    }

    private void createConnection(int portNumber){
        /*if (portNumber <=0)
            System.out.println("WprowadĹş numer portu, na ktĂłrym serwer bÄ™dzie oczekiwaĹ‚ na klientĂłw");
        else {
            int port = 0;
            try {
                port = portNumber;
            } catch (NumberFormatException e) {
                System.err.println("WprowadĹş poprawny numer portu: " + e);
                return;
            }
            try {
                // tworzymy socket
                ServerSocket serverSocket = new ServerSocket(port);
                while (true) {
                    // czekamy na zgĹ‚oszenie klienta ...
                    Socket s = serverSocket.accept();
                    InputStream is = s.getInputStream();
                    System.out.println(is.read());
                    is.close();
                    s.close();
                }
                //zamkniÄ™cie strumieni i poĹ‚Ä…czenia
            } catch (Exception e) {
                System.err.println(e);
            }
        }*/
    }
}