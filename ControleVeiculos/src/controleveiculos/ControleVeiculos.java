package controleveiculos;

import java.util.ArrayList;
import java.util.Scanner;

/*
Este projeto foi INTEIRAMENTE arquitetado AO VIVO com nenhuma ajuda externa.
Para acessar as lives de programação entre em: https://www.youtube.com/watch?v=1Zb7kqS2RmU
Todas as lives também foram gravadas na plataforma da TWITCH: twitch.tv/tothxd
Autor: Gabriel Toth Gonçalves -  RA: N677244 - CC3P13
*/

public class ControleVeiculos {
    public static void main(String[] args) throws InterruptedException {
        Scanner b = new Scanner(System.in);
        String empresa = "";
        int escolha = 1;
        
        ArrayList<String> veiculos = new ArrayList();
        ArrayList<String> automovel = new ArrayList();
        ArrayList<String> moto = new ArrayList();
        ArrayList<String> caminhao = new ArrayList();
        ArrayList<String> motorista = new ArrayList();
        ArrayList<String> multaa = new ArrayList();
        ArrayList<String> multac = new ArrayList();
        ArrayList<String> multam = new ArrayList();
        ArrayList<String> multamo = new ArrayList();
        ArrayList<String> rmultaa = new ArrayList();
        ArrayList<String> rmultac = new ArrayList();
        ArrayList<String> rmultam = new ArrayList();
        ArrayList<String> rmultamo = new ArrayList();
        
        while (empresa.isEmpty()) {
            System.out.print("Nome da Empresa: ");
            empresa = trimAll(b.nextLine());
        }
        
        //Looping para escolhas diferentes de 0
        while (escolha != 0) {
            
            //Bloco empresa
            line();
            System.out.print("SISTEMA DA EMPRESA: " + empresa + 
                    "\nDeseja adicionar ou remover algo do seu catálogo?" + 
                    "\n1 - Adicionar" + "\n2 - Remover" + "\n3 - Visualizar" + 
                    "\nLembrando: Você pode finalizar o programa a qualquer " +
                    "hora digitando: 0 " +
                    "(Zero)\nDigite: ");
            String add = trimAll(b.nextLine());
            
            
            switch (add) {
                case "0" -> escolha = 0;
                //Bloco de adição
                case "1" -> {
                    while (!add.equals("0")) {
                        System.out.print("""
                                                                 Disponíveis:
                                                                 1 - Automóvel
                                                                 2 - Caminhão
                                                                 3 - Moto
                                                                 4 - Motorista
                                                                 5 - Multar
                                                                 0 - Sair
                                                                 6 - Voltar
                                                                 Digite:  """);
                        add = trimAll(b.nextLine());
                        
                        
                        switch (add) {
                            //Automovel
                            case "1" -> {
                                System.out.print("0 - Para sair\n4 - Voltar\nQual o modelo do carro: ");
                                add = trimAll(b.nextLine());
                                if (add.isEmpty() || add.isBlank()) {
                                    System.out.println("??? É o carro do batman pra não ter nome nem modelo?");
                                    Thread.sleep(2000);
                                } else if (add.equals("0")) {
                                    System.out.println("Saindo do sistema de Automóvel");
                                    Thread.sleep(2000);
                                } else if (add.equals("4")) {
                                    System.out.println("Voltando à página de veículos.");
                                    Thread.sleep(2000);
                                } else {
                                    automovel.add(add);
                                    System.out.println("Modelo Adicionado, voltando ao menu principal");
                                    Thread.sleep(2000);
                                }
                                
                            }
                            //Caminhão
                            case "2" -> {
                                System.out.print("0 - Para sair\n4 - Voltar\nQual o modelo do caminhão: ");
                                add = trimAll(b.nextLine());
                                if (add.isEmpty() || add.isBlank()) {
                                    System.out.println("??? Caminhão do tráfego? Pq até eles tem modelo e o seu não?");
                                    Thread.sleep(2000);
                                } else if (add.equals("0")) {
                                    System.out.println("Saindo do sistema de Caminhões");
                                    Thread.sleep(2000);
                                } else if (add.equals("4")) {
                                    System.out.println("Voltando à página de veículos.");
                                    Thread.sleep(2000);
                                } else {
                                    caminhao.add(add);
                                    System.out.println("Modelo Adicionado, voltando ao menu principal");
                                    Thread.sleep(2000);
                                }
                                
                            }
                            //Moto
                            case "3" -> {
                                System.out.print("0 - Para sair\n4 - Voltar\nQual o modelo da moto: ");
                                add = trimAll(b.nextLine());
                                if (add.isEmpty() || add.isBlank()) {
                                    System.out.println("??? Moto roubada pra não dizer modelo ou o que?");
                                    Thread.sleep(2000);
                                } else if (add.equals("0")) {
                                    System.out.println("Saindo do sistema de Motos");
                                    Thread.sleep(2000);
                                } else if (add.equals("4")) {
                                    System.out.println("Voltando à página de veículos.");
                                    Thread.sleep(2000);
                                } else {
                                    moto.add(add);
                                    System.out.println("Modelo Adicionado, voltando ao menu principal");
                                    Thread.sleep(2000);
                                }
                                
                            }
                            //Motorista
                            case "4" -> {
                                System.out.print("0 - Para sair\n4 - Voltar\nQuem dirige: ");
                                add = trimAll(b.nextLine());
                                if (add.isEmpty() || add.isBlank()) {
                                    System.out.println("Motorista anônimo? Ou o carro é autônomo? KKKK");
                                    Thread.sleep(2000);
                                } else if (add.equals("0")) {
                                    System.out.println("Saindo do sistema de Motos");
                                    Thread.sleep(2000);
                                } else if (add.equals("4")) {
                                    System.out.println("Voltando à página de veículos.");
                                    Thread.sleep(2000);
                                } else if (motorista.contains(add)) {
                                    System.out.println("Você ja contratou " + add + "\nPelo jeito essa pessoa trabalha tão bem que você quer contratar novamente.");
                                } else {
                                    motorista.add(add);
                                    System.out.println("Motorista Adicionado, voltando ao menu principal");
                                    Thread.sleep(2000);
                                }
                                
                            }
                            //Multa
                            case "5" -> {
                                System.out.print("'s' - Para sair\n'v' - Ver tabela de motoristas\nQuem será multado?: ");
                                add = trimAll(b.nextLine().toLowerCase());
                                if (add.isEmpty() || add.isBlank()) {
                                    System.out.println("O gasparzinho foi multado?");
                                    Thread.sleep(2000);
                                } else if (add.equals("s")) {
                                    System.out.println("Saindo do sistema de Multas");
                                    Thread.sleep(2000);
                                } else if (add.equals("v")) {
                                    System.out.println("N° dos Motoristas:");
                                    for (int i=0; i<motorista.size(); i++) {
                                        System.out.println(i + "° Motorista: " + motorista.get(i));
                                    }
                                    Thread.sleep(5000);
                                } else if (isNumeric(add)){
                                    if (Integer.parseInt(add) < motorista.size()) {
                                        System.out.println("Nome Adicionado.");
                                        boolean ver = false;
                                        veiculos = instanciarVeiculos(automovel, caminhao, moto, veiculos);
                                        while (!ver) { //////////////////* Talvez esteja errado
                                            System.out.print("Qual o veículo a ser multado?\n's' - Sair\n'v' - Ver tabela de numeração dos veículos declarados\nDigite: ");
                                            String g = trimAll(b.nextLine().toLowerCase());
                                            if (g.equals("s")) {
                                                add = "0";
                                                ver = true;
                                            } else if (g.equals("v")) {
                                                if (quantidadeVeiculos(automovel, caminhao, moto) == 0) {
                                                    System.out.println("Não tem veículos instancidos");
                                                } else {
                                                    System.out.println("Veículos disponíveis:");
                                                    mostrarVeiculos(automovel, caminhao, moto, veiculos);
                                                }
                                            } else if (isNumeric(g)){
                                                int tam = Integer.parseInt(g);
                                                if (tam < veiculos.size()) {
                                                    int tama = quantidadeAutomovel(automovel);
                                                    int tamc = quantidadeCaminhao(caminhao);
                                                    int tamm = quantidadeMoto(moto);
                                                    
                                                    //Array com multas em suas devidas posições
                                                    if (tam < tama) {
                                                        multaa.add(Integer.toString(tam));
                                                        multaa.add(add);
                                                    } else if (tam < tama + tamc) {
                                                        multac.add(Integer.toString(tam - tama));
                                                        multac.add(add);
                                                    } else if (tam < tama + tamc + tamm) {
                                                        multam.add(Integer.toString(tam - tama - tamc));
                                                        multam.add(add);
                                                    }
                                                    
                                                    System.out.println("Veículo e Motorista Multado");
                                                    
                                                    ver = true;
                                                } else {
                                                    System.out.println("O numero referente ao veículo está inválido");
                                                    Thread.sleep(2000);
                                                }
                                            } else {
                                                System.out.println("Seu parâmetro não se refere ao número de nenhum dos veículos.");
                                                Thread.sleep(2000);
                                            }
                                        }
                                    }
                                    
                                } else {
                                    System.out.println("É impossivel multar alguem que não está na sua empresa.");
                                }
                                //Voltar à página veiculos
                            }
                            case "6" -> {
                                System.out.println("Voltado à página principal.");
                                Thread.sleep(5000);
                                add = "0";
                                //Voltar à página principal
                            }
                            case "0" -> escolha = 0;
                            //Alguem ajuda esse usuário
                            default -> {
                                System.out.println("É pegadinha? Vc ta sendo pago pra fazer isso comigo? " +
                                        "É só escolher entre 0, 1, 2, 3 ou 4.");
                                Thread.sleep(5000);
                            }
                        }
                    }
                    //Bloco de remoção
                }
                case "2" -> {
                    while (!add.equals("0")) {
                        System.out.print("""
                                                                 Disponíveis para remover:
                                                                 1 - Veiculos para remoção
                                                                 2 - Motoristas
                                                                 3 - Multa
                                                                 4 - Voltar
                                                                 Digite:  """);
                        add = trimAll(b.nextLine());
                        
                        //Automovel
                        switch (add) {
                            case "1" -> {
                                mostrarVeiculos(automovel, caminhao, moto, veiculos);
                                System.out.print("'s' - Para sair\nQual o numero do veículo: ");
                                add = trimAll(b.nextLine());
                                if (add.isEmpty() || add.isBlank()) {
                                    System.out.println("??? É o carro do batman pra não ter nome nem modelo?");
                                    Thread.sleep(2000);
                                } else if (add.equals("s")) {
                                    System.out.println("Saindo do sistema de Automóvel");
                                    add = "0";
                                    Thread.sleep(2000);
                                } else if (isNumeric(add)){
                                    if (Integer.parseInt(add) < automovel.size()) {
                                        automovel.remove(Integer.parseInt(add));
                                        veiculos.remove(Integer.parseInt(add));
                                    } else if (Integer.parseInt(add) < automovel.size() + caminhao.size()) {
                                        caminhao.remove(Integer.parseInt(add) - automovel.size());
                                        veiculos.remove(Integer.parseInt(add));
                                    } else if (Integer.parseInt(add) < automovel.size() + caminhao.size() + moto.size()) {
                                        caminhao.remove(Integer.parseInt(add) - automovel.size() - caminhao.size());
                                        veiculos.remove(Integer.parseInt(add));
                                    }
                                    
                                }
                                //Motorista
                            }
                            case "2" -> {
                                System.out.print("'s' - Para sair\n'v' - Ver tabela de motoristas\nQuem será multado?: ");
                                add = trimAll(b.nextLine().toLowerCase());
                                if (add.isEmpty() || add.isBlank()) {
                                    System.out.println("O gasparzinho foi multado?");
                                    Thread.sleep(2000);
                                } else if (add.equals("s")) {
                                    System.out.println("Saindo do sistema de Multas");
                                    Thread.sleep(2000);
                                } else if (add.equals("v")) {
                                    System.out.println("N° dos Motoristas:");
                                    for (int i=0; i<motorista.size(); i++) {
                                        System.out.println(i + "° Motorista: " + motorista.get(i));
                                    }
                                    Thread.sleep(5000);
                                } else if (isNumeric(add)){
                                    motorista.remove(motorista.get(Integer.parseInt(add)));
                                }
                                //Multa
                            }
                            case "3" -> {
                                System.out.println("Tabela multa: Posição 0x0 à NxN");
                                mostrarMultas(multaa, multac, multam, multamo, rmultaa, rmultac, rmultam, rmultamo, motorista, automovel, caminhao, moto);
                                System.out.println("Motoristas:");
                                for (int i=0; i<motorista.size(); i++) {
                                    System.out.println(i + "° Motorista: " + motorista.get(i));
                                }
                                System.out.print("'s' - Para sair\nPessoa que será retirada a multa?: ");
                                add = trimAll(b.nextLine().toLowerCase());
                                if (add.isEmpty() || add.isBlank()) {
                                    System.out.println("O gasparzinho foi multado?");
                                    Thread.sleep(2000);
                                } else if (add.equals("s")) {
                                    System.out.println("Saindo do sistema de Multas");
                                    Thread.sleep(2000);
                                } else if (isNumeric(add)){
                                    System.out.println("Veículos disponíveis para remoção");
                                    mostrarVeiculos(automovel, caminhao, moto, veiculos);
                                    System.out.print("'s' - Para sair\nVeículo que será retirada a multa?: ");
                                    String x = trimAll(b.nextLine().toLowerCase());
                                    if (add.isEmpty() || add.isBlank()) {
                                        System.out.println("O gasparzinho foi multado?");
                                        Thread.sleep(2000);
                                    } else if (add.equals("s")) {
                                        System.out.println("Saindo do sistema de Multas");
                                        Thread.sleep(2000);
                                    } else if (isNumeric(x)) {
                                        if (Integer.parseInt(x) < automovel.size()) {
                                            rmultaa.add(add);
                                            rmultaa.add(x);
                                        } else if (Integer.parseInt(x) < automovel.size() + caminhao.size()) {
                                            rmultaa.add(add);
                                            rmultac.add(x);
                                        } else if (Integer.parseInt(x) < veiculos.size()) {
                                            rmultaa.add(add);
                                            rmultam.add(x);
                                        } else {
                                            System.out.println("Número fora da quantidade de veículos");
                                        }
                                    } else {
                                    System.out.println("É pra escolher um número plausível.");
                                    }
                                }
                                
                            }
                            //Voltar à página veiculos
                            case "4" -> {
                                System.out.println("Voltado à página principal.");
                                Thread.sleep(5000);
                                add = "0";
                                //Voltar à página principal
                            }
                            
                            //Alguem ajuda esse usuário
                            default -> {
                                System.out.println("É pegadinha? Vc ta sendo pago pra fazer isso comigo? ");
                                Thread.sleep(5000);
                            }
                        }
                    }
                    
                }
                case "3" -> {
                    //Bloco para vetorizar TUDO em suas devidas classes
                    int s = veiculos.size();
                    //Tabela
                    System.out.print("""
                                                         Tabela de Visualização
                                                         1 - Todos os veículos
                                                         2 - Todos os motoristas
                                                         3 - Todas as Multas
                                                         --------
                                                         Seçãoo 2
                                                         --------
                                                         4 - Automóveis
                                                         5 - Caminhão
                                                         6 - Moto
                                                         Qual desse itens desejas?  """);
                    add = trimAll(b.nextLine());
                    //Tabela Veiculos
                    switch (add) {
                        case "1" -> {
                            if (s > 0) {
                                System.out.println("Tabela de Veículos: ");
                                for (int i=0; i<s; i++) {
                                    System.out.println(i + " - " + veiculos.get(i));
                                }
                            } else {
                                System.out.println("Não há veículos inseridos.");
                                Thread.sleep(1000);
                                System.out.println("Voltando para o menu principal");
                                Thread.sleep(2000);
                            }
                            //Tabela motoristas
                        }
                        case "2" -> {
                            System.out.println("Tabela de Motoristas:");
                            mostrarMotoristas(motorista);
                            Thread.sleep(5000);
                            //Tabela Multas
                        }
                        case "3" -> {
                            System.out.println("Tabela de Multas");
                            mostrarMultas(multaa, multac, multam, multamo, rmultaa, rmultac, rmultam, rmultamo, motorista, automovel, caminhao, moto);
                            Thread.sleep(5000);
                        }
                        case "4" -> {
                            System.out.println("Automóveis: ");
                            for (int i = 0; i < automovel.size(); i++) {
                                System.out.println(i + " - " + automovel.get(i));
                            }
                            Thread.sleep(5000);
                        }
                        case "5" -> {
                            System.out.println("Caminhão: ");
                            for (int i = 0; i < caminhao.size(); i++) {
                                System.out.println(i + " - " + caminhao.get(i));
                            }
                            Thread.sleep(5000);
                        }
                        case "6" -> {
                            System.out.println("Automóveis: ");
                            for (int i = 0; i < moto.size(); i++) {
                                System.out.println(i + " - " + moto.get(i));
                            }
                            Thread.sleep(5000);
                        }
                        default -> {
                            System.out.println("Cringe... Genteeeeeeeeeee são 6 numéros. APENAS 6 NÚMEROS.");
                            Thread.sleep(5000);
                        }
                    }
                }
                //Bloco de: O que o usuário está fazendo????
                default -> {
                    line();
                    System.out.println("Pelo amor de GOD, são apenas 3 opções." +
                            "0, 1 ou 2, não é dificil digita-las.");
                    Thread.sleep(5000);
                }
            }
            
        }
    }    
    
    //Limpa a tela
    public static void line() {
        for (int z = 0; z < 30; z++){
            System.out.println("");
        }
    }
    
    //Remove os espaços desnecessários
    public static String trimAll(String text){
	String string = text.trim();
	while (string.contains("  ")) {
		string = string.replaceAll("  ", " ");
	}
	return string;
    }
    
    
    
    public static void mostrarMultas(ArrayList<String> multaa,ArrayList<String> multac, ArrayList<String> multam, ArrayList<String> multamo,
            ArrayList<String> rmultaa,ArrayList<String> rmultac, ArrayList<String> rmultam, ArrayList<String> rmultamo,
            ArrayList<String> motorista, ArrayList<String> automovel, ArrayList<String> caminhao, ArrayList<String> moto) throws InterruptedException {
        
        Automovel aut[] = new Automovel[quantidadeAutomovel(automovel)];
        for (int i=0; i<automovel.size(); i++) {
            aut[i] = new Automovel(automovel.get(i));
        }
        Caminhao cam[] = new Caminhao[quantidadeCaminhao(caminhao)];
        for (int i=0; i<caminhao.size(); i++) {
            cam[i] = new Caminhao(caminhao.get(i));
        }
        Moto mot[] = new Moto[quantidadeMoto(moto)];
        for (int i=0; i<quantidadeMoto(moto); i++) {
            mot[i] = new Moto(moto.get(i));
        }
        Motorista mo[] = new Motorista[motorista.size()];
        for (int i=0; i<motorista.size(); i++) {
            mo[i] = new Motorista(motorista.get(i));
        }
        Multa x[][] = new Multa[motorista.size()][automovel.size() + caminhao.size() + moto.size()];
        
        for (int i = 0; i <motorista.size(); i++) {
            for (int j = 0; j < automovel.size(); j++) {
                x[i][j] = new Multa(mo[i], aut[j]);
            }
            for (int j = 0; j < caminhao.size(); j++) {
                x[i][j] = new Multa(mo[i], cam[j]);
            }
            for (int j = 0; j < moto.size(); j++) {
                x[i][j] = new Multa(mo[i], mot[j]);
            }
        }
        System.out.println("");
        
        for (int i=0; i<multaa.size(); i++) {
            int o = 0, k = 0;
            if (i%2 == 0) {
                mo[Integer.parseInt(multaa.get(i))].setMulta(mo[Integer.parseInt(multaa.get(i))].getMulta() + 1);
                o = Integer.parseInt(multaa.get(i));
            } else {
                aut[Integer.parseInt(multaa.get(i))].setMulta(aut[Integer.parseInt(multaa.get(i))].getMulta() + 1);
                k = Integer.parseInt(multaa.get(i));
                x[o][k].setMulta(x[o][k].getMulta() + 1);
            }
            
        }
        for (int i=0; i<multac.size(); i++) {
            int o = 0, k = 0;
            if (i%2 == 0) {
                mo[Integer.parseInt(multac.get(i))].setMulta(mo[Integer.parseInt(multac.get(i))].getMulta() + 1);
                o = Integer.parseInt(multac.get(i));
            } else {
                cam[Integer.parseInt(multac.get(i))].setMulta(cam[Integer.parseInt(multac.get(i))].getMulta() + 1);
                k = Integer.parseInt(multac.get(i));
                x[o][k].setMulta(x[o][k].getMulta() + 1);
            }
        }
        for (int i=0; i<multam.size(); i++) {
            int o = 0, k = 0;
            if (i%2 == 0) {
                mo[Integer.parseInt(multam.get(i))].setMulta(mo[Integer.parseInt(multam.get(i))].getMulta() + 1);
                o = Integer.parseInt(multaa.get(i));
            } else {
                mot[Integer.parseInt(multam.get(i))].setMulta(mot[Integer.parseInt(multam.get(i))].getMulta() + 1);
                k = Integer.parseInt(multam.get(i));
                x[o][k].setMulta(x[o][k].getMulta() + 1);
            }
        }
        
        
        
        //Remoção das multas
        for (int i=0; i<rmultaa.size(); i++) {
            int o = 0, k = 0;
            if (i%2 == 0) {
                mo[Integer.parseInt(rmultaa.get(i))].setMulta(mo[Integer.parseInt(rmultaa.get(i))].getMulta() - 1);
                o = Integer.parseInt(rmultaa.get(i));
            } else {
                aut[Integer.parseInt(rmultaa.get(i))].setMulta(aut[Integer.parseInt(rmultaa.get(i))].getMulta() - 1);
                k = Integer.parseInt(rmultaa.get(i));
                x[o][k].setMulta(x[o][k].getMulta() - 1);
            }
            
        }
        for (int i=0; i<rmultac.size(); i++) {
            int o = 0, k = 0;
            if (i%2 == 0) {
                mo[Integer.parseInt(rmultac.get(i))].setMulta(mo[Integer.parseInt(rmultac.get(i))].getMulta() - 1);
                o = Integer.parseInt(rmultac.get(i));
            } else {
                cam[Integer.parseInt(rmultac.get(i))].setMulta(cam[Integer.parseInt(rmultac.get(i))].getMulta() - 1);
                k = Integer.parseInt(rmultac.get(i));
                x[o][k].setMulta(x[o][k].getMulta() - 1);
            }
        }
        for (int i=0; i<rmultam.size(); i++) {
            int o = 0, k = 0;
            if (i%2 == 0) {
                mo[Integer.parseInt(rmultam.get(i))].setMulta(mo[Integer.parseInt(rmultam.get(i))].getMulta() - 1);
                o = Integer.parseInt(rmultaa.get(i));
            } else {
                mot[Integer.parseInt(rmultam.get(i))].setMulta(mot[Integer.parseInt(rmultam.get(i))].getMulta() - 1);
                k = Integer.parseInt(rmultam.get(i));
                x[o][k].setMulta(x[o][k].getMulta() - 1);
            }
        }
        
        
        
        //Visualizar Matriz multa
        for (int i = 0; i < mo[0].getNome().length(); i++) {
            System.out.print(" ");
        }
        System.out.print(" | ");
        for (int i = 0; i < automovel.size(); i++) {
            System.out.print(aut[i].getModelo() + " | ");
        }
        for (int i = 0; i < caminhao.size(); i++) {
            System.out.print(cam[i].getModelo() + " | ");
        }
        for (int i = 0; i < moto.size(); i++) {
            System.out.print(mot[i].getModelo() + " | ");
        }
        System.out.println("");
        int cont = 0;
        for (int i = 0; i <motorista.size(); i++) {
            System.out.print(mo[i].getNome() + " - ");
            for (int j = 0; j < automovel.size(); j++) {
                if (x[i][cont] == null) {
                    System.out.print("0 | ");
                } else {
                    System.out.print(x[i][cont].getMulta() + " | ");
                }
                
                cont++;
            }
            for (int j = 0; j < caminhao.size(); j++) {
                if (x[i][cont] == null) {
                    System.out.print("0 | ");
                } else {
                    System.out.print(x[i][cont].getMulta() + " | ");
                }
                cont++;
            }
            for (int j = 0; j < moto.size(); j++) {
                if (x[i][cont] == null) {
                    System.out.print("0 | ");
                } else {
                    System.out.print(x[i][cont].getMulta() + " | ");
                }
                cont++;
            }
            cont = 0;
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Veículos:");
        int y = 0;
        
        for (int i=0; i<automovel.size(); i++) {
            System.out.println(y + " - Automóvel - " + aut[i].getModelo() + " tem " + aut[i].getMulta());
            y++;
        }
        for (int i=0; i<caminhao.size(); i++) {
            System.out.println(y + " - Caminhao - " + cam[i].getModelo() + " tem " + cam[i].getMulta());
            y++;
        }
        for (int i=0; i<moto.size(); i++) {
            System.out.println(y + " - Moto - " + mot[i].getModelo() + " tem " + mot[i].getMulta());
            y++;
        }
        
        System.out.println("Motoristas:");
        for (int i=0; i<motorista.size(); i++) {
            System.out.println(i + " - Motorista - " + mo[i].getNome() + " tem " + mo[i].getMulta());
        }
        System.out.println("Pausa de 10s para leitura");
        Thread.sleep(10000);
    }
    
    public static void mostrarVeiculos(ArrayList<String> automovel, ArrayList<String> caminhao,
            ArrayList<String> moto, ArrayList<String> veiculos) {
        veiculos = instanciarVeiculos(automovel, caminhao, moto, veiculos);
        for (int i=0; i<veiculos.size(); i++) {
            System.out.print(i);
            if (i<automovel.size()) {
                System.out.print(" - Automovel - ");
            } else if (i<automovel.size() + caminhao.size()) {
                System.out.println(" - Caminhão - ");
            } else {
                System.out.println(" - Moto - ");
            }
            System.out.println(veiculos.get(i));
        }
    }
    
    public static void mostrarMotoristas(ArrayList<String> motorista) {
        motorista = instanciarMotorista(motorista);
        int s = motorista.size();
        for (int i=0; i<s; i++) {
            System.out.println(i + " - " + motorista.get(i));
        }
    }
    
    public static ArrayList<String> instanciarMotorista(ArrayList<String> motorista){
        int t = motorista.size();
        if (t > 0) {
            Motorista n[] = new Motorista[t];
            for (int i=0; i<t; i++) {
                n[i] = new Motorista(motorista.get(i));
            }
        }
        return motorista;
    }
    
    public static ArrayList<String> instanciarVeiculos(ArrayList<String> automovel, ArrayList<String> caminhao,
            ArrayList<String> moto, ArrayList<String> veiculos) {
        int q = quantidadeCaminhao(caminhao);
        int r = quantidadeMoto(moto);
        int s = quantidadeVeiculos(automovel, caminhao, moto);
        int soma = quantidadeAutomovel(automovel);
        int backup = 0;
        veiculos.clear();

        if (s > 0) {
            Veiculo v[] = new Veiculo[s];
            for (int i=backup; i<soma; i++) {
                v[i] = new Veiculo(automovel.get(i));
                veiculos.add(automovel.get(i));
            }
            backup = soma;
            soma += q;
            for (int i=backup; i<soma; i++) {
                v[i] = new Veiculo(caminhao.get(i - backup));
                veiculos.add(caminhao.get(i - backup));
            }
            backup = soma;
            soma += r;
            for (int i=backup; i<soma; i++) {
                v[i] = new Veiculo(moto.get(i - backup));
                veiculos.add(moto.get(i - backup));
            }

        }
        return veiculos;
    }

    public static int quantidadeVeiculos(ArrayList<String> automovel, ArrayList<String> caminhao,
            ArrayList<String> moto) {
        int p = automovel.size();
        int q = caminhao.size();
        int r = moto.size();
        return p + q + r;
    }
    
    public static int quantidadeAutomovel(ArrayList<String> automovel) {
        return automovel.size();
    }
    
    public static int quantidadeCaminhao(ArrayList<String> caminhao) {
        return caminhao.size();
    }
    
    public static int quantidadeMoto(ArrayList<String> moto) {
        return moto.size();
    }
    
    //Verifica se uma String é numérica
    public static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
}
