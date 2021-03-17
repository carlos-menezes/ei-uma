- [1. Conjuntos](#1-conjuntos)
  - [1.1. Conceitos e operações básicas entre conjuntos](#11-conceitos-e-operações-básicas-entre-conjuntos)
  - [1.2. Conjunto das partes de um conjunto](#12-conjunto-das-partes-de-um-conjunto)
  - [1.3. Uniões e inteseções generalizadas de conjuntos](#13-uniões-e-inteseções-generalizadas-de-conjuntos)
  - [1.4 Multiconjuntos](#14-multiconjuntos)
  - [1.5. Produto cartesiano](#15-produto-cartesiano)

# 1. Conjuntos
## 1.1. Conceitos e operações básicas entre conjuntos

$x \in A$ indica que "x pertence ao conjunto A"; $x \notin A$ indica que "x não pertence ao conjunto A".

$Definição.$ Dois conjuntos $A$ e $B$ são iguais ($A=B$) se e só se tiverem os mesmos elementos,

$$
A=B⇔\forall_x(x\in A ⇔ x \in B)
$$

$Definição.$ Um conjunto sem quaisquer elementos é o *conjunto vazio* e representa-se por $\emptyset$ ou $\{\}$.

Um conjunto é singular se é formado por um único elemento,

$$
{3} \quad {\emptyset} \quad {{2}}
$$

$Definição.$ Um conjunto $A$ está contido em $B$ ($A \subset B$) (ou $A$ é um subconjunto de $B$) se e só se $\forall_{x\in A}: x\in B$.

$A \subseteq B$ designa que $A$ está contido em $B$ ou é igual a $B$.

$A$ está *estritamente contido* em $B$ se e só se $A\subset B$ e $A \neq B$ $\mapsto$ $A \subset B$ ou $A \subsetneq B$.

1. $\{2, 3, 3, 6, 9\} \subseteq \{2, 3, 6, 9\}$ **R:** O primeiro conjunto pode ser escrito como ${2, 3, 6, 9}$. Logo, esta afirmação é verdadeira.
2. $\{1,2,3\} \subset \{3,2,1\}$ **R:** F, porque $\{1,2,3\}=\{3,2,1\}$
3. $\emptyset \subseteq \{0,1,3\}$ **R:** V, o vazio está contido em todos os conjuntos.

$Teorema.$ Sejam $A, B, C$ conjuntos quaisquer:

- $\empty \subseteq A$
- $A \subseteq A$
- $A \subseteq B \wedge B\subseteq C \implies A \subseteq C$
- $A=B ⇔ A\subseteq B \wedge B \subseteq A$

## 1.2. Conjunto das partes de um conjunto
O conjunto das partes de um conjunto $A$, $\wp(A)$, é igual ao conjunto formado por todos os subconjuntos de $A$.

$$
\# \wp(A)=2^{\#A}
$$

1. $\wp(\{1\})=\{\emptyset, \{1\}\}$
2. $\wp(\{e,\pi,5\})=\{\empty,\{e\}, \{\pi\}, \{5\}, \{e, \pi\}, \{e, 5\}, \{\pi, 5\}, \{e, \pi, 5\}\}$
3. $\wp(\empty)=\{\empty\}$
4. $\wp(\wp(\empty))=\wp(\{\empty\})=\{\empty, \{\empty\} \}$

$Definição.$ Diferença de $A$ e $B$ ($A-B$) é o conjunto de todos os elementos que pertencem a $A$ mas não pertencem a $B$, i.e. $A-B=\{x:x\in A \wedge x \notin B\}$

$Observações.$
- $A\cap B$, $A\cup B$ são comutativos;
- $A\cap (B\cup C)$, $A\cup (B\cap C)$ verificam a propriedade distributiva;
- Se $A$ e $B$ forem finitos, $\#(A\cup B)=\#A+\#B-\#(A\cap B)$
- $\bigcap$ designa **conjunto universal**.

## 1.3. Uniões e inteseções generalizadas de conjuntos

$A_1 \cup A_2 \cup A_3 \cup ... \cup A_n$ escreve-se

$$
\bigcup_{1 \leq i \leq n}A_i
$$

$A_1 \cap A_2 \cap A_3 \cap ... \cap A_n$ escreve-se

$$
\bigcap_{1 \leq i \leq n}A_i
$$

1. $A_i={0,1,2,...,i}, i \geq 1$

$$
A_1={0, 1} \quad A_2={0, 1, 2} \quad ... \\
\ \\
\begin{aligned}
    \bigcap A_i=&A_1\cap A_2 \cap ... \\
    =&\{0, 1\} \cap \{0, 1, 2\} \\
    =&\{0, 1\}
\end{aligned} \qquad

\begin{aligned}
    \bigcup A_i=&A_1\cup A_2 \cap ... \\
    =&\{0, 1\} \cup \{0, 1, 2\} \\
    =&\N_0=\Z^+_0
\end{aligned}
$$

## 1.4 Multiconjuntos
Coleção de objectos que pode ter um número finito de ocorrências repetidas de certos objectos.

$$
\{3, 4, 4, 2, 2, 1, 6, 5, 2, 1\} \\
\{2\bullet 1, 3\bullet 2, 1 \bullet 3, 2\bullet 4, 1 \bullet 5, 1 \bullet 6 \} \\
\ \\
\{\text{nº de ocorrências} \bullet \text{valores possíveis}\}
$$

$Propriedades.$
- **Igualdade:** $A=B⇔\forall_xno(x, A)=no(x,B)$
- **Cardinalidade:** $\#\{2\bullet 1, 3\bullet 2, 1 \bullet 3, 2\bullet 4, 1 \bullet 5, 1 \bullet 6 \}=10$
- **Submulticonjunto:** $A \subseteq B ⇔ \forall_x no(x,A)\leq no(x,B)$
- **Interseção:** $A \cap B$ é o **maior multiconjunto (em termos de elementos) que está contido, simultaneamente, nos multiconjuntos $A$ e $B$.
- **Reunião:** $A \cup B$ é o **menor multiconjunto que contem, simultaneamente, os multiconjuntos $A$ e $B$.

$Exercício.$
Sejam $A=\{1\bullet a, 2\bullet b,2 \bullet c\}$, $B=\{2\bullet a, 2\bullet b,1 \bullet c\}$,  $C=\{3\bullet x, 2\bullet y,1 \bullet z\}$ e $D=\{2\bullet x, 2\bullet y,3 \bullet z\}$

## 1.5. Produto cartesiano
$$
A\times B=\{(x, y):x\in A \wedge y \in B\}
$$

Se $A=B, A\times B=A\times A=A^2$. $\#(A\times B)=\#A\times \#B$.

1. $A=\{1,3,5\}$, $B=\{2, 4\}$, $C=\{x, y\}$ e $D=\{z\}$

$$
\begin{aligned}
    A\times B &=\{1,3,5\}\times\{2, 4\} \\
    &=\{(1, 2), (1,4), (3, 2), (3,4), (5,2), (5,4)\} \\
    \ \\
    A^2&=A\times A \\
    &=\{1,3,5\}\times\{1,3,5\} \\
    &=\{(1,1), (1,3), (1,5), (3,1), (3,3), (3,5), (5,1), (5,3), (5,5)\}
\end{aligned}
$$