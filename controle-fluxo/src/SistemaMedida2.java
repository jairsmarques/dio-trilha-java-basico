public class SistemaMedida2 {

    public static void main(String[] args) {
        String sigla = "j";

        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MÉDIO");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}