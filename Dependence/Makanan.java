package Dependence;

public class Makanan {
	public String foodName;
	public String alatMakanName;
	public int jumlah;
	

	public Makanan(AlatMakan alatMakan) {
		foodName = alatMakan.getFoodName();
		alatMakanName = alatMakan.getAName();
		jumlah = alatMakan.getJml();
		
		System.out.println("Nama Makanan : " + foodName);
		System.out.println("Alat Makan : " + alatMakanName);
		System.out.println("Jumlah Alat Makan : " + jumlah);
	}

	public String getAlatMakanName() {
		return alatMakanName;
	}

	public void setAlatMakanName(String alatMakanName) {
		this.alatMakanName = alatMakanName;
	}

	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

}
