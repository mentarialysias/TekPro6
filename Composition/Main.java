package Composition;

import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home h1 = new Home("Mentari ", 1998, "Bandung");
		Home h2 = new Home("Alysias ", 1978, "Yogyakarta");
		Home h3 = new Home("Sudrajat", 1974, "Surabaya");
				
		List<Home> houses = new ArrayList<Home>();
		houses.add(h1);
		houses.add(h2);
		houses.add(h3);
		
		Komplek komplek = new Komplek(houses);
		System.out.print("\tDaftar Nama Pemilik Rumah Keluarga\n\n");
		System.out.println("Nama Pemilik\t\tTahun Kepemilikan\tAlamat");
		
		List<Home> hss = komplek.getTotalHousesInKomplek();
		for(Home hs : hss) {
			System.out.println(hs.pemilik + "\t\t" + hs.thnKepemilikan + "\t\t\t" + hs.alamat);
			
		}
	}

}
