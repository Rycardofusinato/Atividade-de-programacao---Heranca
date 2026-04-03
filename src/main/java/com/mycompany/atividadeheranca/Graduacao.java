package com.mycompany.atividadeheranca;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vanes
 */
public class Graduacao extends Cursos {
    private String tipo; //bacharelado, licenciatura, tecnologico
    private boolean tccObrigatorio;
    
    public Graduacao(String codigo, String nome, String tipo, boolean tcc){
        super.codigo = codigo;
        super.nome = nome;
        this.tipo = tipo;
        this.tccObrigatorio = tcc;
      
    }
     public boolean validarTCC(){
         if(this.tccObrigatorio = true){
             return true;
         }else{
             return false;
         }
         
     }
        
    
}
