# Structuring Behavioral Models using BPStruct @ Signavio AI #

by Artem Polyvyanyy`*`, Luciano García-Bañuelos, Dirk Fahland,
Marlon Dumas, and Mathias Weske

`*` _corresponding author_

BPStruct is a tool for transforming unstructured programs/service compositions/(business) process models into well-structured ones. A model is well-structured, if for every node with multiple outgoing arcs (a split) there is a corresponding node with multiple incoming arcs (a join), and vice versa, such that the fragment of the model between the split and the join forms a single-entry-single-exit (SESE) component; otherwise the model is unstructured. The transformation preserves concurrency in resulting well-structured models.

## Key Publications ##
  * Artem Polyvyanyy. _Structuring Process Models_. University of Potsdam, Germany, January 2012 [link](http://nbn-resolving.de/urn:nbn:de:kobv:517-opus-59024)
  * Artem Polyvyanyy, Luciano García-Bañuelos, and Marlon Dumas. _Structuring Acyclic Process Models_. Information Systems (IS), 2011
  * Artem Polyvyanyy, Luciano García-Bañuelos, Dirk Fahland, and Mathias Weske. _Maximal Structuring of Acyclic Process Models_. The Computing Research Repository (CoRR), August 2011
  * Marlon Dumas, Luciano García-Bañuelos, and Artem Polyvyanyy. _Unraveling Unstructured Process Models_. Proceedings of the 2nd International Workshop on BPMN (BPMN). Potsdam, Germany, October 2010
  * Artem Polyvyanyy, Luciano García-Bañuelos, and Marlon Dumas. _Structuring Acyclic Process Models_. Proceedings of the 8th International Conference on Business Process Management (BPM). Hoboken, NJ, US, September 2010
  * Artem Polyvyanyy, Jussi Vanhatalo, and Hagen Voelzer. _Simplified Computation and Generalization of the Refined Process Structure Tree_. Proceedings of the 7th International Workshop on Web Services and Formal Methods (WS-FM). Hoboken, NJ, US, September 2010

# Ten Steps Towards Structuring #

### 1. Go to Signavio AI page at http://academic.signavio.com/p/login. Register and login. ###

![http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step1.png](http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step1.png)

### 2. Repository view opens. ###

![http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step2.png](http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step2.png)

### 3. Start modeling by selecting "New > Business Process Diagram (BPMN 2.0)" from the main menu. ###

![http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step3.png](http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step3.png)

### 4. Editor view opens. ###

![http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step4.png](http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step4.png)

### 5. Compose process model by using shapes from the "Shape Repository" on the left. For instance, compose process model shown in the figure below. ###

![http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step5.png](http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step5.png)

### 6. Request structuring by selecting "Process Structuring" from the main menu. ###

![http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step6.png](http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step6.png)

### 7. Information box opens. Select "Transform" to request structuring. ###

![http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step7.png](http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step7.png)

### 8. The result of structuring is presented. Press "Ok". ###

![http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step8.png](http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step8.png)

### 9. Manually improve the automated layout of the structured process model. For instance, similar as it is shown in the figure below. ###

![http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step9.png](http://bpt.hpi.uni-potsdam.de/pub/Public/ArtemPolyvyanyy/SignavioAI_step9.png)

## 10. TRY IT YOURSELF!!! ##