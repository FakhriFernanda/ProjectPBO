public class Pegawai {
    private int id;
    private String namalengkap;
    private String alamat;
    private String nip;
    private String jabatan;
    private int gaji;
    private int tunjangan;
    private String golongan;

    public Pegawai() {

    }

    public Pegawai(int id, String namalengkap, String nip, String jabatan) {
        this.id = id;
        this.namalengkap = namalengkap;
        this.nip = nip;
        this.jabatan = jabatan;
    }

    public Pegawai(int id, String namalengkap, String alamat, String nip, String jabatan, int gaji, int tunjangan, String golongan) {
        this.id = id;
        this.namalengkap = namalengkap;
        this.alamat = alamat;
        this.nip = nip;
        this.jabatan = jabatan;
        this.gaji = gaji;
        this.tunjangan = tunjangan;
        this.golongan = golongan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public void melayaniKlien(){
        System.out.println("Memberikan pelayanan pada Klien atau Customer");
    }
    public void membuatJadwalAgenda(){
        System.out.println("Menyusun jadwal kegiatan kantor");
    }
    public void mengumpulkanData(){
        System.out.println("Mengumpulkan data-data perusahaan");
    }
    public void membuatLaporan(){
        System.out.println("Membuat laporan dari data-data yang telah dikumpulkan");
    }
}
