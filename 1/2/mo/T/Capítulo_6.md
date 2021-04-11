# Centro de Massa e Momento Linear

- [Centro de Massa e Momento Linear](#centro-de-massa-e-momento-linear)
- [1. Centro de Massa](#1-centro-de-massa)
  - [1.1. Sistemas de Partículas](#11-sistemas-de-partículas)
  - [1.2. Corpos Sólidos](#12-corpos-sólidos)
- [2. Segunda Lei de Newton para um sistema de partículas](#2-segunda-lei-de-newton-para-um-sistema-de-partículas)
- [3. Momento Linear](#3-momento-linear)
  - [3.1. Partícula](#31-partícula)
  - [3.2. Sistema de Partículas](#32-sistema-de-partículas)
- [4. Colisões e impulso](#4-colisões-e-impulso)
    - [Teorema do momento linear-impulso](#teorema-do-momento-linear-impulso)
- [5. Conservaçãodo momento linear](#5-conservaçãodo-momento-linear)
- [6. Momento linear e energia cinética em colisões](#6-momento-linear-e-energia-cinética-em-colisões)
- [7. Colisões a uma dimensão](#7-colisões-a-uma-dimensão)
  - [7.1. Colisão completamente inelástica](#71-colisão-completamente-inelástica)
  - [7.2. Velocidade do centro de massa](#72-velocidade-do-centro-de-massa)
  - [7.3. Colisões elásticas](#73-colisões-elásticas)
    - [Casos Particulares](#casos-particulares)
- [8. Colisões bidimensionais](#8-colisões-bidimensionais)

# 1. Centro de Massa
O centro de massa $CM$ de um sistema de partículas é o ponto que se move como se $1.$ toda a $m$ do sistema estivesse concentrada nele e $2.$ todas as forças exteriores estivessem aplicadas nele.

## 1.1. Sistemas de Partículas
<div align="center">
    <img src="https://i.imgur.com/2AOdJDb.png" height="150px">
</div>

A posição $x_{CM}$ é dada por

$$
x_{CM}=\frac{m_1x_1+m_2x_2}{M} \\
M \mapsto m_1+m_2 (\text{massa total do sistema})
$$

No caso de um sistema de $N$ partículas,

$$
x_{CM}=\frac{m_1x_1+m_2x_2+m_3x_3+...+x_nm_n}{M}=\frac{1}{M}\sum_{i=1}^{n}(m_ix_i)
$$

Se as partículas estiverem distribuídas no espaço, as coordenadas são dadas por

$$
x_{CM}=\frac{1}{M}\sum_{i=1}^{n}(m_ix_i) \quad y_{CM}=\frac{1}{M}\sum_{i=1}^{n}(m_iy_i) \quad z_{CM}=\frac{1}{M}\sum_{i=1}^{n}(m_iz_i) 
$$

A posição da $i$-ésima partícula é dada por

$$
\vec{r}=x_i\vec{e}_x+y_i\vec{e}_y+z_i\vec{e}_z
$$

Logo,

$$
\vec{r}_{CM}=x_{CM}\vec{e}_x+=\frac{1}{M}\sum_{i}^{n}m_i\vec{r}_i
$$

## 1.2. Corpos Sólidos
Um objeto pode ser visto como um sistema contendo um número finito de pequenos elementos com uma massa — logo, o objeto pode ser tratado como uma distribuição contínua de massa.

A coordenada $x$ do centro de massa do objeto divido em elementos de massa $\Delta m_i$, com coordenadas $x_i,y_i$ e $z_i$ é

$$
x_{CM}\approx\frac{1}{M}\sum_{i}^{n}x_i\Delta m_i \\
M \mapsto \text{massa do objeto}
$$

As expressões de $y_{CM}$ e $z_{CM}$ são análogas.

Quando o tamanho dos elementos $\Delta m_i \to 0$, o número de elementos torna-se infinitesimal com massa $dm$, tornando a equação acima em

$$
x_{CM}=\lim_{\Delta m_i \to 0}\frac{1}{M}\sum_{i}^{n}x_i\Delta m_i=\frac{1}{M}\int xdm
$$

O $CM$ para objetos de massa volúmica $\rho$ constante é

$$
x_{CM}=\frac{1}{V}\int xdV \quad y_{CM}=\frac{1}{V}\int ydV \quad z_{CM}=\frac{1}{V}\int zdV
$$

# 2. Segunda Lei de Newton para um sistema de partículas

Considere-se um sistema de $n$ partículas. Da equação de $\vec{r}_{CM}$, podemos escrever

$$
M\vec{r}_{CM}=m_1\vec{r}_1+m_2\vec{r}_2+...+m_n\vec{r}_n \\
\ \\
\vec{r}_{CM} \mapsto \text{vetor posição do centro de massa do sistema} \\
M \mapsto \text{massa total do sistema}
$$

Assumindo que o sistema é fechado ($M$ é constante).

A velocidade da $i$-ésima partícula é

$$
\vec{v}_i=\frac{d\vec{r}_i}{dt}
$$$

e a velocidade do centro de massa é

$$
\vec{v}_{CM}=\frac{d\vec{r}_{CM}}{dt}=\frac{1}{M}\sum_{i}^{n}m_i\vec{v}_i
$$

A aceleração da $i$-ésima partícula é

$$
\vec{a}_i=\frac{d\vec{v}_i}{dt}
$$$

e a aceleração do centro de massa é

$$
\vec{a}_{CM}=\frac{d\vec{v}_{CM}}{dt}=\frac{1}{M}\sum_{i}^{n}m_i\vec{a}_i
$$

Da segunda Lei de Newton, $m_i\vec{a}_i$ representa a resultante das forças que atuam na $i$-ésima partícula. Logo,

$$
M\vec{a}_{CM}=\vec{F}_1+\vec{F}_2+\vec{F}_3+...+\vec{F}_n=\vec{F}_r=M\vec{a}_{CM} \\
\vec{F}_r \mapsto \text{resultante das forças exteriores que atuam no sistema}
$$

# 3. Momento Linear

## 3.1. Partícula

O momento linear $\vec{p}$ de uma partícula é dado por

$$
\vec{p}=m\vec{v} \\
[p]=M(LT^{-1})=LMT^{-1} \quad \text{SI: } kg\ m\ s^{-1}
$$

Se a massa $m$ da partícula for constante, podemos escrever

$$
\vec{F}_r=m\vec{a}=m\frac{d\vec{v}}{dt}=\frac{d}{dt}(m\vec{v})=\frac{d\vec{p}}{dt}
$$

$\vec{p}$ é constante quando $\vec{F}_r$ das forças exteriores que atuam na partícula é nula.

As equações $\vec{F}_r=\frac{d\vec{p}}{dt}$ e $\vec{F}_r=m\vec{a}$ são expressões equivalentes da Segunda Lei de Newton no caso do movimento de uma partícula.

## 3.2. Sistema de Partículas

$$
\vec{p}=\vec{p}_1+\vec{p}_2+...\vec{p}_n=m_1\vec{v}_1+m_2\vec{v}_2+...+m_n\vec{v}_n
$$

$\vec{p}$ pode também ser expresso em termos da massa $M$ do sistema e da velocidade $\vec{v}_{CM}$ do centro de massa

$$
\vec{p}=M\vec{v}_{CM}
$$

A Segunda Lei de Newton para um sistema de partículas é dada por

$$
\vec{F}_r=\frac{d\vec{p}}{dt}
$$

sendo $\vec{F}_r$ a resultante das forças exteriores que atuam no sistema. $\vec{p}$ é constante quando $\vec{F}_r$ das forças exteriores que atuam na partícula é nula.

# 4. Colisões e impulso

$\vec{p}$ só pode variar por ação de forças exteriores.

Quando um taco bate numa bola, a bola fica sujeito a uma força $\vec{F}$ que varia durante a colisão e altera $\vec{p}$  da bola. A variação $d\vec{p}$ de $\vec{p}$ está relacionada com a força $\vec{F}$

$$
d\vec{p}=\vec{F}dt
$$

O impulso $\vec{J}$ da força $\vec{F}$ é dado por

$$
\vec{J}=\int^{t_f}_{t_i}\vec{F}dt
$$

cuja dimensão é 

$$
[J]=(MLT^{-2})T=LMT^{-1} \quad \text{SI: } N\ s
$$

Uma vez que $1N=1kg\ m \ s^{-2}$, uma alternativa para o impulso é o $kg\ m\ s^{-1}$, a mesma que $\vec{p}$.

### Teorema do momento linear-impulso
$$
\Delta \vec{p}=\vec{J}\\
\Delta p_{x}=J_x \quad \Delta p_{y}=J_y \quad \Delta p_{z}=J_z \\
\ \\
p_{fx}-p_{ix}=\int^{t_f}_{t_i}F_xdt \qquad p_{fy}-p_{iy}=\int^{t_f}_{t_i}F_ydt \qquad p_{fz}-p_{iz}=\int^{t_f}_{t_i}F_zdt
$$

Quando uma força constante $\vec{F}$ atua sobre um objeto durante um intervalo $\Delta t$,

$$
\vec{J}=\vec{F}\Delta t
$$

A força média $\vec{F}_m$ de uma força que confere impulso a uma partícula é 

$$
\vec{F}_m=\frac{1}{\Delta t}\int^{t_f}_{t_i}\vec{F}dt
$$

Desta forma, $\vec{F}$ pode ser dado por

$$
\vec{J}=\vec{F}_m\Delta t
$$

# 5. Conservaçãodo momento linear

Se a resultante $\vec{F}_r=0$ num sistema isolado e fechado,

$$
\frac{\vec{d\vec{p}}}{dt}=0
$$

logo $\vec{p}$ é constante e $\vec{p}_i=\vec{p}_f$. Em suma, se não há forças exteriores a atuar num sistema de partículas fechado, o $\vec{p}$ do sistema permanece constante.

# 6. Momento linear e energia cinética em colisões

Se a energia cinética total de um sistema se conserva durante a colisão, então é uma **colisão elástica**. Caso contrário, **colisão inelástica**.

# 7. Colisões a uma dimensão

Considerando dois corpos que colidem num sistema fechado e isolado.

## 7.1. Colisão completamente inelástica

<div align="center">
    <img src="https://i.imgur.com/dg0Mlwt.png" height="150px">
</div>

O momento linear total $\vec{p}_i$ antes da colisão é igual ao momento linear total $\vec{p}_f$ pós a colisão.

A velocidade final $\vec{v}_f$ é dada por

$$
\vec{v}_f=\frac{m_1\vec{v_{1i}}+m_2\vec{v_{2i}}}{m_1+m_2}
$$

Sendo o movimento unidimensional, a velocidade tem apenas uma componente, logo

$$
v_f=\frac{m_1{v_{1i}}+m_2{v_{2i}}}{m_1+m_2}
$$

## 7.2. Velocidade do centro de massa
A $\vec{v}_{CM}$ permanece constante e pode ser determinada por

$$
\vec{p}=Mv_{CM}=(m_1+m_2)\vec{v}_{CM}
$$

Visto que $\vec{p}$ se conserva durante a colisão,

$$
\vec{p}=\vec{p}_{1i}+\vec{p}_{2i}
$$

logo,

$$
\vec{v}_{CM}=\frac{\vec{p}}{m_1+m_2}=\frac{\vec{p}_{1i}+\vec{p}_{2i}}{m_1+m_2}
$$


## 7.3. Colisões elásticas

<div align="center">
    <img src="https://i.imgur.com/MUNprY6.png" height="150px">
</div>

Considerando os dois corpos com massas $m_1$ e $m_2$ que se movem com velocidades $\vec{v}_{1i}$ $\vec{v}_{2i}$ ao longo dos eixos dos $x$'s.

Ao sofrerem uma colisão, emergem com diferentes velocidades  $\vec{v}_{1f}$ $\vec{v}_{2f}$. Nesta colisão, há conservação de $\vec{p}$ e $K$. A lei da conversação do momento pode então ser enunciada como

$$
m_1\vec{v}_{1i}+m_2\vec{v}_{2i}=m_1\vec{v}_{1f}+m_2\vec{v}_{2f}=
$$

Sendo o movimento unidimensional, podemos escrever:

$$
m_1{v}_{1i}+m_2{v}_{2i}=m_1{v}_{1f}+m_2{v}_{2f}=
$$

A velocidade relativa dos dois corpos antes da colisão é igual ao simétrica da velocidade relativa dos corpos após colisão.

$$
v_{1i}-v_{2i}=-(v_{1f}-v_{2f})
$$

$$

v_{1f}=(\frac{m_1-m_2}{m_1+m_2})+v_{1i}+(\frac{2m_2}{m_1+m_2})v_{2i} \\

\ \\

v_{2f}=(\frac{2m_1}{m_1+m_2})+v_{1i}+(\frac{m_1-m_2}{m_1+m_2})v_{2i}
$$

### Casos Particulares
- Massas iguais: $v_{1f}=v_{2i}$ e $v_{2f}=v_{1i}$.
  - Os corpos trocam de velocidades quando têm a mesma massa.


- Alvo massivo: $m_2 \gt \gt m_1$ e $v_{2i}=0$. $v_{1f}\approx-v_{1i}$ e $v_{2f}\approx 0$.

- Projétil massivo: $m_1 \gt \gt m_2$ e $v_{2i}=0$. $v_{1f}\approx v_{1i}$ e $v_{2f}\approx 2v_{1i}$.

# 8. Colisões bidimensionais

<div align="center">
    <img src="https://i.imgur.com/RSxwmF2.png" height="150px">
</div>

Se a colisão entre dois objetos não for frontal, os corpos emergem da clisão com direções diferentes das iniciais dos seus movimentos.

Quando tal colisão ocorre num sistema fechado e isolado, há conservação de $\vec{p}$:

$$
m_1\vec{v}_{1i}+m_2\vec{v}_{2i}=m_1\vec{v}_{1f}+m_2\vec{v}_{2f}
$$

Se a colisão for elástica, $K$ também se conserva:

$$
\frac{1}{2}m_1v^{2}_{1i}p\frac{1}{2}m_2v^{2}_{2i}=\frac{1}{2}m_1v^{2}_{1f}p\frac{1}{2}m_2v^{2}_{2f} \\
\ \\
i \mapsto \text{instante antes da colisão} \qquad f \mapsto \text{instante após colisão}
$$

Na figura acima, $m_2$ está inicialmente em repouso. Considere-se que ambas as particulas colidem.

Após a colisão, o corpo de massa $m_1$ move-se segunda uma direção de ângulo $\theta_1$ com o eixo dos $x$'s, situação análoga ao corpo de massa $m_2$ (em que o ângulo é $\theta_2$).

Segundo o eixo dos $x$'s:

$$
m_1v_{1i}=m_1v_{1fx}+m_2v_{2fx} \\
m_1v_{1i}=m_1v_{1f}cos(\theta_1)+m_2v_{2f}cos(\theta_2)
$$

Segundo o eixo dos $y$'s:

$$
0=m_1v_{1fy}+m_2v_{2fy} \\
0=m_1v_{1f}sin(\theta_1)+m_2v_{2f}sin(\theta_2)
$$

Neste caso, $\theta_1 > 0$ e $\theta_2 < 0$. Neste caso,

$$
\frac{1}{2}m_1v^{2}_{1i}=\frac{1}{2}m_1v^{2}_{1f}+\frac{1}{2}m_2v^{2}_{2f}
$$

As equações acima contêm 7 variáveis. . Se conhecermos quatro destas variáveis, podemos resolver as três equações para as restantes três variáveis.