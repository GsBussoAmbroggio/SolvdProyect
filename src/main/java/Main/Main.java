package Main;

import Entities.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.swing.*;
import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    private static final Logger log= LogManager.getLogger(Main.class);
       public static void insertAirportData(AirPort airport[]){




    }


/*--MENU--*/public static void menu(){ //-----------------------MENU------------------------------
            Passenger2 p1 = new Passenger2();
            ArrayList<Passenger2> PassengerList;
                int option;
              /*DO*/                  do{option = Integer.parseInt(showInputDialog(null,
                        """
                                --------------------------------------------------------------
                                -    Enter ones of these options                             \s
                                -                                                            \s
                                -    1- add Flights                                         \s
                                -    2- add Passengers                                     \s
                                -    3- Show Flight List
                                -    4- Show Passengers List
                                -    5- Check some Passenger info by Flight number                                  \s
                                -    6- check some Passenger info by name
                                -
                                -    7- Exit                                                        \s
                                -                                                            \s
                                --------------------------------------------------------------"""));

              /*SWITCH*/        switch (option){
                                case 1://------------------add Flights----------------------------
                                        break;
                                case 2://------------------add Passengers-------------------------
                                    PassengerList = p1.CreatePassenger();
                                    int op;
                                    do {
                                        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Which passenger do you want to set"));
                                        PassengerList.get(n).setName(JOptionPane.showInputDialog(null,"Passenger name"));
                                        PassengerList.get(n).setPassport(JOptionPane.showInputDialog(null,"Passenger Passport"));
                                        PassengerList.get(n).setNationality(JOptionPane.showInputDialog(null,"Passenger nationality"));
                                        op = JOptionPane.showConfirmDialog(null, "Do you want to register another passenger ?");
                                    }
                                    while (op==0);
                                    p1.createFile(PassengerList);
                                        break;
                                case 3://------------------Show Flight List-----------------------
                                        break;
                                case 4://--------------Show Passengers List-----------------------
                                    System.out.println(p1.readFile());
                                        break;
                                case 5://---------Check some Passenger info by Flight number------
                                        break;
                                case 6://---------Check some Passenger info by name---------------
                                        break;
                                case 7:showMessageDialog(null,"you are leaving the program");
                                        break;//--------------------Exit--------------------------
                                default : showMessageDialog(null,"error");

                        }

              /*WHILE*/                  }while(option!=7);
}//----------------------------------------------------- END MENU -----------------------------------
/*--END--*/



        public static void main(String [] args){
            log.trace("LOG TRACE");
            log.debug("LOG DEBUG");
            log.info("LOG INFO");
            log.warn("LOG WARN");
            log.error("LOG ERROR");
            log.fatal("LOG FATAL");




                menu();



        }
}

