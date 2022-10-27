/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ciudad;

/**
 *
 * @author Jose
 */
public class Project005 {

    public static void main(String[] args) {
        
        var pais1 = new Pais();
        var provincia1 = new Provincia();
        var ciudad1 = new Ciudad();
        

        pais1.nombrePais = "Ecuador";
        pais1.numProvincias = 24;
        pais1.yearIndependencia = 1809;
        

        ciudad1.nombreCiudad = "Cuenca";
        ciudad1.nombreAutoridad = "Pedro Palacios";
        ciudad1.perteneceProv = provincia1;
        

        provincia1.nombreProvincia = "Azuay";
        provincia1.capitalCiudad = ciudad1;
        provincia1.poblacionProvincia = 909.585;
        
        System.out.println(ciudad1.getinfoCiudad());
        System.out.println(provincia1.getinfoProvincia());
        System.out.println(pais1.getinfoPais());
        
        
    }
}
