/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adevprolatam.numeroscomplejos;

/**
 *
 * @author dell
 */
public class numeroComplejo {
       private int real;
       private int imaginario;
       
    public void cargar(String numero) {
       
      String[] partes = numero.split("(?=[-+])|i");

       if (partes.length == 2 || partes.length == 3) {
            
        this.real = Integer.parseInt(partes[0].trim());
       
            if ("-".equals(partes[1]) && partes.length > 2) {
                this.imaginario = -1 * Integer.parseInt(partes[2].trim());
            }else {
                    this.imaginario = Integer.parseInt(partes[1].trim());
            }}
            else 
            {
            throw new IllegalArgumentException("Formato de número complejo inválido");
       }
    }

    public String suma(numeroComplejo numero) {
        int sumaReal = this.real + numero.real;
        int sumaImaginaria = this.imaginario + numero.imaginario;
        if(sumaImaginaria >= 0){
                return sumaReal + "+" + sumaImaginaria + "i";
        }else{
                return sumaReal + "" + sumaImaginaria + "i";
        }
    }
       
    public String mostrar(){
        
        if(imaginario >= 0){
                return real+" + "+ imaginario + "i";
        }else{
                 return real+""+ imaginario + "i";
        }
    }
}   
