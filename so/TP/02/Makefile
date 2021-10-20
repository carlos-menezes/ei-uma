CC=gcc
CCFLAGS=-g -c
SOURCE=fact.c fact_recurs.c fact_iter.c

OUTFLAGS=-lpthread -g -o
OBJ=fact.o fact_recurs.o fact_iter.o
OUT=fact

.PHONY: build

pre: clean
	$(CC) $(CCFLAGS) $(SOURCE)

build: pre
	$(CC) $(OBJ) $(OUTFLAGS) $(OUT)

clean:
	rm -rf *.o $(OUT)