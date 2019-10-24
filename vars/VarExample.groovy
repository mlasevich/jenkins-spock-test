/**
 * VarExample Entry Point
 */

def call(String file="build.file") {
	echo "Called with file: ${file}"
}

def call(Map options, String file="build.file") {
	echo "Called with file: ${file} and options: ${options}"
}