package cap02;

public class OperadoresAritimeticos {
    public static void main(String args[]){
        /*opreadores aritméticos
        adição = x+y;
        subtração = x-y;
        multiplicação = x*y;
        divisão = x/y;
        resto da divisão inteira = x%y;
        sinal negativo = -x;
        sinal positivo = +x;
        incremento unitário = ++x ou x++;
        decremento unitário = --x ou x--;
        */
        int x = 10;
        int y = 5;
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("-x="+(-x));
        System.out.println("x/y="+(x/y));
        System.out.println("resto de x por y="+(x%y)); // resulta em 0
        System.out.println("inteiro de x por y="+ (int)(x/y)); //resulta em 2, valor do quociente
        System.out.println("x+1="+(x++)); // resulta em 11
    }
}
