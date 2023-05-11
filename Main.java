import pengguna.Mhs;

class Main {
    public static void main(String[] args) {

        Mhs mhs = new Mhs("Dandi Putra Utama", "G.111.19.0039", 8, "ini_username", "ini_password");

        mhs.setNama("Dandi Putra Utama");
        mhs.setNim("G.111.19.0039");
        mhs.setSmt(8);

        System.out.println("Nama Mhs: " + mhs.getNama());
        System.out.println("Nim Mhs: " + mhs.getNim());
        System.out.println("Smt Mhs: " + mhs.getSmt());
        System.out.println("Username: " + mhs.getUser().getUsername());
        System.out.println("Password: " + mhs.getUser().getPassword());
    }
}