import Application.App_GUI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException
            {
//        try {
//            System.out.println(name(input_and_first_checking()));
//  Anastacia Ivanovna Gerodot f 19.10.1990 89032075592
//        }
//        catch (Application.App_GUI.Array_Size_Error e){
//            System.out.println("Size error");
//        }
//        catch (Wrong_name_error e){
//            System.out.println("wrong name");
//        }
//        ArrayList<String> da = new ArrayList<String>(Arrays.asList("asda", "sasd", "dsads", "fgf", "19.10.1990", "89032075592"));

//        ArrayList<String> test = bday(input_and_checking());
//        test = phonenumber(test);
//        test = gender(test);
//        System.out.println(name(test));

        //System.out.println(name(test));


        App_GUI.main(null);

    }

/*
    public static String[] input_and_checking() throws App_GUI.Array_Size_Error {
        String[] lst;

        System.out.print("ВВедите ФИО Дату рождения телефон пол: ");

        Scanner input_data = new Scanner(System.in);
        String info = input_data.nextLine();

        info = info.replace("  ", " ");
        lst = info.split(" ");


        if (lst.length != 6) {
            throw new App_GUI.Array_Size_Error();
        }
        return lst;
    }


    /*
    * Func bday searching for Date bday_date, else it returns Application.App_GUI.Birthday_Exception mistake
    * */
//    public static ArrayList<String> bday(String[] lst) throws App_GUI.Birthday_Exception {
//        ArrayList<String> new_lst = new ArrayList<>();
//        Date bday_date = null;
//
//        for (String s : lst) {
//            try {
//                bday_date = new SimpleDateFormat("dd.MM.yyyy").parse(s);
//
//
//            } catch (ParseException e) {
//                new_lst.add(s);
//            }
//        }
//
//        if (bday_date == null) {
//            throw new App_GUI.Birthday_Exception();
//        }
//
//        System.out.println(bday_date);
//        return new_lst;
//    }

    /*PHONE
    *  Func phonenumber searching for Long phone number, else it returns Phonenumber mistake
    * */
//    public static ArrayList<String> phonenumber(ArrayList<String> phone_searching) throws Wrong_phone_error {
//        ArrayList<String> new_lst = new ArrayList<>();
//        Long phone = null;
//        for (String number : phone_searching) {
//            try {
//                phone = Long.parseLong(number);
//                System.out.println(phone);
//            } catch (NumberFormatException e) {
//                new_lst.add(number);
//            }
//        }
//
//        if (phone == null) {
//            throw new Wrong_phone_error();
//        }
//        return new_lst;
//    }


    /*Gender:
    *   Func gender searching for String equals f or m, else it returns Gender_mistake
    * */


//    public static ArrayList<String> gender(ArrayList<String> gender_search) throws Wrong_Gender_Error {
//        ArrayList<String> new_lst = new ArrayList<>();
//        String final_gender = null;
//        for (String gender : gender_search) {
//            if (gender.equals("f") || gender.equals("m")) {
//                final_gender = gender;
//                System.out.println(final_gender);
//            } else {
//                new_lst.add(gender);
//            }
//        }
//
//        if (final_gender == null) {
//            throw new Wrong_Gender_Error();
//        }
//        return new_lst;
//    }


    /*Name searching:
       1) Func name_checking check does word contain anything, except letters
   */
//    public static boolean name_checking(String word) {
//        char[] wordchar = word.toCharArray();
//        for (char c : wordchar) {
//            if (!Character.isAlphabetic(c)) {
//                return false;
//            }
//        }
//        return true;
//
//    }
//
//    /*2) Func name collecting name of client, if name length less than 3, it returns Wrong_name_Error */
//    public static String name(ArrayList<String> name_searching) throws Wrong_name_error {
//        String name = "";
//        int counter = 0;
//
//        for (String word : name_searching) {
//
//            if (name_checking(word)) {
//                if (counter == 0) {
//                    name = word;
//                    counter++;
//                } else {
//                    name = name + " " + word;
//                    counter++;
//                }
//            }
//        }
//
//        if (counter < 3) {
//            throw new Wrong_name_error();
//        }
//
//        return name;
//    }


}

