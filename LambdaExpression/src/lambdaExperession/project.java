package lambdaExperession;

public class project {
	public static void main(String[] args) {
		// Legacy Structure
		// require to add unimplemented method

		Working w = new Working() {

			@Override
			public void work(int employees) {
				System.out.println(employees + " employees are working in current project");
			}
		};
		w.work(10);

		// Using Lambda Expression
		// Used to implement the functional interface,reuse the code and reduce the line
		// of code
		// (Argument)-> {Implementation}
		Working w2 = (employees) -> {
			System.out.println(employees + " employees are working in the current project (Lambda)");
		};
		w2.work(5);

	}
}
