public class Client {

    public static void main(String[] args) {
        run(1);
        run(2);
        run(3);
    }

    public static void run(int n) {
        ProgramInterface p = ProgramFactory.createProgram(n);
        p.go();
    }
}

