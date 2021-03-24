# Capítulo V — Trabalho e Energia

- [Capítulo V — Trabalho e Energia](#capítulo-v--trabalho-e-energia)
- [1. Energia Cinética](#1-energia-cinética)
- [2. Trabalho](#2-trabalho)
- [3. Teorema do trabalho-energia cinética](#3-teorema-do-trabalho-energia-cinética)
- [4. Trabalho realizado por uma força variável](#4-trabalho-realizado-por-uma-força-variável)
- [5. Teorema do trabalho-energia cinética com uma força variável](#5-teorema-do-trabalho-energia-cinética-com-uma-força-variável)
- [6. Potência](#6-potência)
- [7. Trabalho e Energia Potencial](#7-trabalho-e-energia-potencial)
- [8. Forças conservativas e forças não conservativas](#8-forças-conservativas-e-forças-não-conservativas)
- [9. Cálculo da energia potencial](#9-cálculo-da-energia-potencial)
  - [9.1. Energia potencial gravítica](#91-energia-potencial-gravítica)
  - [9.2. Energia potencial elástica](#92-energia-potencial-elástica)
- [10. Conservação da energia mecânica](#10-conservação-da-energia-mecânica)
- [11. Trabalho realizado sobre um sistema por uma força exterior](#11-trabalho-realizado-sobre-um-sistema-por-uma-força-exterior)
  - [11.1. Ausência de atrito](#111-ausência-de-atrito)
  - [11.2. Presença de atrito](#112-presença-de-atrito)
- [12. Conservação da energia](#12-conservação-da-energia)

# 1. Energia Cinética

Energia associada ao movimento de um objeto.

$$
K=\frac{1}{2}mv^2
$$

Quanto mais rapidamente se move um objeto/maior é a sua massa, maior é a sua energia cinética. A dimensão da energia cinética é $ML^2T^{-2}$, logo a unidade de $K$ no SI é $kgm^2s^{-2}=J$.
 
# 2. Trabalho

Ação efetuada num objeto que resulta na alteração do estado cinético do mesmo (i.e. o objeto desloca-se). O trabalho realizado por uma força sobre um objeto é a energia transferida para o objeto ou removida do objeto por ação da força nele aplicada.

$$
W=F_\parallel\Delta x
$$

<div align="center">
<img src="https://i.imgur.com/sD4JYJw.png">
</div>

A dimensão do trabalho é $ML^2T^{-2}$, logo a unidade de $K$ no SI é $kgm^2s^{-2}=J$.

Quando a direção da força é perpendicular à direção do movimento não há realização de trabalho. O trabalho realizado por uma força que atua num objeto depende da orientação da força em
relação à direção do movimento do objeto.

Quando várias forças constantes $\vec{F}_1, \vec{F}_2, ..., \vec{F}_1n$ atuam num objeto, o trabalho resultante $W_R$ é igual à soma dos trabalhos realizados por cada uma das forças. É possível calcular de duas maneiras:

$$
\begin{aligned}
    (1)\quad& W_R=\sum_{i=1}^n(\vec{F}_i\bullet\Delta \vec{r})=\sum_{i=1}^n(F_i\Delta r cos\theta_i) \\
    (2)\quad& W_R=\sum_{i=1}^n(\vec{F}_i\bullet\Delta \vec{r})=\sum_{i=1}^n(\vec{F}_i)\bullet\Delta \vec{r}=\vec{F}_R\bullet \Delta \vec{r}=F_r\Delta r cos\theta
\end{aligned}
$$

# 3. Teorema do trabalho-energia cinética

> O trabalho $W$ realizado sobre um corpo de massa $m$ por uma força $F$ é igual à variação de energia cinética desse corpo.

$$
W=\Delta K = K_f - K_i
$$

# 4. Trabalho realizado por uma força variável

$$
W=\int_{\vec{r}_i}^{\vec{r}_f}\vec{F}\times d\vec{r}=\int_{\vec{x}_i}^{\vec{x}_f}\vec{F}_xdx+\int_{\vec{y}_i}^{\vec{y}_f}\vec{F}_ydy+\int_{\vec{z}_i}^{\vec{z}_f}\vec{F}_zdz
$$

Um modelo físico em que a força varia com a posição é o caso de um bloco que se move, sobre uma superfície horizontal sem atrito, ligado a uma mola elástica.

<div align="center">
    <img width="250" src="https://i.imgur.com/9Zpwn3K.png">
</div>

Quando a mola é alongada ou comprimida, exerce no bloco uma força variável $\vec{F}_s$, **força elástica**. $\vec{F}_s$ é uma força restauradora porque, sob a ação desta força a mola tende a readquirir a sua configuração de equilíbrio (i.e. a mola não está nem comprimida nem alongada).

Quando a mola é alongada, $\vec{F}_s$ atua no bloco para a esquerda. Quando é comprimida, $\vec{F}_s$ atua no bloco para a direita.

$$
\vec{F}_s=-k\vec{x} \\
\vec{x}: \text{deslocamento do bloco relativamente à sua posição de equilíbrio } (x=0) \\
k: \text{ constante elástica da mola } (\text{SI}: Nm^{-1})
$$

Este resultado constitui a **lei de Hooke**. O sinal negativo da equação acima indica que o sentido de $\vec{F}_s$ é sempre oposto ao do deslocamento $\vec{x}$ do bloco. Quando a direção da mola é $\parallel$ ao eixo dos $x$'s,

$$
F_s=-kx
$$

Supondo que o bloco sofre um deslocamento arbitrário desde $x_i$ até $x_f$, o trabalho $W_s$ realizado por $\vec{F}_s$ é dado por

$$
W_s=-(\frac{1}{2}kx_f^2-\frac{1}{2}kx_i^2)
$$

$W_s$ é positivo se $x_f<x_i$; negativo se $x_f>x_i$; nulo se $x_f=x_i$.

# 5. Teorema do trabalho-energia cinética com uma força variável

Considerando um objeto de massa $m$ movendo-se ao longo dos eixos $x$'s sob a ação de uma força variável $F(x)$ dirigida ao longo do eixo dos $x$'s. O trabalho realizado por essa força quando este se move de $x_i$ a $x_f$ é dado por

$$
W=\int_{x_i}^{x_f}F(x)dx=\int_{x_i}^{x_f}madx=\frac{1}{2}mv^2_f-\frac{1}{2}mv^2_i
$$

# 6. Potência

A taxa temporal a que uma força realiza trabalho é a **potência** devido à força. Se uma força é aplicada a um objeto e se o trabalho realizado por esta força sobre o objeto no intervalo de tempo $\Delta t$ é $W$, a potência média $P_m$ devido à força durante esse intervalo de tempo é 

$$
P_m=\frac{W}{\Delta t}
$$

A potência instantânea $P$ é dada por

$$
P=\lim_{\Delta t \to 0}P_m=\lim_{\Delta t \to 0}\frac{W}{\Delta t}=\frac{dW}{dt}
$$

A taxa à qual $\vec{F}$ realiza trabalho sobre o objeto (potência instantânea) pode ser escrita na forma

$$
P=\frac{\vec{F}\times d\vec{R}}{dt}=\vec{F}\frac{d\vec{r}}{dt}=\vec{F}\times\vec{v}
$$

A dimensão da potência é $ML^2T^{-3}$; a unidade do SI de potência é o watt, $W$. $1W=Js^{-1}$. Uma outra unidade é o _horsepower_, $hp$: $1hp=746 W$.

# 7. Trabalho e Energia Potencial

A energia associada à configuração de um sistema com dois ou mais objetos que interagem entre si é denominada **energia potencial**.

Considerando o lançamento vertical de uma bola;

- à medida que esta sobe, a sua energia cinética diminiu e o trabalho $W$ realizado pela $\vec{F}_g$ sobre a bola é negativo. Devido à força gravítica, parte da energia cinética de bola é transformada em energia potencial gravítica $U$ do sistema bola-Terra.
- quando esta desce, a sua energia cinética aumenta e o trabalho $W$ realizado pela $\vec{F}_g$ sobre a bola é positivo. Devido à força gravítica, parte da energia potencial gravítica do sistema é transformada em energia cinética da bola.

A variação de $\Delta U$ de energia potencial gravítica do sistema bola-Terra é definida como

$$
\Delta U = -W
$$

# 8. Forças conservativas e forças não conservativas
Sempre que $W_1=-W_2$, dizemos que o outro tipo de energia é uma energia potencial e a força é chamada força conservativa.  A força gravítica e a força elástica são exemplos de forças conservativas.  A força de atrito é uma força não conservativa. 


**Quando uma partícula está sujeita apenas à ação de forças conservativas, podemos simplificar muito os problemas difíceis que envolvem o movimento da partícula.** As forças conservativas têm duas propriedades:
1. o trabalho realizado por uma força conservativa sobre um objeto ao longo de uma trajetória fechada é zero;
2. o trabalho realizado por uma força conservativa sobre um objeto entre duas posições não depende da trajetória seguida pelo objeto.

# 9. Cálculo da energia potencial
Consideremos um sistema onde atuam forças conservativas entre os objetos do sistema. Suponhamos que a configuração do sistema muda porque um dos objetos do sistema move-se ao longo do eixo dos $x$'s, desde a posição $x_i$ até à posição $x_f$, por ação de uma força conservativa $\vec{F}$. O trabalho realizado pela força $\vec{F}$ à medida que o objeto se move é dado por

$$
W=-\int_{x_i}^{x_f}F(x)dx
$$

## 9.1. Energia potencial gravítica
Consideremos um corpo, com massa $m$, movendo-se na direção vertical ao longo do eixo dos $y$'s. Durante o seu deslocamento, $\vec{F}_g$ realiza trabalho sobre o corpo.

$$
\Delta U=mg\Delta y
$$

## 9.2. Energia potencial elástica
Consideremos o sistema bloco-mola ilustrado na figura acima e seja $k$ a constante elástica da mola. Durante o seu deslocamento sobre o eixo dos $x$'s, $F_s=-kx$ realiza trabalho sobre o corpo. A variação da energia potencial elástica é dada por

$$
\Delta U=\frac{1}{2}kx^2_f-\frac{1}{2}kx^2_i
$$

# 10. Conservação da energia mecânica
$$
E_{mec}=K+U
$$

Considerando um sistema no qual as forças exteriores não podem provocar variações de energia no seu interior e que os objetos desse sistemas estão sujeitos apenas a forças conservativas.

Se uma força conservativa realiza um trabalho W sobre um objeto do sistema, a força provoca uma variação de $K$, $\Delta K$  do objeto e uma variação de $U$, $\Delta U$. O [Teorema do Trabalho Energia-Cinética](#5-teorema-do-trabalho-energia-cinética-com-uma-força-variável) diz que 

$$
\Delta K = W
$$

Da equação em [Trabalho e Energia Potencial](#7-trabalho-e-energia-potencial), obtemos

$$
\Delta U = -W
$$

Combinando, temos:

$$
\Delta K = -\Delta U \equiv K_f-K_i=-(U_f-U_i) \equiv K_f+U_f=K_i+U_i
$$

Em suma, num sistema isolado onde atuam apenas forças conservativas,
pode haver variações de energia cinética e de energia potencial, mas a $E_{mec}$ do sistema permanece constante — **princípio da conservação da energia mecânica**.

$$
\Delta E_{mec}=\Delta K + \Delta U = 0
$$

# 11. Trabalho realizado sobre um sistema por uma força exterior

Se uma força exterior realiza, sobre um sistema:
  - trabalho positivo: a força transfere energia para o sistema;
  - trabalho negativo: a força remove energia do sistema.

Quando um sistema é constituído apenas por um objeto, o trabalho realizado por uma força exterior sobre o sistema pode variar apenas a $K$. Caso exista mais do que um objeto, o trabalho realizado por uma força exterior sobre o sistema pode originar variações de outras formas de energia, e.g. $U$.

Nas seguintes situações, são examinados os trabalhos realizados por uma força exterior sobre um sistema constituído por mais do que um objeto.

## 11.1. Ausência de atrito
Quando se uma bola verticalmente para cima, a força que se aplica na bola realiza trabalho. Esta força exterior provoca uma transferência de energia que realiza trabalho sobre sobre o sistema bola-Terra. Conclui.se que o trabalho realizado nesta situação de ausência  de atrito é dada oir

$$
W=\Delta K + \Delta U = \Delta E_{mec}
$$

## 11.2. Presença de atrito
<div align="center">
<img src="https://i.imgur.com/yymI7mL.png">
</div>

Um bloco de massa $m$ sofre um deslocamento horizontal sobre uma superfície rugosa devido à ação de uma força horizontal constante $\vec{F}$. Durante o movimento, o bloco está sujeito à ação de uma força de atrito cinético constante $\vec{f}_k$. Nestas condições, a celeridade do bloco diminiu de $v_0$ para $v$ ao longo da magnitude $d$.

No que toca ao bloco, a segunda lei de Newton permite escrever 

$$
F-f_k=ma
$$

A aceleração $\vec{a}$ do bloco é constante porque $\vec{F}$ e $\vec{f}_k$ são constantes. Logo

$$
v^2=v_0^2+2ad
$$

Resolvendo em ordem a $a$ e substituindo o resultado da primeira eq. deste subcapítulo, tem-se:

$$
Fd=\frac{1}{2}mv^2-\frac{1}{2}mv_0^2+f_kd=\Delta K + f_kd
$$

Numa situação geral, $\vec{F}$ também pode provocar uma variação $\Delta U$ (e.g. o bloco subia uma rampa). Neste caso, generalizamos a equação:

$$
Fd=(\Delta K + \Delta U)+f_kd \quad ou \quad Fd=\Delta E_{mec}+f_kd
$$


À medida que o bloco desliza sobre a superfície, o deslizamento provoca um aumento da energia térmica $E_{th}$ do bloco e da superfície.

$$
\Delta E_{th}=f_kd
$$

Ou seja, 

$$
Fd=\Delta E_{mec}+\Delta E_{th}
$$

O produto $Fd$ é o trabalho $W$ realizado pela força exterior $\vec{F}$ (a energia transferida pela força). A força $\vec{F}$ realiza o trabalho $W$ sobre o sistema bloco-superfície. O trabalho realizado por uma força exterior sobre um sistema quando há atrito envolvido é dado pela equação

$$
W=\Delta E_{mec}+\Delta E_{th}
$$

# 12. Conservação da energia
A energia total $E$ de um sistema é a soma da $E_{mec}$ do sistema com a $E_{th}$ e outros tipos de energia interna para além desta.

A lei da conservação da energia estabelece que $E$ de um sistema pode variar apenas devido à transferência de energia para o sistema ou à remoção de energia do sistema. Isto significa que o $W$ realizado por uma força exterior sobre um sistema pode ser escrito na forma

$$
W=\Delta E=\Delta E_{mec}+\Delta E_{th}+\Delta E_{int.}
$$

No caso de um sistema isolado, não há transferência de energia entre o sistema e o interior. Logo, $E$ permanece constante $\to W=0$, logo,

$$
\Delta E=\Delta E_{mec}+\Delta E_{th}+\Delta E_{int.}=0
$$

``Note-se que pode haver muitas variações de energia no interior de um sistema isolado.** Por exemplo, transformação de energia cinética em energia potencial ou energia cinética em energia térmica. Contudo, a energia total do sistema permanece constante.