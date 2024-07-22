public class Dispositivo {
    private int codigo;
    private String nome;

    Dispositivo(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void usar(String usuarioNome) {
        System.out.format("%s está usando o dispositivo %s \n", usuarioNome, nome);
    }
}