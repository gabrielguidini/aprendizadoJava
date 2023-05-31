package exercicios.Cap6;


public class Senha {
    public static int getSenha()/*int getSenha(int x)*/ {
        int[] number = new int[8];
        for(int i=0;i<number.length;i++){
            int x = (int)(Math.random()*10);
            number[i]=x;
        }
        System.out.println("a senha é: "+number[0]+number[1]+number[2]+number[3]+number[4]+number[5]+number[6]+number[7]);
        return number[0]+number[1]+number[2]+number[3]+number[4]+number[5]+number[6]+number[7];
    } 
}
