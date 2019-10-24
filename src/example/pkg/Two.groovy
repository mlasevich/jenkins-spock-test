package example.pkg

class Two{

	def run(def source, def caller, int counter) {
		if (counter > 10) {
			caller.crash(source, "Boom")
		}else {
			caller.run(source, counter)
		}
	}
}