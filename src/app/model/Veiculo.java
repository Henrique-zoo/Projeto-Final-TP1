/*
 * Classe Veiculo - Representa um veículo no sistema da oficina, incluindo informações 
 * como tipo, modelo, placa, cor e as peças com problemas associadas.
 */
package app.model;

import app.utils.IDGenerator;
import java.util.ArrayList;

/**
 * Classe que encapsula os detalhes de um veículo.
 * Permite a associação de peças com problemas e o gerenciamento de suas propriedades.
 * 
 * @author henri
 */
public class Veiculo {
    // Identificador único do veículo
    private int id;
    // Ano de fabricação do veículo
    private int ano;
    // Tipo do veículo (ex.: carro, moto, caminhão)
    private String tipo;
    // Modelo do veículo
    private String modelo;
    // Cor do veículo
    private String cor;
    // Placa do veículo
    private String placa;
    // Lista de peças com problemas associadas ao veículo
    private final ArrayList<Peca> pecasComProblema;

    /**
     * Construtor padrão que inicializa o veículo com valores padrão.
     * Usado de maneira criativa para que as comboBox funcionem corretamente.
     */
    public Veiculo() {
        this.tipo = "Selecione";
        this.modelo = "um veículo";
        this.pecasComProblema = new ArrayList<>();
    }

    /**
     * Construtor completo para inicializar um veículo com todos os atributos.
     * 
     * @param ano Ano de fabricação do veículo.
     * @param tipo Tipo do veículo (ex.: carro, moto).
     * @param placa Placa do veículo.
     * @param modelo Modelo do veículo.
     * @param cor Cor do veículo.
     */
    public Veiculo(int ano, String tipo, String placa, String modelo, String cor) {
        this.id = IDGenerator.generateVeiculoID(); // Gera um ID único para o veículo
        this.ano = ano;
        this.tipo = tipo;
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.pecasComProblema = new ArrayList<>();
    }

    /**
     * Comentário geral para os getters
     * 
     * @return o atributo do getter
     */
    public int getId() {
        return id;
    }
    public int getAno() {
        return ano;
    }
    public String getTipo() {
        return tipo;
    }
    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public String getCor() {
        return cor;
    }
    public ArrayList<Peca> getPecasComProblema() {
        return pecasComProblema;
    }

    /**
     * Comentário geral para os setters
     * @param atributo o atributo do setter
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Adiciona peças com problemas à lista do veículo.
     * 
     * @param pecasComProblema Lista de peças a serem associadas ao veículo.
     */
    public void setPecasComProblema(ArrayList<Peca> pecasComProblema) {
        for (Peca par : pecasComProblema)
            this.pecasComProblema.add(par);
    }
    
    /**
     * Retorna a representação do veículo como uma String (placa do veículo).
     * 
     * @return Placa do veículo.
     */
    @Override
    public String toString() {
        return placa;
    }

    /**
     * Obtém a lista de peças com problemas associadas ao veículo.
     * 
     * @return Lista de peças com problemas.
     */
    /**
     * Esvazia a lista de peças com problemas associadas ao veículo.
     */
    public void esvaziarPecasComProblema() {
        pecasComProblema.clear();
    }
}