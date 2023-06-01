package cap07.heranca;

public class UsaFuncionarios {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Pinhas");
        funcionario.setRg("016-999-666-01");
        funcionario.setCartao("AB2345678");

        System.out.println(funcionario.getCartao());
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getRg());
    }
}
