# Operadores

## Aritméticos
|   |                           |
| - | ------------------------- |
| = | atribuição                |
| + | adição/concatenação `txt` |
| - | subtração                 |
| * | multiplicação             |
| / | divisão                   |
| % | módulo/resto              |

## Relacionais

Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões, retornando um valor booleano como resultado.

|    |                                                                  |
| -- | ---------------------------------------------------------------- |
| == | verificar se uma variável é IGUAL A outra                        |
| != | verificar se uma variável é DIFERENTE da outra                   |
| >  | verificar se uma variável é MAIOR QUE a outra.                   |
| >= | verificar se uma variável é MAIOR OU IGUAL a outra.              |
| <  | verificar se uma variável é MENOR QUE outra                      |
| <= | verificar se uma variável é MENOR OU IGUAL a outra.              |

**`==` versus `equals`:

```javascript
// ComparacaoAvancada.java
 public static void main(String[] args) {
        //caso 1
        int numero1 = 130;
        int numero2 = 130;
        System.out.println(numero1 == numero2); //true
        
        //caso 2
        Integer numero1 = 130;
        Integer numero2 = 130;

        System.out.println(numero1 == numero2); //false
        
        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals
        
         System.out.println(numero1.equals(numero2)); 
 }
 ```

## Unários

Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

|    |                                        |                                                        |
| -- |--------------------------------------- | ------------------------------------------------------ |
| +  | Operador unário de valor positivo      | números são positivos sem esse operador explicitamente |
| -  | Operador unário de valor negativo      | nega um número ou expressão aritmética                 |
| ++ | Operador unário de incremento de valor | incrementa o valor em 1 unidade                        |
| -- | Operador unário de decremento de valor | decrementa o valor em 1 unidade                        |
| !  | Operador unário lógico de negação      | nega o valor de uma expressão booleana                 |

*Muito cuidado com ordem de precedência, dos operadores unários!

```javascript
int numero = 5;
		
//Imprimindo o numero negativo
System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
numero ++;
System.out.println(numero);

//incrementando numero em mais 1 numero, direto no print, imprime 7
System.out.println(numero ++);// ops, imprime numero depois realiza o incremento

System.out.println(numero);// agora sim, numero virou 7

//ordem de precedencia conta aqui
System.out.println(++ numero); //realiza incremento, depois imprime numero



boolean verdadeiro = true;

System.out.println("Inverteu " + !verdadeiro); //imprime false
```

## Ternário

O operador de condição ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.

O operador ternário é representado pelos símbolos `?` e `:` utilizados na seguinte estrutura de sintaxe:

<Expressão Condicional>` ? `<Caso condição seja true>` : `<Caso condição seja false>

**Exemplo:**
```javascript
int a = 6;
int b = 6;

String resultado = (a==b) ? "verdadeiro" : "false";

System.out.println(resultado);
```

## Lógicos

|       |                                        |
| ----- | -------------------------------------- |
| &&    | Operador Lógico "E"                    |
| \| \| | Operador Lógico "OU"                   |

```javascript
// Operadores.java
boolean condicao1=true;

boolean condicao2=false;

// "Se Condicao1 "E" Condicao2 forem verdadeiras, executar código"

if(condicao1 && condicao2)
	System.out.print("Os dois valores precisam ser verdadeiros");;

//Se condicao1 "OU" condicao2 for verdadeira, executar código.
if(condicao1 || condicao2)
	System.out.print("Um dos valores precisa ser verdadeiro");
```

