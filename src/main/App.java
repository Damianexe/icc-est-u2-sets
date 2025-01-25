package main;
import utils.ContactoComparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class App {
    private static Set<Contacto> contactos;

    public static void main(String[] args) {
        contactos = new TreeSet<>(new ContactoComparator());
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los contactos. Cuando termines, escribe 'fin' para imprimir la lista.");

        while (true) {
            System.out.print("Ingresa el nombre (o 'fin' para terminar): ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Ingresa el apellido: ");
            String apellido = scanner.nextLine();

            Contacto nuevoContacto = new Contacto(nombre, apellido);
            if (contactos.add(nuevoContacto)) {
                System.out.println("Contacto agregado exitosamente.");
            } else {
                System.out.println("El contacto ya existe.");
            }
        }

        mostrarContactos();
    }

    private static void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos registrados.");
        } else {
            System.out.println("\nContactos registrados:");
            for (Contacto contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }
}
