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
        System.out.println("Kode Transaksi\tNo Rekening\tSaldo\tDebit/Kredit\tFinal Saldo\tTanggal Transaksi\tType");
        System.out.println(kodeTransaksi + "\t" + bankAcc.noRekening() + "\t" + saldo + "\t" + inOutSaldo + "\t" + finalSaldo + "\t" + tanggalTransaksi + "\t" + type + "\t");
    }
}
