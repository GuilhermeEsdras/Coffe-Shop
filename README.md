<!-- Título do Respositório -->
# Coffe Shop
<!-- -->

<!-- Badges -->
<p align="center">
    <img src="https://img.shields.io/badge/made%20with-Java-red.svg?style=flat&logo=Java" alt="Java Badge">
</p>
<!-- -->

<!-- Msg de boas vindas -->
<p align="center">Bem-vindo ao meu repositório de
<!-- -->

<!-- Logo -->
<p align="center">
    <img align="center" src="https://logos-download.com/wp-content/uploads/2016/10/Java_logo_icon.png" alt="Java Logo" width="300">
</p>
<!-- -->

<!-- Links Principais-->
<p align="center">
    <a href="https://docs.oracle.com/javase/8/docs/" target="_blank"><strong>Documentação da linguagem »</strong></a>
    <br/>
    <a href="https://pt.wikipedia.org/wiki/Java_(linguagem_de_programa%C3%A7%C3%A3o)" target="_blank"><strong>Página no Wikipedia »</strong></a>
    <br/>
    <a href="https://www.java.com/pt_BR/" target="_blank"><strong>Site Oficial »</strong></a>
    <br/>
</p>
<!-- -->

<!-- Links do Repositório -->
<p align="center">
    <a href="Exercícios Resolvidos">Exercícios Resolvidos</a>
    ·
    <a href="Programas Simples">Programas Simples</a>
    ·
    <a href="Projetos Android">Projetos Android</a>
</p>
<!-- -->

<!-- Language Preview-->
<p align="center">
    <img align="center" src="https://miro.medium.com/max/1838/1*3OWWk9BUargTyvFGQpBsOA.png" alt="Java Preview" width="500">
</p>
<!-- -->

---

<!-- Table of Contents -->
## Glossário
- [Coffe Shop](#Coffe-Shop)
  - [Glossário](#Gloss%C3%A1rio)
  - [Objetivo](#Objetivo)
  - [Material Utilizado](#Material-Utilizado)
    - [Sistema Operacional](#Sistema-Operacional)
    - [Compilador](#Compilador)
    - [IDE](#IDE)
  - [Programando em Java](#Programando-em-Java)
    - [Pré-Requisitos](#Pr%C3%A9-Requisitos)
    - [Executando .java pelo CMD](#Executando-java-pelo-CMD)
    - [Criando e Rodando Projetos com Maven](#Criando-e-Rodando-Projetos-com-Maven)
    - [Exemplo de Hello World](#Exemplo-de-Hello-World)
  - [Links Úteis](#Links-%C3%9Ateis)
  - [Autor](#Autor)
  - [Licença](#Licen%C3%A7a)
<!-- -->

<!-- Objetivo -->
## Objetivo
Este repositório foi criado com a finalidade de guardar meus projetos, ideias, anotações, exercícios e programas pessoais feitos em <strong>Java</strong>.
<!-- -->

<!-- Material Utilizado -->
## Material Utilizado
Estes são os materiais usados por mim para desenvolver e rodar meus programas em Java.
### Sistema Operacional
- [Windows 10](https://www.microsoft.com/pt-br/windows/)
### Compilador
- [Java Runtime Environment](#Links-%C3%9Ateis)
### IDE
- [Visual Studio Code](https://code.visualstudio.com/)
  - Com as extensões: <br/>
    [Maven for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-maven) <br/>
    [Debugger for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug) <br/>
    [Language Support for Java(TM)](https://marketplace.visualstudio.com/items?itemName=redhat.java) <br/>
    [Java Test Runner](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-test) <br/>
    [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) <br/>
    [Java Dependency Viewer](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-dependency)
- [IntelliJ IDEA by JetBrains](https://www.jetbrains.com/idea/)
- [Android Studio](https://developer.android.com/studio)
<!-- -->

<!-- Programando em ... -->
## Programando em Java
O que foi necessário para criar e rodar meus programas em Java

### Pré-Requisitos
Para executar e criar programas em **Java** é necessário ter o compilador do Java (JRE) instalado no computador.

- Para verificar se o java está instalado no PC, basta executar o comando no CMD: <br/>
    `> java --version`
> - Se o comando não for reconhecido, **não está** instalado! *(ver [Links Úteis](#Links-%C3%9Ateis) para instalar o Java e suas dependências)* <br/>
> - Caso exiba a versão do java, **está** instalado! <br/>

### Executando .java pelo CMD
Criando e executando um programa simples em Java pelo CMD

1. Para executar arquivos *.java* pelo terminal deve-se ter o Java JDK (Java Development Kit) devidamente instalado no PC. <br/>
   Para instalar, visitar o site oficial e seguir as intruções.  *(ver [Links Úteis](#Links-%C3%9Ateis))*

2. Após ter baixado e configurado o compilador, já será capaz de criar e executar programas Java no Windows.

- Para compilar programas *".java"* e executá-los no terminal/cmd:
  - Abrir pasta onde se localiza o arquivo main (principal) *.java*: <br/>
     `> cd "pasta do programa"`
  - Compilar o programa: <br/>
     `> javac "nome do programa".java`
  - Para executar: <br/>
     `> java "nome do programa"`
  
  - Exemplo: <br/>
     `> cd "C:\Users\Guilherme\Documentos\Meus Programas\Java\Programa Hello World\main" // Para ir até a pasta do arquivo main .java` <br/>
     `> javac HelloWorld.java // Para compilar o programa"` <br/>
     `> java HelloWorld // Para executar este programa`

### Criando e Rodando Projetos com Maven
> Em breve...

### Exemplo de Hello World
``` Java
public class HelloWorld {

    public static void main(String[] args) {
        String mensagem1 = new HelloWorld().retornaMsg1();
        String mensagem2 = new HelloWorld().retornaMsg2();
        System.out.println(mensagem1 + mensagem2 + "=)");
    }

    public String retornaMsg1() {
        return "Hello, ";
    }

    public String retornaMsg2() {
        return "Gui! ";
    }

}
```

Saída: <br/>
`> Hello Gui! =)`
<!-- -->

<!-- Links-->
## Links Úteis
- [Java™ SE (Standard Edition) Development Kit (JDK™) - Java JDK](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
- [Java Download](https://www.java.com/pt_BR/download/)
<!-- -->

<!-- Autor/Contato -->
## Autor
* **Guilherme Esdras (guilherme.esdras@outlook.com)** - [GitHub Page](https://github.com/GuilhermeEsdras)
<!-- -->

<!-- Licença -->
## Licença
*Distributed under the MIT License. See LICENSE for more information.*