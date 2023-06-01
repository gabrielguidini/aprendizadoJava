package cap07.ClassesAbstratasConcretas;

public class UsaVeiculo {
    public static void main(String[] args) {
        //Veiculo veiculo = new Veiculo(); // essa linha gera um erro
        Automovel automovel = new Automovel();
        automovel.ligar();
        System.out.println("putariaaa "+automovel.velocidade);
        automovel.acelerar();
        System.out.println(automovel.velocidade);
        automovel.desilgar();

        Aviao aviao = new Aviao();
        aviao.ligar();
        System.out.println("orgia de traveco "+automovel.velocidade);
        aviao.acelerar();
        System.out.println(aviao.velocidade);
        aviao.desilgar();
    }
}
