/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf4_actividad_b_ej_3;

/**
 *
 * @author Oriol Tarragó
 */
public class UF4_Actividad_B_Ej_3 {

    public static void main(String arg[]) {

        int min = 0, segundos = 0;
        for (min = 0; min < 60; min++) {
            for (segundos = 0; segundos < 60; segundos++) {
                System.out.println(min + ":" + segundos);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }

    }

}
