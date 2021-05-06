package ad222uk_assign1;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.style.Styler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ScatterPlot {

    public static void main(String[] args) {
        XYChart chart = new XYChartBuilder().width(800).height(600).build();
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Scatter);
        chart.getStyler().setChartTitleVisible(false);
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideSW);
        chart.getStyler().setMarkerSize(5);

        ArrayList <Integer> x = new ArrayList<Integer>();
        ArrayList <Integer> y = new ArrayList<Integer>();
        Random rand = new Random();
        int size = 1000;
        for (int i = 0; i < size; i++) {
            x.add((int) rand.nextGaussian());
            y.add((int) rand.nextGaussian());
        }

        chart.addSeries("Gaussian Blob", x, y);
        new SwingWrapper(chart).displayChart();
    }
}