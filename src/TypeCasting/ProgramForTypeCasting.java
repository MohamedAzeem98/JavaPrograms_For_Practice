package TypeCasting;

public class ProgramForTypeCasting {
	
	public static void main(String[] args) {
		
		
	//b,s,i,l,f,d//	
	
		//widening/AutomaticConversion
		int s=23;
		double d=s;
		System.out.println(d);
		
		//Narrowing/ExplicitType
		double de=67.34;
		int v= (int)de;
		
		System.out.println(v+" ");
		
	}

}
