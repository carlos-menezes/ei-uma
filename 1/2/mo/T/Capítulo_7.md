# Rotação

- [Rotação](#rotação)
- [1. Variáveis da Rotação](#1-variáveis-da-rotação)
  - [1.1. Posição Angular](#11-posição-angular)
  - [1.2. Deslocamento Angular](#12-deslocamento-angular)
  - [1.3. Velocidade Angular](#13-velocidade-angular)
    - [1.4. Aceleração Angular](#14-aceleração-angular)
- [2. Relação entre os Movimentos de Translação e Rotação](#2-relação-entre-os-movimentos-de-translação-e-rotação)
  - [2.1. Posição](#21-posição)
  - [2.2. Velocidade](#22-velocidade)
  - [2.3. Aceleração](#23-aceleração)
- [3. Vetor Velocidade Angular ($\vec{\omega}$) e Vetor Aceleração Angular ($\vec{\alpha}$)](#3-vetor-velocidade-angular-vecomega-e-vetor-aceleração-angular-vecalpha)
- [4. Energia cinética de rotação](#4-energia-cinética-de-rotação)
- [5. Cálculo do $I$](#5-cálculo-do-i)
  - [5.1. Teorema dos eixos paralelos](#51-teorema-dos-eixos-paralelos)
- [6. Torque](#6-torque)
- [7. Segunda Lei de Newton para a rotação](#7-segunda-lei-de-newton-para-a-rotação)
- [8. $W$ e $K$ de rotação](#8-w-e-k-de-rotação)

# 1. Variáveis da Rotação

- **Eixo de rotação**:
  - significa que a rotação ocorre em torno de um eixo que não se move.

- **Rotação pura** (movimento angular):
  - cada partícul ado corpo descreve uma trajetória circular cujo centro está no eixo de rotação.

## 1.1. Posição Angular
<div align="center">
    <img src="https://i.imgur.com/yQxeg4y.png" height="150px">
</div>

A posição angular do corpo é dada por $\theta$. No caso da figura acima, a posição angular $\theta$ é medida no sentido anti-horário em relação ao semi-eixo positivo $x$.

$$\large
\theta=\frac{s}{r} \\
s \mapsto \text{arco da circunferência} \quad r \mapsto \text{raio da circunferência}
$$

## 1.2. Deslocamento Angular

Ocorre quando há $\Delta \theta$.

$$\large
\Delta \theta=\theta_2 - \theta_1 \qquad \begin{cases}
    +, \text{deslocamento ocorre no sentido anti-horário} \\
    -, \text{deslocamento ocorre no sentido horário}
\end{cases}
$$

## 1.3. Velocidade Angular
Seja $\theta_1$ em $t_1$ e $\theta_2$ em $t_2$. A velocidade angular média, $\omega_m$, do corpo em $\Delta t$ é

$$\large
\omega_m=\frac{\Delta \theta}{\Delta t}=\frac{\theta_2 - \theta_1}{t_2-t_1}
$$

A velocidade angular instantânea, $\omega$, é dada por

$$\large
\omega=\lim_{\Delta t \to 0}\omega_m=\frac{d\theta}{dt}
$$

### 1.4. Aceleração Angular
Se há $\Delta \omega$, então o corpo tem aceleração angular. Seja $\omega_1$ em $t_1$ e $\omega_2$ em $t_2$. A aceleração média, $\alpha_m$, do corpo em $\Delta t$ é

$$\large
\alpha_m=\frac{\omega_2-\omega_1}{t_2-t_1}
$$

A aceleração angular instantânea, $\alpha$, é dada por

$$\large
\alpha=\lim_{\Delta t \to 0}\alpha_m=\frac{d\omega}{dt}=\frac{d^2\omega}{dt^2}
$$

# 2. Relação entre os Movimentos de Translação e Rotação

## 2.1. Posição
<div align="center">
    <img src="https://i.imgur.com/Ec434D9.png" height="150px">
</div>

Se uma linha de referência no corpo roda através de um ângulo $\theta$, uma partícula no ponto $P$, a uma distância $r$ (constante) do eixo de rotação, percore uma distância $s$,

$$\large
s=\theta\ (rad) \ r
$$

## 2.2. Velocidade
$$\large
v=\omega r
$$

Quando $\omega$ de um corpo rígido é constante, cada ponto do corpo efetua um movimento circular uniforme. O período de cada ponto é dado por 

$$\large
T=\frac{2\pi r}{v}=\frac{2\pi}{\omega}
$$

O número de revoluções, _frequência_ $f$, completadas por um ponto do corpo por unidade de tempo é

$$\large
f=\frac{2}{T}
$$

## 2.3. Aceleração

- **Tangencial**: existe $a_t$ sempre que $\alpha \neq 0$.

$$\large
a_t=\alpha r
$$

- **Normal**: cada ponto em rotação tem $a_n$ porque se move segundo uma trajetória circular. Existe $a_n$ sempre que $\omega \neq 0$.

$$\large
a_n=\frac{v^2}{r}=\frac{(\omega r)^2}{r}=\omega^2r
$$

O vetor aceleração linear de cada ponto de um corpo tem as duas componentes, $a_t$ e $a_n$. Logo, a sua magnitude é dada por

$$\large
a=\sqrt{(a_t{^2}+a_n{^2})}=\sqrt{(\alpha r)^2+\omega^4r^2}
$$

Quando a magnitude $\omega$ é constante, a magnitude $a$ é dada por

$$\large
a=\omega^2r
$$

# 3. Vetor Velocidade Angular ($\vec{\omega}$) e Vetor Aceleração Angular ($\vec{\alpha}$)

Quando um corpo rígido tem rotação, a sua velocidade angular é expressa por $\vec{\omega}$ paralelo ao eixo de rotação.

<div align="center">
    <img src="https://i.imgur.com/qtRMNyD.png" height="150px">
</div>

$\vec{\alpha}$ tem a direção e sentido de $\vec{\omega}$ se $\omega$ aumenta com o tempo; tem a direção e sentido contrário de $\vec{\omega}$ se a $\omega$ diminiu com o tempo.

# 4. Energia cinética de rotação

Quando um corpo rídigo roda em torno de um eixo fixo, as suas partículas movem-se em trajetórias circulares em torno desse mesmo eixo — logo, há $K$ associada ao movimento de rotação.

Seja um corpo um sistema de partículas em torno dos eixo dos $z$'s com velocidade angular $\vec{w}$. Esteja a $i$-ésima partícula a uma distância $r_i$ do eixo de rotação. Se a massa dessa partícula for $m_i$ e a magnitude da sua velocidade é $v_i$,

$$\large
K_i=\frac{1}{2}m_iv_i^2
$$

Somando a energia de todas as partículas, temos $K$ do sistema (corpo):

$$\large
K=\sum_iK_i=\frac{1}{2}\sum_i m_iv_i^2
$$

Todas as partículas têm a mesma $w$, logo a magnitude $v_i$ depende da distância de $r_i$ ao eixo de rotação de acordo com $v_i=\omega r_i$. A $K$ do corpo em rotação em torno de um eixo fixo é dada por

$$\large
K=\frac{1}{2}\sum_i m_i(\omega r_i)^2=\frac{1}{2}\omega^2\sum_i m_ir_i^2
$$

O termo $\sum_i m_i(r_i)^2$ corresponde ao **momento de inércia** $I$ e expressa o grau de dificuldade em se alterar o estado de movimento de um corpo em rotação.

$K$ pode ser obtido em termos de $I$ e $\omega$:

$$\large
K=\frac{1}{2}I\omega^2
$$

# 5. Cálculo do $I$
- Num corpo rígido que consiste num:
  - sistema discreto de partículas:

$$\large I=\sum_i m_i(r_i)^2$$

  - distribuição contínua de massa: 

$$\large
I\approx \sum_i r_i^2\Delta m_i=\lim_{\Delta m_i\to 0}r_i^2\Delta m_i
$$

$I$ também pode ser obtido através da massa volúmica $\rho$ do corpo:

$$\large
I=\int\rho r^2dV
$$

Se o corpo for homogéneo, $\rho$ é constante; caso contrário, a variação de $\rho$ tem de ser conhecida para calcular o integral acima.

## 5.1. Teorema dos eixos paralelos
<div align="center">
    <img src="https://i.imgur.com/h3h7A1E.png" height="250px">
</div>

Conhecendo o $I_{CM}$ de um corpo rígido em relação em relação a um eixo que passa pelo $CM$ do corpo, como em $(a)$.

De acorod com o **teorema dos eixos paralelos**. De acordo com este teorema,

$$\large
I=I_{CM}+Mh^2 \\
M: \text{ massa do corpo} \quad h: \text{ distância entre os eixos}
$$

# 6. Torque
<div align="center">
    <img src="https://i.imgur.com/k75Qlq9.png" height="250px">
</div>

É uma grandeza física utilizada para medir a capacidade de uma força para fazer um corpo rodar,

$$\large
\tau = Fb\\
b: \text{ braço de força }
$$

O **braço de uma força** relativo a um ponto é a distância mais curta desde o ponto à linha de ação da força. É o comprimento de uma linha perpendicular desde o ponto até à linha de ação da força.

A dimensão é $L^2MT^{-2}$ e no SI é $N m$. Da figura acima, $b=rsin\theta$, logo

$$\large
\tau=rFsin\theta \\
\theta: \text{ menor angulo entre $\vec{r}$ e $\vec{F}$ com origens coincidentes}
$$

$\tau$ pode também ser dada por

$$\large
\tau=\vec{r}\times\vec{F} \qquad \text{produto vetorial} \\
=(x\vec{e}_x+y\vec{e}_y+z\vec{e}_z)\times(F_x\vec{e}_x+F_y\vec{e}_y+F_z\vec{e}_z)
$$

$\tau$ é representada por um vetor perpendicular ao plano determinado por $\vec{r}$ e $\vec{F}$.

Usando a regra da mão direita:

$$\large
\tau=(yF_z-zF_y)\vec{e}_x+(zF_x-xF_z)\vec{e}_y+(xF_y-yF_x)\vec{e}_z
$$

Se $\vec{r}$ e $\vec{F}$ estão no plano $xy$, a eq. acima diz-nos que o vetor $\tau$ está dirigido segundo o eixo dos $z$'s.

Quando várias forças atuam num corpo, a **torque total** $\vec{T}_R$ é

$$
\large\vec{\tau}_R=\sum_i \vec{\tau}_i
$$

Quando um corpo rígido tem movimento de rotação em torno de um eixo fixo, apenas a componente do torque ao longo de tal eixo tem interesse, e muitas vezes esta componente é denominada torque em relação a este ei

Quando várias forças atuam num corpo e cada uma origina rotação em torno de um
mesmo eixo,

$$
\tau_R=\sum_i \tau_i
$$

Um torque é considerado positivo se produz rotação no sentido anti-horário. Um torque é considerado negativo se produz rotação no sentido horário.

# 7. Segunda Lei de Newton para a rotação
<div align="center">
    <img src="https://i.imgur.com/hFt5HJE.png" height="250px">
</div>

Se mais de um $\tau$ atua num corpo rígido em torno de um eixo fixo, então a soma dos torques é

$$
\tau_r=I\alpha
$$

# 8. $W$ e $K$ de rotação
<div align="center">
    <img src="https://i.imgur.com/igQ7SNG.png" height="250px">
</div>

Na figura acima, o corpo roda livremente em torno de um eixo que passa por $O$ perpendicularmente à secção reta. A força $\vec{F}$ é aplicada no ponto $P$. O trabalho $dW$ realizado por $\vec{F}$ sobre o corpo é dado por

$$
dW=\vec{F}\times d\vec{r}=Fdrcos(\frac{\pi}{2}-\phi)=F(rd\theta)sin\phi=(Frsin\phi)d\theta
$$

O trabalho $dW$ realizado durante uma rotação infinitesimal $d\theta$ é

$$
dW=rd\theta
$$

A potência $P$ associada a $\vec{F}$ é dada por

$$
P=\frac{dW}{dt}=r\frac{d\theta}{dt}=r\omega
$$

O **teorema do trabalho-energia cinética para o movimento de rotação** estabelece que o $W_R$ devido ao $\tau_R$ sobre um corpo rígido em relação a um eixo fixo é igual a $\Delta K$ de rotação do corpo.