package exercicios.Cap7;

public class Brinquedos {
    private String nome;
    private Float preco;
    private String faixaEtaria;


    public void setPreco(Float preco){
        this.preco = preco;
    }
    public void setFaixaEtaria(String faixaEtaria){
        int aux = Integer.parseInt(faixaEtaria);
        if(aux>0){
            this.faixaEtaria = faixaEtaria;
            System.out.println("bombadb");
        }
    } 
    public void mostrar(){
        System.out.println(faixaEtaria);
        System.out.println(preco);
    }
}
