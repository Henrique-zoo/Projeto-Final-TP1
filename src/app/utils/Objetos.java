package app.utils;

import app.model.Cliente;
import app.model.Funcionario;
import app.model.Servico;
import app.model.Veiculo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Objetos {
    public final static HashMap<Integer, Funcionario> funcionarios;
    public final static HashMap<Integer, Cliente> clientes;
    public final static HashMap<String, Veiculo> veiculos;
    public final static HashMap<Integer, Servico> servicos;
    public final static ArrayList<String> placas;
    
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
    }

    private static void adicionarFuncionariosAleatorios() {
        funcionarios.put(1, new Funcionario(5000.0, "senha123", 1, "João Silva", "123.456.789-00", "joao@gmail.com", "11999999999"));
        funcionarios.put(2, new Funcionario(4500.0, "senha456", 2, "Maria Oliveira", "987.654.321-00", "maria@gmail.com", "21988888888"));
        funcionarios.put(3, new Funcionario(4800.0, "senha789", 3, "Pedro Santos", "111.222.333-44", "pedro@gmail.com", "31977777777"));
        funcionarios.put(4, new Funcionario(4700.0, "senha321", 4, "Ana Clara", "444.555.666-77", "ana@gmail.com", "41966666666"));
        funcionarios.put(5, new Funcionario(6000.0, "senha654", 5, "Carlos Pereira", "999.888.777-66", "carlos@gmail.com", "51955555555"));
        funcionarios.put(6, new Funcionario(5500.0, "senha987", 6, "Fernanda Souza", "222.333.444-55", "fernanda@gmail.com", "11988887777"));
        funcionarios.put(7, new Funcionario(5200.0, "senha111", 7, "Lucas Andrade", "666.777.888-99", "lucas@gmail.com", "21977776666"));
    }

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
                i + 1, // ID do cliente
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
}
