 

public class Listar {
    public static void listarObras() {
        System.out.println("Listagem de Obras");
        for (Obra obras : DiarioObras.obras) {
            System.out.println(obras.toString());
        }
    }

    public static void listarRelatorios() {
        int n = 1;
        for (Obra obras : DiarioObras.obras) {
            if (obras.getId() == n) {
                System.out.print("\nObra: " + obras.getNome());
                for (Relatorio relatorio : DiarioObras.relatorio) {
                    if (relatorio.getId() == n) {
                        System.out.println(relatorio.toString());
                    }
                }
            }
            n++;
        }
    }
}