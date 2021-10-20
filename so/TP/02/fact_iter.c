/*
 * fact_iter.c -- computacao de factoriais de forma iterativa
 */
#include <stdio.h>	/* importa definicao de printf() */
// #include "fact.h"

/*
 * fact_iterativo: calcula, de forma iterativa, o factorial de um 
 * numero passado como argumento e retorna o resultado
 */

void * fact_iterativo (void * n)
{
    int i;
    int valor = *((int *) n);
    int factorial = 1;
    for (i = valor; i > 0; i = i - 1) {
			factorial = factorial * i;
    }
    printf("factorial(%.2i)=%i\n", valor, factorial);
    return NULL;
}


