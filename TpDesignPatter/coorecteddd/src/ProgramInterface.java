interface ProgramInterface {
    void go();
}

class Program1 implements ProgramInterface {

    public Program1() {
        // The constructor does nothing.
    }

    public void go() {
        System.out.println("Je suis le traitement 1");
    }
}

class Program2 implements ProgramInterface {

    public Program2() {
        // The constructor does nothing.
    }

    public void go() {
        System.out.println("Je suis le traitement 2");
    }
}

class Program3 implements ProgramInterface {

    public Program3() {
        // The constructor does nothing.
    }

    public void go() {
        System.out.println("Je suis le traitement 3");
    }
}

class ProgramFactory {

    public static ProgramInterface createProgram(int n) {
        switch (n) {
            case 1:
                return new Program1();

            case 2:
                return new Program2();

            case 3:
                return new Program3();

            default:
                throw new IllegalArgumentException(
                        "Argument must be 1, 2, or 3"
                );
        }
    }
}

