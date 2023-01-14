package NewFrameWorkTest;

import org.checkerframework.checker.units.qual.C;

public class testttttttt {



    public static void main(String[] args) {


        String text = " java is a fan programming language$#%$#^^#^# 1236523656852 ";
        String CharssOnly = text.replaceAll("[a-zA-Z0-9]+", " ");
        System.out.println(CharssOnly);
    }
//        String s = "adad ,888888 dsd  r dsdsd,,,,..////";
//        System.out.println(s.replaceAll("[a-zA-Z0-9]+", "")); // remove everything apart from "a-z and A-Z"




    }


    /*
    public static void main(String[] args) {




        String text =" java is a fan programming language $#%$#^^#^# 1236523656852 ";
        String charonly= (text.replaceAll("[^a-z]"," ")+text.replaceAll("[^0-9]"," "));
        String Numbersonly =text.replaceAll("[^0-9]"," ");
        String Letterssonly =text.replaceAll("[^a-z]"," ");
        String Charssonly =text.replaceAll("[^a-zA-Z0-9_-]"," ");

        String[] result = text.split(" ");

      //  System.out.println("result = ");
//        for (String str: result){{
//            System.out.println(str.concat(""));
//        }


//        System.out.println(Charssonly);
//       System.out.println(Letterssonly);
//        System.out.println(text);
//        System.out.println(Numbersonly);
        System.out.println(Numbersonly);

    }

//        String s1 = "java,selenium,maven,testng";
//
//        String[] s2 = s1.split(",");
//
//
//
//
//            System.out.println(s2[i]);
//
//        // for (int i = 0; i < s2.length; i++)
//
//
//    }

*/

