import java.util.*;
import java.util.ArrayList;

public class RainfallStats {
	
	private List<Double> rainfall = new ArrayList<>();

	
	public int getCount() {
		int size = rainfall.size();
		return size;
	}

	public void addMeasurement(double d) {
		if(d<0) {
			String message = "Measurement is negative";
			InvalidRainfallException ex = new InvalidRainfallException(message);
			throw ex;
		}
		rainfall.add(d);	
	}

	public double getMean() {
		if(rainfall.size()==0) {
			String message = "There are no measurments";
			throw new IllegalStateException(message);
		}
		double sum=0;
		for(int i=0;i<rainfall.size();i++) {
			sum+=rainfall.get(i);
		}
		double mean=sum/rainfall.size();
		return mean;
	}

	public double getMax() {
		if(rainfall.size()==0) {
			String message = "There are no measurments";
			throw new IllegalStateException(message);
		}
		double max=0;
		for(int i=0;i<rainfall.size();i++) {
			if(rainfall.get(i)>max) {
				max=rainfall.get(i);	
			}
		}
		return max;
	}


}
