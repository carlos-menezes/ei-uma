# Lógica Computacional

## 1. Sistema Lógico ou Sistema Formal

Um *sistema lógico* representa **fatos** e raciciona sobre os mesmos de forma rigorosa e não ambígua.

Uma **Linguagem Formal**  é constituída por:

- **alfabeto**: conjunto de símbolos;
- **gramática**: regras sintáticas que definem um conjunto de sequências de símbolos do alfabeto;
- **semântica**: significado de fórmulas;
- **sistema dedutivos**: conjunto de regras de dedução que indicam como se podem deduzir novas fórmulas a partire de outras fórmulas de maneira puramente sintática.

---

## 2. Lógica Proposicional

### 2.1. Argumentos

Um argumento é uma estrutura da forma

$$
\begin{matrix}
\phi_1 \\
\vdots \\
\phi_n \\ \hline
\psi
\end{matrix}
$$

onde $n \geq 1$ e $\phi_1,\dots,\phi_n$ e $\psi$ são proposições. Um argumento da forma apresenta acima diz-se **válido** se e só se a conclusão $\psi$ for verdadeira sempre que as premissas $\phi_1,\dots,\phi_n$ foram simultaneamente verdadeiras. Caso contrário, é um argumento **inválido**.

Um argumento da forma

$$
\begin{matrix}
\phi_1 \\
\vdots \\
\phi_n \\ \hline
\psi
\end{matrix}
$$

lê-se: $\psi_1$e $\psi_2$, logo $\phi$.

### 2.3. Linguagems do Cálculo Proposicional

Para explicitar a forma lógica de uma proposição, utiliza-se uma *linguagem proposicional*. 

**Alfabeto de uma Linguagem Proposicional**:

- Símbolos de pontuação: $\lparen$ e $\rparen$;
- Conjunto numerável de símbolos proposicionais: $p, p_1, p_2,\dots,q,q_1,q_2,\dots,r,r_1,\dots$;
- Símbolos conetivos unários: $\neg$ (*"não"*);
- Símbolos conetivos binários: $\land, \lor,\implies,\iff$.

As fórmulas de uma linguagem proposicional $L$ são expressões formadas de acordo com as seguintes regras sintáticas:

1. Um símbolo proposicional é uma fórmula atómica;
2. Se $\psi$ é uma fórmula, então $(\neg\psi)$ também o é;
3. Se $\psi$ e $\phi$  são fórmulas e "$\circ$" é um conetivo binário da linguagem considerada, então $(\phi \circ \psi)$ também é uma fórmula.

**Exemplo:** Considerando a linguagem proposicional $L_{\neg,\land,\lor,\implies,\iff}$.

**Fórmulas de $L$**: $p, (\neg r), (\neg(\neg(\neg q))), (p\land q)$

**Não Fórmulas de $L$**: $p\neg,p\land q, \implies(r\lor q), \neg(q\land, \neg(q\land r$

**Convenções de escrita**: de maneira a simplificar as escrita de fórmulas, é possível omitir alguns parêntesis onde a leitura da fórmula não seja ambígua tendo em conta as seguintes precedências:

1. $\neg$
2. $\land$
3. $\lor$
4. $\implies$ e $\iff$

Desta maneira:

- $p \land r$ é uma abreviatura de $(p \land r)$;
- $(p_1\implies \neg p_2)$ é uma abrevitura de $(p_1\implies(\neg p_2));$
- $p_1 \implies p_2 \iff p_3$ não é fórmula.

**Literal**: fórmula que consiste apenas de um símbolo proposicional, e.g. $p_1; \neg p_6.$

Dada uma lunguagem proposicional $L$, arbitrária, os símbolos que fazem parte do alfabeto de $L$ são **símbolos primitivos** da linguagem, enquanto que os **símbolos definidos** são extensões de símbolos primitivos (e.g. $\oplus$ à custa de $\land$ e $\lor$, através da Forma Disjuntiva Normal).

---

> Fim da aula de 07-10-2021 .
>