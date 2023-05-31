package exercicios.Cap6;

public class MesPorExtenso {
    public static String getMesPorExtenso(String aux1, String aux2){
        while (true){
            int mes = Integer.parseInt(aux1);
            int idioma = Integer.parseInt(aux2);
            
            String[] mesesPt = {"Janeiro","Fevereio","Março","Abril","Maio","Junho","Julho","Agosto","Setembro",
        "Outubro","Novembro","Dezembro","BOMBA TSSSC KABUM"};
            String[] mesesIng = {"January","February","March","April","May","June","July","August","September",
        "October","November","Dezember","BOMBER MEN"};
            if(mes == 0 || mes >=14){
                System.out.println("Bombo tudo");
            } else{
                if(idioma == 1){
                    return mesesPt[mes-1];
                }
                if(idioma == 2){
                    return mesesIng[mes-1];
                }
            }
        }
    } 
}
