public class Bank {

    String noReknening;
    String nama;
    String namaIbu;
    String noHP;
    String email;

    Bank (String noRekening, String nama, String namaIbu, String noHP, String email){
        this.noReknening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.noHP = noHP;
        this.email = email;
    }

    void tampilDataNorek(){
        System.out.println("No Rekening\tNama\tNama Ibu\tNoHp\tEmail");
        System.out.println(noReknening + "\t" + nama + "\t" + namaIbu  + "\t" + noHP + "\t" + email + "\t");
    }

}
