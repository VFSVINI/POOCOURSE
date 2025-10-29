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




    //Métodos,Ações,Comportamentos,Atividades
    /*
    1. Método Sem Retorno e Sem Parâmetro
    2. Método Sem Retorno e Com Parâmetro
    3. Método Com Retorno e Sem Parâmetro
    4. Método Com Retorno e Com Parâmetro
     */

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){

        return nome;

    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setWhatsapp(String whatsapp){
        this.whatsapp = whatsapp;
    }

    public String getWhatsapp(){
        return whatsapp;
    }


    public void apresentar(){

        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(idade);
        System.out.println(whatsapp);

    }

    public String getApresentacao(){

        return (nome+", "+cpf+", "+idade+","+whatsapp);
    }

}

