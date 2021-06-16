package immutable;

final public class Address {
  public final StringBuilder area;
  public final String state;
  public final int pincode;
  
   Address(StringBuilder area,String state,int pincode){
	 this.area=new StringBuilder(area);
	  // this.area=area;
	 this.state=state;
	 this.pincode=pincode;
	  }
 
  
}
