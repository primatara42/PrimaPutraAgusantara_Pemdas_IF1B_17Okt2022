package packageprima;

import java.util.Scanner;

public class Latihan3 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		byte pilihan = 0;
		
		//RUMUS PERSEGI PANJANG
		int panjangPersegi = 0, lebarPersegi = 0, luasPersegi;
		
		//RUMUS SEGITIGA
		double alasSegitiga = 0, tinggiSegitiga = 0;
		double luasSegitiga;
		
		//RUMUS LINGKARAN
		double jariJari = 0;
		double pi = 3.14, luasLingkaran;
		
		
		System.out.println("=============================");
		System.out.println("      LUAS BANGUN DATAR      ");
		System.out.println("=============================");
		
		System.out.println("1. Persegi Panjang");
		System.out.println("2. Segitiga");
		System.out.println("3. Lingkaran");
		
		System.out.print("Masukkan Pilihan Anda <1/2/3> = ");
		pilihan = input.nextByte();
		
		switch(pilihan)
		{
			case 1 :
			{
				System.out.print("\n");
				System.out.println("Anda Memilih Luas Persegi Panjang");
				System.out.print("Masukkan Panjang Persegi = ");
				panjangPersegi = input.nextInt();
				
				System.out.print("Masukkan Lebar Persegi = ");
				lebarPersegi = input.nextInt();
				
				luasPersegi = panjangPersegi * lebarPersegi;
				System.out.println("Luas Persegi = " + luasPersegi);
			}
			break;
			
			case 2 : 
			{
				System.out.print("\n");
				System.out.println("Anda Memilih Luas Segitiga");
				System.out.print("Masukkan Alas Segitiga = ");
				alasSegitiga = input.nextDouble();
				
				System.out.print("Masukkan Tinggi Segitiga = ");
				tinggiSegitiga = input.nextDouble();
				
				luasSegitiga = 0.5*alasSegitiga*tinggiSegitiga;
				System.out.println("Luas Segitiga = " + luasSegitiga);
			}
			break;
			
			case 3 :
			{
				System.out.print("\n");
				System.out.println("Anda Memilih Luas Lingkaran");
				System.out.print("Masukkan Jari - Jari Lingkaran = ");
				jariJari = input.nextDouble();
				
				luasLingkaran = pi*jariJari*jariJari; 
				System.out.println("Luas Lingkaran = " + luasLingkaran);
			}
			break;
			
			default : System.out.println("Masukkan Angka 1-3!");
		}
		
		
		
	}
}
