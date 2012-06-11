package de.tobias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChartController {

	@RequestMapping(value = "/googleChart.do", method = RequestMethod.GET)
	public String showGoogleChart() {
		return "googleChart";
	}

	@RequestMapping(value = "/jqPlot.do", method = RequestMethod.GET)
	public String showJqPlotChart() {
		return "jqPlotChart";
	}
}
