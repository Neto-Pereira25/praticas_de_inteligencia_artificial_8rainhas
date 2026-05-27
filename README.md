# Problema das 8 Rainhas com Busca em Profundidade (DFS)

Este projeto resolve o problema clássico das **8 rainhas** usando **Busca em Profundidade (Depth-First Search)** com backtracking, em Java.

## Objetivo

Posicionar 8 rainhas em um tabuleiro 8x8 de forma que nenhuma rainha ataque outra.

Uma rainha ataca em:

- mesma linha
- mesma coluna
- diagonais

## Como a solução funciona

A modelagem usa um vetor `int[8]`:

- índice = linha
- valor = coluna da rainha naquela linha
- `-1` = linha ainda sem rainha

O algoritmo:

1. Começa de um estado inicial (tabuleiro vazio ou parcial).
2. Tenta posicionar uma rainha na linha atual, coluna por coluna.
3. Só avança se a posição for segura (`isSafe`).
4. Chama recursivamente a DFS para a próxima linha.
5. Se atingir `currentRow == 8`, encontrou solução.

## Estrutura do projeto

```text
src/
	application/
		Program.java
	model/
		QueenState.java
	search/
		DepthFirstSearchSolver.java
	util/
		BoardPrinter.java

bin/
	... classes compiladas ...
```

## Classes principais

- `Program`: ponto de entrada da aplicação, executa cenários de teste.
- `QueenState`: representa um estado do tabuleiro e a linha atual.
- `DepthFirstSearchSolver`: implementa DFS + backtracking e conta nós gerados.
- `BoardPrinter`: imprime o tabuleiro no console (`Q` para rainha e `.` para vazio).

## Cenários executados

O `main` testa 4 estados iniciais:

- tabuleiro vazio
- tabuleiro com 1 rainha pré-posicionada
- tabuleiro com 2 rainhas pré-posicionadas
- tabuleiro com 3 rainhas pré-posicionadas

Para cada cenário:

- executa o solver
- imprime a primeira solução encontrada
- exibe a quantidade de nós criados

## Compilar e executar

No terminal, a partir da raiz do projeto:

```bash
javac -d bin src/application/Program.java src/model/QueenState.java src/search/DepthFirstSearchSolver.java src/util/BoardPrinter.java
java -cp bin application.Program
```

No Windows PowerShell, o mesmo comando também funciona.

## Exemplo de saída (resumo)

```text
==============================
TABULEIRO VAZIO
==============================
Solução encontrada!

 .  Q  .  .  .  .  .  .
 .  .  .  .  Q  .  .  .
 ...

Nós criados: <valor>
```
