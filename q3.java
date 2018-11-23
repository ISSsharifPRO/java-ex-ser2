import java.util.Scanner;

public class q3{ 
public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	pic(str);
}


public static void pic (String a){
	String out="";
	for(int i=a.length(); i>=2; i--){
		for (int j=0; j<=a.length()-i; j++) {
			if(ai(a.substring(j,i+j))){
				if(out.length()<a.substring(j,i+j).length())
				out = a.substring(j,i+j);
			}
		}
	}
	System.out.print(out);
}

// fun to check 'ayyneh ey'
public static Boolean ai(String a){
	Boolean res=true;
	int i = a.length();
	if(i%2==0){
		for(int j=0; j<=i/2-1; j++){
			if(a.charAt(j) != a.charAt(i-j-1))
				res=false;
		}
	}else{
		for(int j=0; j<(i-1)/2; j++){
			if(a.charAt(j) != a.charAt(i-j-1))
				res=false;
		}
	}
	
	return res;
}
}