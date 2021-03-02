# Capítulo II - Movimento Retilíneo

- [Capítulo II - Movimento Retilíneo](#capítulo-ii---movimento-retilíneo)
- [1. Movimento Retilíneo](#1-movimento-retilíneo)
  - [1.1 Posição e Deslocamento](#11-posição-e-deslocamento)
  - [1.2 Velocidade Média e Celeridade Média](#12-velocidade-média-e-celeridade-média)
    - [1.2.1 Velocidade Média](#121-velocidade-média)
    - [1.2.2 Celeridade Média](#122-celeridade-média)
  - [1.3 Velocidade Instantânea e Celeridade Instantânea](#13-velocidade-instantânea-e-celeridade-instantânea)
    - [1.3.1 Velocidade Instantânea](#131-velocidade-instantânea)
    - [1.3.1 Celeridade Instantânea](#131-celeridade-instantânea)
  - [1.4 Aceleração Média e Aceleração Instantânea](#14-aceleração-média-e-aceleração-instantânea)
    - [1.4.1 Aceleração Média](#141-aceleração-média)
    - [1.4.1 Aceleração Instantânea](#141-aceleração-instantânea)
  - [1.5 Movimento Uniforme](#15-movimento-uniforme)
  - [1.5 Movimento Uniformemente Variado](#15-movimento-uniformemente-variado)
  - [1.6 Corpos em Queda Livre](#16-corpos-em-queda-livre)

# 1. Movimento Retilíneo

O movimento de um objeto representa uma mudança contínua da sua posição. O movimento retilíneo é um caso particular do movimento de translação. A descrição do movimento de translação de um corpo é feita com base no chamado modelo de partícula:  o corpo em movimento é tratado como uma partícula independentemente do seu tamanho.

## 1.1 Posição e Deslocamento

A posição de uma partícula, tomando o valor algébrico $x$, pode ser especificada, sem ambiguidade, adotando uma convenção para atribuir um valor positivo ou negativo a $x$, i.e. $x=3m$ significa que a partícula está à direita da origem a uma distância de $3m$; $x=-3m$ significa que a partícula está à esquerda da origem a uma distância de $3m$; 

A posição $x$ de uma partícula é uma função do tempo,

$$
x=x(t)
$$

**Deslocamento**: grandeza vetorial (requer a especificação de uma direção e magnitude). Quando uma partícula muda de posição, digamos de uma posição inicial $x_{1}$ para uma posição final $x_{2}$; sofre um deslocamento $\Delta x$:

$$
\Delta x = x_{2}-x_{1}
$$


**Distância**: grandeza escalar; é o comprimento da trajetória seguida pela partícula (valor numérico positivo).

## 1.2 Velocidade Média e Celeridade Média

### 1.2.1 Velocidade Média

$$
v_{m}=\frac{\Delta x}{\Delta t}=\frac{x_{2}-x_{1}}{t_{2}-t_{1}} \\

[v_{m}]=\frac{L}{T}=LT^{-1}
$$

- Num gráfico posição tempo ($x$ em função de $t$), o valor da $v_{m}$ em $[t_{1}, t_{2}]$ é igual ao declive da reta que passa pelos pontos $(x_{1}, t_{1})$ e $(x_{2}, t_{2})$.

### 1.2.2 Celeridade Média

$$
c_{m}=\frac{distância}{\Delta t} \\
[c_{m}]=\frac{L}{T}=LT^{-1}
$$

- Não tem sinal algébrico (sempre positiva);
- A $distância$ é a soma dos módulos dos deslocamentos parciais.


## 1.3 Velocidade Instantânea e Celeridade Instantânea

### 1.3.1 Velocidade Instantânea

- Taxa de variação da posição de um particula com o tempo, num dado instante.

$$
v=\lim_{\Delta t \to 0}v_{m}=\lim_{\Delta t \to 0}\frac{\Delta x}{\Delta t}=\frac{dx}{dt}
$$

- Da equação acima, retira-se que a velocidade num dado instante $t$ é a derivada da função $x=x(t)$. Geometricamente, a velocidade num instante $t$ é igual ao declive da reta tangente à curva $x=x(t)$ nesse instante.

### 1.3.1 Celeridade Instantânea

$$
|v|=c
$$

- É uma velocidade a que foi retirada a informação relativa ao sentido do movimento:
  - $+4ms^{-1}$ e $-4ms^{-1}$ têm a mesma celeridade de $4ms^{-1}$.

## 1.4 Aceleração Média e Aceleração Instantânea

Uma partícula tem aceleraçãpo quando a sua velocidade varia com o tempo.

### 1.4.1 Aceleração Média

$$
a_{m}=\frac{\Delta v}{\Delta t}=\frac{v_{2}-v_{1}}{t_{2}-t_{1}} \\
‎\\
[a_m]=\frac{LT^{-1}}{T}=LT^{-2}
$$

- Num gráfico velocidade-tempo ($v$ em função de $t$), $a_m$ é igual ao declive da reta que passa pelos pontos $(v_{1}, t_{1})$ e $(v_{2}, t_{2})$

### 1.4.1 Aceleração Instantânea

- Taxa de variação da velocidade de uma partícula com o tempo num dado instante.

$$
a=\lim_{\Delta t \to 0}a_m=\lim_{\Delta t \to 0}\frac{\Delta v}{\Delta t}=\frac{dv}{dt}
$$

- Da equação acima, retira-se que a derivada de $v=v(t)$ resulta na aceleração num dado instante. Geometricmaente, a aceleração num dado instante é igual ao declive da reta tangente à curva $v=v(t)$.

$$
a=\frac{dv}{dt}=\frac{d}{dt}(\frac{dx}{dt})=\frac{d^2x}{dt^2}
$$

## 1.5 Movimento Uniforme

O movimento de uma partícula diz-se uniforme quando o valor da velocidade da partícula é constante (o que resulta em $a=0$).

**Lei do Movimento Uniforme**
$$
x=x_{0}+v(t-t_0)
$$

**Exemplo**: nas figuras abaixo, representam-se os gráficos das funções $x=x(t)$ (1) e $v=v(t)$ (2) para o caso de uma partícula que se desloca com movimento uniforme, cuja lei do movimento é $x=-3+2t$.

$$
\frac{dx}{dt}=2
$$

<div align="center">
<img height=180 src="https://i.imgur.com/5UiloUV.png"> (1)
<img height=180 src="https://i.imgur.com/79AGIiu.png"> (2)
</div>

## 1.5 Movimento Uniformemente Variado

A velocidade de uma partícula pode aumentar (movimento acelerado) ou diminuir (movimento retardado) de tal forma que a sua aceleração a permaneça constante ao longo do tempo.

**Lei das Velocidades do Movimento Uniformemente Variado**
$$
\begin{aligned}
v&=v_0+a(t-t_0) \\
‎\\
v^2&=v_0^2+2a(x-x_0)
\end{aligned}
$$

**Lei do Movimento Uniformemente Variado**

$$
x=x_0+v_0(t-t_0)+\frac{1}{2}a(t-t_0)^2
$$

**Exemplo**: representar graficamente, no intervalo $[0,4]s$, as funções $x=(t)$, $v=v(t)$ e $a=a(t)$ que dão, respetivamente, a posição, a velocidade e a aceleração da partícula que se desloca ao longo do eixo dos $x$'s com

$a.$ movimento uniformemente variado acelerado, cuja lei do movimento é $x=-10+4t+2t^2$

$$
\begin{aligned}
(1)\quad& x=-10+4t+2t^2 (1)\\
‎\\
(2)\quad& v=v(t) \equiv v=\frac{dx}{dt} \equiv v=4t+4 ‎‎‎\\‎
\\
(3)\quad& a=a(t) \equiv a=\frac{dv}{dt} \equiv a=\frac{d^2x}{dt^2}=4
\end{aligned}
$$

<div align="center">
<img height=160 src="https://i.imgur.com/plp4iEI.png"> (1)
<img height=160 src="https://i.imgur.com/ZKzEudi.png"> (2)
<img height=160 src="https://i.imgur.com/HtALXpc.png"> (3)
</div>


$b.$ movimento uniformemente retardado cuja lei do movimento é $x=10+16t-t^2$.

$$
\begin{aligned}
    (1)\quad& x=10+16t-t^2 \\
‎    \\
    (2)\quad& v=v(t) \equiv v=\frac{dx}{dt} \equiv v=16-2t ‎‎‎\\
    ‎\\
    (3)\quad& a=a(t) \equiv a=\frac{dv}{dt} \equiv a=\frac{d^2x}{dt^2}=-2
\end{aligned}
$$

<div align="center">
<img height=160 src="https://i.imgur.com/PwH35t4.png"> (1)
<img height=160 src="https://i.imgur.com/Rc3JGdG.png"> (2)
<img height=160 src="https://i.imgur.com/n861P7i.png"> (3)
</div>

## 1.6 Corpos em Queda Livre

Quando a resistência do ar não é significativa, todos os corpos em queda perto da superfície terrestre caem com a mesma aceleração constante sob a ação gravítica da Terra: o corpo está em **queda livre**.

Neste caso, a aceleração é chamada _aceleçeração de queda livre_ e é representada por _g_.

$$
g \approx 9.8\ ms^{-1}
$$

No movimento vertical de uma partícula em queda livre, tomando o sentido ascendente dos eixos dos $y$'s como positivo, $a=-g=-9.8\ ms^{-1}$.

$$
\begin{aligned}
    y&=y_0+v_0(t-t_0)-\frac{1}{2}g(t-t_0)^2 \\
\ \\
v&=v_0-g(t-t_0) 
\end{aligned}
$$

**Nota**: $v_0 > 0$ se o corpo for lançado para cima e $v_0 < 0$ se for atirado para baixo.