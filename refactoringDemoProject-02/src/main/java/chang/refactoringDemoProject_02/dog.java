package chang.refactoringDemoProject_02;

public class dog extends Animal{ 
	public static void main(String[] args) {
		Animal dog =new dog();
		int times=10;
		dog.sayWangWangNew(times);  
	}

	public void sayWangWangNew(int times) { 
		for (int i = 0; i < times; i++) {
			System.out.println("汪汪汪");
			
		}
	}


	
}
