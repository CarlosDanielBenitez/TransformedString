import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Transformador {

    public static List<String> transformadorEnMayusculas(List<String> lista,Transformacion transformacion) {
        List<String> resultado = new ArrayList<>();
        for (String cadena: lista){
            resultado.add(transformacion.transformar(cadena));
        }
        return resultado;
    }
    public static void main(String[] args) {
        List<String>listaDeCadenas = List.of("hola", "mundo","java");

        //expresión lambda
        List<String> listaEnMayusculas = transformadorEnMayusculas(listaDeCadenas, cadena -> cadena.toUpperCase());

            System.out.println("Lista original: " + listaDeCadenas);
            System.out.println("lista transformada: " + listaEnMayusculas);
        }
    }



@FunctionalInterface
interface Transformacion {
    String transformar(String cadena);
}