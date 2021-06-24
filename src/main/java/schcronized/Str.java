package schcronized;

public class Str {
StringBuffer sf ;
StringBuilder sl;
Str(StringBuffer sf,StringBuilder sl){
	this.sf=sf;
	this.sl=sl;
}

public StringBuffer appendBuffer() {
	sf=sf.append("ab");
	return sf;
}
public StringBuilder appendBuilder() {
	sl=sl.append("xy");
	return sl;
}

}
