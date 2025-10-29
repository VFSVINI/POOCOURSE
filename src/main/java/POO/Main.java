package POO;

public class Main {
    public static void main(String[] args) {

       Pessoa p1 = new Pessoa();
       Pessoa p2 = new Pessoa("Vini","000",23,"00000");
       Pessoa p3 = new Pessoa("Vini",23,"000","00000");


       p1.setNome("PG");
       p1.setCpf("178.206.872-23");
       p1.setIdade(23);
       p1.setWhatsapp("8199522-4852");

       p1.apresentar();
       System.out.println(p1.getApresentacao());




    }


}


