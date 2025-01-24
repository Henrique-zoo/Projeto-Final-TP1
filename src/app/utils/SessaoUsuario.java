/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.utils;

import app.model.Funcionario;

/**
 *
 * @author henri
 */
public class SessaoUsuario {
    private static SessaoUsuario instancia;
    private Funcionario usuarioLogado;

    private SessaoUsuario() {}

    public static SessaoUsuario getInstancia() {
        if (instancia == null) {
            instancia = new SessaoUsuario();
        }
        return instancia;
    }

    public void setUsuarioLogado(Funcionario usuario) {
        this.usuarioLogado = usuario;
    }

    public Funcionario getUsuarioLogado() {
        return usuarioLogado;
    }
}
