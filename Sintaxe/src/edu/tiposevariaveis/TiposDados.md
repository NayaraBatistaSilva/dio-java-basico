# Tipos de dados

No Java, existem algumas palavras reservadas, para a representação dos tipos de dados básicos, que precisam ser manipulados, para a construção de programas. Estes tipos de dados são conhecidos como tipos primitivos (Primitive Types).
*Inteiro; Real; Caractere; Lógico.


## Tipos Primitivos Inteiros

| Tipo   | Classe  | Memória  | Valor Máximo              |
| ------ | ------  | -------- | ------------------------- |
| byte   | Byte    | 1 byte   | 127                       |
| short  | Short   | 2 byte   | 32.767                    |
| int    | Integer | 4 bytes  | 2.147.483.647             |
| long   | Long    | 8 bytes  | 9.223.372.036.854.775.807 |


## Tipos Primitivos Reais

| Tipo   | Classe  | Memória  | Valor Máximo      | Precisão      |
| ------ | ------- | -------- | ----------------- | ------------- |
| float  | Float   | 4 bytes  | 3.4e $^{+38}$     | 6 – 7 dígitos |
| double | Double  | 8 bytes  | 1.8e $^{+ 308}$   | 15 dígitos    |

*Na grande maioria das vezes para representar números, utilizaremos o tipo int , para representar números inteiros ou double para representar números fracionados.

**Peculiaridades**
```javascript
int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
float pi = 3.14F;
```
*Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F, pois alguns cenários do dia-a-dia, podem estimular uma alteração de tipos de dados convencional.


## Tipos Primitivos Caractere

| Tipo   | Classe    | Memória            | Exemplo                   |
| ------ | ----------| -------------------| ------------------------- |
| char   | Character | 1 byte             | 'A'                       |
|        | String    | 1 byte/letra       | "JAVA" (4bytes)           |

*O tipo `char`só aceita um caractere, para palavras maiores usa-se a classe `String`.

## Tipo Primitivo Lógico

| Tipo    | Classe    | Memória      | Exemplo                   |
| ------- | --------- | ------------ | ------------------------- |
| boolean | Boolean   | 1 byte       | true / false              |


## Variáveis e Constantes
No Java, utilizamos identificadores que representam uma referência (ponteiro) a um valor em memória, e esta referência pode ser redirecionada a outro valor, sendo portanto esta a causa do nome "variável", pois o valor pode variar.

Já as Constantes, são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada `final`, seguida do tipo. Por convenção, Constantes são sempre escritas em CAIXA ALTA.

**Exemplo Variável**
```javascript
int numero = 5;
numero = 10;

System.out.print(numero); //print será 10
```

**Exemplo Constante**
```javascript
final double VALOR_DE_PI = 3.14;
```

