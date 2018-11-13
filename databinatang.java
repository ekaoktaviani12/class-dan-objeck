class binatang {
	private String nama;
	private String jenis;
	private String caraberkembangbiak;
	private String makanan; 

public binatang(String nama,String jenis,String caraberkembangbiak,String makanan){
	this.nama=nama;
	this.jenis=jenis;
	this.caraberkembangbiak=caraberkembangbiak;
	this.makanan=makanan;
}
public void tampildatanya(){
        System.out.println("=======Data Binatang=======");
	System.out.println("Nama Binatang       : "+this.nama);
	System.out.println("jenis               : "+this.jenis);
	System.out.println("Cara Berkembangbiak : "+this.caraberkembangbiak);
	System.out.println("Makanan             : "+this.makanan);
}
}
public class databinatang{
public static void main(String args[]){
binatang bnt1 = new binatang ( "kambing " , " Mamalia " ," Melahirkan "," Rumput " );
bnt1.tampildatanya();
}
}