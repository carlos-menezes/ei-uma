/*
 * fact.h -- definicoes e declaracoes globais para o programa fact
 */

/*dimensao do vector a calcular */
#define DIM_DADOS      10

int dados[DIM_DADOS]; /* v: vector com os factoriais a calcular */

void * fact_iterativo(void *n);
void * fact_recursivo(void *n);
