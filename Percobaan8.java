import java.io.IOException;

public class Percobaan8 {
        public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() throws IOException {
        System.out.println(20 / 0);
        System.out.println("Method B");
    }
}

class Utama {
    public static void main(String[] args) throws IOException {
        Percobaan8 c = new Percobaan8();
        c.methodA();
        c.methodB(); // Akan error jika tidak di-handle
    }
}
