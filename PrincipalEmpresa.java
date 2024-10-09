package Rela_entre_Classes;

public class PrincipalEmpresa {
    public static void main(String[] args) {
        
        Departamento departamento = new Departamento("Police 2");

        Empresa empresa = new Empresa("JGT´s", departamento);

        System.out.println("Nome da Empresa: " + empresa.getNome());
        System.out.println("Nome do Departamento: " + empresa.getDepartamento().getNome());
    }
}
