package Aggregation;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		UKM u1 = new UKM("ROBOTIKA");
		Mahasiswa m1 = new Mahasiswa("Mentari", 20, "D4-TI");
		Mahasiswa m2 = new Mahasiswa("Ayu", 20, "D4-KV");
		Mahasiswa m3 = new Mahasiswa("Alysia", 20, "D4-AE");
	
		System.out.print("\tDaftar nama anggota UKM "+ u1.getUkmName()+"\n\n");
		System.out.print("No.\t Nama \t\t SKS \t\t Prodi \n");
		System.out.print(" 1\t " + m1.getName() + "\t " + m1.getSKS() + "\t\t " + m1.getProd());
		System.out.print("\n 2\t " + m2.getName() + "\t\t " + m2.getSKS() + "\t\t " + m2.getProd());
		System.out.print("\n 3\t " + m3.getName() + "\t\t " + m3.getSKS() + "\t\t " + m3.getProd());
		
	}

}
