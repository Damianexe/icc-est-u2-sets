
import java.util.*;
import models.Contacto;
import utils.ContactoComparator;

public class App {
    public static void main(String[] args) throws Exception {
        runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeComparator();
    }

    private static void runHashSet() {
        Sets sets = new Sets();
        Set<String> miHashSet = sets.construirHashSet();
        System.out.println("----- HashSet -----");
        System.out.println("Elementos del HashSet ( no garantiza el orden)");
        for (String elemento : miHashSet) {
            System.out.println(elemento);
        }
    }

    private static void runLinkedHashSet() {
        Sets sets = new Sets();
        Set<String> miLinkedHashSet = sets.construirLinkedHashSet();
        System.out.println("----- LinkedHashSet -----");
        System.out.println("Elementos del LinkedHashSet (respeta orden de insercion)");
        for (String element : miLinkedHashSet) {
            System.out.println(element);
        }
    }

    private static void runTreeSet() {
        Sets sets = new Sets();
        Set<String> miTreeSet = sets.construirTreeSet();
        System.out.println("----- TreeSet -----");
        System.out.println("Elementos del TreeSet (va por orden alfabetico)");
        for (String element : miTreeSet) {
            System.out.println(element);
        }

    }

    private static void runTreeComparator() {
        Sets sets = new Sets();
        Set<String> miTreeSetConComparator = sets.construirTreeSetComparator();
        System.out.println("----- TreeSet con Comparator -----");
        for (String element : miTreeSetConComparator) {
            System.out.println(element);
        }
    }

}
