## BPStruct Serialization Format ##

This page is currently used for the discussions on the design of the  BPStruct JSON serialization format. For the details on JSON please see http://www.json.org/

```
process 
  { pair_name, pair_tasks, pair_gateways, pair_flows }

pair_name
  name  : string

pair_tasks
  tasks : [ elements_task ]

pair_gateways
  gateways : []
  gateways : [ elements_gateway ]

pair_flows
  flows : []
  flows : [ elements_flow ]

elements_task
  task
  task, elements_task

elements_gateway
  gateway
  gateway, elements_gateway

elements_flow
  flow
  flow, elements_flow

task
  { id : UID, label : string }

gateway
  { id : UID, type : gateway_type }

flow 
  { src : UID, tgt : UID, label : strnull }

strnull
  string
  null

UID
  unique identifier

gateway_type
  'XOR'
  'AND'
  'OR'
```


### Serialization format correctness criteria ###
  * All UIDs must be unique within a single process

### Structural correctness criteria ###
  * Process must contain at least one task
  * Every task has at most one incoming and at most one outgoing flow
  * Every gateway has at least one incoming, at least one outgoing, and at least three incident flows
  * Process must contain at least one source task, i.e., a task without incoming flow
  * Process must contain at least one sink task, i.e., a task without outgoing flow
  * Every node (task or gateway) is on a path from some source to some sink

### Behavioral correctness criteria ###
  * Process must be sound.