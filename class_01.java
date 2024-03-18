package study;

import java.util.Scanner;

public class class_01 {
	public static void main(String[] args) {
		System.out.println("Hello");    // 1번
		
		System.out.println("Hello World"); // 2번
		
		System.out.println("Hello" + '\n' + "World"); // 3번
		
		System.out.println("\'Hello\'"); // 4번
		
		System.out.println("\"Hello World\""); // 5번
		
		System.out.printf("C:\\Download\\hello.java"); // 6번
		
		
		Scanner scan = new Scanner(System.in);// 7번
		int i = scan.nextInt(); // 키보드 입력을 받는 부분
		System.out.println(i); // 키보드로부터 정수 입력받음
		
//		int number = 15; // 변수에 직접 값 할당 // 7번
//		System.out.println(number); // 입력된 정수 출력
		
		Scanner scanner = new Scanner(System.in); // 8번
		String str = scanner.nextLine();
		System.out.println(str);
		
		Scanner scan1 = new Scanner(System.in); // 9번 float형
		float f = scan1.nextFloat(); // float형 실수
		System.out.println(f);
		
		Scanner scan2 = new Scanner(System.in); // 9번 double형
		double d = scan2.nextDouble(); // double형 실수
		System.out.println(d);
		
		Scanner scan3 = new Scanner(System.in); // 10번
		int num = scan3.nextInt();
		int num2 = scan3.nextInt();
		System.out.print(num + " " + num2);
		
		Scanner scan4 = new Scanner(System.in); // 11번
		String a = scan4.next();
		String b = scan4.next();
		System.out.println(b + " " + a);
		
		Scanner scan5 = new Scanner(System.in); // 12번
		System.out.println("단어를 입력해주세요 :");
		String word = scan5.nextLine();
		System.out.println(word);
		
		Scanner scan6 = new Scanner(System.in); // 13번
		System.out.println("입력해 주세요 :");
		float num3 = scan6.nextFloat();
		System.out.printf("%.2f",1.59654);
		
		Scanner scan7 = new Scanner(System.in); // 14번
		int hour = scan7.nextInt();
		int minute = scan7.nextInt();
		System.out.println(hour + ":" + minute);
		
		

	}

}
