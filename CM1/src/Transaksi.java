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

}
