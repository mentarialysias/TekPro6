package Association;
import java.util.*;

public class Status {
	private int longTime;
	private int age;
	private Penduduk pdk;
	
	public Status(int longTime, int Age) {
	this.longTime = longTime;
	this.age = Age;
	pdk = null;
	}

	public int getLongTime() {
		return longTime;
	}

	public void setLongTime(int longTime) {
		this.longTime = longTime;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		age = age;
	}
	public Penduduk getPdk() {
		return pdk;
	}
	public void setPdk(Penduduk pdk) {
		this.pdk = pdk;
	}
	
}
