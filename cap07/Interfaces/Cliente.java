package cap07.Interfaces;

/*
Como escrito dentro do arquivo POO.txt, todos os métodos de dentro da interface DAO DEVEM ser implementados na classe
Cliente, uma vez que caso não apresentado, haja um erro de compilaçãp

Simplificando, se a classe Cliente deixar de cumprir esse "contrato", ela se torna inválida.

Pode aparecer a necessidade de se implementar mais de uma interface, dessa forma, além de DAO teria seguindo DAO
a proxima interface, no caso Estoque ///// implements DAO, Estoque{corpo do código}
 */

public class Cliente implements DAO {
    //private int codigo;
    //private String nome;
    public void inserir(){

    }
    public void excluir(){

    }
    public void localizar(){

    }
}
