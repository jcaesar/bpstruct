# REST API #

This page list the current status of the BPStruct REST API and further remarks regarding the usage.
A publicly available version of the service is located at: [http://141.89.225.233/bpstruct/rest](http://141.89.225.233/)

### A Structuring Request ###

A structuring request consists of two parts, a process model and a collection of options. The content is serialized in the JSON format and submitted with a POST request to the RESTful service.
The options are completely optional, any single or no option value can be submitted with the request. If no option value is submitted, the default value is used.
```
request
  {process : process, options : options}

options
  {json : Boolean, dot : Boolean}
```

### Options ###

  * json (default: true):
> > a JSON representation of the structuring result is returned if set to true
  * dot (default: false):
> > a DOT representation of the structuring result is returned if set to true

See [this page](SerializationFormat.md) for information about the serialization format of a process model.

---

## API ##
The BPStruct REST API currently covers two different calls. You can find some examples of the usage [here](APIUsageExamples.md).

### /v1/structure/max ###

Perform maximal structuring of a process model.

Options: json, dot

Response:
```
{process : process, dot : string, hasChanged : Boolean}
```

  * process (optional): the JSON representation of the structured process
  * dot (optional): a String containing the DOT representation of the structured process
  * hasChanged: indicates if the structuring could be done

### /v1/check/structure ###

Check structure of a process model.

Options: none

Response:
```
{isStructured : Boolean}
```

  * isStructured: indicates whether the submitted process is already structured

### Errors ###

While processing a request, several errors could occur. In this case an error response is returned instead of the normal response, which contains a list of errors.

Response:
```
{errors : [elements_error]}	

elements_error
  string
  string, elements_error
```

### Hints ###

The IDs of all process elements are just used to detect the structure and change while structuring. So don't rely on the IDs to recognize the tasks afterwards, rather use the task labels, which will not change.