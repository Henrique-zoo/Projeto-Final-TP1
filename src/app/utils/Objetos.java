/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.utils;

import app.model.Cliente;
import app.model.Funcionario;
import app.model.Servico;
import app.model.Veiculo;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author henri
 */
public class Objetos {
    public static HashMap<Integer, Funcionario> funcionarios;
    public static HashMap<Integer, Cliente> clientes;
    public static HashMap<Integer, Veiculo> veiculos;
    public static HashMap<Integer, Servico> servicos;

    public Objetos() {
        funcionarios = new HashMap<>();
        adicionarFuncionariosAleatorios();
        veiculos = new HashMap<>();
        adicionarVeiculosAleatorios();
        clientes = new HashMap<>();
        adicionarClientesAleatorios();
        servicos = new HashMap<>();
    }

    private void adicionarFuncionariosAleatorios() {
        funcionarios.put(1, new Funcionario(5000.0, "senha123", 1, "João Silva", "123.456.789-00", "joao@gmail.com", "11999999999"));
        funcionarios.put(2, new Funcionario(4500.0, "senha456", 2, "Maria Oliveira", "987.654.321-00", "maria@gmail.com", "21988888888"));
        funcionarios.put(3, new Funcionario("senha789", 3, "Pedro Santos", "111.222.333-44", "pedro@gmail.com", "31977777777"));
        funcionarios.put(4, new Funcionario("senha321", 4, "Ana Clara", "444.555.666-77", "ana@gmail.com", "41966666666"));
        funcionarios.put(5, new Funcionario(6000.0, "senha654", 5, "Carlos Pereira", "999.888.777-66", "carlos@gmail.com", "51955555555"));
    }
 
    private static HashMap<Integer, Veiculo> adicionarVeiculosAleatorios() {
        Random random = new Random();

        String[] tipos = {"Carro", "Moto", "Caminhão", "SUV"};
        String[] modelos = {"Modelo A", "Modelo B", "Modelo C", "Modelo D"};
        String[] cores = {"Vermelho", "Azul", "Preto", "Branco", "Prata"};

        for (int i = 0; i < 20; i++) {
            Veiculo veiculo = new Veiculo(
                i + 1, // ID do veículo
                2000 + random.nextInt(23), // Ano entre 2000 e 2022
                tipos[random.nextInt(tipos.length)], // Tipo aleatório
                modelos[random.nextInt(modelos.length)], // Modelo aleatório
                cores[random.nextInt(cores.length)] // Cor aleatória
            );

            veiculos.put(veiculo.getId(), veiculo);
        }

        return veiculos;
    }
    
    private static HashMap<Integer, Cliente> adicionarClientesAleatorios() {
        Random random = new Random();

        String[] nomes = {
            "João Silva", "Maria Oliveira", "Pedro Santos", "Ana Costa", "Lucas Pereira",
            "Mariana Almeida", "Rafael Rodrigues", "Beatriz Sousa", "Carlos Mendes", "Fernanda Lopes",
            "José Carvalho", "Clara Nogueira", "Ricardo Lima", "Luiza Araújo", "Fábio Barros",
            "Sofia Ribeiro", "Tiago Cunha", "Isabela Martins", "Gabriel Teixeira", "Larissa Monteiro"
        };

        String[] emails = {
            "joao@email.com", "maria@email.com", "pedro@email.com", "ana@email.com", "lucas@email.com",
            "mariana@email.com", "rafael@email.com", "beatriz@email.com", "carlos@email.com", "fernanda@email.com",
            "jose@email.com", "clara@email.com", "ricardo@email.com", "luiza@email.com", "fabio@email.com",
            "sofia@email.com", "tiago@email.com", "isabela@email.com", "gabriel@email.com", "larissa@email.com"
        };

        String[] cpfs = {
            "123.456.789-01", "987.654.321-02", "111.222.333-03", "444.555.666-04", "777.888.999-05",
            "222.333.444-06", "555.666.777-07", "888.999.111-08", "333.444.555-09", "666.777.888-10",
            "999.111.222-11", "444.555.666-12", "777.888.999-13", "111.222.333-14", "888.999.111-15",
            "222.333.444-16", "555.666.777-17", "333.444.555-18", "666.777.888-19", "999.111.222-20"
        };

        String[] telefones = {
            "(11) 98765-4321", "(21) 99876-5432", "(31) 91234-5678", "(41) 97654-3210", "(51) 98765-1234",
            "(61) 93210-4567", "(71) 97890-1234", "(81) 96543-2109", "(91) 98765-6789", "(31) 94321-5678",
            "(41) 98760-4321", "(51) 97654-2109", "(11) 98765-8901", "(21) 96543-1234", "(31) 93210-7890",
            "(41) 98765-6789", "(51) 91234-5678", "(61) 96543-8901", "(71) 98760-4321", "(81) 97890-5678"
        };

        for (int i = 0; i < 20; i++) {
            Cliente cliente = new Cliente(
                i + 1, // ID do cliente
                nomes[i],
                cpfs[i],
                emails[i],
                telefones[i]
            );
            
            cliente.setVeiculo(veiculos.get(i));
            // Atribuindo valores aleatórios para débito e totalPago
            cliente.setDebito(random.nextDouble() * 1000); // Débito aleatório entre 0 e 1000
            cliente.setTotalPago(random.nextDouble() * 5000); // Total pago aleatório entre 0 e 5000

            clientes.put(cliente.getId(), cliente);
        }

        return clientes;
    }
    
    public static void adicionarServico(Servico servico) {
        servicos.put(servico.getId(), servico);
    }
}
