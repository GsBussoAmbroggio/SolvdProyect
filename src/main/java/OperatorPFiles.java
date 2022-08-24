import java.util.ArrayList;

public interface OperatorPFiles {

        //crea como archivo en el disco, recibe como parametro la lista de pasajeros
        public void createFile(ArrayList <Passenger2> list);

        //crea el archivo en disco, retorna la lista de pasajeros
        public ArrayList readFile();

        //add passengers to file
        public void addPassagerfile(ArrayList <Passenger2>list);
    }


