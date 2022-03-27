package Association;
import java.util.*;

public class Penduduk {
	private String name;
	private String address;
	private String tlp;
	private Status stt;
	
	public Penduduk(String name, String address, String tlp) {
		this.name = name;
		this.address = address;
		this.tlp = tlp;
		stt = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTlp() {
		return tlp;
	}

	public void setTlp(String tlp) {
		this.tlp = tlp;
	}
	public Status getStatus() {
		return stt;
	}
	public void setStatus(Status stt) {
		this.stt = stt;
	}

}
