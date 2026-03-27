package org.eclipse.epsilon.netlist.cli;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
	subcommands = { Merge.class, Validate.class },
	name="netlist-cli",
	version="1.0.0",
	mixinStandardHelpOptions = true
)
public class Launcher {

	public static void main(String[] args) {
		int exitCode = new CommandLine(new Launcher()).execute(args);
		System.exit(exitCode);
	}

}
