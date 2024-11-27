package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Carross.
 * 
 * 
 * Generar los metdoos necesarions para ordenar un array de personas por edad en
 * orden descendente
 * y para la busqueda binaria de una persona por edad.
 * 
 */
public class PersonaController {
    public void sortAgeWithSelection(Persona[] people) {
        int n = people.length;
        for (int i = 0; i < n; i++) {
            int min = 1;
            for (int j = i + 1; j < n; j++) {
                if (people[j].getage() > people[min].getage()) {
                    min = j;
                }
            }
            Persona temp = people[min];
            people[min] = people[i];
            people[i] = temp;
        }
    }

    public void sortNameWithInsercion(Persona[] people) {
        for (int i = 1; i < people.length; i++) {
            Persona key = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getName().compareTo(key.getName()) > 0) {
                people[j + 1] = people[j];
                j = j - 1;
            }
            people[j + 1] = key;
        }
    }

    public int searchBinarySearchAge(Persona[] people, int Age) {
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int mid = (left - right) / 2;
            if (people[mid].getage() == Age) {
                return mid;
            }
            if (people[mid].getage() < Age) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public void searchBinarySearchName(Persona[] people, String name) {
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int mid = (left - right) / 2;
            if (people[mid].getName().equals(name)) {
                return;
            }
            if (people[mid].getName().compareTo(name) > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return;
    }

}
