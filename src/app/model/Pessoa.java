/*
 * Classe abstrata Pessoa que serve como base para outras classes no sistema.
 * Representa informações gerais de uma pessoa, como ID, nome, CPF, e contato.
 */
package app.model;

/**
 * Classe abstrata que encapsula atributos e métodos básicos de uma pessoa.
 * Classes derivadas, como Funcionario, devem herdar dessa classe.
 * @author derickandrade
 */
public abstract class Pessoa {
    // Identificador único da pessoa
    private int id;
    
    // Nome completo da pessoa
    private String nome;
    
    // CPF (Cadastro de Pessoa Física) da pessoa
    private String cpf;
    
    // E-mail da pessoa
    private String email;
    
    // Telefone de contato da pessoa
    private String telefone;

    /**
     * Construtor completo da classe Pessoa.
     * 
     * @param id Identificador único da pessoa.
     * @param nome Nome completo da pessoa.
     * @param cpf CPF da pessoa.
     * @param email E-mail da pessoa.
     * @param telefone Telefone de contato da pessoa.
     */
    public Pessoa(int id, String nome, String cpf, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }        

    /**
     * Construtor alternativo da classe Pessoa, usado quando o ID não é informado.
     * 
     * @param nome Nome completo da pessoa.
     * @param cpf CPF da pessoa.
     * @param email E-mail da pessoa.
     * @param telefone Telefone de contato da pessoa.
     */
    public Pessoa(String nome, String cpf, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }            

    // Métodos getters e setters para manipulação dos atributos da classe

    /**
     * Obtém o identificador único da pessoa.
     * 
     * @return ID da pessoa.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador único da pessoa.
     * 
     * @param id Novo ID da pessoa.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome completo da pessoa.
     * 
     * @return Nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome completo da pessoa.
     * 
     * @param nome Novo nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o CPF da pessoa.
     * 
     * @return CPF da pessoa.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF da pessoa.
     * 
     * @param cpf Novo CPF da pessoa.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o e-mail da pessoa.
     * 
     * @return E-mail da pessoa.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o e-mail da pessoa.
     * 
     * @param email Novo e-mail da pessoa.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtém o telefone de contato da pessoa.
     * 
     * @return Telefone da pessoa.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone de contato da pessoa.
     * 
     * @param telefone Novo telefone da pessoa.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }    
}
