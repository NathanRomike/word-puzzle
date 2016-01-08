import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;
import org.junit.*;
import static org.junit.Assert.*;

public class IntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
    public void rootTest() {
      goTo("http://localhost:4567");
      assertThat(pageSource()).contains("");
    }

  @Test
    public void singleWordInputTest() {
      goTo("http://localhost:4567");
      fill("#userWordInputForm").with("apple");
      submit(".btn-info");
      assertThat(pageSource()).contains("-ppl-");
    }

  @Test
    public void twoWordsInputTest() {
      goTo("http://localhost:4567");
      fill("#userWordInputForm").with("Hello world");
      submit(".btn-info");
      assertThat(pageSource()).contains("H-ll- w-rld");
    }
  }
