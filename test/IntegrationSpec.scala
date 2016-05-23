import org.scalatestplus.play._
import play.api.test._
import play.api.test.Helpers._

/**
 * An integration test will fire up a whole play application in a browser
 */
class IntegrationSpec extends PlaySpec with OneServerPerTest with OneBrowserPerTest
    with HtmlUnitFactory {
  "Application" should {
    "work from within a browser" in {
      go to s"http://localhost:$port"
      pageSource must include ("version")
      pageSource must include ("name")
    }
  }
}
