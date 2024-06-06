import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private StringBuilder input;
    private double result;
    private String operator;

    public SimpleCalculator() {
        input = new StringBuilder();
        result = 0;
        operator = "";

        // Frame settings
        setTitle("Simple Calculator");
        setSize(400, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display field
        display = new JTextField();
        display.setBounds(50, 40, 300, 50);
        display.setFont(display.getFont().deriveFont(24f));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        add(display);

        // Buttons
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        int x = 50, y = 120;
        for (int i = 0; i < buttons.length; i++) {
            JButton button = new JButton(buttons[i]);
            button.setBounds(x, y, 60, 60);
            button.setFont(button.getFont().deriveFont(24f));
            button.addActionListener(this);
            add(button);

            x += 70;
            if ((i + 1) % 4 == 0) {
                x = 50;
                y += 70;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            input.append(command);
            display.setText(input.toString());
        } else if (command.equals("C")) {
            input.setLength(0);
            result = 0;
            operator = "";
            display.setText("");
        } else if (command.equals("=")) {
            if (operator.isEmpty() || input.length() == 0) return;

            double current = Double.parseDouble(input.toString());
            switch (operator) {
                case "+":
                    result += current;
                    break;
                case "-":
                    result -= current;
                    break;
                case "*":
                    result *= current;
                    break;
                case "/":
                    result /= current;
                    break;
            }

            display.setText(String.valueOf(result));
            operator = "";
            input.setLength(0);
        } else {
            if (input.length() == 0) return;

            if (!operator.isEmpty()) {
                actionPerformed(new ActionEvent(new JButton("="), ActionEvent.ACTION_PERFORMED, "="));
            } else {
                result = Double.parseDouble(input.toString());
            }

            operator = command;
            input.setLength(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator calc = new SimpleCalculator();
            calc.setVisible(true);
        });
    }
}
