# Command Line Tool #

BPStruct is available as a command line tool. Please download the latest `bpstruct-x.y.z.jar file` (see in featured downloads). The usage of the command line tool is proposed below.

```
Usage:
	java -jar bpstruct.jar [options] <inputmodel>
Options:
 -dot       : Generate DOT file
 -odir FILE : Output directory
```

The tool expects `<inputmodel>` as input parameter - a file which contains a process model serialized in JSON format (for more information on the serialization format check [here](SerializationFormat.md)). Furthermore, the tool accepts two options:

  * `-dot` : If `-dot` option is specified, then no structuring takes place. Instead, the input process model is serialized in DOT ([Graphviz](http://www.graphviz.org/)) format.
  * `-odir FILE` : If `-odir` option with `FILE` parameter is specified, then all the output of the tool is forwarded to the FILE folder.

### Sample shell script ###

```
1: java -jar bpstruct-x.y.z.jar model.json
2: java -jar bpstruct-x.y.z.jar -dot model.json
3: java -jar bpstruct-x.y.z.jar -dot model.struct.json
4: dot -Tpng -omodel.png model.dot
5: dot -Tpng -omodel.struct.png model.struct.dot
```

At line 1, a process model in `model.json` gets structured; the result is serialized in `model.struct.json`. Both the input and the structured process model get serialized in DOT format at lines 2 and 3, respectively. Finally, visual representations of both process models are generated at lines 4 and 5 (in PNG format).