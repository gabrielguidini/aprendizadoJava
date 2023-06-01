package exercicios.Cap7;

public class GPS {
    private String idioma;
    private String rota;

    public GPS() {
        this.idioma = "";
        this.rota = "";
    }

    public GPS(String rota) {
        this.idioma = "Português";
        this.rota = rota;
    }

    public void definirIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void definirRota(String rota) {
        this.rota = rota;
    }

    public void mostrar() {
        System.out.println("Idioma: " + this.idioma);
        System.out.println("Rota: " + this.rota);
    }
}
