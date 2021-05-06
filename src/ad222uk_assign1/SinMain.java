package ad222uk_assign1;

import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SinMain {

	 public static void main(String[] args) {
		 ArrayList<Double> x = new ArrayList<Double>();
		 ArrayList<Double> y = new ArrayList<Double>();

	        double num = 0;
	        while (num < 2 * Math.PI) {
	        	x.add(num);
	            y.add((1 + num / Math.PI) * cos(num) * cos(40 * num));
	            num += 0.01f;
	        }

	        XYChart chart = QuickChart.getChart( "X", "Y", "X(Y)", "Y(X)", x, y);
	        new SwingWrapper(chart).displayChart();
	    }

	private static double cos(double d) {
	      double radians = Math.toRadians(d);
		return d;
	}
	}
