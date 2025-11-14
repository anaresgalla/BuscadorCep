public class Main {
    public static void main(String[] args) {

        ConsultaCep consultaCep = new ConsultaCep();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco("01001");
            System.out.println(novoEndereco);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Aplicação finalizada.");
        }
    }
}
