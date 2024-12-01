# Sistema para a Federação Piauiense de Judô (FPIJ)

## Desenvolvedores
- **João Pedro Nagib Jorge Barbieri** - RA: 22.120.049-6
- **Lucas Podmanicki** - RA: 22.121.007-3
- **Gabriel Brito Schanz** - RA: 22.119.010-1
- **Leonardo Barrionuevo Candido** - RA: 22.121.034-7

---

## 1. Introdução

### 1.1 Propósito
Este documento define os requisitos específicos para o Sistema para a Federação Piauiense de Judô (FPIJ) e detalha as especificações das funcionalidades, capacidades, atributos críticos e outras características do sistema proposto.


### 1.2 Escopo
O sistema será responsável por:
- Gerenciar os dados cadastrais de alunos e professores filiados.
- Manter registros das entidades que oferecem prática de Judô no estado do Piauí.
- Emitir carteiras de filiação à Federação.
  
Este projeto visa substituir o sistema atual, baseado em Microsoft Access, para um ambiente mais robusto, minimizando inconsistências e redundâncias nos dados.

### 1.3 Stakeholders Principais
- **Presidente da Federação Piauiense de Judô**
- **Secretário da Federação**
- **Atletas e professores filiados à Federação**

### 1.4 Acrônimos e Abreviações
- **FPIJ**: Federação Piauiense de Judô do Piauí
- **SGBD**: Sistema Gerenciador de Banco de Dados
- **RF**: Requisito Funcional
- **RNF**: Requisito Não Funcional
- **GUI**: Interface Gráfica de Usuário (Graphic User Interface)

---

## 2. Restrições

### 2.1 Restrições de Equipe e Processo de Desenvolvimento
A equipe é composta por dois desenvolvedores, responsáveis pelo projeto, administração do banco de dados e implementação.

### 2.2 Restrições Ambientais e de Tecnologia
Por limitações financeiras, o sistema será desenvolvido com base em software livre, evitando custos adicionais para a Federação.

### 2.3 Restrições de Entrega e Implantação
O sistema deve preferencialmente utilizar um SGBD embarcado para facilitar a instalação e uso.

---

## 3. Riscos

### 3.1 Riscos Tecnológicos
- **Migração de Dados**: Potenciais conflitos de dados devido a generalizações e tipos de dados diferentes entre os sistemas.
- **Dependência de Microsoft Access**: O sistema atual é baseado em tecnologia proprietária e será substituído por uma opção de software livre.

### 3.2 Riscos de Habilidades e Recursos
Embora a equipe tenha experiência em Java, não possui experiência prévia com migração de dados não normalizados.

---

## 4. Requisitos Funcionais

### 4.1 Funcionalidades Principais
- **Cadastro de Alunos, Professores e Entidades**: Inserção, atualização, busca e exclusão.
- **Emissão de Relatórios e Carteiras**: Relatórios de alunos, entidades, professores, e carteira de filiação.
- **Relatório de Aniversariantes**: Listagem dos filiados que aniversariam no mês corrente.

### 4.2 Atores
- **Secretário**: Usuário principal que interage diretamente com o sistema.
- **Professor**: Fornece dados para cadastro e recebe carteira de filiação.
- **Aluno**: Fornece dados para cadastro e recebe carteira de filiação.


### 4.3 Casos de Uso
- **Adicionar, Atualizar, Apagar e Buscar Alunos, Professores e Entidades**.
- **Emitir Relatórios e Carteiras de Filiação**.

### 4.4 Aplicações
- **FPIJ-App**: Aplicação desktop para gerenciamento das transações de inserção, edição, busca e deleção de Filiados e Entidades.

---

## 5. Requisitos Não-Funcionais
- **Baixa Demanda de Processamento**: Não há necessidade de grande capacidade de processamento.

---

Este sistema tem como objetivo otimizar o gerenciamento de filiações e processos administrativos da Federação Piauiense de Judô, trazendo mais eficiência e facilidade no controle de dados.
