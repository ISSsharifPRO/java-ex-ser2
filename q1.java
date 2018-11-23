import java.util.Scanner;

public class q1{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Double deg = sc.nextDouble();
	int n = sc.nextInt();
	String a = sin(t360rad(deg));
	System.out.print(a.substring(0,n+2));
}

//this is a function to calculution the sin(x)
public static String sin(Double i){
Double o = i-Math.pow(i,3)/6+Math.pow(i,5)/120-Math.pow(i,7)/5040;
String out = o+"";
return out;
}

//this is a function to return the angle in range -360,360 degree!
public static Double t360rad(Double ii){
	Double i = ii;
	if (i>0) {
		while(i>=360){
			i-=360;
		}
	}
	if (i<0) {
		while(i<=-360){
			i += 360;
		}
	}
	if (Math.abs(i-360)<i) {
		i-=360;
	}
	i=Math.toRadians(i);
	return i;
}
}
