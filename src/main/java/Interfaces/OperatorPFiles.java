package Interfaces;

import Entities.Passenger2;
import Exceptions.CustomExpection;

import java.util.ArrayList;

public interface OperatorPFiles {

        //crea como archivo en el disco, recibe como parametro la lista de pasajeros
        public default void createFile(ArrayList<Passenger2> list) throws CustomExpection {

        }

        //crea el archivo en disco, retorna la lista de pasajeros
        public ArrayList readFile();

        //add passengers to file
        public void addPassagerfile(ArrayList <Passenger2>list);
    }


