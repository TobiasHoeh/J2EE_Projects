package de.tobias.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

@Path("/chart")
public class ChartService {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/Google")
	public String showGoogleChart() {
		return "googleChart";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/JqPlot")
	public String showJqPlotChart() {
		return null;
	}
}