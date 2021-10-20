/*
 * fact.c -- modulo principal do programa de calculo de factoriais
 */

#include <stdio.h>	/* importa definicao de printf() */
#include <stdlib.h>
#include <pthread.h>
#include <time.h>
#include "fact.h"


/* modos de computacao da funcao factorial(n) */

#define MODO_ITERATIVO 1
#define MODO_RECURSIVO 0

/*
 * programa principal
 */

int main(int argc, char *argv[])
{
    int modo = MODO_RECURSIVO;
    pthread_t tarefa_id[DIM_DADOS];   
    int i;

    /* preenchimento do vector com valores aleatorios */

	srand(time(NULL));

	for (i=0; i < DIM_DADOS; i++) {
		dados[i]=rand()%10;
	}
   
	for (i=0; i < DIM_DADOS; i++) {
        if (modo == MODO_ITERATIVO) {
            if (pthread_create(&tarefa_id[i],NULL, fact_iterativo, 
                           (void *) &dados[i]) != 0) {
                printf("Error creating thread for interactive mode. Exiting...\n");
                exit(1);
            } else {
                printf("Thread created in interactive mode; PID: %d\n", &tarefa_id[i]);
            }
        } else {
            if (pthread_create(&tarefa_id[i],NULL, fact_recursivo, 
                           (void *) &dados[i]) != 0) {
                printf("Error creating thread for recursive mode. Exiting...\n");
                exit(1);
            } else {
                printf("Thread created in recursive mode; PID: %d\n", &tarefa_id[i]);
            }
        }
    }
		for (i=0; i < DIM_DADOS; i++) {
        pthread_join(tarefa_id[i],NULL);
		}
    return 0;
}



