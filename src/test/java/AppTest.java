import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void puzzledWord_shouldReplaceAWithDash_dash() {
    App app = new App();
    String puzzledWord = "-";
    assertEquals("-", App.puzzledWord("a"));
  }

  @Test
  public void puzzledWord_shouldReplaceEWithDash_dash() {
    App app = new App();
    String puzzledWord = "-";
    assertEquals("-", App.puzzledWord("e"));
  }

}
