# Voz do Utilizador

- O desenvolvimento de *software* depende muito da capacidade de ligar o utilizador ao *developer*:
    - Identificar classes de utilizadores;
    - Escolher quem vai identificar cada classe de utilizador (**importante perceber quais as diferentes classes e respetivos papéis e privilégios**);
    - Escolher os *decision makers* no projeto.

## Classes de Utilizador
 - Uma classe de utilizadores é um subgrupo dos clientes que, por sua vez, é um subgrupo dos *stakeholders*:
    - Um cliente pode pertencer a várias classes;
    - Podemos agrupar clientes em diferentes classes de acordo com as seguintes diferenças na interação.
- Considerar as tarefas que os utilizadores podem fazer no sistema;
- Algumas classes podem ser mais importantes que outras (as cuja satisfação aumenta a possibilidade de alcançar os objetivos do negócio);
- Cada classe tem os seus requisitos:
    - Tarefas que poderão realizar;
    - Expectativas de qualidade (e.g. usabilidade).
- Este processo deve ser feito o mais cedo possível:
    - **Elicitar** requisitos para cada classe o mais cedo possível;
- Classes ignoradas podem dar problemas em fases futuras;
- Diagramas para identificar classes:
    - Diagrama Contextual:
        - Representa a fronteira entre o sistema e o "universo";
        - Utiliza a mesma notação de um DFD, mas o sistema é representado como um processo;
        - As entidades representam classes de utilizadores, organizações, outros sistemas ou *hardware*;
        - As linhas representam fluxos de dados entre as entidades e o sistema.
    - Gráfico Organizacional:
        - Procurar por:
            - Departamentos que participam no negócio e/ou são afetados pelo processo de negócio;
            - Departamentos ou papéis com utilizadores diretos ou indiretos;
        - Reduz a probabilidade de serem ignoradas certas classes;
        - Ajuda a encontrar possíveis representantes para cada classe.

    ```mermaid
    graph TD;
        A[CEO] ---> B[Clinical Trials]
        A ---> C[Purchasing]
        A ---> D[Drug Discovery]
        D ---> E[Analytical Sciences]
        D ---> F[Toxicology]
    ```

    - As classes de utilizadores, bem como as suas caraterísticas e responsabilidades devem ser guardads no documento de requisitos.

## Personas
- Dão vida às classes dos utilizadores;
- Pessoa genérica que serve como protótipo para um grupo de utilizador com caraterísticas semelhantes;
    - Evita que o projeto fique parado caso não haja um verdadeiro representante dos utilizadores.
- Baseia-se em pesquisas de mercado, demografia e etnografia.

## Representante do Utilizador
- Um represente do utilizador é necessário e a sua voz deve ser ouvida durante todo o ciclo de desenvolvimento;
- Cada classe necessita de um representante;
- Beta-testing é uma abordagem para comunicar com utilizadores em sistemas comerciais;

## Product Champion
- Principal ligação entre membros de uma classe de utilizadores e o analista de negócio:
    - Deverá ser um utilizador do sistema;
    - Recolhe requisitos de outros membros da mesma classe;
    - Compreendem o domínio da aplicação e o ambiente de operação do sistemas;
    - **Críticos para o sucesso de um projeto pois podem levar à adoção de um sistema pela comunidade de utilizadores**.
- Para produtos comerciais, *experts* do domínio podem ser *product champions*;
- É necessário perceber se este representa uma forma precisa as necesisdades de um utilizador real;
- Considerações:
    - É importante que correspondam às expectativas da equipa e tenham autoridade para tomar decisões ao nível dos requisitos de utilizador;
    - Os gestores podem mudar decisões dos PC, o que pode levar a utilizadores insatisfeitos e PC frustrado;
    - O PC deverá ter uma visão clara do sistema para poder passar decisões ao analista de negõcio;

## Projetos Ágeis
- A comunicação direta entre a equipa e os clientes são a forma mais eficiente de resolver problemas nos requisitos;
- O **product owner** define a visão do produto:
    - Responsável por desenvolver e priorizar conteúdos do *backlog*;
    - Deverá alcançar todos os níveis de requisitos (negócio, utilizador e funcionais);

## Conflitos nos requisitos
- Existirão conflitos nos requisitos entre as classes de utilizadores;
- Muitas vezes, os *decision makers* serão chamados a intervir;