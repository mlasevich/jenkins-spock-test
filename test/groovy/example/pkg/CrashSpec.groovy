package example.pkg

import spock.lang.Specification
import example.pkg.One

public class CrashSpec extends Specification {

	def "Demonstrate Crash With No Stack Trace" () {
		
		given:
		def object = new One()
		
		when:
		//try {
			object.run(this, 0)
		//} catch (Exception ex) {
		//	ex.printStackTrace()
		//}

		then:
		noExceptionThrown()
	}
}