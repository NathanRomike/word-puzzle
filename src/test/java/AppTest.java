import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void puzzledWord_shouldReplaceAWithDash_dash() {
    App App = new App();
    String puzzledWord = "-";
    assertEquals("-", App.puzzledWord("a"));
  }
}
