 

import java.util.Scanner;

public class Cadastrar {
    public static void cadastrarObra(int idObra) {
        Scanner scanner = DiarioObras.scanner;

        int obraSolicitada;
        String nome;
        String responsavel;
        String contratante;
        String dataInicio;
        String dataTermino;
        int numContrato;
        String endereco;
        String status;

        System.out.println("Selecione o Tipo de Obra Solicitada:");
        System.out.println("1. Obra Publica");
        System.out.println("2. Obra Privada");
        System.out.print("\nInforme a opção desejada: ");
        obraSolicitada = scanner.nextInt();

        scanner.nextLine();
        System.out.print("\nDescrição da obra: ");
        nome = scanner.nextLine();

        System.out.print("Nome do responsável: ");
        responsavel = scanner.nextLine();

        System.out.print("Nome do contratante: ");
        contratante = scanner.nextLine();

        System.out.print("Data de início da obra: ");
        dataInicio = scanner.nextLine();

        System.out.print("Data de previsão de término da obra: ");
        dataTermino = scanner.nextLine();

        System.out.print("Número do contrato: ");
        numContrato = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Endereço da obra: ");
        endereco = scanner.nextLine();

        System.out.print("Status atual da obra: ");
        status = scanner.nextLine();

        if (obraSolicitada == 1) {
            String dataOrdemDeServico;
            String processoLicitatorio;

            System.out.print("Insira a data da ordem de serviço: ");
            dataOrdemDeServico = scanner.nextLine();

            System.out.print("Insira o tipo do processo licitatório: ");
            processoLicitatorio = scanner.nextLine();

            ObraPublica dados = new ObraPublica(idObra, nome, responsavel, contratante, dataInicio, dataTermino,
                    numContrato, endereco, status, dataOrdemDeServico, processoLicitatorio);

            DiarioObras.obras.add(dados);

        } else {
            String tipoDeObra;
            String fonteDeRecurso;

            System.out.print("Insira o tipo da obra: ");
            tipoDeObra = scanner.nextLine();

            System.out.print("Insira a fonte de recurso: ");
            fonteDeRecurso = scanner.nextLine();

            ObraPrivada dados = new ObraPrivada(idObra, nome, responsavel, contratante, dataInicio, dataTermino,
                    numContrato, endereco, status, tipoDeObra, fonteDeRecurso);

            DiarioObras.obras.add(dados);
        }

        System.out.println("\nObra Cadastrada.");
    }

    public static void criarRelatorio(int idRelatorio) {
        Scanner scanner = DiarioObras.scanner;

        String data;
        String tempo;
        String condicao;
        int idObra;

        System.out.println("\nListagem de Obras: ");
        for (Obra obras : DiarioObras.obras) {
            System.out.println(obras.getId() + " - " + obras.getNome());
        }

        System.out.print("\nInforme o ID da Obra: ");
        idObra = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Data do relatório: ");
        data = scanner.nextLine();

        System.out.print("Tempo: ");
        tempo = scanner.nextLine();

        System.out.print("Condição de trabalho: ");
        condicao = scanner.nextLine();

        Relatorio novoRelatorio = new Relatorio(idObra, data, condicao, tempo);

        DiarioObras.relatorio.add(novoRelatorio);

        System.out.println("\nRelatório Cadastrado.");
    }

}
