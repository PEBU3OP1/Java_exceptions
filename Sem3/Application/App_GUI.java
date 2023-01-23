package Application;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class App_GUI {
    private JTextField enterHereYourInfoTextField;
    private JButton PARSEButton;
    private JPanel MainPanel;
    private JLabel Name;
    private JLabel Phone;
    private JLabel Bday;
    private JLabel Gender;


    public static void main(String[] args) {
        JFrame frame = new JFrame("HW3 App");
        frame.setContentPane(new App_GUI().MainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public App_GUI() {
        PARSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = enterHereYourInfoTextField.getText();

                try {
                    String[] checked_array = input_and_checking(input);
                    ArrayList<String> finalarraylist = bday(checked_array);
                    finalarraylist = phonenumber(finalarraylist);
                    finalarraylist = gender(finalarraylist);
                    name(finalarraylist);

                } catch (Array_Size_Error size_er) {
                    JOptionPane.showMessageDialog(null, "Wrong info length!");
                } catch (Birthday_Exception bday_er) {
                    JOptionPane.showMessageDialog(null, "Wrong Bday Date!");
                } catch (Wrong_phone_error phn_er) {
                    JOptionPane.showMessageDialog(null, "Wrong phone number!");
                } catch (Wrong_Gender_Error gnd_err) {
                    JOptionPane.showMessageDialog(null, "Wrong Gender!");
                } catch (Wrong_name_error nm_err) {
                    JOptionPane.showMessageDialog(null, "Wrong Name!");
                }


            }
        });

    }

    public static String[] input_and_checking(String input) throws Array_Size_Error {
        String[] lst;

        String info = input.replace("  ", " ");
        lst = info.split(" ");


        if (lst.length != 6) {
            throw new Array_Size_Error();
        }
        return lst;
    }






    /*
     * Func bday searching for Date bday_date, else it returns Application.App_GUI.Birthday_Exception mistake
     * */

    public ArrayList<String> bday(String[] lst) throws Birthday_Exception {
        ArrayList<String> new_lst = new ArrayList<>();
        Date bday_date = null;

        for (String date : lst) {
            try {
                bday_date = new SimpleDateFormat("dd.MM.yyyy").parse(date);


            } catch (ParseException e) {
                new_lst.add(date);
            }
        }

        if (bday_date == null) {
            throw new Birthday_Exception();
        }

        Bday.setText(bday_date.toString());
        return new_lst;
    }






    /*PHONE
     *  Func phonenumber searching for Long phone number, else it returns Phonenumber mistake
     * */

    public ArrayList<String> phonenumber(ArrayList<String> phone_searching) throws Wrong_phone_error {
        ArrayList<String> new_lst = new ArrayList<>();
        Long phone = null;
        for (String number : phone_searching) {
            try {
                phone = Long.parseLong(number);

            } catch (NumberFormatException e) {
                new_lst.add(number);
            }
        }

        if (phone == null) {
            throw new Wrong_phone_error();
        }
        Phone.setText(phone.toString());
        return new_lst;
    }




    /*Gender:
     *   Func gender searching for String equals f or m, else it returns Gender_mistake
     * */

    public ArrayList<String> gender(ArrayList<String> gender_search) throws Wrong_Gender_Error {
        ArrayList<String> new_lst = new ArrayList<>();
        String final_gender = null;
        for (String gender : gender_search) {
            if (gender.equals("f")) {
                final_gender = "Female";
                Gender.setText(final_gender);
            } else if (gender.equals("m")) {
                final_gender = "Male";
                Gender.setText(final_gender);
            } else {
                new_lst.add(gender);
            }
        }

        if (final_gender == null) {
            throw new Wrong_Gender_Error();
        }
        return new_lst;
    }


    /*Name searching:
      1) Func name_checking check does word contain anything, except letters
  */
    public static boolean name_checking(String word) {
        char[] wordchar = word.toCharArray();
        for (char c : wordchar) {
            if (!Character.isAlphabetic(c)) {
                return false;
            }
        }
        return true;

    }

    /*2) Func name collecting name of client, if name length less than 3, it returns Wrong_name_Error */
    public void name(ArrayList<String> name_searching) throws Wrong_name_error {
        String name = "";
        int counter = 0;

        for (String word : name_searching) {

            if (name_checking(word)) {
                if (counter == 0) {
                    name = word;
                    counter++;
                } else {
                    name = name + " " + word;
                    counter++;
                }
            }
        }

        if (counter < 3) {
            throw new Wrong_name_error();
        }

        Name.setText(name);
    }


}
