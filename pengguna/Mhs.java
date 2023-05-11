package pengguna;

public class Mhs {
    private String nama;
    private String nim;
    private int smt;
    private User user;

    public Mhs(String nama, String nim, int smt, String username, String password) {
        this.nama = nama;
        this.nim = nim;
        this.smt = smt;
        this.user = new User(username, password);
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
