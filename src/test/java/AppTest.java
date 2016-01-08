import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void wordPuzzle_shouldReplaceAWithDash_dash() {
    App app = new App();
    String wordPuzzleResult = "-";
    assertEquals(result, app.wordPuzzle("a"));
  }
