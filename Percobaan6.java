public class Percobaan6 {
        static void demo() {
        NullPointerException t = new NullPointerException("Coba Throw");
        throw t;
        // Baris di bawah tidak akan pernah dieksekusi
        // System.out.println("Ini tidak lagi dicetak");
    }

    public static void main(String[] args) {
        try {
            demo();
            System.out.println("Selesai");
        } catch (NullPointerException e) {
            System.out.println("Ada pesan error: " + e);
        }
    }
}
