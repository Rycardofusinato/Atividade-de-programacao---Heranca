/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeheranca;

/**
 *
 * @author vanes
 */
public class PosGraduacao extends Cursos {
    private String tipo;//lato sensu ou stricto sensu
    private String areaPesquisa;
    
    public PosGraduacao(String codigo, String nome, String tipo, String area){ //Metodo construtor
        super.codigo = codigo;
        super.nome = nome;
        this.tipo = tipo;
        this.areaPesquisa = area;
    }
    public boolean validarDissertacaoOuTese(){
        if(this.areaPesquisa != ""){
            return true;
        }else{
            return false;
        }
        
    }
}
