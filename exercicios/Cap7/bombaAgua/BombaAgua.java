package exercicios.Cap7.bombaAgua;

public class BombaAgua {
    public void ligar(int x){ //Thred.sleep() necessita de try/catch
        this.checkStatus = true;
            if(x>0){
                for(int i = x; i>0;i--){
                    System.out.println("Segundos restantes: "+x);
                    try{
                        Thread.sleep(1000); //o parametro do metodo é feito com milissegundos, logo *10
                    } catch (Exception error){
                        System.out.println("acorreu um erro"+ error);
                    }
                } 
            }
    } public void desligar(){
        this.checkStatus = false;   
    }
    private boolean checkStatus;
    public BombaAgua(){
        this.checkStatus = false;
    }
}
