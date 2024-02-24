import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

class Main {

    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);

        System.out.print("Nama : ");
        String inputNama = objInput.nextLine();
        System.out.print("Jenis Kelamin (L/P) : ");
        String inputJenisKelamin = objInput.nextLine();
        System.out.print("Tanggal Lahir (yyyy-mm-dd) : ");
        String inputTanggalLahir = objInput.nextLine();

        String jenisKelamin = "";

        if (inputJenisKelamin.equals("P")) {
            jenisKelamin = "Perempuan";
        }
        else if (inputJenisKelamin.equals("L")) {
            jenisKelamin = "Laki-laki";
        }

        LocalDate tanggalLahir = LocalDate.parse(inputTanggalLahir);
        Period umur = Period.between(tanggalLahir, LocalDate.now());

        System.out.println("Nama : " + inputNama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur Anda : " + umur.getYears() + " tahun " + umur.getMonths() + " bulan");
    }
}