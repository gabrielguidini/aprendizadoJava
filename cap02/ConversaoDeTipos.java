package cap02;

public class ConversaoDeTipos {
    public static void main(String args[]){

        //CONVERSÃO DE TIPOS:
        int x = 10;
        float y = (float) x; // int para float, funciona trocar float por double, ou o inverso de tudo
        System.out.println(y);
        // -----------------------------------
        String z = "10";
        int w = Integer.parseInt(z); // String para integer -> funciona com float e double"Float.parseFloat(z)"
        System.out.println(w);
        //------------------------------------
        int p = 10;
        String l = String.valueOf(p); // int para string -> funciona de double, float para string também.
        System.out.println(l);
        //------------------------------------
    }
}