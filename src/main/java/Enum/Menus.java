package Enum;

import Entities.Passenger2;
import Exceptions.CustomExpection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;


import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public enum Menus {
    ;
    private static final Logger log= LogManager.getLogger(Menus.class);
    Menus() {
    }
    /*--MENU--*/public static void AirportMenu ()throws CustomExpection {//-----------------------MENU------------------------------
                Passenger2 p1 = new Passenger2();
                ArrayList<Passenger2> PassengerList=new ArrayList<>();
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

            /*SWITCH*/  switch (option){
                case 1://------------------add Flights----------------------------
                    break;
                case 2://------------------add Passengers-------------------------
                    p1.CreatePassenger(PassengerList);
                    p1.createFile(PassengerList);
                    break;
                case 3://------------------Show Flight List-----------------------
                    break;
                case 4://--------------Show Passengers List-----------------------
                    log.info(p1.readFile());
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
}

