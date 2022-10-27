/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciudad;

/**
 *
 * @author Jose
 */
public class Pais {
    String nombrePais;
    int yearIndependencia;
    int numProvincias;
    int densidadPoblacion;
        
    public String getinfoPais(){
        var retorno = " provincia"+"El nombre del pais es :"+this.nombrePais+ ", ademas su fecha de independencia es: "
                +this.yearIndependencia+" ,su densidad poblacional es de:"
                +this.densidadPoblacion+" millones de habitantes y contiene:"+this.numProvincias;
        return retorno; 
}
}
