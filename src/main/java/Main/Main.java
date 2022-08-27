package Main;

import Entities.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    private static final Logger log= LogManager.getLogger(Main.class);
       public static void insertAirportData(AirPort airport[]){




    }





        public static void menu(){ //-----------------------MENU------------------------------
            Passenger2 p1 = new Passenger2();
            ArrayList<Passenger2> PassengerList;
                int option;
                do{option = Integer.parseInt(showInputDialog(null,
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
                        switch (option){
                                case 1:
                                        showMessageDialog(null,"Hola");//Show Airport
                                        break;
                                case 2://add Passengers
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
                                case 3://Show Flight List
                                        break;
                                case 4://Show Passengers List
                                    System.out.println(p1.readFile());
                                        break;
                                case 5://Check some Passenger info by Flight number
                                        break;
                                case 6://check some Passenger info by name
                                        break;
                                case 7:showMessageDialog(null,"you are leaving the program");
                                        break;//Exit
                                default : showMessageDialog(null,"error");

                        }

                }while(option!=7);



    }

        public static void main(String [] args){
            log.trace("LOG TRACE");
            log.debug("LOG DEBUG");
            log.info("LOG INFO");
            log.warn("LOG WARN");
            log.error("LOG ERROR");
            log.fatal("LOG FATAL");


            ArrayList<PrivateHangar> airPorts1 = new ArrayList<>();
            //PrivateHangar PHangar1 = new PrivateHangar("Ezeiza","Corrientes", Country.ARGENTINA,150000,788,new AirLine("Aerolines Argentinas",6556,new Flight("6556","Corrientes","Buenos Aires",15000,new Passenger2("Guillermo Busso","N4552236","Argentino"))));
            //Entities.PrivateHangar PHangar2 = new Entities.PrivateHangar("Fiumicino","Roma","Italia",788,200000,788)


            //Passenger2 a = PHangar1.getAirLine().getFlight().getPassenger();











            //showMessageDialog(null,airPorts1.get(0));
            //System.out.println(airPorts1.get(0)+"\n"+airPorts1.get(1));
            //System.out.println(airPorts1.get(0));
            //System.out.println(PHangar1.getAirLine().getFlight().getPassenger());
            //System.out.println(a);


        //Insert Airports Data
                //insertAirportData(airport);
                menu();




        }
}

