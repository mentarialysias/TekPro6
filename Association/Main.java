package Association;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Penduduk pdk = new Penduduk("Abdul Aziz", "Blok B No. 23", "0224902409");	
		Status stt = new Status(10, 34);	
	
		System.out.println("Nama \t\t: " + pdk.getName());
		System.out.println("Alamat \t\t: " + pdk.getAddress());
		System.out.println("Telepon \t: " + pdk.getTlp());
		System.out.println("Lama Tinggal \t: " + stt.getLongTime());
		System.out.println("Usia \t\t: " + stt.getAge());
	}
}
