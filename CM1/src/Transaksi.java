public class Transaksi {

    String kodeTransaksi;
    double saldo;
    double inOutSaldo;
    double finalSaldo;
    String tanggalTransaksi;
    String type;
    Bank bankAcc;

    Transaksi(String kodeTransaksi, double saldo, double inOutSaldo, double finalSaldo, String tanggalTransaksi, String type, Bank bankAcc){
        this.kodeTransaksi=kodeTransaksi;
        this.saldo=saldo;
        this.inOutSaldo=inOutSaldo;
        this.finalSaldo=finalSaldo;
        this.tanggalTransaksi=tanggalTransaksi;
        this.type=type;
        this.bankAcc=bankAcc;
    }


    void tampilDataTransaksi(){
        System.out.printf("%-15s %-15s %-10s %-15s %-15s %-20s %-10s\n",
        kodeTransaksi,
        bankAcc.noRekening,
        saldo,
        inOutSaldo,
        finalSaldo,
        tanggalTransaksi,
        type
    );
    }

    void tampilData(){
        System.out.println("Kode Transaksi    : " + kodeTransaksi);
        System.out.println("No Rekening       : " + bankAcc.noRekening);
        System.out.println("Nama              : " + bankAcc.nama);
        System.out.println("Saldo             : " + saldo);
        System.out.println("Debit/Kredit      : " + inOutSaldo);
        System.out.println("Saldo Akhir       : " + finalSaldo);
        System.out.println("Tanggal Transaksi : " + tanggalTransaksi);
        System.out.println("Type              : " + type);
    }

}
