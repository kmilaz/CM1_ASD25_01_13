public class Bank {

    String noRekening;
    String nama;
    String namaIbu;
    String noHP;
    String email;

    Bank (String noRekening, String nama, String namaIbu, String noHP, String email){
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.noHP = noHP;
        this.email = email;
    }

    void tampilDataNorek(){
        System.out.println("No Rekening\tNama\tNama Ibu\tNoHp\tEmail");
        System.out.println(noRekening + "\t" + nama + "\t" + namaIbu  + "\t" + noHP + "\t" + email + "\t");
    }

}
