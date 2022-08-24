
import Loggers.Loggers;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.swing.*;
import java.io.Console;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    private static final Logger log= LogManager.getLogger(Main.class);





    public static void insertAirportData(AirPort airport[]){




    }
    //All Gets

        public static void menu(){
                int option;
                do{option = Integer.parseInt(showInputDialog(null, ""));
                        switch (option){
                                case 1:
                                        showMessageDialog(null,"Hola");//Show Airports
                                        break;
                                case 2://Show Hangars
                                        System.out.println();
                                        break;
                                case 3://List of Airlines
                                        break;
                                case 4://Airline Flights list
                                        break;
                                case 5://All Flights origin/destination
                                        break;
                                case 6:showMessageDialog(null,"you are leaving the program");
                                        break;//Exit
                                default : showMessageDialog(null,"error");

                        }

                }while(option!=6);



    }

        public static void main(String [] args){
            log.trace("LOG TRACE");
            log.debug("LOG DEBUG");
            log.info("LOG INFO");
            log.warn("LOG WARN");
            log.error("LOG ERROR");
            log.fatal("LOG FATAL");


            ArrayList<PrivateHangar> airPorts1 = new ArrayList<>();
            PrivateHangar PHangar1 = new PrivateHangar("Ezeiza","Corrientes",Country.ARGENTINA,150000,788,new AirLine("Aerolines Argentinas",6556,new Flight("6556","Corrientes","Buenos Aires",15000,new Passenger("Guillermo Busso","N4552236","M",25,"Argentino"))));
            //PrivateHangar PHangar2 = new PrivateHangar("Fiumicino","Roma","Italia",788,200000,788)





            //airPorts1.add(PHangar1);
            //airPorts1.add(PHangar2);
            //airport[0].setAirline("Alitalia").getFlight("FL368").insertPassenger(new Passenger("Guillermo Busso","N5121358","Argentinian"));
            Passenger a = PHangar1.getAirLine().getFlight().getPassenger();

            ArrayList Passengerlist = new ArrayList();
            Passenger2 a1 = new Passenger2("Guillermo Busso","N4513488","Argentino");
            Passenger2 a2 = new Passenger2("fulano","N45134548","Argentino");
            Passenger2 a3 = new Passenger2("mengano","N4513488","Argentino");
            Passengerlist.add(a1);
            Passengerlist.add(a2);
            Passengerlist.add(a3);
            //a1.createFile(Passengerlist);
            System.out.println(Passengerlist);





            //showMessageDialog(null,airPorts1.get(0));
            //System.out.println(airPorts1.get(0)+"\n"+airPorts1.get(1));
            //System.out.println(airPorts1.get(0));
            //System.out.println(PHangar1.getAirLine().getFlight().getPassenger());
            //System.out.println(a);


        //Insert Airports Data
                //insertAirportData(airport);
                //menu();




        }
}

