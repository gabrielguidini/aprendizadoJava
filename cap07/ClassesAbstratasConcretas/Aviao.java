package cap07.ClassesAbstratasConcretas;

public class Aviao extends Veiculo {
    @Override
    public void acelerar(){
        velocidade = velocidade + 10;
    }
}
