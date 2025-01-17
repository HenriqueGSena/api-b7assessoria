 <div>
  <h2 align="center">B7 Assessoria</h2>
</div>

The goal is to build a Rest API for product management. You should use Java, Spring Boot, and a relational database of your choice. You can use any other libraries/tools that help in the development of the test.


## Instalação

- Baixe o repositorio
```bash
  git clone https://github.com/HenriqueGSena/api-b7assessoria.git
```

- Instale as dependencias do projeto
```bash
  mvn install
```

- Iniciando projeto
```bash
  mvn spring-boot:start
```

- Parando projeto
```bash
  mvn spring-boot:stop
``` 

- Usuario utilizado para teste
```json
  login: admin
  password: admin
``` 

## Documentação Swagger

[Documentação API](http://localhost:8080/swagger-ui.html)


## Stack utilizada

**Back-end:** Java, Spring Boot

**Banco de Dados:** H2


## Funcionalidades

- [x] A API deve utilizar a estratégia de autenticação JWT.

- [x] O sistema deve ter dois níveis de acesso: administrador e estoquista.

- [x] Deve ser possível realizar as operações CRUD em um produto (Os cadastros de categoria e usuário podem ser feitas diretamente no banco, sem necessidade de CRUD específico para eles).

- [x] O usuário pode inativar um produto ou excluir permanentemente.

- [x] Os produtos devem ser listados com paginação, com possibilidade de escolher a quantidade de itens por página e ordenação de todos os campos.

- [x] A listagem deve permitir filtrar pelo usuário que cadastrou o produto.

- [x] A listagem deve permitir filtrar por múltiplos campos. Exemplo: filtrar por Nome e Categoria e Data de cadastro. Deve ser possível filtrar por qualquer um dos campos do produto.

- [ ] O sistema deve permitir que o administrador crie uma regra para quais campos não serão exibidos para o estoquista. Exemplo: o administrador não quer exibir ICMS e Custo (exibição condicional). O administrador pode alterar essa regra para os campos exibidos a qualquer momento.

- [x] O sistema deve ter um endpoint que liste os valores agregados dos produtos (simulando um relatório). Exemplo:  Produto A - Custo: R$ 1,00 - Quantidade: 10 - Custo Total: R$ 10,00 - Valor de Venda: R$ 2,00 - Valor Total Previsto de Venda: R$ 20,00, Produto B - Custo: R$ 2,00 - Quantidade: 20 - Custo Total: R$ 40,00 - Valor de Venda: R$ 4,00 - Valor Total Previsto de Venda: R$ 80,00.
    - Este endpoint deve filtrar da mesma forma que os itens 4 e 5.


- [x] O sistema deve emitir um relatório dos produtos em formato CSV ou XLSX (o usuário deve escolher qual formato), podendo filtrar os dados da mesma forma que os itens 4 e 5. O usuário, no momento da geração do relatório, poderá escolher quais campos do produto deseja exibir no relatório. Exemplo: todos, apenas ID e nome e SKU e etc.


- [ ]  O sistema deve registrar auditoria de todos os eventos realizados (criação, atualização, exclusão e etc.), registrando as seguintes informações: objeto alterado, ação realizada (inclusão, alteração, exclusão), data/hora e usuário que realizou a alteração. Deve ser possível detalhar a auditoria, mostrando o campo alterado, valor anterior e valor atual. Exemplo: Auditoria:
- ID 39 - Produto - Inclusão - 10/10/2023 12:25 - Jose Carlos
- ID 40 - Produto - Alteração - 10/10/2023 12:30 - João da Silva
- Detalhamento auditoria ID 40:
- Campo: Nome - Valor anterior: Caixa SP - Valor atual: Caixa GR SP
- Você pode mudar essa resposta de auditoria, desde que exiba um histórico dos dados alterados.

- [ ]  O usuário estoquista, na atualização de um produto, não deve alterar o Valor de Custo e ICMS.


**Dependencias Utilizadas:**

```xml
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>com.auth0</groupId>
			<artifactId>java-jwt</artifactId>
			<version>4.4.0</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-docker-compose</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<version>2.3.232</version>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>1.18.32</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			<version>2.7.0</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
</project>

```

## Documentação da API

#### Atualizar produto por Id

```http
  PUT /product/update/{productId}
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `api_key` | `string` | **Obrigatório**. A chave da sua API |
| `productId` | `string` | Atualizar produto a partir do id |

#### Criar produto

```http
  POST /product/create
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `name`      | `string` | O name do produto que você quer |
| `active`      | `boolean` | Definir se o produto estara ativo ou nao na criacao |
| `sku`      | `string` | Codigo do produto |
| `categoryId`      | `long` | Codigo da categoria que estara o produto |
| `costValue`      | `string` | Valor de custo do produto |
| `sellingValue`      | `string` | Valor de venda do produto |
| `registrationDate`      | `date` | Data de registro do produto |
| `quantityStock`      | `string` | Quantidade do produto em estoque |

#### Inativar produto por Id

```http
  PATH /product/inactivate/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | Id do produto para desativar |

#### Buscar produto por Id

```http
  GET /product/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | Id do produto para busca |

#### Buscar produto por Id do usuario

```http
  GET /product/productUser/{userId}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | Id do usuario para busca |

#### Buscar lista de produtos

```http
  GET /product/list
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `page`      | `string` | Numero da pagina |
| `size`      | `string` | Tamanho da pagina |
| `sort`      | `string` | Id, asc |

#### Deletar produto pelo id

```http
  GET /product/list
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | Identificador do produto |

#### Registrar novo usuario

```http
  POST /auth/register
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `name`      | `string` | Inserir o nome do novo usuario |
| `password`      | `string` | Inserir a senha do novo usuario |
| `role`      | `string` | Inserir a role para o usuario como : `ADMIN ou STOCKIST` |

#### Login novo usuario

```http
  POST /auth/register
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `name`      | `string` | Inserir o nome do novo usuario |
| `password`      | `string` | Inserir a senha do novo usuario |

#### Listar categoria

```http
  GET /category/list
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `name`      | `string` | Inserir o nome do novo usuario |
| `password`      | `string` | Inserir a senha do novo usuario |





