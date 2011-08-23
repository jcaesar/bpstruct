package ee.ut.bpstruct2.cmd;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

public class BPStructCMDOptions {
	@Option(name="-odir", usage="Output directory")
	File odir = new File(".");
	
	@Argument
	List<String> arguments = new LinkedList<String>();
}