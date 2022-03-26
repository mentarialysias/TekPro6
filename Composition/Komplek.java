package Composition;
import java.util.*;
import java.io.*;

public class Komplek {
	private final List<Home> houses;
	Komplek (List<Home> houses){
		this.houses = houses;
	}
	public List<Home> getTotalHousesInKomplek(){
		return houses;
	}
}
