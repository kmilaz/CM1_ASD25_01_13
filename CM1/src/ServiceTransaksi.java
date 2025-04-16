public class ServiceTransaksi {
    Transaksi[] listTransaksi;
    int idx;

    ServiceTransaksi(int kapasitas) {
        listTransaksi = new Transaksi[kapasitas];
        idx = 0;
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listTransaksi[i].tampilDataTransaksi();
        }
    }

    Transaksi cariByKodeTransaksi(String kode) {
        for (int i = 0; i < idx; i++) {
            if (listTransaksi[i].kodeTransaksi.equalsIgnoreCase(kode)) {
                return listTransaksi[i];
            }
        }
        return null;
    }

    Transaksi cariMinFinalSaldo() {
        if (idx == 0) return null;

        Transaksi min = listTransaksi[0];
        for (int i = 1; i < idx; i++) {
            if (listTransaksi[i].finalSaldo < min.finalSaldo) {
                min = listTransaksi[i];
            }
        }
        return min;
    }

    void sortingFinalSaldoAsc() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listTransaksi[j].finalSaldo > listTransaksi[j + 1].finalSaldo) {
                    Transaksi temp = listTransaksi[j];
                    listTransaksi[j] = listTransaksi[j + 1];
                    listTransaksi[j + 1] = temp;
                }
            }
        }
    }
}
