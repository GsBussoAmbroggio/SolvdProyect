package main;

import Enum.Menus;
import Exceptions.CustomExpection;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    private static final Logger log= LogManager.getLogger(Main.class);


        public static void main(String [] args) throws CustomExpection {
            log.trace("LOG TRACE");
            log.debug("LOG DEBUG");
            log.info("LOG INFO");
            log.warn("LOG WARN");
            log.error("LOG ERROR");
            log.fatal("LOG FATAL");
            Menus.AirportMenu();



        }
}

