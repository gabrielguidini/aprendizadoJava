package cap07.heranca;

public class PessoaFisica extends Pessoa {
    private String rg;
    public void setRg(String rg){
        this.rg = rg;
    }
    public String getRg(){
        return(rg);
    }
    public void mostraClasse(){
        System.out.println("classe pessoa fisica");
    }
}
