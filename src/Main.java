import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
Perro perro1 = new Perro();
perro1.setCodigoUnico("1010");
perro1.setNombre("Caifas");
perro1.setFechaNacimiento("10-10-23");
perro1.setRelacionamiento("Bueno");

Gato gato1 = new Gato();
gato1.setCodigoUnico("2020");
gato1.setNombre("Mis");
gato1.setFechaNacimiento("05-05-23");
gato1.setVirusLeusemiaFelina("No");

Persona persona1 = new Persona();
persona1.setDni("40584572G");
persona1.setNombre("Antonio");
persona1.setApellidos("Vasquez");
persona1.setTelefono("423587461");

Adopcion adopcion1 = new Adopcion();
adopcion1.setCodigoUnico("4040");
adopcion1.setAnimalAdopcion("Perro");
adopcion1.setFchaAdopcion("30-11-23");
adopcion1.setPersona(persona1);
adopcion1.setAnimal(perro1);


System.out.println("Adopcion"+ adopcion1);
    }

}