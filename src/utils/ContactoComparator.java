package utils;
import java.util.*;
import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2){
        //primero comparamos apellidos
        int result = c1.getApellido().compareTo(c2.getApellido());
        //si los apellidos son iguales, comparamos nombres
                return result;
    }

}
