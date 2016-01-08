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

  @Test
  public void  puzzledWord_shouldReplacedApplewithDashPPLDash_dashppldash() {
    App app = new App();
    String puzzledWord = "-ppl-";
    assertEquals("-ppl-", App.puzzledWord("apple"));
  }

  @Test
  public void puzzledWord_shouldReplaceVowelsWithDashes_hdashlldashspacewdashrld() {
    App app = new App();
    String puzzledWord = "H-ll- W-rld";
    assertEquals("H-ll- W-rld", App.puzzledWord("Hello World"));
  }
}
