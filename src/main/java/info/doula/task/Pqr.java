package info.doula.task;

public class Pqr extends Xyz {
    int a = 5;
    int b = 7;

    public Pqr() {
        System.out.println(" Default Constructor ");
    }

    public Pqr(int a) {
        System.out.println("Initital");
    }

    public Pqr(int a, int b) {
        this(a); //constructor chaining
        this.a = a;
        this.b = b;
    }

    @Override
    int min(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        Pqr pqr = new Pqr();
        int ab = pqr.a ; 
        int bb = pqr.b;
        Pqr pq = new Pqr(52, 53);
        int x = pq.a + pq.b;
    }

    int sum(int a, int b) {
        return 0;
    }
}