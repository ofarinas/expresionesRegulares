/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ristras;

import java.util.regex.*;

/**
 *
 * @author osvaldo
 */
public class Ristras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(nombre("Osvaldo Fariñas Fernández Osvaldo Fariñas Roman Luis Fariñas Fernádez") );
    }

    public static String numero(String numero) {
        Pattern p = Pattern.compile("\\b[1-2]?([1-3]|[8,9])[0-5]\\b");
        Matcher m = p.matcher(numero);
        String aux = "";
        while (m.find())   aux += m.group(0) + " ";
         return aux.trim();
    }

    public static String nombre(String cadena) {
        Pattern p = Pattern.compile("([A-Z][a-z]+) ([A-Z][a-z,á,é,í,ó,ú,ñ]+) ([A-Z][a-z,á,é,í,ó,ú]+)");
        Matcher m = p.matcher(cadena);
        return m.replaceAll("$1 hola $3");
       // String aux="";
//        while (m.find()) {
//            aux+=m.group(2) +" "+  m.group(4) +" " + m.group(6)+ ",";
//        }
        //return aux;
       }
    
}
