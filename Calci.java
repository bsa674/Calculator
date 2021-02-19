import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 

public class Calci  {

    private JFrame frame;
    private JTextField textField;
    double var_1;
    double var_2;
    double answer;
    String result;
    String operator;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        Calci window = new Calci();
                        window.frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
    }

    /**
     * Create the application.
     */
    public Calci() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 364, 478);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(10,20, 330, 71);
        frame.getContentPane().add(textField);
        textField.setColumns(20);
        textField.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        JButton btnDel = new JButton("Del");
        btnDel.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    String del=null;
                    if(textField.getText().length()>0)
                    {
                        StringBuilder str=new StringBuilder(textField.getText());
                        str.deleteCharAt(textField.getText().length()-1);              
                        del=str.toString();
                        textField.setText(del);
                    }              
                }
            });
        btnDel.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
        btnDel.setBounds(10, 110, 59, 52);
        frame.getContentPane().add(btnDel);

        JButton btnAdd = new JButton("+");
        btnAdd.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    var_1=Double.parseDouble(textField.getText());
                    textField.setText(null);
                    operator="+";
                }
            });
        btnAdd.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnAdd.setBounds(10, 172, 59, 52);
        frame.getContentPane().add(btnAdd);

        JButton btnSubtract = new JButton("-");
        btnSubtract.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    var_1=Double.parseDouble(textField.getText());
                    textField.setText(null);
                    operator="-";
                }
            });
        btnSubtract.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnSubtract.setBounds(10, 234, 59, 52);
        frame.getContentPane().add(btnSubtract);

        JButton btnMultiply = new JButton("*");
        btnMultiply.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    var_1=Double.parseDouble(textField.getText());
                    textField.setText(null);
                    operator="*";
                }
            });
        btnMultiply.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnMultiply.setBounds(10, 298, 59, 52);
        frame.getContentPane().add(btnMultiply);

        JButton btnDivide = new JButton("/");
        btnDivide.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    var_1=Double.parseDouble(textField.getText());
                    textField.setText(null);
                    operator="/";
                }
            });
        btnDivide.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnDivide.setBounds(10, 358, 59, 52);
        frame.getContentPane().add(btnDivide);

        
        JButton btnOne = new JButton("1");
        btnOne.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    String number=textField.getText()+btnOne.getText();
                    textField.setText(number);
                }
            });
        btnOne.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnOne.setBounds(98, 172, 59, 52);
        frame.getContentPane().add(btnOne);

        JButton btnFour = new JButton("4");
        btnFour.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    String number=textField.getText()+btnFour.getText();
                    textField.setText(number);
                }
            });
        btnFour.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnFour.setBounds(98, 234, 59, 52);
        frame.getContentPane().add(btnFour);

        JButton btnSeven = new JButton("7");
        btnSeven.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    String number=textField.getText()+btnSeven.getText();
                    textField.setText(number);
                }
            });
        btnSeven.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnSeven.setBounds(98, 298, 59, 52);
        frame.getContentPane().add(btnSeven);

        JButton btnDot = new JButton(".");
        btnDot.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    String number=textField.getText()+btnDot.getText();
                    textField.setText(number);
                }
            });
        btnDot.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnDot.setBounds(98, 358, 59, 52);
        frame.getContentPane().add(btnDot);

        
        JButton btnTwo = new JButton("2");
        btnTwo.addActionListener(new ActionListener()
            {
                
                public void actionPerformed(ActionEvent arg0)
                {
                    String number=textField.getText()+btnTwo.getText();
                    textField.setText(number);
                }
            });
        btnTwo.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnTwo.setBounds(182, 172, 59, 52);
        frame.getContentPane().add(btnTwo);

        JButton btnFive = new JButton("5");
        btnFive.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    String number=textField.getText()+btnFive.getText();
                    textField.setText(number);
                }
            });
        btnFive.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnFive.setBounds(182, 234, 59, 52);
        frame.getContentPane().add(btnFive);

        JButton btnEight = new JButton("8");
        btnEight.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    String number=textField.getText()+btnEight.getText();
                    textField.setText(number);
                }
            });
        btnEight.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnEight.setBounds(182, 298, 59, 52);
        frame.getContentPane().add(btnEight);

        JButton btnZero = new JButton("0");
        btnZero.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    String number=textField.getText()+btnZero.getText();
                    textField.setText(number);
                }
            });
        btnZero.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnZero.setBounds(182, 358, 59, 52);
        frame.getContentPane().add(btnZero);

        JButton btnClr = new JButton("Clr");
        btnClr.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    if(textField.getText().length()>0)
                    {
                        textField.setText("");
                    }              
                }
            });

        btnClr .setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
        btnClr.setBounds(268, 110, 59, 52);
        frame.getContentPane().add(btnClr );

        JButton btnThree = new JButton("3");
        btnThree.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    String number=textField.getText()+btnThree.getText();
                    textField.setText(number);
                }
            });
        btnThree.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnThree.setBounds(268, 172, 59, 52);
        frame.getContentPane().add(btnThree);

        JButton btnSix = new JButton("6");
        btnSix.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    String number=textField.getText()+btnSix.getText();
                    textField.setText(number);
                }
            });
        btnSix.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnSix.setBounds(268, 234, 59, 52);
        frame.getContentPane().add(btnSix);

        JButton btnNine = new JButton("9");
        btnNine.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    String number=textField.getText()+btnNine.getText();
                    textField.setText(number);
                }
            });
        btnNine.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnNine.setBounds(268, 298, 59, 52);
        frame.getContentPane().add(btnNine);

        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    var_2=Double.parseDouble(textField.getText());
                    textField.setText(null);
                    if(operator=="+")
                    {
                        answer=var_1+var_2;
                        result=Double.toString(answer);
                        textField.setText(result);
                    }
                    else if(operator=="-")
                    {
                        answer=var_1-var_2;
                        result=Double.toString(answer);
                        textField.setText(result);
                    }
                    else if(operator=="*")
                    {
                        answer=var_1*var_2;
                        result=Double.toString(answer);
                        textField.setText(result);
                    }
                    else if(operator=="/")
                    {
                        answer=var_1/var_2;
                        result=Double.toString(answer);
                        textField.setText(result);
                    }            
                }});
        btnEqual.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        btnEqual.setBounds(268, 358, 59, 52);
        frame.getContentPane().add(btnEqual);
    }
}
