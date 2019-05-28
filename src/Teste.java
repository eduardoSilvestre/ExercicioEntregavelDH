public class Teste {

    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.registrarAluno("Eduardo", "Silvestre", 255);
        digitalHouseManager.registrarAluno("Vinicius", "Genovez", 256);
        digitalHouseManager.registrarAluno("Vinicius", "Dorigo", 257);
        digitalHouseManager.registrarAluno("Pedro", "Sakamoto", 258);
        digitalHouseManager.registrarAluno("Bruno", "Caires", 259);


        digitalHouseManager.registrarCurso("Full Stack", 20001, 3);
        digitalHouseManager.registrarCurso("Android", 20002, 2);


        digitalHouseManager.adicionarProfessorAdjunto("Guilherme", "Sartori",
                                                        2, 12 );
        digitalHouseManager.adicionarProfessorTitular("Fabio", "Tadashi",
                                                        1, "Android");

        digitalHouseManager.adicionarProfessorAdjunto("joão", "almeida",
                4, 12 );
        digitalHouseManager.adicionarProfessorTitular("Caike", "Oliveira",
                3, "Full Stack");

        digitalHouseManager.alocarProfessores(20001, 1, 2);
        digitalHouseManager.alocarProfessores(20002, 3, 4);


        digitalHouseManager.matricularAluno(255, 20002);
        System.out.println("***********************************************************");
        digitalHouseManager.matricularAluno(256, 20002);
        System.out.println("***********************************************************");
        digitalHouseManager.matricularAluno(257, 20001);
        System.out.println("***********************************************************");
        digitalHouseManager.matricularAluno(258, 20001);
        System.out.println("***********************************************************");
        digitalHouseManager.matricularAluno(259, 20001);
        System.out.println("***********************************************************");

        digitalHouseManager.alunoConsultarCurso(257);

    }
}
