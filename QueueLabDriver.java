
public class QueueLabDriver {

	public static void main(String[] args) {
		WaitLine waitLine = new WaitLine();
		
		// Change 'numOfTrials' to run more iterations
		int numOfTrials = 5;
		
		for (int i = 0; i < numOfTrials; i++) {
			
			try {
				waitLine.simulate( 10, 1, 4);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
			waitLine.displayResults();
			waitLine.reset();
		}
	}
}
