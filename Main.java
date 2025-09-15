package atividadePooClassesVeiculos;

//Atividade 15/09/2025 - Faculdade ADS
// Criar classe pai com 5 atibutos, 3 metodos e 3 classes filhas, contendo 2 atributos e 2 metodos.


//? Classe pai
class Veiculos {
    String marca;
    String modelo;
    String cor;
    int anoFabricacao;
    int valor;

    //Construtor
    public Veiculos (String marca, String modelo, String cor, int anoFabricacao, int valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.valor = valor;
}


//Metodos
public void mostrarInfo() {
        System.out.println("\nMarca: " + marca + " | Modelo: " + modelo + " | Cor:" + cor + " | Ano de Fabricação: " + anoFabricacao + " | Valor:" + valor + "\n");
    }

public void andar() {
    System.out.println("O veículo estar andando...");
}

public void parar() {
    System.out.println("O veículo estar parado!");
}

public void buzinar() {
    System.out.println("O veículo estar buzinando...");
}
}

//? Classe filha 1
class Carro extends Veiculos {
    int quantidadePortas;
    int quantidadeLugares;

    //Construtor Filha 1
    public Carro(String marca, String modelo, String cor, int anoFabricacao, int valor, int quantidadePortas, int quantidadeLugares) {
        super(marca, modelo, cor, anoFabricacao, valor);
        this.quantidadePortas = quantidadePortas;
        this.quantidadeLugares = quantidadeLugares;
    }

    //Metodos Filha 1
    public void abrirMala() {
        System.out.println("A mala do carro estar aberta!");
    }

    public void ligarArcondicionado() {
        System.out.println("O ar-condicionado do carro estar ligado!");
    }
}

//? Classe filha 2
class Moto extends Veiculos {
    int cilindradas;
    String tipoCapacete;

    //Construtor Filha 2
    public Moto (String marca, String modelo, String cor, int anoFabricacao, int valor, int cilindradas, String tipoCapacete) {
        super(marca, modelo, cor, anoFabricacao, valor);
        this.cilindradas = cilindradas;
        this.tipoCapacete = tipoCapacete;
    }
    
    //Metodos Filha 2
    public void empinar() {
        System.out.println("Cuidado! Você  estar empinando a moto.");
    }

    public void colocarCapacete() {
        System.out.println("Capacete do tipo " + tipoCapacete + " colocado para pilotar a moto");
    }
}

//? Classe filha 3
class Caminhao extends Veiculos {
    int capacidadeCarga;
    int numeroEixos;

    //Construtor Filha 3
    public Caminhao (String marca, String modelo, String cor, int anoFabricacao, int valor, int capacidadeCarga, int numeroEixos) {
        super(marca, modelo, cor, anoFabricacao, valor);
        this.capacidadeCarga  = capacidadeCarga;
        this.numeroEixos = numeroEixos;
    }

    //Metodos Filha 3
    public void carregar() {
        System.out.println("Estão carregando o caminhão...");
    }

    public void descarregar() {
        System.out.println("Estão descarregando o caminhão...");
    }
}

//! Classe Main
public class Main {
    public static void main(String[] args) {
            Carro carro1 = new Carro ("Toyota", "Corolla", "Vermelho", 2025, 164590, 4, 4);
            carro1.mostrarInfo();
            carro1.abrirMala();
            carro1.ligarArcondicionado();

            Moto moto1 = new Moto ("Honda", "CB 500", "Preta", 2025, 4611000, 500, "Fechado"); 
            moto1.mostrarInfo();
            moto1.empinar();
            moto1.colocarCapacete();

            Caminhao caminhao1 = new Caminhao ("Volvo", "FH", "Branco", 2024, 270000, 74, 4);
            caminhao1.mostrarInfo();
            caminhao1.carregar();
            caminhao1.descarregar();
    }
}
