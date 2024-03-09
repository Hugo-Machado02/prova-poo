import java.util.Scanner;
import javax.swing.JOptionPane;
public class Questão1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o Número do ISBN: ");
        String isbn = scan.nextLine();

        String[] valor = isbn.split("");

        if(valor[12].equals("X"){
            valor[12] = "10";
        }
    
        int soma = 0;
        for(int i=0; i < valor.length ;i++){
            if(valor[i].equals("-")){
                continue;
            }else{
                int convert = Integer.parseInt(valor[i])
                int result = convert * 10;
                soma += result;
            }
        }

        if(soma % 11 == 0){
            System.out.println("Número validado");
        }else{
            System.out.println("Número não validado");
        }
    }

}