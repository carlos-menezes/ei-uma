```c
semaforo_t cliente = 0;
semaforo_t servidor = 0;

int K = N;
int espera = 0;
mutex_t g;

void RequisitarServico() {
	esperar(servidor);
	fechar(g);
	espera--;
	abrir(g);
	assinalar(cliente);
}

bool NovoCliente() {
	fechar(g);
	espera++;
	if (espera > K)
		espera--;
		abrir(g);
		return 0;
	else {
		abrir(g);
		assinalar(servidor);
		esperar(cliente);
		return 1;
	}
}
```
