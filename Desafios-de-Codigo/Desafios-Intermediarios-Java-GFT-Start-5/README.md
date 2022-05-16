# Desafios de Código Intermediários Java - GFT Start #5 - DIO

## Média 2

### Desafio 1

Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

### Entrada

O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

### Saída

Imprima a variável MEDIA conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

```java
//Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double nota1 = input.nextDouble();
    double nota2 = input.nextDouble();
    double nota3 = input.nextDouble();
//TODO: Complete os espaços em branco com uma possível solução para o desafio
    double media = ((nota1 *    ) + (nota2 *    ) + (nota3 *    )) / (2+3+5);
    System.out.printf("MEDIA = %.1f", media);
  }
}
```

## Esfera

### Desafio 2

Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.

Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++), assumem que o resultado da divisão entre dois inteiros é outro inteiro.


### Entrada

O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), correspondente ao raio da esfera.

### Saída

A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo, com um espaço antes e um espaço depois da igualdade. O valor deverá ser apresentado com 3 casas após o ponto.

```java
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
 //TODO: Complete os espaços em branco com uma possível solução para o desafio 
  		double pi = 3.14159;
  		double R = sc.nextDouble();
  		double volume = (          ) * pi * (Math.pow(R, 3.0));
  		System.out.printf("VOLUME = %.3f%n",         );
    }
	
}
```


## Polígonos Regulares Simples

### Desafio 3

Na geometria Euclidiana, um polígono regular é um polígono em que todos os ângulos são iguais e todos os lados tem o mesmo comprimento. Um polígono simples é aquele cujos segmentos de reta não se interceptam. Abaixo pode-se ver vários mosaicos feitos por polígonos regulares.

Você deve escrever um programa que, dados o número e o comprimento dos lados de um polígono regular, mostre seu perímetro.


### Entrada

A entrada tem dois inteiros positivos: N e L, que são, respectivamente, o número de lados e o comprimento de cada lado de um polígono regular (3 ≤ N ≤ 1000000 and 1 ≤ L ≤ 4000).

### Saída

A saída é o perímetro P do polígono regular em uma única linha.


```java
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String N = scan.nextLine();
    String[] split = N.split(" ");
//TODO: Complete os espaços em branco com uma possível solução para o desafio
    int P = Integer.parseInt(split[ ]) * Integer.parseInt(split[ ]);
    
    System.out.println(     );
  }
}

```

## Maior e Posição

### Desafio 4

Você recebeu o desafio de ler 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

### Entrada

O arquivo de entrada contém 100 números inteiros, positivos e distintos.


### Saída

Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.


```java
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
//TODO: Complete os espaços em branco com uma possível solução para o desafio
    List<Integer> numeros = new ArrayList<>();
    for(int i = 0; i < 100; i++){
      int numero = scan.nextInt();
      numeros.add(                    );
    }

    Integer max = Collections.max(                    );
    System.out.println(           );
    int position = numeros.indexOf(               ) +1;
    System.out.println(           );
  }
}

```