package cap03;

import java.io.*;
import javax.swing.*;;

public class UsoDoThrow{
    public static void main(String args[]) throws IOException {
        String aux = JOptionPane.showInputDialog(null,"frasesinha");
        try{
            FileWriter file = new FileWriter("c:/temp/frases.txt", true);
            PrintWriter out = new PrintWriter(file);
            out.println(aux);
            file.close();
            out.close();
            JOptionPane.showMessageDialog(null,"frase armazenada no dispositivo");
        } catch(FileNotFoundException error){
            JOptionPane.showMessageDialog(null, "erro, veirifique a pasta c:/temp existe");
        }
    }
}