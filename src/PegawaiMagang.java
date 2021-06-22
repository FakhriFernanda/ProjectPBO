public class PegawaiMagang extends Pegawai{
    private String pendidikanTerakhir;
    private String pengalamanKerja;
    private int nik;

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }

    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public String getPengalamanKerja() {
        return pengalamanKerja;
    }

    public void setPengalamanKerja(String pengalamanKerja) {
        this.pengalamanKerja = pengalamanKerja;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public void mengerjakanTugas(){
        System.out.println("Mengerjakan tugas yang diberikan sesuai deadline yang ditetapkan");
    }
    public void menerapkanIlmu(){
        System.out.println("Menerapkan/mempraktekkan ilmu yang telah didapat");
    }

    @Override
    public String getNamalengkap() {
        return super.getNamalengkap();
    }

    @Override
    public String getNip(){
        return super.getNip();
    }
}
