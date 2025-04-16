import java.util.Scanner;
public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank [] arrBank = new Bank[5];
        arrBank[0] = new Bank("16030927", "Wallace", "Mei Mei","082-458-264-3263","wallace@gmail.com");
        arrBank[1] = new Bank("16100617", "Darius", "Susanti","081-357-843-0547","darius@pt.otg");
        arrBank[2] = new Bank("16240401", "Fuller", "Rosalia","085-556-712-7062","fuller@gmail.com");
        arrBank[3] = new Bank("16270525", "Maria", "Krabela","082-267-223-0234","maria@gmail.com");
        arrBank[4] = new Bank("16101617", "Gery", "Fatimah","083-683-416-8323","gery@gery.com");

        Transaksi[] arrTransaksi =  new Transaksi[5];
        arrTransaksi[0] = new Transaksi("Tr005", 600000, 200000, 800000, "23-04-2024", "Kredit", arrBank[0]);
        arrTransaksi[1] = new Transaksi("Tr004", 500000, 150000, 650000, "23-04-2024", "Kredit", arrBank[1]);
        arrTransaksi[2] = new Transaksi("Tr003", 400000, 300000, 100000, "23-04-2024", "Debit", arrBank[2]);
        arrTransaksi[3] = new Transaksi("Tr002", 300000, 100000, 400000, "23-04-2024", "Kredit", arrBank[3]);
        arrTransaksi[4] = new Transaksi("Tr001", 200000, 100000, 100000, "23-04-2024", "Debit", arrBank[4]);
      
        ServiceTransaksi service = new ServiceTransaksi(5);

        do {
            System.out.println("==========POLINEMA BANK==========");
            System.out.println("BANK MENU:");
            System.out.println("1. Data Norek");
            System.out.println("2. Data tranksaksi");
            System.out.println("3. Search Data");
            System.out.println("4. Display min/max Saldo");
            System.out.println("5. Sort Data");
            System.out.println("6. exit");
            System.out.print("Choose Menu(1-6): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.printf("%-15s %-15s %-15s %-20s %-30s\n", "No Rekening", "Nama", "Nama Ibu", "No HP", "Email");
                    for (Bank bank : arrBank) {
                        bank.tampilDataNorek();
                    }
                    break;
                case 2:
                    System.out.printf("\"%-15s %-15s %-10.2f %-15.2f %-15.2f %-20s %-10s\n", "Kode Transaksi", "No Rekening", "Saldo", "Debit/Kredit", "Final Saldo", "Tanggal Transaksi", "Type");
                    service.tampil();
                    break;
                case 3:
                    System.out.println("Pencarian Transkasi");
                    System.out.print("Input Kode Transaksi yang Dicari: ");
                    String kode = sc.nextLine();
                    Transaksi hasil = service.cariByKodeTransaksi(kode);
                    if (hasil != null) {
                        hasil.tampilDataTransaksi();
                    } else {
                        System.out.println("Transaksi tidak ditemukan.");
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    break;
            }
        } while (true);        
    }
}
