package main;
import java.util.Set;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

    public Set<String> construirHashSet() {
        Set<String> miHashSet = new HashSet<>();

        miHashSet.add("Manzana");
        miHashSet.add("Pera");
        miHashSet.add("Melocoton");
        miHashSet.add("Melon");
        miHashSet.add("Pera");// elemento repetido no se agregara otra vez

        return miHashSet;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> miLinkedHashSet = new LinkedHashSet<>();
        miLinkedHashSet.add("Manzana");
        miLinkedHashSet.add("Pera");
        miLinkedHashSet.add("Melocoton");
        miLinkedHashSet.add("Melon");
        miLinkedHashSet.add("Pera");// elemento repetido no se agregara otra vez
        return miLinkedHashSet;
    }

    public Set<String> construirTreeSet() {
        Set<String> miTreeSet = new TreeSet<>();
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Melocoton");
        miTreeSet.add("Melon");
        miTreeSet.add("Pera");// elemento repetido no se agregara otra vez
        return miTreeSet;
    }

    public Set <String> construirTreeSetComparator(){
        // Implementacion de Comparator para ordenar por longitud y por orden alfabetico
        Comparator<String> comparadorPorLongitud = new Comparator <String>(){
            @Override
            public int compare(String s1, String s2) {
                int result= Integer.compare(s1.length(), s2.length());

                if(result == 0){
                    return s1.compareTo(s2);
                }
               return result;
            }
        };

        Set<String> miTreeSetConComparator = new TreeSet<>(comparadorPorLongitud);
        miTreeSetConComparator.add("Melon");
        miTreeSetConComparator.add("Pera");
        miTreeSetConComparator.add("Manzana");
        miTreeSetConComparator.add("Fresa");
        miTreeSetConComparator.add("Kiwi");
        miTreeSetConComparator.add("Melocoton");
        miTreeSetConComparator.add("Pera");// elemento repetido no se agregara otra vez

        return miTreeSetConComparator;
    }
}
