package Mahasiswa;

import java.time.chrono.ThaiBuddhistChronology;

public class Mahasiswa<NIM, NAMA, KELAS> {
    private NIM nim;
    private NAMA nama;
    private KELAS kelas;

    public void setNim(NIM nim) {
        this.nim = nim;
    }

    public NIM getNIM() {
        return nim;
    }

    public void setNama(NAMA nama) {
        this.nama = nama;
    }

    public NAMA geNama() {
        return nama;
    }

    public void setClass(KELAS kelas){
        this.kelas = kelas;
    }

    public KELAS getClassValue() {
        return kelas;
    }
   
}
