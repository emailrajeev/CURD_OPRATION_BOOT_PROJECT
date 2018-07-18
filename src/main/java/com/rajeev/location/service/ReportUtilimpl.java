package com.rajeev.location.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;
@Component
public class ReportUtilimpl implements ReportUtil {

	 
	public void genratePieChart(String path, List<Object[]> data) {
		DefaultPieDataset dataset=new DefaultPieDataset();
		for(Object[]objects:data) {
			dataset.setValue(objects[0].toString(), new Integer(objects[1].toString()));
		}
		JFreeChart chart=ChartFactory.createPieChart3D("Location_Type",dataset);
		try {
			ChartUtilities.saveChartAsJPEG(new File(path+"/piechart.jpeg"), chart, 300, 300);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
