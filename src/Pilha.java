public class Pilha{
    private No topo;
    private int nElementos;
    public Pilha(){
        topo = null;
        nElementos = 0;
    }
    public boolean vazia () {
        if (nElementos == 0)
            return true;
        else
            return false;
    }
    public int tamanho() {
        return nElementos;
    }
    public int top () {
        if (vazia()) {
            return -1;
        }
        return topo.getConteudo();
    }
    public boolean push(int valor) {
        No novoNo = new No();
        novoNo.setConteudo(valor);
        novoNo.setProx(topo);
        topo = novoNo;
        nElementos++;
        return true;
    }
    public int pop () {
        if (vazia())
            return -1;
        No p = topo;
        int valor = p.getConteudo();
        topo = p.getProx();
        nElementos--;
        p= null;
        return valor;
    }
}
