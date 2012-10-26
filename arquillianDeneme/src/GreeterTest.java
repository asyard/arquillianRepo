import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/*deneme testleri burada olacak*/
@RunWith(Arquillian.class)
public class GreeterTest {
	
	@Inject // PACKAGE : JAVAX.INJECT 
	Greeter greeter;
	
	@Deployment
	public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
            .addClass(Greeter.class)
            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }
	
	@Test
	public void should_create_greeting() {
        //Assert.fail("Not yet implemented");
		Assert.assertEquals("Hello, Earthling!",
	            greeter.createGreeting("Earthling"));
	        greeter.greet(System.out, "Earthling");
	}
	
	

}
