# NOMECLATURAS

## Arquivos
Todo arquivo **.java** deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve também ser maiúscula. 

**Exemplos:**
- Calculadora.java
- CalculadoraCientifica.java

## Classes
A classe deve possuir o mesmo nome do **arquivo.java**

**Exemplo:**
```javascript
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica {

}
```

## Variáveis

**Regras:**
- Uma variável deve ser clara, sem abreviações ou definição sem sentido;
- Uma variável é sempre no singular, exceto quando se referir a um array ou coleção;
- Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês;
- Deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA;
- Deve conter apenas letras, _ (underline), $ ou os números de 0 a 9;
- Deve obrigatoriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número;
- Não pode conter espaços;
- Não podemos usar palavras-chave da linguagem;
- O nome deve ser único dentro de um escopo.

**Exemplos Não Recomendados:**
```javascript
double salMedio = 1500.23  //variável abreviada, o que dificulta a compreensão
String emails = "aluno@escola.com" //confuso se a variável seria um array ou único e-mail
String myName = "JOSEPH" //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não 
int numero&um = 1; //Os únicos símbolos permitidos são _ e $
int 1numero = 1;    //Uma variável não pode começar com númerico
int numero um = 1; //Não pode ter espaço no nome da variável
int long = 1; //long faz parte das palavras reservadas da linguagem
```

**Exemplos Recomendados:**
```javascript
double salarioMedio=1500.23;
String email ="aluno@escola.com"; //email único
String [] emails = {"aluno@escola.com","professor@escola.com"} //array
String meuNome = "JOSEPH" 
int numero$um = 1;
int numero1 = 1;
int numeroum = 1;
int longo = 1;
```

## Métodos

**Regras:**
- Deverão ser nomeados como verbos.
- Deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA

**Exemplos Recomendados:**
```javascript
somar(int n1, int n2){}
abrirConexao(){}
concluirProcessamento() {}
findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada
calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade
```
