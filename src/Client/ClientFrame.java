package Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ClientFrame extends JFrame {
    boolean canSeeScore = false;
    ClientFrame() {
        super( "Ankietyzacja" );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLocation(50,50);

        int num = getNumberOfPort();
        if(connect(num)) {
            createStartFrame();
        }
        else
            System.out.println("Blad polaczenia");
    }

    private int getNumberOfPort(){
        return 0;
    }

    private boolean connect(int numOfPort){
        /*int port = 0;
        try {
            port = numOfPort;
        } catch (NumberFormatException e) {
            System.err.println("Niepoprawny numer portu: " + e);
            return false;
        }
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(),port);
            int in;
            while ((in = System.in.read()) >= 0)
                socket.getOutputStream().write((char) in);
            socket.close();
        } catch (Exception e) {
            System.err.println("Inny blad: " + e);
            return false;
        }*/
        return true;
    }
    private void createStartFrame(){

        this.add(new JLabel("Wybierz AnkietÄ™ z listy"), BorderLayout.NORTH);

        JList formList = new JList<>(getFormNames());
        formList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        formList.setLayoutOrientation(JList.VERTICAL);
        formList.setVisibleRowCount(5);
        JScrollPane listScroller = new JScrollPane(formList);
        this.add(listScroller, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(1,3,5,5));
        JButton startFormButton = new JButton("Uzupenij ankiete");
        startFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startForm(1);
            }
        });
        buttonPanel.add(startFormButton);

        JButton showAnswersButton = new JButton("Pokaz swoje odpowiedzi");
        showAnswersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAnswers(1);
            }
        });
        buttonPanel.add(showAnswersButton);

        JButton showScoreButton = new JButton("Pokaz wyniki");
        showScoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showScore(1);
            }
        });
        buttonPanel.add(showScoreButton);

        this.add(buttonPanel,BorderLayout.SOUTH);
        setVisible(true);
    }
    private void startForm(int formNumber){

    }
    private void showAnswers(int formNumber){

    }
    private void showScore(int formNumber){

    }
    private String[] getFormNames(){
        return new String[]{"1","2"};
    }
}