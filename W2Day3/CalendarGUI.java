package W2Day3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("unused")
public class CalendarGUI extends JFrame {
    private JLabel monthYearLabel;
    private JPanel calendarPanel;
    private JComboBox<String> monthComboBox;
    private JSpinner yearSpinner;

    private int currentMonth;
    private int currentYear;

    private String[] monthNames = { "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December" };
    private int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private String[] dayNames = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    public CalendarGUI() {
        // Initialize with current date
        java.util.Calendar cal = java.util.Calendar.getInstance();
        currentMonth = cal.get(java.util.Calendar.MONTH) + 1; // Calendar months are 0-based
        currentYear = cal.get(java.util.Calendar.YEAR);

        setTitle("Calendar");
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(0, 0));
        getContentPane().setBackground(new Color(240, 248, 255));

        // Create top panel with header
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BorderLayout());
        headerPanel.setBackground(new Color(66, 139, 202));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Month and Year display label
        monthYearLabel = new JLabel();
        monthYearLabel.setFont(new Font("Arial", Font.BOLD, 28));
        monthYearLabel.setHorizontalAlignment(SwingConstants.LEFT);
        monthYearLabel.setForeground(Color.WHITE);

        // Control panel with month/year selectors
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
        controlPanel.setBackground(new Color(66, 139, 202));

        // Month combo box
        monthComboBox = new JComboBox<>(monthNames);
        monthComboBox.setSelectedIndex(currentMonth - 1);
        monthComboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        monthComboBox.setPreferredSize(new Dimension(120, 30));
        monthComboBox.addActionListener(e -> {
            currentMonth = monthComboBox.getSelectedIndex() + 1;
            updateCalendar();
        });

        // Year spinner
        SpinnerModel yearModel = new SpinnerNumberModel(currentYear, Integer.MIN_VALUE, Integer.MAX_VALUE, 1);
        yearSpinner = new JSpinner(yearModel);
        yearSpinner.setFont(new Font("Arial", Font.PLAIN, 14));
        yearSpinner.setPreferredSize(new Dimension(80, 30));
        ((JSpinner.DefaultEditor) yearSpinner.getEditor()).getTextField().setColumns(5);
        yearSpinner.addChangeListener(e -> {
            currentYear = (Integer) yearSpinner.getValue();
            updateCalendar();
        });

        controlPanel.add(monthComboBox);
        controlPanel.add(yearSpinner);

        headerPanel.add(monthYearLabel, BorderLayout.NORTH);
        headerPanel.add(controlPanel, BorderLayout.SOUTH);

        // Calendar panel
        calendarPanel = new JPanel();
        calendarPanel.setLayout(new GridLayout(0, 7, 8, 8));
        calendarPanel.setBackground(new Color(240, 248, 255));
        calendarPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        add(headerPanel, BorderLayout.NORTH);
        add(calendarPanel, BorderLayout.CENTER);

        updateCalendar();
    }

    private void updateCalendar() {
        monthYearLabel.setText(monthNames[currentMonth - 1] + " " + currentYear);
        calendarPanel.removeAll();

        // Add day headers
        for (String day : dayNames) {
            JLabel label = new JLabel(day, SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 16));
            label.setForeground(Color.WHITE);
            label.setOpaque(true);
            label.setBackground(new Color(92, 159, 214));
            label.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
            calendarPanel.add(label);
        }

        // Calculate first day of month
        int startDay = dayOfWeek(1, currentMonth, currentYear);

        // Check for leap year
        int daysThisMonth = daysInMonth[currentMonth];
        if (currentMonth == 2 && isLeapYear(currentYear)) {
            daysThisMonth = 29;
        }

        // Add empty cells for days before month starts
        for (int i = 0; i < startDay; i++) {
            JPanel emptyPanel = new JPanel();
            emptyPanel.setOpaque(true);
            emptyPanel.setBackground(new Color(240, 248, 255));
            calendarPanel.add(emptyPanel);
        }

        // Add day buttons
        java.util.Calendar today = java.util.Calendar.getInstance();
        int todayDay = today.get(java.util.Calendar.DAY_OF_MONTH);
        int todayMonth = today.get(java.util.Calendar.MONTH) + 1;
        int todayYear = today.get(java.util.Calendar.YEAR);

        for (int day = 1; day <= daysThisMonth; day++) {
            JButton dayButton = new JButton(String.valueOf(day));
            dayButton.setFont(new Font("Arial", Font.BOLD, 18));
            dayButton.setFocusPainted(false);
            dayButton.setBorderPainted(false);
            dayButton.setPreferredSize(new Dimension(80, 60));

            // Check if it's a Sunday (for orange highlighting in the image)
            int dayOfWeek = (startDay + day - 1) % 7;

            // Highlight today's date or Sundays
            if (day == todayDay && currentMonth == todayMonth && currentYear == todayYear) {
                dayButton.setBackground(new Color(255, 127, 80)); // Coral/Orange for today
                dayButton.setForeground(Color.WHITE);
            } else if (dayOfWeek == 0) { // Sunday
                dayButton.setBackground(new Color(255, 127, 80)); // Orange for Sundays
                dayButton.setForeground(Color.WHITE);
            } else {
                dayButton.setBackground(new Color(92, 159, 214)); // Light blue
                dayButton.setForeground(Color.WHITE);
            }

            // Hover effect
            dayButton.addMouseListener(new java.awt.event.MouseAdapter() {
                Color originalColor = dayButton.getBackground();

                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    dayButton.setBackground(originalColor.brighter());
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    dayButton.setBackground(originalColor);
                }
            });

            final int selectedDay = day;
            dayButton.addActionListener(e -> {
                JOptionPane.showMessageDialog(this,
                        "Selected: " + monthNames[currentMonth - 1] + " " + selectedDay + ", " + currentYear,
                        "Date Selected",
                        JOptionPane.INFORMATION_MESSAGE);
            });

            calendarPanel.add(dayButton);
        }

        calendarPanel.revalidate();
        calendarPanel.repaint();
    }

    private int dayOfWeek(int d, int m, int y) {
        int[] t = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        if (m < 3)
            y--;
        return (y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalendarGUI calendar = new CalendarGUI();
            calendar.setVisible(true);
        });
    }
}
