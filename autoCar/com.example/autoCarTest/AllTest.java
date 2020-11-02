package autoCarTest;

//import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectClasses( { roadTest.class, urbanTest.class, ruralTest.class } )
class AllTest {

}
