public class PersonAksi{
	public static void main(String[] args){
	//membuat object Anton
	Person anton = new Person();
	
	/* memanggil atribut dan memberi nilai */
	
	anton.setNama("Anton");
	anton.setJenisKelamin("Laki-laki");
	anton.setUmur(19);
	System.out.println("Nama: " + anton.getNama());
	System.out.println("Jenis Kelamin: " + anton.getJenisKelamin());
	System.out.println("Umur: " + anton.getUmur());
	
	//membuat object Riko
	Person riko = new Person();
	
	/*memanggil atribut dan memberi nilai*/
	
	riko.setNama("Riko");
	riko.setJenisKelamin("Laki-laki");
	riko.setUmur(29);
	System.out.println("Nama: " + riko.getNama());
	System.out.println("Jenis Kelamin: " + riko.getJenisKelamin());
	System.out.println("Umur: " + riko.getUmur());
	
	}
}