# Anatomia das classes

## Sintaxe de declaração de uma nova classe:

- 99,9% das nossas classes iniciarão com public class;
- Toda classe precisa de nome, exemplo MinhaClasse;
- O nome do arquivo deve ser idêntico ao nome da classe pública;
- Após o nome, definir o corpo { } , onde iremos compor nossas classes com atributos e métodos.

```javascript
public class MinhaClasse {
    //corpo da classe

    public static void main (string [] arg) {
        //corpo do método main
    }
} 
```
- Dentro de uma aplicação, recomenda-se que somente uma classe possua o método `main`, responsável por iniciar todo o nosso programa.

- O método `main` recebe seu nome **main**, sempre terá a visibilidade public, será difinido como static, não retornará nenhum valor com void e receberá um parâmetro do tipo array de caracteres `String[]`.


## Sintaxe de declação de Variáveis e Métodos:

- Declarar uma variável em Java segue sempre a seguinte estrutura: 
```javascript
// Estrutura

Tipo NomeBemDefinido = Atribuicao (opcional em alguns casos)

// Exemplo

int idade = 23;
double altura = 1.62;
Dog spike; //observe que aqui a variável spike não tem atribuição, é normal
```

- Declarar métodos em Java segue uma estrutura bem simples:
```javascript
// Estrutura

TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

//Exemplo

int somar (int numeroUm, int numero2)

String formatarCep (long cep)
```

## Identação
Basicamente indentar é um termo utilizado para escrever o código do programa de forma hierárquica, facilitando assim a visualização e o entendimento do programa.

**Exemplos:** 

- Sem Identação
```javascript
// arquivo BoletimEstudantil.java

public class BoletimEstudantil {
public static void main(String[] args) {
int mediaFinal = 6;
if(mediaFinal<6)	
System.out.println("REPROVADO"); 
else if(mediaFinal==6)
System.out.println("PROVA MINERVA"); 
else
System.out.println("APROVADO"); 		
}
}
```

- Com Identação
```javascript
public class BoletimEstudantil {
	public static void main(String[] args) {
		int mediaFinal = 6;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	}
}
```

## Escopo

O escopo pode ser entendido como,o ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis vai de acordo com o bloco onde ela foi declarada.
- Classe: Os atributos (variáveis) que são declarados no corpo principal da Classe são acessíveis por todos os métodos.
- Métodos: Atributos (variáveis) que são declarados no Método, tem o escopo dessa variável limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método.


## Tag e Comentários

**Tipos de Tags**

| Tag      | Descrição                                              |
| -------- | ------------------------------------------------------ |
| @autor   | Autor / Criador                                        |
| @version | Versão do recurso disponibilizado                      |
| @since   | Versão / Data de início da disponibilização do recurso |
| @param   | Descrição dos parâmetros dos métodos criados           |
| @return  | Definição do tipo de retorno de um método              |
| @throws  | Se o método lança alguma exceção                       |

*Para inserir o símbolo @ sem iniciar uma tag Javadoc você pode usar o código de caracter HTML `&#064;` e evitar problemas de parsing.

```java
/**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Gleyson Sampaio
* @version 1.0
* @since   01/01/2022
*/
public class Calculadora {
    /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }
}
```

**Tipos de Comentários**

```java
// Olá, eu sou um comentário em uma única linha
```
```java
/* Olá,
 * Eu sou um comentario
 * que posso ser mais detalhadod
 * quando necessário
 */
```
```java
/** 
 * Estas duas estrelinhas acima
 * é para identificar que você
 * pretende elaborar um comentário
 * a nível de documentação.
 * Que incrível !!!
 */
```

## Javadoc
Javadoc é um gerador de documentação criado pela Sun Microsystems , para documentar a API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML. É constituído, basicamente, por algumas marcações muitos simples, inseridas nos comentários do programa.

Este sistema, é o padrão de documentação de classes em Java, onde muitas das IDEs desta linguagem irão automaticamente gerar um Javadoc em HTML.

**Como criar uma documentação no formato HTML, para disponibilizar via web.
```java
// No terminal execute o comando abaixo

javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
```