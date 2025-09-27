import java.awt.event.*;
import javax.swing.*;

public class FibonacciEncoderGUI {

    // Fibonacci logic from first program
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Encoding logic from first program
    public static String encodeMessage(String message) {
        StringBuilder encoded = new StringBuilder();
        int fibInput;

        for (int i = 0; i < message.length(); i++) {
            char c = Character.toLowerCase(message.charAt(i)); // lowercase for consistency

            switch (c) {
                case ' ':
                    fibInput = 0;
                    encoded.append(fibonacci(fibInput));
                    break;
                case 'a': fibInput = 1; encoded.append(fibonacci(fibInput)); break;
                case 'b': fibInput = 2; encoded.append(fibonacci(fibInput)); break;
                case 'c': fibInput = 3; encoded.append(fibonacci(fibInput)); break;
                case 'd': fibInput = 4; encoded.append(fibonacci(fibInput)); break;
                case 'e': fibInput = 5; encoded.append(fibonacci(fibInput)); break;
                case 'f': fibInput = 6; encoded.append(fibonacci(fibInput)); break;
                case 'g': fibInput = 7; encoded.append(fibonacci(fibInput)); break;
                case 'h': fibInput = 8; encoded.append(fibonacci(fibInput)); break;
                case 'i': fibInput = 9; encoded.append(fibonacci(fibInput)); break;
                case 'j': fibInput = 10; encoded.append(fibonacci(fibInput)); break;
                case 'k': fibInput = 11; encoded.append(fibonacci(fibInput)); break;
                case 'l': fibInput = 12; encoded.append(fibonacci(fibInput)); break;
                case 'm': fibInput = 13; encoded.append(fibonacci(fibInput)); break;
                case 'n': fibInput = 14; encoded.append(fibonacci(fibInput)); break;
                case 'o': fibInput = 15; encoded.append(fibonacci(fibInput)); break;
                case 'p': fibInput = 16; encoded.append(fibonacci(fibInput)); break;
                case 'q': fibInput = 17; encoded.append(fibonacci(fibInput)); break;
                case 'r': fibInput = 18; encoded.append(fibonacci(fibInput)); break;
                case 's': fibInput = 19; encoded.append(fibonacci(fibInput)); break;
                case 't': fibInput = 20; encoded.append(fibonacci(fibInput)); break;
                case 'u': fibInput = 21; encoded.append(fibonacci(fibInput)); break;
                case 'v': fibInput = 22; encoded.append(fibonacci(fibInput)); break;
                case 'w': fibInput = 23; encoded.append(fibonacci(fibInput)); break;
                case 'x': fibInput = 24; encoded.append(fibonacci(fibInput)); break;
                case 'y': fibInput = 25; encoded.append(fibonacci(fibInput)); break;
                case 'z': fibInput = 26; encoded.append(fibonacci(fibInput)); break;

                // Punctuation: keep as-is
                case '?': case '.': case '!': case '"': case ',':
                case '(': case ')': case '-': case ';': case ':': case '#':
                    encoded.append(c);
                    break;

                default:
                    encoded.append("?");
            }
        }

        return encoded.toString();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fibonacci Encoder");
        frame.setSize(600, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        // Input label
        JLabel userLabel = new JLabel("Please enter a message:");
        userLabel.setBounds(10, 20, 200, 25);
        panel.add(userLabel);

        // Input field
        JTextField userText = new JTextField(20);
        userText.setBounds(220, 20, 300, 25);
        panel.add(userText);

        // Output label
        JLabel newMessage = new JLabel("Encryption: ");
        newMessage.setBounds(10, 100, 500, 25);
        panel.add(newMessage);

        // Button
        JButton encButton = new JButton("Encode");
        encButton.setBounds(10, 60, 100, 25);
        panel.add(encButton);

        // Action: encode message when button is clicked
        encButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = userText.getText();
                String encoded = encodeMessage(input);
                newMessage.setText("Encryption: " + encoded);
            }
        });

        frame.setVisible(true);
    }
}
