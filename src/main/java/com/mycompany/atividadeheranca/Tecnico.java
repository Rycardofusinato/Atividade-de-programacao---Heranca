/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeheranca;

/**
 *
 * @author vanes
 */
public class Tecnico extends Cursos {
    private String eixoTecnologico;
    private int chEstagio;
    
    public Tecnico(String codigo, String nome, String eixo, int ch){ //Metado construtor
        super.codigo = codigo;
        super.nome = nome;
        this.eixoTecnologico = eixo;
        this.chEstagio = ch;
    }
    public boolean validarEstagioObrigatorio(){
        if(this.chEstagio > 0){
            return true;
        }else{
            return false;
        }
        
    }
}
