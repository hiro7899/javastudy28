package studyjava.basic1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AttendanceCalculatorGUI extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField totalHoursField, totalMinutesField;
    private JTextField missingHoursField, missingMinutesField;
    private JLabel resultLabel;

    public AttendanceCalculatorGUI() {
        setTitle("국취제 출석 퍼센트 계산기");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 5, 5));

        // 전체 시간 입력
        add(new JLabel("전체 시간 (시간):"));
        totalHoursField = new JTextField("0");
        add(totalHoursField);

        add(new JLabel("전체 시간 (분):"));
        totalMinutesField = new JTextField("0");
        add(totalMinutesField);

        // 빠진 시간 입력
        add(new JLabel("빠진 시간 (시간):"));
        missingHoursField = new JTextField("0");
        add(missingHoursField);

        add(new JLabel("빠진 시간 (분):"));
        missingMinutesField = new JTextField("0");
        add(missingMinutesField);

        // 버튼
        JButton calcButton = new JButton("계산하기");
        add(calcButton);

        resultLabel = new JLabel("결과: ");
        add(resultLabel);

        // 버튼 이벤트
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAttendance();
            }
        });

        setVisible(true);
    }

    private void calculateAttendance() {
        try {
            int totalHours = Integer.parseInt(totalHoursField.getText());
            int totalMinutes = Integer.parseInt(totalMinutesField.getText());
            int missingHours = Integer.parseInt(missingHoursField.getText());
            int missingMinutes = Integer.parseInt(missingMinutesField.getText());

            int totalTimeInMinutes = totalHours * 60 + totalMinutes;
            int missingTimeInMinutes = missingHours * 60 + missingMinutes;

            if (totalTimeInMinutes <= 0) {
                resultLabel.setText("전체 시간은 0보다 커야 합니다.");
                return;
            }

            int attendedTime = totalTimeInMinutes - missingTimeInMinutes;
            double percentage = (double) attendedTime / totalTimeInMinutes * 100;

            resultLabel.setText(String.format("출석 시간: %d분, 출석 퍼센트: %.2f%%", attendedTime, percentage));
        } catch (NumberFormatException ex) {
            resultLabel.setText("숫자를 올바르게 입력하세요.");
        }
    }

    public static void main(String[] args) {
        new AttendanceCalculatorGUI();
    }
}