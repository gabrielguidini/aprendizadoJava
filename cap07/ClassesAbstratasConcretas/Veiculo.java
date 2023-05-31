package cap07.ClassesAbstratasConcretas;

public abstract class Veiculo {
    public int velocidade;
    public boolean status;
    public void ligar(){
        status = true;
    }
    public void desilgar(){
        status = false;
    }
    public void mostrarStatus(){
        System.out.println(status);
    }
    public abstract void acelerar();
}