![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.

    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```

2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.

   ```mermaid
   flowchart TD
    inicio(( Inicio )) --> entrada1[\Digite sua nota\]
    entrada1 --> entrada2[\ Digite sua frequencia em %\]
    entrada2 --> teste{ Nota>= 50 \n E \n frequencia>= 75% ?}
    teste --> |Não| resposta1[/Reprovado/]
    teste --> |Sim| resposta2[/Aprovado/]
    resposta1 --> final([Fim])
    resposta2 --> final 
   ```

3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.

   ```mermaid
   flowchart TD
      inicio(( Inicio )) --> entrada1[\Digite o N1\]
      entrada1 --> entrada2[\ Digite o N2 \]
      entrada2 --> soma[Resultado = N1 +N2]
      soma -->  saída[/Resultado/]
      saída --> termino([Fim])
   ```

4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.

   ```mermaid
   flowchart TD
      start(( Início )) --> num1[\ Digite seu Numero \]
        num1 --> resp1{ Numero >=0 }
        resp1 -->  |SIM|A[/ Positivo /]
        resp1 -->  |NAO|B[/ Negativo /]
        A --> finish([ Fim ])
        B --> finish
   ```

5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.

   ```mermaid
   flowchart TD
      A((inicio)) --> B[\Digite sua idade\]
      B --> C(\ voce tem titulo de eleitor?\)
   C --> D{ Idade>=16? \n \AND \n Titilo=sim?}
   D --> |sim| E[\Pode votar\]
   E --> |nao| F[/Nao pode votar/]
   F --> G([Final])
   ```

6. Crie um fluxograma que leia dois números e determine o maior entre eles.

   ```mermaid
     flowchart TD
      start(( Início )) --> num1[\ Digite seu primeiro numero \]
        num1 --> num2[\ Digite seu segundo numero\]
        num2 --> result{ num1 > num2 }
        result --> |SIM| resp[/ O primeiro numero é maior /]
        result --> |NAO| resp2[/ O segundo numero é maior /]
        resp --> finish([ Fim ])
        resp2 --> finish([ Fim ])
   ```

7. Crie um fluxograma que leia três números e determine o maior entre eles.

   ```mermaid
   flowchart TD
     start(( Início )) --> num1[\ Digite seu primeiro numero \]
        num1 --> num2[\ Digite seu segundo numero\]
        num2 --> num3[\ Digite seu terceiro numero\]
        num3 --> result{ num1 > num2 }
        result --> |Sim| resp{/ O primeiro numero é o maior /}
        result --> |Nao| resp2{ num2 > num3}
        resp2 --> respfinal{num3 > num1/num2}
        resp --> respfinal{num3 > num1/num2}
        respfinal --> |num3 > num1/num2| resp3[/ O terceiro numero é maior /]
        respfinal --> | Nao | resp4[/ O outro numero é o maior /]
        resp4 --> finish
        resp3 --> finish([ Fim ])
   ```

8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.

   ```mermaid
   flowchart TD
     A(( Início )) --> B[\ Digite um numero \]
        B --> C[r = 1]
        C --> D{ n > 1?}
        D --> | Sim | E[r = r * n]
        E --> F[ n = n - 1 ]
        F --> D
        D --> | Nao | G[/Resposta = r/]
        G --> H([Fim])
   ```

9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.

   ```mermaid
   flowchart TD
     start(( Início )) --> num1[\ Digite seu primeiro numero \]
        num1 --> result{ Verificando }
        result --> | Num % 2 = 1 | resp[/ O numero é impar /]
        result --> | Num % 3 = 2 | resp2[/ O numero é par  /]
        resp2 --> finish 
        resp --> finish([ Fim ])
    ```

10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
```mermaid
   flowchart TD
       A([Início]) --> B[/Digite um número/]
       B --> C{n < 2?}
       C -- sim --> D[Não é primo] --> Z([Final])
       C -- não --> E[i = n / 2]
       E --> F{i > 1?}
       F -- não --> G[É primo] --> Z
       F -- sim --> H{n % i == 0?}
       H -- sim --> D
       H -- não --> I[i = i - 1] --> F
```