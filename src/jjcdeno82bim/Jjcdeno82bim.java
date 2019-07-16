/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jjcdeno82bim;

/**
 *
 * @author Break OFF
 */
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Jjcdeno82bim {

   public static void main(String[] args) throws FileNotFoundException {
        
       PrintStream file = new PrintStream("GuardarResultado.txt");
       try {
           //DeclaraciÃ³n de Variables
            System.out.println("");
            Scanner sca = new Scanner(System.in);
            Calendar cal = new GregorianCalendar();
            int mesActual = cal.get(Calendar.MONTH), anyoActual = cal.get(Calendar.YEAR),
                    diaActual = cal.get(Calendar.DAY_OF_MONTH);
            int mes, dia, anyo;
            int mesResultado, diaResultado, anyResultado;

            //Solicitamos la informaciÃ³n al Usuario
            System.out.println("Se procedera a calcular cuantos años tienes, Por Favor proporcionarnos la siguiente informacion");
            System.out.println("Cual es el dia de nacimiento expresado en numeros");
            dia = sca.nextInt();
            System.out.println("En que mes nacia³?");
            mes = sca.nextInt();
            System.out.println("En que año nacia³");
            anyo = sca.nextInt();

            //Creamos las excepciones
            if (dia < 0 | dia > 31) {
                throw new Exception("El dia ingresado es incorrecto");

            }
            if (mes < 0 | mes > 12) {
                throw new Exception("El mes ingresado es incorrecto");

            }
            if (anyo < 0) {
                throw new Exception("El año ingresado es incorrecto");

            }

            mesResultado = Math.abs(mes - mesActual);
            diaResultado = diaActual;
            anyResultado = Math.abs(anyo - anyoActual);

            System.out.println("Tienes " + anyResultado + " años" + ", " + mesResultado
                    + " meses " + " y " + diaResultado + " dias");
        } catch (Exception ex) {
            System.out.println("Ha habido un error en el calculo realizado" + ex.toString());
        }
       
       
    }
    
}
