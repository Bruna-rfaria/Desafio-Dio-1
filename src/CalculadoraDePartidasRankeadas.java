/*Instruções para entrega
 # 2️⃣ Calculadora de partidas Rankeadas
**O Que deve ser utilizado**

- Variáveis
- Operadores
- Laços de repetição
- Estruturas de decisões
- Funções

## Objetivo:

Crie uma função que recebe como parâmetro a quantidade de vitórias e derrotas de um jogador,
depois disso retorne o resultado para uma variável, o saldo de Rankeadas deve ser feito através do calculo (vitórias - derrotas)

Se vitórias for menor do que 10 = Ferro
Se vitórias for entre 11 e 20 = Bronze
Se vitórias for entre 21 e 50 = Prata
Se vitórias for entre 51 e 80 = Ouro
Se vitórias for entre 81 e 90 = Diamante
Se vitórias for entre 91 e 100= Lendário
Se vitórias for maior ou igual a 101 = Imortal

## Saída

Ao final deve se exibir uma mensagem:
"O Herói tem de saldo de **{saldoVitorias}** está no nível de **{nivel}**"*/


import java.util.Objects;
import java.util.Scanner;
public class CalculadoraDePartidasRankeadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String exit;

        do {
            System.out.println("Digite quantidade de vitórias:");
            int victories = Integer.parseInt(scanner.next());
            System.out.println("Adicionar quantidade de derrotas: ");
            int defeats = Integer.parseInt(scanner.next());
            System.out.println("O Herói tem saldo de "+ rankeadas(victories, defeats) +" vitórias e esta no nível de " + determineLevel(victories) );
            System.out.println("Digite 'sair' para finalizar");
            exit = scanner.next();




        }while(exit == "sair");{
            scanner.close();
        }
    }

    public static int rankeadas(int victories, int defeats){
        victories=victories-defeats;
        return victories;
    }

    public static String determineLevel(int victories) {
        if (victories <= 10) {
            return "Ferro";
        }
        else if (victories <= 20) {
            return "Bronze";
        }
        else if (victories <=50) {
            return "Prata";
        }
        else if (victories <=80) {
            return "Ouro";
        }
        else if (victories <=90) {
            return "Diamante";
        }
        else if (victories <= 100) {
            return "Lendário";
        }
        else {
            return "Imortal";
        }
    }

}


