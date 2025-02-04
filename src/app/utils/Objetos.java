package app.utils;

import app.model.Cliente;
import app.model.Funcionario;
import app.model.Pessoa;
import app.model.Servico;
import app.model.Veiculo;
import app.model.TipoDePeca;
import app.model.Estoque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Classe responsável pelo gerenciamento de coleções de objetos no sistema.
 * Inclui funcionalidades para inicializar, manipular e validar dados simulados.
 * 
 * As coleções disponíveis são:
 * - Funcionários
 * - Clientes
 * - Veículos
 * - Serviços
 */
public class Objetos {
    // Coleção de funcionários
    public final static HashMap<Integer, Funcionario> funcionarios;
    // Coleção de clientes
    public final static HashMap<Integer, Cliente> clientes;
    // Coleção de veículos, mapeada por placa
    public final static HashMap<String, Veiculo> veiculos;
    // Coleção de serviços
    public final static HashMap<Integer, Servico> servicos;
    // Lista de placas geradas para veículos
    public final static ArrayList<String> placas;

    // Bloco estático para inicializar as coleções e adicionar dados simulados
    static {
        funcionarios = new HashMap<>();
        clientes = new HashMap<>();
        servicos = new HashMap<>();
        veiculos = new HashMap<>();
        placas = new ArrayList<>();
        adicionarFuncionariosAleatorios();
        adicionarVeiculosAleatorios();
        adicionarClientesAleatorios();
        adicionarServicosAleatorios();
        adicionarPecasAleatorias(); // Adiciona peças aleatórias ao estoque
    }

    /**
     * Adiciona funcionários com dados simulados à coleção.
     */
    private static void adicionarFuncionariosAleatorios() {
        funcionarios.put(1, new Funcionario(5000.0, "senha123", 1, "João Silva", "123.456.789-00", "joao@gmail.com", "11999999999"));
        funcionarios.put(2, new Funcionario(4500.0, "senha456", 2, "Maria Oliveira", "987.654.321-00", "maria@gmail.com", "21988888888"));
        funcionarios.put(3, new Funcionario(4800.0, "senha789", 3, "Pedro Santos", "111.222.333-44", "pedro@gmail.com", "31977777777"));
        funcionarios.put(4, new Funcionario(4700.0, "senha321", 4, "Ana Clara", "444.555.666-77", "ana@gmail.com", "41966666666"));
        funcionarios.put(5, new Funcionario(6000.0, "senha654", 5, "Carlos Pereira", "999.888.777-66", "carlos@gmail.com", "51955555555"));
        funcionarios.put(6, new Funcionario(5500.0, "senha987", 6, "Fernanda Souza", "222.333.444-55", "fernanda@gmail.com", "11988887777"));
        funcionarios.put(7, new Funcionario(5200.0, "senha111", 7, "Lucas Andrade", "666.777.888-99", "lucas@gmail.com", "21977776666"));
    }

    /**
     * Adiciona veículos com dados simulados à coleção.
     * Cada veículo é criado com uma placa única gerada aleatoriamente.
     */
    public static void adicionarVeiculosAleatorios() {
        Random random = new Random();

        String[] modelos = {"Toyota Corolla", "Honda Civic", "Ford Mustang", "Chevrolet Onix", "Volkswagen Gol", 
                             "Hyundai HB20", "Fiat Uno", "Jeep Renegade", "Nissan Kicks", "BMW X1"};
        String[] cores = {"Vermelho", "Azul", "Preto", "Branco", "Prata"};
        String[] tipos = {"Carro", "Moto", "Caminhão", "SUV"};

        for (int i = 0; i < 20; i++) {
            String placa = gerarPlacaAleatoria(random);

            Veiculo veiculo = new Veiculo(
                2000 + random.nextInt(24), // Ano entre 2000 e 2023
                tipos[random.nextInt(tipos.length)], // Tipo aleatório
                placa, // Placa gerada aleatoriamente
                modelos[random.nextInt(modelos.length)], // Modelo real de carro
                cores[random.nextInt(cores.length)] // Cor aleatória
            );

            veiculos.put(placa, veiculo);
        }
    }

    /**
     * Gera uma placa de veículo aleatória no formato "AAA-1234".
     * 
     * @param random Instância de Random usada para gerar valores aleatórios.
     * @return Uma placa de veículo única.
     */
    private static String gerarPlacaAleatoria(Random random) {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder placa = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            placa.append(letras.charAt(random.nextInt(letras.length())));
        }
        placa.append("-");
        for (int i = 0; i < 4; i++) {
            placa.append(random.nextInt(10));
        }
        placas.add(placa.toString());
        return placa.toString();
    }

    /**
     * Adiciona clientes com dados simulados à coleção.
     * Cada cliente é associado a um veículo previamente gerado.
     * 
     * @return A coleção de clientes gerada.
     */
    private static HashMap<Integer, Cliente> adicionarClientesAleatorios() {
        Random random = new Random();

        String[] nomes = {"João Silva", "Maria Oliveira", "Pedro Santos", "Ana Costa", "Lucas Pereira",
                          "Mariana Almeida", "Rafael Rodrigues", "Beatriz Sousa", "Carlos Mendes", "Fernanda Lopes"};
        String[] emails = {"joao@email.com", "maria@email.com", "pedro@email.com", "ana@email.com", "lucas@email.com",
                           "mariana@email.com", "rafael@email.com", "beatriz@email.com", "carlos@email.com", "fernanda@email.com"};
        String[] cpfs = {"123.456.789-01", "987.654.321-02", "111.222.333-03", "444.555.666-04", "777.888.999-05",
                         "222.333.444-06", "555.666.777-07", "888.999.111-08", "333.444.555-09", "666.777.888-10"};
        String[] telefones = {"(11) 98765-4321", "(21) 99876-5432", "(31) 91234-5678", "(41) 97654-3210", "(51) 98765-1234",
                              "(61) 93210-4567", "(71) 97890-1234", "(81) 96543-2109", "(91) 98765-6789", "(31) 94321-5678"};

        for (int i = 0; i < 10; i++) {
            Cliente cliente = new Cliente(
                nomes[i],
                cpfs[i],
                emails[i],
                telefones[i]
            );

            cliente.setVeiculo(veiculos.get(placas.get(i)));
            cliente.setDebito(random.nextDouble() * 1000);
            cliente.setTotalPago(random.nextDouble() * 5000);

            clientes.put(cliente.getId(), cliente);
        }

        return clientes;
    }

    /**
     * Adiciona serviços com dados simulados à coleção.
     * Cada serviço é associado a um cliente, veículo e funcionário.
     */
    private static void adicionarServicosAleatorios() {
        Random random = new Random();
        String[] metodosPagamento = {"Dinheiro", "Cartão", "PIX"};

        for (int i = 0; i < 10; i++) {
            Cliente cliente = clientes.get(i + 1);
            ArrayList<Veiculo> veiculosCliente = cliente.getVeiculos();
            Veiculo veiculo = veiculosCliente.get(random.nextInt(cliente.getVeiculos().size()));
            Funcionario funcionario = funcionarios.get(random.nextInt(funcionarios.size()) + 1);
            String metodo = metodosPagamento[random.nextInt(metodosPagamento.length)];
            Servico servico = new Servico(i + 1, random.nextDouble() * 2000, random.nextBoolean(), random.nextBoolean(), metodo, cliente, veiculo, funcionario);
            servicos.put(servico.getId(), servico);
        }
    }

    /**
     * Verifica se um CPF já está cadastrado no sistema.
     * 
     * @param objeto Tipo de objeto a ser verificado ("cliente" ou "funcionário").
     * @param campo CPF a ser validado.
     * @throws IllegalStateException Caso o CPF já esteja cadastrado.
     */
    public static void verificaCPF(String objeto, String campo) {
        HashMap tipo = (objeto.equals("cliente")) ? clientes : funcionarios;
        for (int i = 1; i < tipo.size(); i++) {
            if (tipo.get(i) != null) {
                if (((Pessoa) tipo.get(i)).getCpf().equals(campo)) {
                    throw new IllegalStateException("CPF já cadastrado!");
                }
            }
        }
    }

    /**
     * Adiciona 20 peças aleatórias ao estoque.
     * As peças são geradas com tipos, marcas e preços aleatórios.
     */
    private static void adicionarPecasAleatorias() {
        Random random = new Random();

        // Arrays de tipos e marcas pré-definidos para gerar peças aleatórias
        String[] tipos = {"Parafuso", "Porca", "Arruela", "Prego", "Chave"};
        String[] marcas = {"ACME", "Tramontina", "Vonder", "Bosch", "3M"};

        for (int i = 0; i < 20; i++) {
            // Gera valores aleatórios para tipo, marca e preço
            String tipo = tipos[random.nextInt(tipos.length)];
            String marca = marcas[random.nextInt(marcas.length)];
            double preco = 1.0 + (100.0 - 1.0) * random.nextDouble(); // Preço entre 1.0 e 100.0

            // Cria um novo TipoDePeca com os valores aleatórios
            TipoDePeca tipoDePeca = new TipoDePeca(tipo, marca, preco);

            // Adiciona a peça ao estoque com uma quantidade aleatória entre 1 e 10
            int quantidade = 1 + random.nextInt(10);
            Estoque.adicionarPeca(tipoDePeca, quantidade);
        }
    }
}