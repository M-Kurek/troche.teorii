package pl.mk.testing;

public class Dostepy {

    static class Next extends Cont {
        void foo() {
            val++;
        }
    }

    public static void main(String[] args) {
        Next next = new Next();
        next.val++;
        System.out.println("v : " + next.val);

        Cont cont = new Cont();
        cont.val++;
        System.out.println("c : " + cont.val);
    }
}
