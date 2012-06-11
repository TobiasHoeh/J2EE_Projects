<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<script language="javascript" type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.js"></script>
		<script language="javascript" type="text/javascript" src="<%=request.getContextPath() %>/js/jqPlot/jquery.jqplot.min.js"></script>
		
		<script type="text/javascript" src="<%=request.getContextPath() %>/js/jqPlot/plugins/jqplot.highlighter.min.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/js/jqPlot/plugins/jqplot.cursor.min.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/js/jqPlot/plugins/jqplot.dateAxisRenderer.min.js"></script>
		
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/jqPlot/jquery.jqplot.css" />
		<title>Insert title here</title>
	</head>
<body>	
	<div id="chartdiv" style="height:400px;width:300px; "></div>
	<div id="chart1" style="height:400px;width:300px; "></div>
	<script type="text/javascript">
		$.jqplot('chartdiv',  [[[1, 2],[3,5.12],[5,13.1],[7,33.6],[9,85.9],[11,219.9]]]);
		$(document).ready(function(){
			  var line1=[['23-May-08', 578.55], ['20-Jun-08', 566.5], ['25-Jul-08', 480.88], ['22-Aug-08', 509.84],
			      ['26-Sep-08', 454.13], ['24-Oct-08', 379.75], ['21-Nov-08', 303], ['26-Dec-08', 308.56],
			      ['23-Jan-09', 299.14], ['20-Feb-09', 346.51], ['20-Mar-09', 325.99], ['24-Apr-09', 386.15]];
			  var plot1 = $.jqplot('chart1', [line1], {
			      title:'Data Point Highlighting',
			      axes:{
			        xaxis:{
			          renderer:$.jqplot.DateAxisRenderer,
			          tickOptions:{
			            formatString:'%b&nbsp;%#d'
			          } 
			        },
			        yaxis:{
			          tickOptions:{
			            formatString:'$%.2f'
			            }
			        }
			      },
			      highlighter: {
			        show: true,
			        sizeAdjust: 7.5
			      },
			      cursor: {
			        show: false
			      }
			  });
			});
	</script>
</body>
</html>