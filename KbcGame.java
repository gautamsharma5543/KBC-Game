package RaceProblem_Starvation;

import java.util.Scanner;

public class KbcGame {
	
	public static void sleep(int s) {
		try {
			Thread.sleep(1000+s);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("----welcome to kbc-----------");
	sleep(4);
	System.out.println("mera name amitabh bacchan aur aap hmara sath khel rha hai kaun banage crorepati");
	sleep(2);
	System.out.println("first question for you ");
	sleep(5);
	System.out.println("Q1 who founder of sql ");
	sleep(3);
	System.out.println("option are ");
	sleep(4000);
	System.out.println("A.shakesparer \n B.nidhi\n C.willian d>none of these");
	String s=sc.next();
	sleep(3000);
	
	if(s.equalsIgnoreCase("c")){
		System.out.println("correct ans");
		System.out.println("Q2 on your screen");
		sleep(4000);
		System.out.println("Q2 what is java ");
		sleep(3);
		System.out.println("option are ");
		sleep(4000);
		System.out.println("A. country\n B.coffe shop\n C.language d.all of these");
		String s1=sc.next();
	
		if(s1.equalsIgnoreCase("d")) {
			System.out.println("correct answer");
		
		
		System.out.println("Q3 on your screen");
		sleep(4000);
		System.out.println("Q3 what is c ");
		sleep(3);
		System.out.println("option are ");
		sleep(4000);
		System.out.println("A. opps\n B.pop\n C.nothing d.opps");
		
		String s11=sc.next();
		if(s11.equalsIgnoreCase("b")) {
			System.out.println("correct answer");	
		}
			
		}
	
	}
	else {
		System.out.println("incorrect");
	}
	
}

}
