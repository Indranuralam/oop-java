	class AC{
	//Atribut class pada AC{
	String merk;
	String type;

	void nyalakankan_AC(){
		System.out.println("AC menyala");
}		
	void AC_mati(){
		System.out.println("AC mati");
}
	
	public static void main(String[] args){
		
		AC ACruangan=new AC();
		ACruangan.merk="AC Split Wall";
		ACruangan.merk="AC Window";
		ACruangan.merk="AC Standing Floor";
		ACruangan.merk="AC Casette";
		ACruangan.merk="AC Split Duct / Central";
		ACruangan.merk="AC VRV";		
				
		ACruangan.type="Daikin";
		ACruangan.type="Sharp";
		ACruangan.type="Panasonic";
		ACruangan.type="Samsung";
		ACruangan.type="LG";
		
		System.out.println(ACruangan.merk);
		System.out.println(ACruangan.type);
		
		ACruangan.nyalakankan_AC();
		ACruangan.AC_mati();
	}
}