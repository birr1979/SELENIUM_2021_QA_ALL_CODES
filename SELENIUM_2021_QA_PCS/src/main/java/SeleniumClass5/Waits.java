package SeleniumClass5;

public class Waits {

    /*
     * There are situations where the page loads slowly or an element
     * on a page does not load in time.
     *
     * In these situations, WebDriver will continue looking for the element
     * to interact with, but if it's not found, will throw a NoSuchElement
     * or an ElementNotFound exception.
     *
     * To avoid these types of synchronization issues, WebDriver provides
     * a couple different options.
     *
     * Both of the options below allow WebDriver to pause for a period of time
     * to allow for the loading of the page or web element
     */

    /*
     * Implicit Waits
     * - We are providing a universal wait time for all steps
     * of a test script
     *
     * - Whatever wait time we provide, WebDriver will wait for
     * that amount of time, before throwing an ElementNotFound Exception
     *
     * - Will wait for the specified amount of time IF the element is not
     * present on the page immediately - if the element is present on the page (DOM)
     * then the implicit wait time won't apply
     *
     * - Implemented using a 1 line piece of code which utilizes the Options interface,
     * as well as the Timeouts Interface
     * 	ex: driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     *
     */

    /*
     * Explicit Waits
     * - We are providing a localized wait time for each individual step of a test script
     *
     * - Whatever wait time we provide, WebDriver will implement it based on a specified
     * condition
     *
     * - 2 Classes that are involved with Explicit Waits
     *  1. WebDriverWait
     *  2. ExpectedConditions
     *
     *  - The more preferred way to implement wait times because we can have more control
     *  over the test execution time
     */

}
