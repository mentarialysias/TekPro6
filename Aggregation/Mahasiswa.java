package Aggregation;
import java.util.*;
import java.io.*;

public class Mahasiswa {
	private String name;
	private int SKS;
	private String prod;
	
	Mahasiswa(){
		this.name = "";
		this.SKS = 0;
		this.prod = "";
	}
	
	Mahasiswa(String name, int SKS, String prod){
		this.name = name;
		this.SKS = SKS;
		this.prod = prod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSKS() {
		return SKS;
	}

	public void setSKS(int sKS) {
		SKS = sKS;
	}

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}
	
	

}
