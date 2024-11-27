
import Controllers.PersonaController;
import Models.Persona;

public class App {
        public static void main(String[] args) {
                Persona[] personas = {
                                new Persona("Anais", 25),
                                new Persona("Luis", 32),
                                new Persona("Carlos", 40),
                                new Persona("María", 19),
                                new Persona("José", 45),
                                new Persona("Laura", 30),
                                new Persona("Pedro", 28),
                                new Persona("Marta", 35),
                                new Persona("Jorge", 50),
                                new Persona("Sofía", 22),
                                new Persona("Raúl", 18),
                                new Persona("Patricia", 29),
                                new Persona("Andrés", 41),
                                new Persona("Elena", 24),
                                new Persona("Manuel", 38),
                                new Persona("Isabel", 34),
                                new Persona("Gabriel", 42),
                                new Persona("Claudia", 26),
                                new Persona("Fernando", 31),
                                new Persona("Paula", 20),
                                new Persona("Diego", 36),
                                new Persona("Rosa", 27),
                                new Persona("Rubén", 44),
                                new Persona("Teresa", 33),
                                new Persona("Iván", 17),
                                new Persona("Julia", 21),
                                new Persona("Adriana", 39),
                                new Persona("Sergio", 48),
                                new Persona("Lorena", 23),
                                new Persona("Miguel", 52)
                };

                App app = new App();

                PersonaController controller = new PersonaController();

                System.out.println("Ordenamiento por edad en orden descendente");
                controller.ordenamientoSelecion(personas);
                app.printPersonasArray(personas);

                System.out.println("Busqueda de persona con edad 25");
                app.searchAndPrintByAge(controller, personas, 25);

                System.out.println("Busqueda de persona con edad 70");
                app.searchAndPrintByAge(controller, personas, 70);

                System.out.println("Ordenamiento por nombre en orden ascendente");
                controller.ordenamientoInsercio(personas);
                app.printPersonasArray(personas);

                System.out.println("Busqueda de persona Anais");
                app.searchAndPrintByName(controller, personas, "Anais");

                System.out.println("Busqueda de persona Miguel");
                app.searchAndPrintByName(controller, personas, "Miguel");
        }

        public void printPersonasArray(Persona[] personas) {
                for (int i = 0; i < personas.length; i++) {
                        System.out.println(personas[i].getName() + " (" + personas[i].getage() + " años)");
                }
        }

        public void searchAndPrintByAge(PersonaController controller, Persona[] personas, int age) {
                int index = controller.busquedaBinariaEdad(personas, age);
                if (index != -1) {
                        System.out.println("Persona encontrada: " + personas[index].getName() + " ("
                                        + personas[index].getage() + " años) en el índice " + index);
                } else {
                        System.out.println("Persona con edad " + age + " no encontrada.");
                }
        }

        public void searchAndPrintByName(PersonaController controller, Persona[] personas, String name) {
                int index = controller.busquedaBinariaNombre(personas, name);
                if (index != -1) {
                        System.out.println("Persona encontrada: " + personas[index].getName() + " ("
                                        + personas[index].getage() + " años) en el índice " + index);
                } else {
                        System.out.println("Persona con nombre '" + name + "' no encontrada.");
                }
        }
}