package Q_2;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClockDemo extends JFrame implements Runnable {
    private JLabel timeLabel;
    private JLabel messageLabel;
    private String userMessage;

    public DigitalClockDemo(String message) {
        this.userMessage = message;
        setTitle("Digital Clock");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        messageLabel = new JLabel(userMessage, SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        add(timeLabel, BorderLayout.CENTER);
        add(messageLabel, BorderLayout.SOUTH);
        setVisible(true);
    }

    @Override
    public void run() {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");
        while (true) {
            String currentTime = formatter.format(new Date());
            timeLabel.setText(currentTime);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String message = JOptionPane.showInputDialog("Enter a custom message for your clock:");
            DigitalClockDemo clock = new DigitalClockDemo(message);
            Thread clockThread = new Thread(clock);
            clockThread.start();
        });
    }
}
