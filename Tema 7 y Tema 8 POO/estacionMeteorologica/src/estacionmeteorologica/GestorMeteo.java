/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionmeteorologica;

import java.util.*;
import java.io.*;

/**
 *
 * @author IEUser
 */
public class GestorMeteo {

    //Nathan Gonzalez Mercado
    
    // Definición de atributos: A COMPLETAR POR EL ALUMNO ...
    //Creamos un array con las medidas que contendrá todos los datos
    //Un número de medidas así como el máximo de medidas posibles.
    private Medida medidas[];
    private int numeroMedidas;
    private int MAXM = 1000;

    // Constructor de la clase
    public GestorMeteo(String nomFich) throws IOException {
        Scanner f = new Scanner(new File(nomFich)).useLocale(Locale.US);
        // A COMPLETAR POR EL ALUMNO ... 1 o más líneas
        this.numeroMedidas = 0;
        this.medidas = new Medida[11];
        while (f.hasNext() && numeroMedidas < MAXM) {
            //creamos un string que almacene la siguiente linea del documento
            String medi = f.nextLine();
            //En base a dicha linea haremos que almacene los valores correspondientes a la medida
            int mes = f.nextInt();
            int dia = f.nextInt();
            int hora = f.nextInt();
            double tempMax = f.nextDouble();
            double pluvio = f.nextDouble();
            // A COMPLETAR POR EL ALUMNO ... Añadir elementos al array
            //Tras ello, creamos los objetos Momento y Medida con sus respectivos datos
            Momento momento = new Momento(dia, mes, hora);
            Medida medida = new Medida(momento, tempMax, pluvio);
            //Una vez creamos, lo agregamos al array medidas e incrementamos el número de medidas.
            medidas[numeroMedidas] = medida;
            numeroMedidas++;
            // 1 o más líneas

        }
        // 1 o más líneas

        f.close();
    }

    public Momento mayorTemp() {
        // A COMPLETAR POR EL ALUMNO ...
        //Creamos un doble que almacenara la temperatura maxima,
        //asi como un momento que almacenara sus datos.
        double maxTemp = 0;
        Momento max = new Momento(0, 0, 0);
        //recorremos el array de medidas
        for (int i = 0; i < medidas.length; i++) {
            //Si la temperatura máxima de dicha posicion es mayor a la registrada
            if (medidas[i].getTempMax() > maxTemp) {
                //añadimos dicha temperatura como maxima y 
                //agregamos al objeto max dicho momento.
                maxTemp = medidas[i].getTempMax();
                max = medidas[i].getMomento();
            }
        }
        //Devolvemos el Objeto max que hemos creado que contiene los valores.
        return max;
    }

    public double pluvioMedia(int mes) {
        // A COMPLETAR POR EL ALUMNO ...
        //Creamos una variable que almacenara el pluvio y otro con las veces que ocurre
        double pMedia = 0;
        int veces = 0;
        //recorremos el array
        for (int i = 0; i < medidas.length; i++) {
            //Si el mes es igual al mes que otorgamos nosotros
            if (medidas[i].getMomento().getMes() == mes) {
                //entonces el pluvio sera igual a lo que ya tenia + el pluvio de dicha posicion
                //Además registreamos las veces que esto ocurre
                pMedia = pMedia + medidas[i].getPluvio();
                veces++;
            }
        }
        //una vez hecho esto, para sacar la media dividiremos la suma de todos los pluvios
        //entre todas las veces que esto ocurrio.
        pMedia = pMedia / veces;
        //para finalizar, devolveremos dicha media.
        return pMedia;

    }

    /**
     * Método de ordenación de un array de enteros por Selección Directa.
     * Utilícese como guía para resolver el método ordenarPorMomento().
     */
    public void SeleccionDirecta(int v[]) {
        for (int i = 0; i < v.length - 1; i++) {
            int posMin = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[posMin]) {
                    posMin = j;
                }
            }

            int aux = v[posMin];
            v[posMin] = v[i];
            v[i] = aux;
        }
    }

    public void ordenarPorMomento() {
        // A COMPLETAR POR EL ALUMNO, utilizando el método anterior de la clase Medida.
        for (int i = 0; i < (medidas.length - 1); i++) {
            int posicionMinima = i;
            for (int j = (i + 1); j < medidas.length; j++) {
                if (medidas[j].anterior(medidas[posicionMinima]) == true) {
                    posicionMinima = j;
                }
            }
            Medida aux = medidas[posicionMinima];
            medidas[posicionMinima] = medidas[i];
            medidas[i] = aux;
        }
    }

    public void mostrar() {
        for (Medida recorrido : medidas) {
            System.out.println(recorrido.toString());

        }
    }
}
