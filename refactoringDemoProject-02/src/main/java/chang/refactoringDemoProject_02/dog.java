package chang.refactoringDemoProject_02;

public class dog { 
	public static void main(String[] args) {
		
		int times=10;
		sayWangWang(times);
	}

	private static void sayWangWang(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("汪汪汪");
			
		}
	}
	
}
