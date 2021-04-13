# Rotação

- [Rotação](#rotação)- [Rotação](#rotação)
- [1. Variáveis da Rotação](#1-variáveis-da-rotação)
  - [1.1. Posição Angular](#11-posição-angular)
  - [1.2. Deslocamento Angular](#12-deslocamento-angular)
  - [1.3. Velocidade Angular](#13-velocidade-angular)
    - [1.4. Aceleração Angular](#14-aceleração-angular)
- [2. Relação entre os Movimentos de Translação e Rotação](#2-relação-entre-os-movimentos-de-translação-e-rotação)
  - [2.1. Posição](#21-posição)
  - [2.2. Velocidade](#22-velocidade)
  - [2.3. Aceleração](#23-aceleração)

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

$$
\theta=\frac{s}{r} \\
s \mapsto \text{arco da circunferência} \quad r \mapsto \text{raio da circunferência}
$$

## 1.2. Deslocamento Angular

Ocorre quando há $\Delta \theta$.

$$
\Delta \theta=\theta_2 - \theta_1 \qquad \begin{cases}
    +, \text{deslocamento ocorre no sentido anti-horário} \\
    -, \text{deslocamento ocorre no sentido horário}
\end{cases}
$$

## 1.3. Velocidade Angular
Seja $\theta_1$ em $t_1$ e $\theta_2$ em $t_2$. A velocidade angular média, $\omega_m$, do corpo em $\Delta t$ é

$$
\omega_m=\frac{\Delta \theta}{\Delta t}=\frac{\theta_2 - \theta_1}{t_2-t_1}
$$

A velocidade angular instantânea, $\omega$, é dada por

$$
\omega=\lim_{\Delta t \to 0}\omega_m=\frac{d\theta}{dt}
$$

### 1.4. Aceleração Angular
Se há $\Delta \omega$, então o corpo tem aceleração angular. Seja $\omega_1$ em $t_1$ e $\omega_2$ em $t_2$. A aceleração média, $\alpha_m$, do corpo em $\Delta t$ é

$$
\alpha_m=\frac{\omega_2-\omega_1}{t_2-t_1}
$$

A aceleração angular instantânea, $\alpha$, é dada por

$$
\alpha=\lim_{\Delta t \to 0}\alpha_m=\frac{d\omega}{dt}=\frac{d^2\omega}{dt^2}
$$

# 2. Relação entre os Movimentos de Translação e Rotação

## 2.1. Posição
<div align="center">
    <img src="https://i.imgur.com/Ec434D9.png" height="150px">
</div>

Se uma linha de referência no corpo roda através de um ângulo $\theta$, uma partícula no ponto $P$, a uma distância $r$ (constante) do eixo de rotação, percore uma distância $s$,

$$
s=\theta\ (rad) \ r
$$

## 2.2. Velocidade
$$
v=\omega r
$$

Quando $\omega$ de um corpo rígido é constante, cada ponto do corpo efetua um movimento circular uniforme. O período de cada ponto é dado por 

$$
T=\frac{2\pi r}{v}=\frac{2\pi}{\omega}
$$

O número de revoluções, _frequência_ $f$, completadas por um ponto do corpo por unidade de tempo é

$$
f=\frac{2}{T}
$$

## 2.3. Aceleração

- **Tangencial**: existe $a_t$ sempre que $\alpha \neq 0$.

$$
a_t=\alpha r
$$

- **Normal**: cada ponto em rotação tem $a_n$ porque se move segundo uma trajetória circular. Existe $a_n$ sempre que $\omega \neq 0$.

$$
a_n=\frac{v^2}{r}=\frac{(\omega r)^2}{r}=\omega^2r
$$

O vetor aceleração linear de cada ponto de um corpo tem as duas componentes, $a_t$ e $a_n$. Logo, a sua magnitude é dada por

$$
a=\sqrt{(a_t{^2}+a_n{^2})}=\sqrt{(\alpha r)^2+\omega^4r^2}
$$

Quando a magnitude $\omega$ é constante, a magnitude $a$ é dada por

$$
a=\omega^2r
$$

# 3. Vetor Velocidade Angular ($\vec{\omega}$) e Vetor Aceleração Angular ($\vec{\alpha}$)

Quando um corpo rígido tem rotação, a sua velocidade angular é expressa por $\vec{\omega}$ paralelo ao eixo de rotação.

<div align="center">
    <img src="https://i.imgur.com/qtRMNyD.png" height="150px">
</div>

$\vec{\alpha}$ tem a direção e sentido de $\vec{\omega}$ se $\omega$ aumenta com o tempo