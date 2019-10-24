package example.pkg

class One{

	boolean crash(def source, String value) {
		println "test ${value.getClass().getShorterName()} exception"
	}

	def run(def source, int counter) {
		counter ++;
		
		(new Two()).run(source, this, counter)
	}
}