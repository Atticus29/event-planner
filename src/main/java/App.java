import java.io.Console;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;


public class App{
	public static void main(String[] args) {
		String layout = "templates/layout.vtl";

		get("/", (request, response) -> {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("template", "templates/main-form.vtl");
			// String usrSelection = request.queryParams("option");
			// if(usrSelection.equals(""))
			// model.put("option", usrSelection);
			return new ModelAndView(model, layout);
		}, new VelocityTemplateEngine());

		get("/display", (request, response) ->{
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("template", "templates/display.vtl");
			model.put("option", request.queryParams("option"));
			Event randomEvent = new Event();
			model.put("eventObj", randomEvent);
			return new ModelAndView(model, layout);
		}, new VelocityTemplateEngine());

		get("/total", (request, response) -> {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("template", "templates/total.vtl");
			Event customEvent = new Event();
			model.put("eventObj", customEvent);
			model.put("guestnumber", request.queryParams("guestnumber"));
			model.put("customfood", request.queryParams("customfood"));
			model.put("custombeverage", request.queryParams("custombeverage"));
			model.put("custom-entertainment", request.queryParams("custom-entertainment"));
			return new ModelAndView(model,layout);
		}, new VelocityTemplateEngine());

	}
}
