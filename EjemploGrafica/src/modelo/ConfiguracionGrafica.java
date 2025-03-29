package modelo;

import java.awt.Color;
import java.util.Random;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Douglas Soch
 */
public class ConfiguracionGrafica {

    public ChartPanel dibujar(DefaultCategoryDataset dataset) {

        // Create the chart
        JFreeChart chart = ChartFactory.createBarChart(
                "UFO Shape Statistics", // Chart title
                "Burbuja", // X-Axis Label
                "Count", // Y-Axis Label
                dataset, // Dataset
                PlotOrientation.VERTICAL, // Plot Orientation
                false, // Show Legend
                true, // Use tooltips
                false // Configure chart to generate URLs?
        );

        // Customize colors for each bar
        CategoryPlot plot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();

        // Set colors for each bar
        renderer.setSeriesPaint(0, Color.BLUE);

        ChartPanel chartpanel = new ChartPanel(chart);
        return chartpanel;
    }
    
    public DefaultCategoryDataset generarDataset ()
    {
        // Create the dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        // Random
        Random random = new Random();
       
        // Add data for UFO shapes
        dataset.addValue(100, "Burbuja", "Bullet");
        dataset.addValue(random.nextInt(200) + 100, "Burbuja", "Simp");
        dataset.addValue(random.nextInt(200) + 100, "Burbuja", "Bullet/Mel");
        dataset.addValue(random.nextInt(200) + 100, "Burbuja", "Boomerang");
        dataset.addValue(random.nextInt(200) + 100, "Burbuja", "Chevron");
        dataset.addValue(random.nextInt(200) + 100, "Burbuja", "Changing");
        dataset.addValue(random.nextInt(200) + 100, "Burbuja", "Circle");
        dataset.addValue(random.nextInt(200) + 100, "Burbuja", "Cone");
        dataset.addValue(random.nextInt(200) + 100, "Burbuja", "Copa");
       
        return dataset;
    }

}
