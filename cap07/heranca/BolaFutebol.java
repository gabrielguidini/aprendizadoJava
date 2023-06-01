package cap07.heranca;

public class BolaFutebol extends Bola { // extends faz a conexão entre a subclass(BolaFutebol.java) e superclass(Bola.java)
    private String tipo;
    public BolaFutebol(String cor, int tamanho, String tipo){
        super(cor,tamanho); // acessa os recursos da superclass(Bola), esse código em especifico acessa
                            // o metodo constructor da classe bola
        this.tipo = tipo;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println(tipo);
    }
}
