package collection;

public class Compare implements Comparable<Compare>{
  int rollNo;
  String name;
  int age;
  Compare(int rollNo, String name,int age){
	  this.rollNo=rollNo;
	  this.name=name;
	  this.age=age;
  }
	@Override
	public int compareTo(Compare o) {
		if(this.rollNo==o.rollNo) {
			return 0;
		}
		else if (this.rollNo<o.rollNo) {
			return 1;
		}
		else 
			return -1;
		
	}

}
