package exercicios.Cap7;

public class UsaGPS {
    public static void main(String[] args) {
        // Teste do construtor padrão
        GPS gps1 = new GPS();
        gps1.mostrar(); // Imprime: Idioma: , Rota:
    
        // Teste do construtor com rota definida
        GPS gps2 = new GPS("Rua A, 123");
         gps2.mostrar(); // Imprime: Idioma: Português, Rota: Rua A, 123
    
            // Teste dos métodos definirIdioma() e definirRota()
        gps1.definirIdioma("Inglês");
        gps1.definirRota("Rua B, 456");
        gps1.mostrar(); // Imprime: Idioma: Inglês, Rota: Rua B, 456
    }
}
    

