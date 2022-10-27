/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciudad;

/**
 *
 * @author Jose
 */
public class Ciudad {
    String nombreCiudad;
    Provincia perteneceProv;
    String nombreAutoridad;

    public String getinfoCiudad(){
        var retorno = "El nombre de la ciudad es :"+this.nombreCiudad+ "/n, ademas pertenece a la provincia del"
                +this.perteneceProv.nombreProvincia+" ,/n siendo su alcande"+this.nombreAutoridad;
       return retorno; 
    }
}

