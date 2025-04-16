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
        System.out.printf("%-15s %-15s %-15s %-20s %-30s\n",
        noRekening,
        nama,
        namaIbu,
        noHP,
        email
        );
    }

}
