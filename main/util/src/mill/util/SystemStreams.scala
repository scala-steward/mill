package mill.util

import java.io.{InputStream, PrintStream}

class SystemStreams(val out: PrintStream, val err: PrintStream, val in: InputStream)
