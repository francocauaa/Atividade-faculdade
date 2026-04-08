public class ListaSimples {
    private Node head;

    public ListaSimples(){
        this.head = null;
    }

    public void insertFirst(Object item){
        Node novoNo = new Node(item, head);
        head = novoNo;
    }

    public void imprimir(){
        Node atual = head;

        while(atual != null){
            System.out.print(atual.item + " -> ");
            atual = atual.next;
        }

        System.out.println("null");
    }
}
