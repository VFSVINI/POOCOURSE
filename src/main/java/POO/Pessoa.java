package POO;

public class Pessoa {

    //Atributos - Características - Variáveis Que Armazenam Dados e Possuem Modificadores de Acesso

    private String nome;
    private String cpf;
    private int idade;
    private String whatsapp;

    //Construtores
    //Construtores Padrão

    public Pessoa(){

        nome = "";
        cpf = "";
        idade = 0;
        whatsapp = "";
    }

    //Construtor Recebendo Parâmetros

    public Pessoa(String nome, String cpf, int idade, String whatsapp) {

        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.whatsapp = whatsapp;
    }

    public Pessoa(String nome,int idade, String cpf, String whatsapp) {

        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.whatsapp = whatsapp;
    }




    //Métodos
}
