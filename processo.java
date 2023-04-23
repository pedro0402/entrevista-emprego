package job;
import java.util.Scanner;
public class processo {
	public static void main (String [] args) {
		
		// first question
		int index = 13, sum = 0, k = 0;
		
		while (k < index) {
			k += 1;
			sum += k;
		}
	System.out.printf("The final sum is %d\n", sum);
	System.out.println("-------------------");
	
	
	Scanner input = new Scanner(System.in);
    System.out.print("Informe um número: ");
    int numero = input.nextInt();
    
    // inicialização das variáveis para o cálculo da sequência de Fibonacci
    int primeiro = 0, segundo = 1, proximo = 0;
    boolean pertence = false;
    
    // cálculo da sequência de Fibonacci
    while (proximo < numero) {
        proximo = primeiro + segundo;
        primeiro = segundo;
        segundo = proximo;
        if (proximo == numero) {
            pertence = true;
            break;
        }
    }
    
    // verificação se o número pertence ou não à sequência de Fibonacci
    if (pertence) {
        System.out.println(numero + " pertence à sequência de Fibonacci!");
    } else {
        System.out.println(numero + " não pertence à sequência de Fibonacci!");
    }
    //5 questão
    String original = "Exemplo de string";
	String invertida = "";{
	for (int i = original.length() - 1; i >= 0; i--) {
	    invertida += original.charAt(i);
	}
	System.out.println(invertida);
	
	}}}
	/*a) A lógica é somar 2 ao número anterior. O próximo elemento é 9.

b) A lógica é multiplicar o número anterior por 2. O próximo elemento é 128.

c) A lógica é elevar o índice da sequência ao quadrado. O próximo elemento é 49.

d) A lógica é elevar os números ímpares ao quadrado. O próximo elemento é 100.

e) A lógica é somar os dois números anteriores. O próximo elemento é 13.

f) A lógica é a seguinte:

O segundo número é o dobro do primeiro (2 x 2 = 4)
O terceiro número é a soma do primeiro com o segundo (2 + 4 = 6)
O quarto número é o dobro do terceiro (2 x 6 = 12)
O quinto número é a soma do terceiro com o quarto (6 + 12 = 18)
O sexto número é a soma do quarto com o quinto (12 + 18 = 30)
O sétimo número é a soma do quinto com o sexto (18 + 30 = 48)
Portanto, o próximo elemento é 48.*/
	
	//O carro estará mais próximo de Ribeirão Preto.
	



