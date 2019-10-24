package example.pkg

import spock.lang.Specification
import example.pkg.One

public class CrashSpec extends Specification {

	def "Demonstrate Crash With No Stack Trace" () {
		when:
		def object = new One()

		then:
		//try {
			object.run(this, 0)
		//} catch (Exception ex) {
		//	ex.printStackTrace()
		//}
	}
}