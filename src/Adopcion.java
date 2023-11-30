public class Adopcion {
    private String codigoUnico;
    private String fchaAdopcion;
    private String animalAdopcion;
    private String personaAdopcion;
    private Persona persona;
    private Animal animal;

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getFchaAdopcion() {
        return fchaAdopcion;
    }

    public void setFchaAdopcion(String fchaAdopcion) {
        this.fchaAdopcion = fchaAdopcion;
    }

    public String getAnimalAdopcion() {
        return animalAdopcion;
    }

    public void setAnimalAdopcion(String animalAdopcion) {
        this.animalAdopcion = animalAdopcion;
    }

    public String getPersonaAdopcion() {
        return personaAdopcion;
    }

    public void setPersonaAdopcion(String personaAdopcion) {
        this.personaAdopcion = personaAdopcion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
