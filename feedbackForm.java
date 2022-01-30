package jdbctryfirst;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

class feedbackForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("User Feedback Form");
        f.setContentPane(new JLabel(new ImageIcon("F:/java files/jdbctryfirst/forma-ugly-fon.jpg")));

        Color color2 = new Color(224, 231, 34);
        Color color1 = new Color(57, 255, 20);
        JLabel header = new JLabel("<html><b>USER FEEDBACK FORM<b><></html>");
        header.setBounds(175, 3, 450, 30);
        header.setForeground(color1);
        header.setFont(new Font("Bebas Neue", Font.BOLD, 22));

        JLabel l = new JLabel("Name :");
        l.setBounds(40, 40, 100, 30);
        l.setFont(new Font("Calibri", Font.BOLD, 18));
        l.setForeground(color1);
        l.setHorizontalAlignment(SwingConstants.RIGHT);
        l.setVerticalAlignment(SwingConstants.CENTER);
        JTextField tf = new JTextField();
        tf.setBounds(160, 40, 250, 25);
        tf.setFont(new Font("Calibri", Font.ITALIC, 17));
        tf.setForeground(color2);
        tf.setOpaque(false);
        JLabel label = new JLabel(new ImageIcon("F:/java files/jdbctryfirst/bg3.png"));
        label.setLayout(new BorderLayout());
        label.add(tf);
        label.setBounds(160, 40, 250, 25);
        tf.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        tf.setCaretColor(color2);

        JLabel l2 = new JLabel("Age :");
        l2.setBounds(40, 80, 100, 30);
        l2.setFont(new Font("Calibri", Font.BOLD, 18));
        l2.setForeground(color1);
        l2.setHorizontalAlignment(SwingConstants.RIGHT);
        l2.setVerticalAlignment(SwingConstants.CENTER);
        JTextField tf2 = new JTextField();
        tf2.setBounds(160, 80, 250, 25);
        tf2.setFont(new Font("Calibri", Font.ITALIC, 17));
        tf2.setForeground(color2);
        tf2.setOpaque(false);
        JLabel label3 = new JLabel(new ImageIcon("F:/java files/jdbctryfirst/bg3.png"));
        label3.setLayout(new BorderLayout());
        label3.add(tf2);
        label3.setBounds(160, 80, 250, 25);
        tf2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        tf2.setCaretColor(color2);

        JLabel l3 = new JLabel("Ph No :");
        l3.setBounds(40, 120, 100, 30);
        l3.setFont(new Font("Calibri", Font.BOLD, 18));
        l3.setForeground(color1);
        l3.setHorizontalAlignment(SwingConstants.RIGHT);
        l3.setVerticalAlignment(SwingConstants.CENTER);
        JTextField tf3 = new JTextField();
        tf3.setBounds(160, 120, 250, 25);
        tf3.setFont(new Font("Calibri", Font.ITALIC, 17));
        tf3.setForeground(color2);
        tf3.setOpaque(false);
        JLabel label4 = new JLabel(new ImageIcon("F:/java files/jdbctryfirst/bg3.png"));
        label4.setLayout(new BorderLayout());
        label4.add(tf3);
        label4.setBounds(160, 120, 250, 25);
        tf3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        tf3.setCaretColor(color2);

        JPanel p = new JPanel();
        p.setBounds(160, 155, 450, 35);
        p.setOpaque(false);
        JLabel label5 = new JLabel(new ImageIcon("F:/java files/jdbctryfirst/bg3.png"));
        label5.setLayout(new BorderLayout());
        label5.add(p);
        label5.setBounds(160, 155, 450, 35);
        p.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        JLabel l4 = new JLabel("Occupation :");
        l4.setBounds(40, 160, 100, 30);
        l4.setFont(new Font("Calibri", Font.BOLD, 18));
        l4.setForeground(color1);
        l4.setHorizontalAlignment(SwingConstants.RIGHT);
        l4.setVerticalAlignment(SwingConstants.CENTER);
        JRadioButton rad = new JRadioButton("Student");
        JRadioButton rad2 = new JRadioButton("Employed");
        JRadioButton rad3 = new JRadioButton("Business");
        JRadioButton rad4 = new JRadioButton("Retired");
        rad.setBounds(170, 160, 90, 25);
        rad2.setBounds(270, 160, 100, 25);
        rad3.setBounds(380, 160, 100, 25);
        rad4.setBounds(490, 160, 100, 25);
        rad.setForeground(color2);
        rad2.setForeground(color2);
        rad3.setForeground(color2);
        rad4.setForeground(color2);
        rad.setOpaque(false);
        rad.setOpaque(false);
        rad2.setOpaque(false);
        rad3.setOpaque(false);
        rad4.setOpaque(false);
        rad.setBackground(Color.BLACK);
        rad2.setBackground(Color.BLACK);
        rad3.setBackground(Color.BLACK);
        rad4.setBackground(Color.BLACK);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rad);
        bg.add(rad2);
        bg.add(rad3);
        bg.add(rad4);

        JLabel l5 = new JLabel("Email ID :");
        l5.setBounds(40, 200, 100, 30);
        l5.setFont(new Font("Calibri", Font.BOLD, 18));
        l5.setForeground(color1);
        l5.setHorizontalAlignment(SwingConstants.RIGHT);
        l5.setVerticalAlignment(SwingConstants.CENTER);
        JTextField tf5 = new JTextField(" @gmail.com");
        tf5.setBounds(160, 200, 250, 25);
        tf5.setFont(new Font("Calibri", Font.ITALIC, 17));
        tf5.setForeground(color2);
        tf5.setOpaque(false);
        JLabel label6 = new JLabel(new ImageIcon("F:/java files/jdbctryfirst/bg3.png"));
        label6.setLayout(new BorderLayout());
        label6.add(tf5);
        label6.setBounds(160, 200, 250, 25);
        tf5.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        tf5.setCaretColor(color2);

        JLabel l6 = new JLabel("Gender :");
        l6.setBounds(40, 240, 100, 30);
        l6.setFont(new Font("Calibri", Font.BOLD, 18));
        l6.setForeground(color1);
        l6.setHorizontalAlignment(SwingConstants.RIGHT);
        l6.setVerticalAlignment(SwingConstants.CENTER);
        JPanel p2 = new JPanel();
        p2.setBounds(160, 235, 450, 35);
        p2.setOpaque(false);
        JLabel label7 = new JLabel(new ImageIcon("F:/java files/jdbctryfirst/bg3.png"));
        label7.setLayout(new BorderLayout());
        label7.add(p2);
        label7.setBounds(160, 235, 450, 35);
        p2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton others = new JRadioButton("Others");
        male.setBounds(170, 240, 90, 25);
        female.setBounds(270, 240, 100, 25);
        others.setBounds(380, 240, 100, 25);
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(male);
        bg2.add(female);
        bg2.add(others);
        male.setForeground(color2);
        female.setForeground(color2);
        others.setForeground(color2);
        male.setOpaque(false);
        female.setOpaque(false);
        others.setOpaque(false);
        male.setBackground(Color.BLACK);
        female.setBackground(Color.BLACK);
        others.setBackground(Color.BLACK);

        JLabel l7 = new JLabel("Feedback :");
        l7.setBounds(40, 280, 100, 30);
        l7.setFont(new Font("Calibri", Font.BOLD, 18));
        l7.setForeground(color1);
        l7.setHorizontalAlignment(SwingConstants.RIGHT);
        l7.setVerticalAlignment(SwingConstants.CENTER);
        JTextArea ta = new JTextArea();
        ta.setBounds(160, 280, 450, 200);
        ta.setFont(new Font("Calibri", Font.ITALIC, 17));
        ta.setForeground(color2);
        ta.setOpaque(false);
        JLabel label2 = new JLabel(new ImageIcon("F:/java files/jdbctryfirst/bg3.png"));
        label2.setLayout(new BorderLayout());
        label2.add(ta);
        label2.setBounds(160, 280, 450, 200);
        ta.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        ta.setCaretColor(color2);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);

        JButton button = new JButton("SUBMIT");
        button.setBackground(color1);
        button.setFont(new Font("Bebas Neue", Font.BOLD, 15));
        button.setBounds(250, 520, 100, 30);
        button.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

        f.add(l);
        f.add(tf);
        f.add(l2);
        f.add(tf2);
        f.add(l3);
        f.add(tf3);
        f.add(l4);
        f.add(rad);
        f.add(rad2);
        f.add(rad3);
        f.add(rad4);
        f.add(p);
        f.add(l5);
        f.add(tf5);
        f.add(l6);
        f.add(male);
        f.add(female);
        f.add(others);
        f.add(p2);
        f.add(l7);
        f.add(ta);
        f.add(header);
        f.add(button);
        f.add(label);
        f.add(label2);
        f.add(label3);
        f.add(label4);
        f.add(label5);
        f.add(label6);
        f.add(label7);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent m) {
                button.setBackground(Color.RED);
                button.setForeground(color2);
                button.setBorder(BorderFactory.createLineBorder(color2, 2));
            }

            @Override
            public void mouseExited(MouseEvent mexit) {
                button.setBackground(color1);
                button.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                button.setForeground(Color.BLACK);
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tf.getText();
                int age = Integer.parseInt(tf2.getText());
                String phno = tf3.getText();
                String occupation = "";
                if (rad.isSelected())
                    occupation += "Student";
                else if (rad2.isSelected())
                    occupation += "Employed";
                else if (rad3.isSelected())
                    occupation += "Business";
                else if (rad4.isSelected())
                    occupation += "Retired";
                String emailID = tf5.getText();
                String gender = "";
                if (male.isSelected())
                    gender += "Male";
                else if (female.isSelected())
                    gender += "Female";
                else if (others.isSelected())
                    gender += "Others";
                String feedback = ta.getText();
                if (phno.length() < 10) {
                    tf3.setBackground(Color.RED);
                    JOptionPane.showMessageDialog(tf3, "Invalid Mobile Number");
                    return;
                }
                Emailvalidator emailValidator = new Emailvalidator();
                if (!emailValidator.validate(emailID.trim())) {
                    tf5.setBackground(Color.RED);
                    JOptionPane.showMessageDialog(tf5, "Invalid Email Address");
                    return;
                }
                if (name.length() <= 0) {
                    tf.setBackground(Color.RED);
                    JOptionPane.showMessageDialog(tf, "Name Field Cannot be Vacant");
                    return;
                }
                if (occupation.length() <= 0) {
                    JOptionPane.showMessageDialog(l4, "Occupation Must be Specified");
                    return;
                }
                if (gender.length() <= 0) {
                    JOptionPane.showMessageDialog(l6, "Gender Must be Mentioned");
                    return;
                }
                if (feedback.length() <= 0) {
                    ta.setBackground(Color.RED);
                    JOptionPane.showMessageDialog(ta, "Feedback Field Cannot be Vacant");
                    return;
                }
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/firstsql", "root",
                            "spandandb94");
                    Statement statement = connection.createStatement();
                    String qr = "INSERT INTO feedback_db VALUES('" + emailID + "','" + name + "','" + age + "','" + phno
                            + "','" + occupation + "','" + gender + "','" + feedback + "')";
                    int success_flag = statement.executeUpdate(qr);
                    if (success_flag > 0) {
                        JOptionPane.showMessageDialog(button, "Feedback Successfully Registered");
                    }
                    connection.close();
                } catch (SQLException e1) {
                    // JOptionPane.showMessageDialog(button, e1.getMessage());
                    JOptionPane.showMessageDialog(button, "Duplicate Entry is Not Accepted \nThis already exits ");
                }

            }
        });

        ImageIcon img = new ImageIcon("F:/java files/jdbctryfirst/logo.jpg");
        f.setIconImage(img.getImage());
        f.setLayout(null);
        f.setResizable(false);
        f.setSize(650, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}