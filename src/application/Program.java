package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		
		
		System.out.print("How many students for course A? ");
		int numberOfStudentsCourseA = sc.nextInt();
		
		for(int i=1; i<=numberOfStudentsCourseA; i++){
			System.out.print("Enter " + "#" + i + " student number: ");
			int studentNumber = sc.nextInt();
			courseA.add(studentNumber);	
		}
		
		System.out.print("How many students for course B? ");
		int numberOfStudentsCourseB = sc.nextInt();
		
		for(int i=1; i<=numberOfStudentsCourseB; i++){
			System.out.print("Enter " + "#" + i + " student number: ");
			int studentNumber = sc.nextInt();
			courseB.add(studentNumber);
		
		}
		System.out.print("How many students for course C? ");
		int numberOfStudentsCourseC = sc.nextInt();
			
		for(int i=1; i<=numberOfStudentsCourseC; i++){
			System.out.print("Enter " + "#" + i + " student number: ");
			int studentNumber = sc.nextInt();
			courseB.add(studentNumber);
		
		}	
		
		Set<Integer> allCourses = new HashSet<>();
		allCourses.addAll(courseA);
		allCourses.addAll(courseB);
		allCourses.addAll(courseC);
		
		System.out.print("Total students: " + allCourses.size());
		
		sc.close();

	}

}
;