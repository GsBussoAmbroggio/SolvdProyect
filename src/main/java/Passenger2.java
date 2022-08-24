import java.io.*;
import java.util.*;
import java.util.Objects;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Passenger2 implements OperatorPFiles {

        //Attributes
        private String name;
        private String passport;
        private String Nationality;
        private boolean list;

    //Empty Constructor
//public Passenger2() {

//}

    public Passenger2() {
    }

    public Passenger2(String name, String passport, String nationality) {
        this.name = name;
        this.passport = passport;
        Nationality = nationality;
    }

    @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Passenger)) return false;
            Passenger passenger = (Passenger) o;
            return Objects.equals(getName(), passenger.getName()) && Objects.equals(getPassport(), passenger.getPassport()) && Objects.equals(getNationality(), passenger.getNationality());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getPassport(), getNationality());
        }

        @Override
        public String toString() {
            return "Passenger{" +
                    "name='" + name + '\'' +
                    ", passport='" + passport + '\'' +
                    ", Nationality='" + Nationality + '\'' +
                    '}';
        }



//Interface Methods
    @Override
    public void createFile(ArrayList <Passenger2> list) {
        FileWriter flwriter = null;
        try {
            //crea el flujo para escribir en el archivo
            flwriter = new FileWriter("C:\\Users\\guill\\IdeaProjects\\Airport3\\src\\main\\resources\\Passengerlist.txt");
            //crea un buffer o flujo intermedio antes de escribir directamente en el archivo
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            for (Passenger2 passenger2 : list) {
                //escribe los datos en el archivo
                bfwriter.write(passenger2.getName() + "," + passenger2.getPassport() + "," + passenger2.getNationality() + "\n");
            }
            //cierra el buffer intermedio
            bfwriter.close();
            System.out.println("successfully Created file..");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {//cierra el flujo principal
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public ArrayList readFile() {// crea el flujo para leer desde el archivo
        File file = new File("C:\\\\Users\\\\guill\\\\IdeaProjects\\\\Airport3\\\\src\\\\main\\\\resources\\\\Passengerlist.txt\"");
        ArrayList passengersList= new ArrayList<>();
        Scanner scanner;
        try {
            //se pasa el flujo al objeto scanner
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                // el objeto scanner lee linea a linea desde el archivo
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                //se usa una expresión regular
                //que valida que antes o despues de una coma (,) exista cualquier cosa
                //parte la cadena recibida cada vez que encuentre una coma
                delimitar.useDelimiter("\\s*,\\s*");
                Passenger2 e= new Passenger2();
                e.setName(delimitar.next());
                e.setPassport(delimitar.next());
                e.setNationality(delimitar.next());
                passengersList.add(e);
            }
            //close scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return passengersList;
    }

    @Override
    public void addPassagerfile(ArrayList <Passenger2>list) {
        //add passengers to file

            FileWriter flwriter = null;
            try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros
                flwriter = new FileWriter("C:\\\\Users\\\\guill\\\\IdeaProjects\\\\Airport3\\\\src\\\\main\\\\resources\\\\Passengerlist.txt\"", true);
                BufferedWriter bfwriter = new BufferedWriter(flwriter);
                for (Passenger2 passenger2 : list) {
                    //write the data in the file
                    bfwriter.write(passenger2.getName() + "," + passenger2.getPassport() + "," + passenger2.getNationality() + "\n");
                }
                bfwriter.close();
                System.out.println("successfully modified file..");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (flwriter != null) {
                    try {
                        flwriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


//Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }
}


