import java.util.ArrayList;
import java.util.List;

public class EstoqueProduto {

    private List<String> estoque;

    public EstoqueProduto() {
        estoque = new ArrayList<>();
    }

    public void cadastrar(String produto) {
        if (produto == null || produto.trim().isEmpty()) {
            System.out.println("O nome do produto não pode ser vazio.");
            return;
        }
        estoque.add(produto);
        System.out.println("Produto cadastrado com sucesso: " + produto);
    }

    public void remover(String produto) {
        if (estoque.remove(produto)) {
            System.out.println("Produto removido com sucesso: " + produto);
        } else {
            System.out.println("Produto não encontrado no estoque: " + produto);
        }
    }

    public void exibirEstoque() {
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("Produtos no estoque:");
            for (String produto : estoque) {
                System.out.println("- " + produto);
            }
        }
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        
        estoque.cadastrar("Produto A");
        estoque.cadastrar("Produto B");
        estoque.exibirEstoque();

        estoque.remover("Produto A");
        estoque.exibirEstoque();
    }
}
