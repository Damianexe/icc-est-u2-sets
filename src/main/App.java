package main;

import utils.ContactoComparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

import models.Contacto;

public class App {
    private static Set<Contacto> contactos;

    public static void main(String[] args) {
        // runHashSet();
        // runLinkedHashSet();
        // runTreeSet();
        // runTreeSetConComparator();
        runEjercicio();
    }
/* 
    public static void runHashSet() {

        // Ejemplo de HashSet
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();

        System.out.println("------ HashSet -----\n");
        System.out.println("Elementos del HashSet (no se garantiza orden): ");

        for (String elemento : ejemploHashSet) {
            System.out.println(elemento);
        }
    }

    public static void runLinkedHashSet() {

        // Ejemplo de LinkedHashSet
        Sets sets = new Sets();
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();

        System.out.println("\n------ LinkedHashSet -----\n");
        System.out.println("Elementos del LinkedHashSet (orden de inserción): ");

        for (String elemento : ejemploLinkedHashSet) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSet() {

        // Ejemplo de TreeSet
        Sets sets = new Sets();
        Set<String> ejemploTreeSet = sets.construirTreeSet();

        System.out.println("\n------ TreeSet -----\n");
        System.out.println("Elementos del TreeSet (orden alfabetico): ");

        for (String elemento : ejemploTreeSet) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSetConComparator() {

        // Ejemplo de TreeSet con Comparator
        Sets sets = new Sets();
        Set<String> ejemploTreeSetConComparator = sets.construirTreeSetConComparator();

        System.out.println("\n------ TreeSet con Comparator -----\n");
        System.out.println("Elementos del TreeSet con Comparator (orden de longitud y alfabeticamente): ");

        for (String elemento : ejemploTreeSetConComparator) {
            System.out.println(elemento);
       }
    }
*/

    private static void runEjercicio() {
        /*Contacto c1 = new Contacto("Pedro", "López", "1234567890");
        Contacto c2 = new Contacto("Pedro", "Lopez", "0987654321");

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Referencia en memoria");
        boolean comparacionReferencia = c1 == c2;
        System.out.println(comparacionReferencia);
        System.out.println("c1" + c1  + " == c2: " +c2 + " = " + comparacionReferencia);

        System.out.println("Comparación por equals");
        System.out.println(c1.equals(c2));
        boolean comparacionEquals = c1.equals(c2);
        System.out.println(comparacionEquals);
        System.out.println("c1: " + c1 + " c2: " + c2 + " = " + comparacionEquals);

        System.out.println("Comparación por hashcode");
        boolean comparacionHashCode = c1.hashCode() == c2.hashCode();
        System.out.println(comparacionHashCode);
        System.out.println("c1: " + c1.hashCode() + "c2: ");**/

        Set <Contacto> agenda = new TreeSet <>(new ContactoComparator());   

        //Agregar contactos
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "1111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "1234567890"));
        //Pedro lopez tiene telf diferente
        // pero equals () lo considera duplicado y no se agrega
        
        //Imprimir contactos
        System.out.println("Contactos en la agenda: ");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
        
    }
}
