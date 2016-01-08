import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {}

    public static String puzzledWord(String userWordInput) {
     String puzzledWord = userWordInput.replace('a', '-').replace('e', '-').replace('i', '-').replace('o', '-').replace('u', '-');
     return puzzledWord;
  }
}
