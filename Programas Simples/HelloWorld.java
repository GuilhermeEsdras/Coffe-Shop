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