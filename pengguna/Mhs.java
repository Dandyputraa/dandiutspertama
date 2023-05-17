package pengguna;

public class Mhs extends User {
    private String nama;
    private String nim;
    private int smt;

    public Mhs(String username, String password) {
        super(username, password);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getSmt() {
        return smt;
    }

    public void setSmt(int smt) {
        this.smt = smt;
    }
}
