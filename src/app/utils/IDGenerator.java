/*
 * Classe utilitária IDGenerator - Gera identificadores únicos para diferentes objetos.
 * Esta classe utiliza variáveis estáticas e métodos sincronizados para garantir
 * que os identificadores gerados sejam únicos mesmo em ambientes multithread.
 */
package app.utils;

/**
 * Classe responsável pela geração de identificadores únicos para os objetos do sistema.
 * 
 * Atualmente, a classe suporta a geração de IDs para os seguintes objetos:
 * - Serviços
 * - Veículos
 * 
 * Os métodos são implementados como sincronizados para evitar condições de corrida
 * em cenários de acesso concorrente.
 * 
 * @author henri
 */
public class IDGenerator {
    // Identificador atual para serviços
    private static int currentServicoId = 11;
    // Identificador atual para veículos
    private static int currentVeiculoId = 1;

    /**
     * Gera um identificador único para um serviço.
     * Este método é sincronizado para evitar que dois serviços recebam o mesmo ID.
     * 
     * @return Um número inteiro único representando o ID do serviço.
     */
    public static synchronized int generateServicoID() {
        return currentServicoId++;
    }

    /**
     * Gera um identificador único para um veículo.
     * Este método é sincronizado para evitar que dois veículos recebam o mesmo ID.
     * 
     * @return Um número inteiro único representando o ID do veículo.
     */
    public static synchronized int generateVeiculoID() {
        return currentVeiculoId++;
    }
}