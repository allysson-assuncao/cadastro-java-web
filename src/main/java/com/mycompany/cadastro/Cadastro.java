/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author janio.silva
 */
@Named
@SessionScoped
public class Cadastro implements Serializable  {
    private String mensagem="Bem vindo ao cadastro de Alunos!";
    private Aluno dadosAluno;
    
    public void cadastrarAluno(){
        this.mensagem="Aluno cadastrado com sucesso!";
    }   

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Aluno getDadosAluno() {
        return dadosAluno;
    }

    public void setDadosAluno(Aluno dadosAluno) {
        this.dadosAluno = dadosAluno;
    }
    
    
    
}
