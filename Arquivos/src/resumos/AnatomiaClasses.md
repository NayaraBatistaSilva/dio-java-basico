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