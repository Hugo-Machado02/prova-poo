import java.util.Scanner;
public class Biblioteca {
    public static void main(String[] args) {
        Livro[] livro = new Livro[2];
        Scanner scan = new Scanner(System.in);
        livro[0] = new Livro("1-123-12345-9", "Dragon Ball", "Akira Toryama", 1990);
        livro[1] = new Livro("1-852-12458-8", "Naruto", "Akira Toryama", 2000);

        int op = 0;
        do{
            System.out.println("========== Bem-vindo a Biblioteca ==========");
            System.out.println("1- Emprestimo de um Livro");
            System.out.println("2- Devolução de um Livro");
            System.out.print("\nDigite uma opção: ");
            op = scan.nextInt();
            System.out.println("============================================\n");

            System.out.println("========== Selecione um livro abaixo ==========");
            for(int i=0; i<livro.length; i++){
                System.out.println(i+" - "+livro[i].getTitulo());
            }
            System.out.println("Digite o ID do Livro: ");
            int idLivro = scan.nextInt();
            System.out.println("===============================================");       

            if(op == 1){
                if(livro[idLivro].emprestimo()){
                    System.out.println("--> Emprestimo do livro realizado\n\n");
                }else{
                    System.out.println("--> O livro está indisponível\n\n");
                }
            }
            else if(op == 2){
                if(livro[idLivro].devolucao()){
                    System.out.println("--> Devolução do livro realizado com Sucesso!\n\n");
                }else{
                    System.out.println("--> Não foi possível fazer a devolução do livro!\n\n");
                }

            }else if(op == -1){
                System.out.println("--> Consulta a Biblioteca Finalizada!\n\n");
            }
            else{
                System.out.println("--> Opção não reconhecida, digite novamente\n\n");
            }

        }while(op != -1);



    }
}
