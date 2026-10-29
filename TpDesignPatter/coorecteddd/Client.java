    public class Client
    {
        public static void main(int i){
                if (i < 1 || i > 3) {
                    throw new IllegalArgumentException("Argument must be 1, 2, or 3");
                }
                if(i==1){
                    Program1 p = new Program1 () ;
                    p.go();
                }
                if(i==2){
                    Program2 p = new Program2 () ;
                    p.go();
                }
                else{
                    Program3 p = new Program3 () ;
                    p.go();
                }
        }
    }