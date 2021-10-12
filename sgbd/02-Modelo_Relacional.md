# T02: Modelo Relacional

## 1. Estrutura das Bases de Dados Relacional

- Conjunto de tabelas com nome único:
    - Cada tabela guarda instâncias de uma entidade ou associação;
        - Cada coluna é um atributo da entidade;
        - Cada linha contém os valores desses atributos.
    - Cada tabela estabelece uma **relação** entre um conjunto de valores.

---

## 2. Tipos de Atributos

- Cada atributo de uma tabela tem um nome;
- Os valores permitidos para cada atributo é o **domínio** do atributo;
- Os valores dos atributos são, por norma, **atómicos (i.e. indivisível)**:
    - *e.g.*: o valor de um atributo pode ser um número de uma conta mas não um conjunto de número de contas.
- **O domínio é atómico se todos os seus membros forem atómicos;**
- $null$ é membro de todos os domínios;

---

## 3. Relação

- Os valores atuais de uma relação são especificados por uma tabela;
- Um elemento $t$ de $r$ é um tuplo representado por uma linha (i.e. entrada) numa tabela;

---

## 4. Base de Dados

- Conjunto de várias relações;
- A informação é partida em partes, onde cada relação armazena uma parte da informação (e.g. a tabela `accounts` armazena informação sobre contas);

---

## 5. Chaves

- Seja $K \in R$ ($K$ é um conjunto de atributos do esquema relacional $R$);
- $K$ é uma **superchave** de $R$ se valores para $K$forem suficientes para identificar as linhas (tuplos) de forma unívoca para cada relação possível $r(R)$:
    - por *"possível $r(R)$"* referimo-nos a uma relação $r$ que possa existir na modelação que estamos a fazer.
- $K$ é **chave candidata** se $K$ for mínima;
- **Chave primária** (PK) é uma *chave candidata* que é escolhida como o atributo principal a identificar os tuplos numa relação:
    - As PKs nunca (ou raramente) devem mudar;

### 5.1. Chaves Estrangeiras

- Atributo que corresponde à PK de outra relação;
- Numa associação:
    - **convertida para tabela**;
    - os atributos são FK das entidades que se associam;
    - o conjunto das FKs constitui a PK da tabela de associação;

---

## 6. Redução a Esquemas Relacionais

- PK permitem ter entidades e associações expressadas de forma uniforme como *esquemas de relação* que representam os conteúdos da BD;
- Para cada entidade e relação, um *schema* único é atribuído o nome da entidade ou relação correspondente;
- Cada *schema* tem um número de colunas que têm nomes únicos;
- As entidades são transformadas em *schemas*/tabelas os mesmos atributos;
- As associações *many-to-many* são representadas como uma tabela com atributos  para as PK das duas relações participantes (+ quaisquer atributos descritivos);
- As associações *many-to-one* e *one-to-many*  que são totais no lado *many* podem ser representadas adicionando um atributo extra no lado *many* contendo a PK do lado *one*;
- Nas associações *one-to-one*, qualquer lado pode agir como o lado *many* (um atributo extra pode ser adicionado a qualquer uma das tabelas);
- Os atributos compostos são separados em novos atributos na tabela;
- Os atributos multi-valor são representados como um *schema* à parte;
- **Especialização**:
    - Criar um *schema* para a entidade de mais alto nível;
    - Criar um *schema* para cada entidade de nível mais baixo, incluíndo a PK da entidade de mais alto nível e eventuais atributos locais.