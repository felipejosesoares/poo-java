package projetoLivro;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Felipe", 28, "M");
        p[2] = new Pessoa("Ketylin", 23, "F");

        l[0] = new Livro("Aprendendo Java", "José Silva", 300, p[0]);
        l[1] = new Livro("Manual de POO", "Osvaldo Carlos", 250, p[1]);
        l[2] = new Livro("POO para iniciantes", "Rafaela de Andrade", 500, p[2]);

        l[0].abrir();
        l[0].folhear(263);
        System.out.println(l[0].detalhes());
        System.out.println("\n-----------------------\n");
        System.out.println(l[1].detalhes());
    }
}
