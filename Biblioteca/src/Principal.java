import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.biblioteca.DAOs.LivroDao;
import br.com.biblioteca.DAOs.cdDAO;
import br.com.biblioteca.itens.Cd;
import br.com.biblioteca.itens.Livro;


public class Principal {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        Cd cd;
        cdDAO cdao;
        Livro livro;
        LivroDao livrodao;
        boolean menu = true;
        int op = 0;

        do {
            System.out.println("BIBLIOTECA USANDO BANCO SQL SERVER");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");
            System.out.println("Digite a opção desejada:");

            op = en.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Cadastro de Itens");
                    System.out.println("1 - Cds");
                    System.out.println("2 - Livros");
                    System.out.println("Digite a opção desejada:");

                    int subOp = en.nextInt();
                    if (subOp == 1) {
                        cd = new Cd();
                        cdao = new cdDAO();
                        System.out.println("Cadastro de CD");
                        System.out.println("Digite o Título do Cd");
                        cd.setTitulo(en.next());
                        System.out.println("Digite o Artista do Cd");
                        cd.setArtista(en.next());
                        System.out.println("Digite o número da faixa");
                        cd.setNumeroFaixa(en.nextInt());
                        System.out.println("Digite o nome da Gravadora");
                        cd.setGravadora(en.next());

                        cdao.inserirCd(cd);
                    } else if (subOp == 2) {
                        livro = new Livro();
                        livrodao = new LivroDao();
                        System.out.println("Cadastro de Livro");
                        System.out.println("Digite o Título do Livro");
                        livro.setTitulo(en.next());
                        System.out.println("Digite o Nome do Autor do Livro");
                        livro.setAutor(en.next());
                        System.out.println("Digite o nome da Editora do Livro");
                        livro.setEditora(en.next());
                        System.out.println("Digite o número de páginas do livro");
                        livro.setNumeroPaginas(en.nextInt());
                        livrodao.inseriLivro(livro);
                    } else {
                        System.out.println("Opção inválida");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Listar itens Cadastrados");
                    System.out.println("1 - CDs");
                    System.out.println("2 - Livros");
                    System.out.println("Digite a Opção desejada");

                    subOp = en.nextInt();
                    if (subOp == 1) {
                        cd = new Cd();
                        cdao = new cdDAO();
                        List<Cd> cds = new ArrayList<>();
                        cds = cdao.listarCds();
                        System.out.println("Listando CDs Cadastrados");
                        for (int i = 0; i < cds.size(); i++) {
                            System.out.println("\n" + cds.get(i).toString());
                        }
                    } else {
                        System.out.println("Opção inválida");
                        break;
                    }
                    break;
                case 3:
               // Lógica para alterar itens
                    break;
                case 4:
                    // Lógica para excluir itens
                    break;
                case 5:
                    menu = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (menu);

        en.close();
    }
}
