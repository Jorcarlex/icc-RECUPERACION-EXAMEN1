package Models;

/**
 * 
 * Clase Persona que representa una entidad Persona con atributos para name y
 * edad.
 */
public class Persona {
    // Atributos de la clase
    String name; // Almacena el name de la carro
    int age; // Almacena la age de la carro

    /**
     * Constructor para crear una nueva instancia de Persona con un name y age
     * específicos.
     * 
     * @param name Nombre de la persona.
     * @param age   age de la persona.
     */
    public Persona(String name, int age) {
        this.name = name; // Asigna el name pasado al atributo name de la clase
        this.age = age; // Asigna la age pasada al atributo age de la clase
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona [name=" + name + ", age=" + age + "]";
    }
    

}