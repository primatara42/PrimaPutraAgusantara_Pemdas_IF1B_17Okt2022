package packageprima;

import java.io.BufferedReader;
import java.util.Scanner;

public class Latihan1 
{
	public static void main(String[] args) 
	{
		//DEKLARASI
		Scanner input = new Scanner(System.in);
		
		String kodePesawat, namaMaskapai = null, jenisKelas = null;
		char kodeKelas;
		int jumlahTiket, hargaTiket = 0, total;
		
		//INPUT
		System.out.println("===SILAHKAN MASUKKAN KODE PESAWAT, KODE KELAS DAN JUMLAH TIKET YANG DIINGINKAN");
		
		System.out.print("Masukkan Kode Pesawat \t: ");
		kodePesawat = input.nextLine();
		
		System.out.print("Masukkan Kode Kelas \t: ");
		kodeKelas = input.next().charAt(0);
		
		System.out.print("Masukkan Jumlah Tiket \t: ");
		jumlahTiket = input.nextInt();
		
		//PROSES
		if(kodePesawat.equalsIgnoreCase("GA"))
		{
			if(kodeKelas == 'B')
			{
				namaMaskapai = "Garuda Indonesia";
				jenisKelas = "Bisnis";
				hargaTiket = 2200000;
			}
			
			else if(kodeKelas == 'E')
			{
				namaMaskapai = "Garuda Indonesia";
				jenisKelas = "Ekonomi";
				hargaTiket = 1600000;
			}
		}
		
		else if(kodePesawat.equalsIgnoreCase("SR"))
		{
			if(kodeKelas == 'B')
			{
				namaMaskapai = "Sriwijaya Air";
				jenisKelas = "Bisnis";
				hargaTiket = 1700000;
			}
			
			else if(kodeKelas == 'E')
			{
				namaMaskapai = "Sriwijaya Air";
				jenisKelas = "Ekonomi";
				hargaTiket = 1400000;
			}
		}
		
		else if(kodePesawat.equalsIgnoreCase("LI"))
		{
			if(kodeKelas == 'B')
			{
				namaMaskapai = "Lion Air";
				jenisKelas = "Bisnis";
				hargaTiket = 1500000;
			}
			
			else if(kodeKelas == 'E')
			{
				namaMaskapai = "Lion Air";
				jenisKelas = "Ekonomi";
				hargaTiket = 1200000;
			}
		}
	
		hargaTiket = hargaTiket*jumlahTiket;
		
		//OUTPUT
		System.out.println("\n");
		System.out.println("===BUKTI PEMESANAN===");
		System.out.println("Anda Memilih Maskapai " + namaMaskapai);
		System.out.println("Dengan Kelas " + jenisKelas);
		System.out.println("Tiket yang Dipesan Sebanyak " + jumlahTiket + " Tiket");
		System.out.println("Total Harga : " + hargaTiket);
		
	}
}
