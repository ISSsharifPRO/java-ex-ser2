import java.util.Scanner;
public class q5{ 
public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	for(int i=1; i<num; i++){
		int p=0 , q=0;
		p=prime(i);
		q=tavan(num,p);
		if(q != 0)
		System.out.println(p+"^"+q);
		if(p>num)
			break;
	}
}

//this is a funtion that return the (i) prime num
public static Integer prime(int a){
	int kk=0, i=2;
	for(i=2; i<=9999999; i++){
	int k=0;
		for(int j=2; j<=i; j++){
			if (i%j == 0)
				k++;
			if (k>=2)
				break;
		}
	if(k==1)
	kk++;
	if(kk == a)
		break;
	}
	return i;
}

// is a function to return power of a (prime) number in the (num) 
public static Integer tavan(int num , int prime){
	// r is the final value of power prime number
	int k = num%prime , r=0;
	while(k == 0){
		r++;
		num=num/prime;
		k = num%prime;
	}
	return r;
}
}