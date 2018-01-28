package loop;
public enum pieces {
//Tout les piéces:	
	VIDE(" ",false,false,false,false,0,0),
	ONE_CON_N("/u257D",false,false,true,false,1,0),
	ONE_CON_E("/u257E",true,false,false,false,1,1),
	ONE_CON_S("/u257F",false,false,false,true,1,2),
	ONE_CON_O("/u257C",false,true,false,false,1,3),
	TWO_CON_NS("/u2502",false,false,true,true,2,0),
	TWO_CON_EO("/u2500",true,true,false,false,2,1),
	THREE_CON_NEO("/u2534",true,true,true,false,3,0),
	THREE_CON_NSE("/u251C",true,false,true,true,3,1),
	THREE_CON_ESO("/u252C",true,true,false,true,3,2),
	THREE_CON_OSN("/u2524",false,true,true,true,3,3),
	FOUR_CON("/u253D",true,true,true,true,4,0),
	L_NE("/u2514",true,false,true,false,5,0),
	L_ES("/u250C",true,false,false,true,5,1),
	L_SO("/u2510",false,true,false,true,5,2),
	L_ON("/u2518",false,true,true,false,5,3),
	
	;

	
	
	
	
	
	
	
			
			
			
	
			
			
					
			
			
	//les spécificités de chaque piéce
	private final String ref;
	private final boolean est;
	private final boolean ouest;
	private final boolean nord;
	private final boolean sud;
	private final int num;
	private final int orientation;
	

	
	
	//Constructeur des piéces:
 pieces(String ref, boolean est, boolean ouest,boolean nord, boolean sud,int num,int orientation) {
	this.ref=ref;
	this.est=est;
	this.ouest=ouest;
	this.nord=nord;
	this.sud=sud;
	this.num=num;
	this.orientation=orientation;
	
}
public int getNum() {
	return num;
}
public int getOrientation() {
	return orientation;
}
 
 
//getteur de la reférence des piéces:
public String getRef() {
	return ref;
}
//getteur des directions
public boolean getEst() {
	return est;
}
public boolean getOuest() {
	return ouest;
}
public boolean getNord() {
	return nord;
}
public boolean getSud() {
	return sud;
}

// Getteur de nbreConex des piéces , sert a la comparaison entre deux piéces
public  int nbreConex() {
	int i=0;
	if (this.getEst())
		i++;
	if (this.getNord())
		i++;
	if (this.getOuest())
		i++;
	if (this.getSud())
		i++;
	return i;
}


	
}
