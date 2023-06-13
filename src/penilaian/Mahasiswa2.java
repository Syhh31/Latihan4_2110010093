package penilaian;
public class Mahasiswa2 {
    private String nama;
    private String npm;
    
    public Mahasiswa2(String nama, String npm) {
        this.nama = nama;
        this.npm = npm;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNpm(String npm) {
        this.npm = npm;
    }
    
    public String getNpm() {
        return npm;
    }
}
