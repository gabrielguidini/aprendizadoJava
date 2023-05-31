package cap07;

public class UsaTelevisorEncapsulada {
    public static void main(String[] args) {
    TelevisorEncapsulada tv = new TelevisorEncapsulada();
    tv.setCanal(12);
    tv.aumentarCanal();
    tv.setVolume(33);
    tv.diminuirVolume();
    System.out.println(tv.getCanal());
    System.out.println(tv.getVolume()); // poggers
    }
}
