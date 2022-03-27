package Dependence;
import java.io.*;
import java.util.*;

public class main {
	public static void main(String[] args) {
		AlatMakan m1 = new AlatMakan();
		m1.setFoodName("Mie");
		m1.setAName("Garpu");
		m1.setJml(1);

		Makanan mk1 = new Makanan(m1);
	}
	

}
