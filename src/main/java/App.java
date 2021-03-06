import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/results.vtl" );

      String inputToPass = request.queryParams("userWordInputForm");
      String userWordInputString = puzzledWord(inputToPass);
      model.put("userWordInputString", userWordInputString);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String puzzledWord(String userWordInput) {
   String puzzledWord = userWordInput.replace('a', '-').replace('e', '-').replace('i', '-').replace('o', '-').replace('u', '-');
   return puzzledWord;
  }
}
