package utils;

import java.util.*;
import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {
    
    @Override
    public int compare(Contacto c1, Contacto c2) {

        // primero comparamos apellidos
        int result = c1.getApellido().compareToIgnoreCase(c2.getApellido());


        // si los apellidos son iguales, comparamos nombres
        if (result != 0) {
            return result;
        }

        //si los apellidos son iguales comparamos nombres
        result = c1.getNombre().compareToIgnoreCase(c2.getNombre());

        // si los dos anteriores son igual , comparamos telefonos
        if(result == 0){
            return c1.getTelefono().compareToIgnoreCase(c2.getTelefono());
        }
        return result;
        
    }

}
