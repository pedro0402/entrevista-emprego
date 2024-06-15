1º Questão: V,V,V,V,V
2º Questão:
  2.1) Uma forma de resolver colisões em tabelas de hash é usar listas encadeadas.
       Nesse método, cada endereço da tabela de hash contém uma lista encadeada onde todas as chaves que colidem (ou seja, que resultam no mesmo índice a partir da função de hash) são armazenadas.
       Como funciona:
       Inserção: A função de hash determina o índice na tabela. Se o índice já contém uma chave, a nova chave é adicionada à lista encadeada nesse índice.
       Busca: A função de hash determina o índice e a lista encadeada nesse índice é percorrida para encontrar a chave desejada.
       Remoção: A função de hash determina o índice e a lista encadeada nesse índice é percorrida para encontrar e remover a chave.
       Vantagens:
       Simplicidade de implementação.
       Fácil gerenciamento de colisões.
       Desvantagens:
       Pode degradar o desempenho se muitas colisões ocorrerem, resultando em listas encadeadas longas.

  2.2) Para a tabela de hash com M=7 e a função de transformação ℎ(chave)= mod 7
       inserindo as chaves "P", "E", "S", "Q", "U", "I", "S", "A" (com "P"=16, "E"=5, "S"=19, "Q"=17, "U"=21, "I"=9, "S"=19, "A"=1):
       1. P(16):16 mod 7 = 2
       2. E(5):5 mod 7 = 5
       3. S(19):19 mod 7 = 5
       4. Q(17):17 mod 7 = 3
       5. U(21):21 mod 7 = 0
       6. I(9):9 mod 7 = 2
       7. S(19)19 mod 7 = 5
       8. A(1):1 mod 7 = 1
       tabela de hash com listas ligadas:
       indice             chaves
       0                  U
       1                  A
       2                  P -> I
       3                  Q
       4
       5                  E -> S -> S
       6
       
 2.3) Para detectar quando todas as posições possíveis para reespalhamento em uma tabela de hash foram acessadas, use um contador de tentativas:
         Inicialização: Inicie um contador de tentativas em zero.
         Incremento: Cada vez que ocorre uma colisão, incremente o contador e tente a próxima posição.
         Verificação: Se o contador atingir M (tamanho da tabela), todas as posições foram tentadas.
         Pseudo-código:
            int M = 7; // Tamanho da tabela
            int contadorTentativas = 0; // Inicialização do contador
            int posicao = h(chave); // Posição inicial da função de hash
            
            while (tabela[posicao] != null && contadorTentativas < M) {
                posicao = (posicao + 1) % M; // Próxima posição
                contadorTentativas++; // Incrementa o contador
            }
            
            if (contadorTentativas == M) {
                // Todas as posições foram tentadas
                System.out.println("Reespalhamento falhou.");
                // Tomar ação apropriada (ex: redimensionar a tabela)
            } else {
                tabela[posicao] = chave; // Inserir chave na posição encontrada
            }

3º Questão: Letra D) N . log N
4º Questão:
   4.1) Vantagens: O algoritmo de ordenação por seleção é simples de entender e implementar, 
        não requer estruturas de dados adicionais,
        tem um desempenho consistente independente da organização inicial dos dados, 
        e realiza poucas trocas, o que pode ser vantajoso se o custo de troca for alto.

   4.2) Desvantagens: É ineficiente para grandes conjuntos de dados devido à complexidade de tempo O(n^2) no pior, melhor e caso médio, 
        não preserva a ordem relativa de elementos iguais (não é estável), 
        e existem algoritmos mais eficientes, como Merge Sort, Quick Sort e Heap Sort, que são mais adequados para grandes conjuntos de dados.

   4.3) Foto no celular.
   
