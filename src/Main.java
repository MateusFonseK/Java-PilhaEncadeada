public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        System.out.println("Pilha vazia: " + pilha.vazia());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Pilha vazia: " + pilha.vazia());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());
        System.out.println("Elemento no topo: " + pilha.top());

        System.out.println("Removendo elementos:");
        while (!pilha.vazia()) {
            System.out.println("Elemento removido: " + pilha.pop());
        }

        System.out.println("Pilha vazia: " + pilha.vazia());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());
    }
}