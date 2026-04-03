/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeheranca;

/**
 *
 * @author vanes
 */
public abstract class Cursos {
 protected String codigo;
 protected String nome;
 protected int chTotal;
 protected int duracao;
 protected String tipoDuracao; //Trimetral, Semestral ou Anual
 protected String Modalidade; //Presencial ou EAD
 protected boolean Status;
 
 public void obterDisciplinas(){
     System.out.println("Disciplinas " + this.nome); 
 }
 public void obterAlunosAtivos(){ 
     System.out.println("Alunos ativos" + this.codigo);
 }
 public void obterAlunosEgressos(){
     System.out.println("alunos Egressos" + this.nome);
 }
 

}