/*
 * Classe SessaoUsuario - Implementa o padrão Singleton para gerenciar a sessão do usuário no sistema.
 * 
 * Essa classe mantém uma instância única (Singleton) responsável por armazenar as informações do 
 * usuário atualmente logado, permitindo que qualquer parte do sistema acesse ou modifique esses 
 * dados de forma centralizada.
 */
package app.utils;

import app.model.Funcionario;

/**
 * Classe SessaoUsuario
 * 
 * Gerencia a sessão do usuário logado no sistema, utilizando o padrão Singleton. 
 * Permite definir e recuperar o funcionário atualmente autenticado no sistema.
 * 
 * Autor: henri
 */
public class SessaoUsuario {
    // Instância única da classe SessaoUsuario
    private static SessaoUsuario instancia;
    
    // Armazena o funcionário atualmente logado
    private Funcionario usuarioLogado;

    /**
     * Construtor privado - Impede a criação de múltiplas instâncias da classe.
     */
    private SessaoUsuario() {}

    /**
     * Retorna a instância única da classe SessaoUsuario.
     * 
     * Caso a instância ainda não tenha sido criada, ela será inicializada.
     * 
     * @return Instância única de SessaoUsuario.
     */
    public static SessaoUsuario getInstancia() {
        if (instancia == null) {
            instancia = new SessaoUsuario();
        }
        return instancia;
    }

    /**
     * Define o funcionário atualmente logado no sistema.
     * 
     * @param usuario O objeto Funcionario que representa o usuário logado.
     */
    public void setUsuarioLogado(Funcionario usuario) {
        this.usuarioLogado = usuario;
    }

    /**
     * Retorna o funcionário atualmente logado no sistema.
     * 
     * @return Objeto Funcionario correspondente ao usuário logado, ou null se nenhum usuário estiver logado.
     */
    public Funcionario getUsuarioLogado() {
        return usuarioLogado;
    }
}