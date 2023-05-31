package cap07.POOComDados;

import java.io.*;

public class ProdutoPersiste extends Produto {
    public String gravar(){
        String ret = "produto armazenado com sucesso";
        try{
            FileOutputStream file = new FileOutputStream("C:/Users/gsgui/OneDrive - Univille/CURSOS/java/cap07/POOComDados/produto"+this.getCodigo());
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(this);
            stream.flush();
        }
        catch (Exception error){
            ret = "Falha na gravação\n"+error.toString();
        }
        return ret;
    }
    public static Produto ler(int codigo){
        try{
            FileInputStream file = new FileInputStream("C:/Users/gsgui/OneDrive - Univille/CURSOS/java/cap07/POOComDados/produto"+codigo);
            ObjectInputStream stream = new ObjectInputStream(file);
            return((Produto) stream.readObject());
        } catch (Exception error){
            System.out.println("Falha na leitura\n"+error.toString());
            return null;
        }
    }
}
