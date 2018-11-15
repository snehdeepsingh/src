import java.io.*;

public class RainfallProgram {
	public static void main(String[] args) throws IOException {
		BufferedReader keyboard = new BufferedReader(
			new InputStreamReader(System.in)
		);
		
		RainfallStats stats = new RainfallStats();
		System.out.println("Enter rainfall measurements (in mm), or \"end\" to stop.");
		
		while(true) {
			System.out.print("> ");
			String line = keyboard.readLine();
			
			if("end".equals(line)) {
				break;
			}
			double value = Double.parseDouble(line);
			try {
				stats.addMeasurement(value);
			} catch(InvalidRainfallException ex) {
				System.out.println("Failed to add value.");
				System.out.println("The exception message was: " + ex.getMessage());
			}
		}
		if(stats.getCount()==0) {
			System.out.println(stats.getCount() + " measurement(s) entered.");
			}
		else {
		System.out.println(stats.getCount() + " measurement(s) entered.");
		System.out.println("Mean rainfall: " + stats.getMean() + " mm");
		System.out.println("Maximum rainfall: " + stats.getMax() + " mm");
		}
		}
}
