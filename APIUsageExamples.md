# API Usage Examples #

### Maximal Structuring ###
http://141.89.225.233/bpstruct/rest/v1/structure/max

The request:
```
{'process' : {'name' : 'test case',
  'tasks' : [
    {'id' : 'a', 'label' : 'A'},
    {'id' : 'b', 'label' : 'B'},
    {'id' : 'c', 'label' : 'C'},
    {'id' : 'd', 'label' : 'D'},
    {'id' : 'i', 'label' : 'I'},
    {'id' : 'o', 'label' : 'O'}],
   'gateways' : [
    {'id' : 'u', 'type' : 'AND'},
    {'id' : 'v', 'type' : 'XOR', 'label' : 'v'},
    {'id' : 'w', 'type' : 'XOR', 'label' : 'w'},
    {'id' : 'x', 'type' : 'AND', 'label' : 'x'},
    {'id' : 'y', 'type' : 'XOR'},
    {'id' : 'z', 'type' : 'AND'}],
  'flows' : [
    {'src' : 'i', 'tgt' : 'u', 'label' : null},
    {'src' : 'u', 'tgt' : 'a', 'label' : null},
    {'src' : 'u', 'tgt' : 'w', 'label' : null},
    {'src' : 'a', 'tgt' : 'v', 'label' : null},
    {'src' : 'w', 'tgt' : 'c', 'label' : null},
    {'src' : 'v', 'tgt' : 'b', 'label' : null},
    {'src' : 'b', 'tgt' : 'x', 'label' : null},
    {'src' : 'c', 'tgt' : 'x', 'label' : null},
    {'src' : 'x', 'tgt' : 'd', 'label' : null},
    {'src' : 'd', 'tgt' : 'y', 'label' : null},
    {'src' : 'y', 'tgt' : 'z', 'label' : null},
    {'src' : 'z', 'tgt' : 'v', 'label' : null},
    {'src' : 'z', 'tgt' : 'w', 'label' : null},
    {'src' : 'y', 'tgt' : 'o', 'label' : null}]},
  'options' : {'json' : true, 'dot' : true}}
```

The response:
```
{"process":{"name":"",
  "gateways":[
    {"id":"481fb4bb-da5a-4ddd-bc40-3934c1ff88d6","type":"XOR"},
    {"id":"5dba3e01-f597-4def-a75a-19d6380f57ab","type":"AND"},
    {"id":"2fbd2f63-3224-4c86-a195-df3a8a7f0f75","type":"XOR"},
    {"id":"5a4c1730-9d5b-4164-bbf7-2e066ced5dd6","type":"AND"},
    {"id":"f906d84e-bba3-4309-b40e-7079c3b0c655","type":"AND"},
    {"id":"bdd9da4d-69ba-46fa-a9e1-9f1279b94e68","type":"AND"}],
  "tasks":[
    {"id":"20ab4441-b09b-49b1-a38c-eac6560a9f87","label":"B"},
    {"id":"573e6b03-9aed-4622-a2ce-6ee932e8faf2","label":"B"},
    {"id":"1f26636f-1e2c-4d97-9ebe-64a1841cbdb5","label":"I"},
    {"id":"d77183f9-65e9-4ef0-bfb0-194fc1f02d22","label":"D"},
    {"id":"9beaa6f9-bbc8-413e-a520-31465df1bc96","label":"A"},
    {"id":"8260d9d4-ce15-48c7-8153-19fb698ae9bc","label":"C"},
    {"id":"b97cd316-6797-4e35-a1ea-e5d934ddd293","label":"O"},
    {"id":"6f70627e-c842-4e69-81c8-64d9683f3f0a","label":"C"}],
  "flows":[
    {"tgt":"8260d9d4-ce15-48c7-8153-19fb698ae9bc","label":"","src":"5a4c1730-9d5b-4164-bbf7-2e066ced5dd6"},
    {"tgt":"573e6b03-9aed-4622-a2ce-6ee932e8faf2","label":"","src":"9beaa6f9-bbc8-413e-a520-31465df1bc96"},
    {"tgt":"f906d84e-bba3-4309-b40e-7079c3b0c655","label":"","src":"1f26636f-1e2c-4d97-9ebe-64a1841cbdb5"},
    {"tgt":"481fb4bb-da5a-4ddd-bc40-3934c1ff88d6","label":"","src":"5dba3e01-f597-4def-a75a-19d6380f57ab"},
    {"tgt":"5a4c1730-9d5b-4164-bbf7-2e066ced5dd6","label":null,"src":"2fbd2f63-3224-4c86-a195-df3a8a7f0f75"},
    {"tgt":"481fb4bb-da5a-4ddd-bc40-3934c1ff88d6","label":"","src":"bdd9da4d-69ba-46fa-a9e1-9f1279b94e68"},
    {"tgt":"b97cd316-6797-4e35-a1ea-e5d934ddd293","label":null,"src":"2fbd2f63-3224-4c86-a195-df3a8a7f0f75"},
    {"tgt":"9beaa6f9-bbc8-413e-a520-31465df1bc96","label":"","src":"f906d84e-bba3-4309-b40e-7079c3b0c655"},
    {"tgt":"20ab4441-b09b-49b1-a38c-eac6560a9f87","label":"","src":"5a4c1730-9d5b-4164-bbf7-2e066ced5dd6"},
    {"tgt":"5dba3e01-f597-4def-a75a-19d6380f57ab","label":"","src":"20ab4441-b09b-49b1-a38c-eac6560a9f87"},
    {"tgt":"d77183f9-65e9-4ef0-bfb0-194fc1f02d22","label":"","src":"481fb4bb-da5a-4ddd-bc40-3934c1ff88d6"},
    {"tgt":"5dba3e01-f597-4def-a75a-19d6380f57ab","label":"","src":"8260d9d4-ce15-48c7-8153-19fb698ae9bc"},
    {"tgt":"6f70627e-c842-4e69-81c8-64d9683f3f0a","label":"","src":"f906d84e-bba3-4309-b40e-7079c3b0c655"},
    {"tgt":"2fbd2f63-3224-4c86-a195-df3a8a7f0f75","label":"","src":"d77183f9-65e9-4ef0-bfb0-194fc1f02d22"},
    {"tgt":"bdd9da4d-69ba-46fa-a9e1-9f1279b94e68","label":"","src":"573e6b03-9aed-4622-a2ce-6ee932e8faf2"},
    {"tgt":"bdd9da4d-69ba-46fa-a9e1-9f1279b94e68","label":"","src":"6f70627e-c842-4e69-81c8-64d9683f3f0a"}]},
"hasChanged":true,
"dot":"digraph G {\n  n20ab4441b09b49b1a38ceac6560a9f87[shape=box,label=\"B\"];\n  n573e6b039aed4622a2ce6ee932e8faf2[shape=box,label=\"B\"];\n  n1f26636f1e2c4d979ebe64a1841cbdb5[shape=box,label=\"I\"];\n  nd77183f965e94ef0bfb0194fc1f02d22[shape=box,label=\"D\"];\n  n9beaa6f9bbc8413ea52031465df1bc96[shape=box,label=\"A\"];\n  n8260d9d4ce1548c7815319fb698ae9bc[shape=box,label=\"C\"];\n  nb97cd31667974e35a1eae5d934ddd293[shape=box,label=\"O\"];\n  n6f70627ec8424e6981c864d9683f3f0a[shape=box,label=\"C\"];\n\n  n5dba3e01f5974defa75a19d6380f57ab[shape=diamond,label=\"AND\"];\n  n5a4c17309d5b4164bbf72e066ced5dd6[shape=diamond,label=\"AND\"];\n  nf906d84ebba34309b40e7079c3b0c655[shape=diamond,label=\"AND\"];\n  nbdd9da4d69ba46faa9e19f1279b94e68[shape=diamond,label=\"AND\"];\n  n481fb4bbda5a4dddbc403934c1ff88d6[shape=diamond,label=\"XOR\"];\n  n2fbd2f6332244c86a195df3a8a7f0f75[shape=diamond,label=\"XOR\"];\n\n  n5a4c17309d5b4164bbf72e066ced5dd6->n8260d9d4ce1548c7815319fb698ae9bc[label=\"\"];\n  n9beaa6f9bbc8413ea52031465df1bc96->n573e6b039aed4622a2ce6ee932e8faf2[label=\"\"];\n  n1f26636f1e2c4d979ebe64a1841cbdb5->nf906d84ebba34309b40e7079c3b0c655[label=\"\"];\n  n5dba3e01f5974defa75a19d6380f57ab->n481fb4bbda5a4dddbc403934c1ff88d6[label=\"\"];\n  n2fbd2f6332244c86a195df3a8a7f0f75->n5a4c17309d5b4164bbf72e066ced5dd6[label=\"null\"];\n  nbdd9da4d69ba46faa9e19f1279b94e68->n481fb4bbda5a4dddbc403934c1ff88d6[label=\"\"];\n  n2fbd2f6332244c86a195df3a8a7f0f75->nb97cd31667974e35a1eae5d934ddd293[label=\"null\"];\n  nf906d84ebba34309b40e7079c3b0c655->n9beaa6f9bbc8413ea52031465df1bc96[label=\"\"];\n  n5a4c17309d5b4164bbf72e066ced5dd6->n20ab4441b09b49b1a38ceac6560a9f87[label=\"\"];\n  n20ab4441b09b49b1a38ceac6560a9f87->n5dba3e01f5974defa75a19d6380f57ab[label=\"\"];\n  n481fb4bbda5a4dddbc403934c1ff88d6->nd77183f965e94ef0bfb0194fc1f02d22[label=\"\"];\n  n8260d9d4ce1548c7815319fb698ae9bc->n5dba3e01f5974defa75a19d6380f57ab[label=\"\"];\n  nf906d84ebba34309b40e7079c3b0c655->n6f70627ec8424e6981c864d9683f3f0a[label=\"\"];\n  nd77183f965e94ef0bfb0194fc1f02d22->n2fbd2f6332244c86a195df3a8a7f0f75[label=\"\"];\n  n573e6b039aed4622a2ce6ee932e8faf2->nbdd9da4d69ba46faa9e19f1279b94e68[label=\"\"];\n  n6f70627ec8424e6981c864d9683f3f0a->nbdd9da4d69ba46faa9e19f1279b94e68[label=\"\"];\n}"}

```
### Checking Structure ###
http://141.89.225.233/bpstruct/rest/v1/check/structure

The request:
```
{'process' : {'name' : 'test case',
  'tasks' : [
    {'id' : 'task1', 'label' : 'Task 1'},
    {'id' : 'task2', 'label' : 'Task 2'},
    {'id' : 'task3', 'label' : 'Task 3'},
    {'id' : 'task4', 'label' : 'Task 4'}], 
  'gateways' : [
    {'id' : 'gate1', 'type' : 'XOR'},
    {'id' : 'gate2', 'type' : 'XOR'}],
  'flows' : [
    {'src' : 'task1', 'tgt' : 'gate1', 'label' : null},
    {'src' : 'gate1', 'tgt' : 'task2', 'label' : 'x > 3'},
    {'src' : 'gate1', 'tgt' : 'task3', 'label' : 'x <= 3'},
    {'src' : 'task2', 'tgt' : 'gate2', 'label' : null},
    {'src' : 'task3', 'tgt' : 'gate2', 'label' : null},
    {'src' : 'gate2', 'tgt' : 'task4', 'label' : null}]}
```
The response:
```
{"isStructured":true}
```
### Errors ###
This example uses the process of the previous example, but two edges have been removed. The response lists the problems, that prevented the service from structuring the process

The request:
```
{'process' : {'name' : 'test case',
  'tasks' : [
    {'id' : 'task1', 'label' : 'Task 1'},
    {'id' : 'task2', 'label' : 'Task 2'},
    {'id' : 'task3', 'label' : 'Task 3'},
    {'id' : 'task4', 'label' : 'Task 4'}], 
  'gateways' : [
    {'id' : 'gate1', 'type' : 'XOR'},
    {'id' : 'gate2', 'type' : 'XOR'}],
  'flows' : [
    {'src' : 'task1', 'tgt' : 'gate1', 'label' : null},
    {'src' : 'gate1', 'tgt' : 'task2', 'label' : 'x > 3'},
    {'src' : 'gate1', 'tgt' : 'task3', 'label' : 'x <= 3'},
    {'src' : 'task3', 'tgt' : 'gate2', 'label' : null}]},
  'options': {'json': true, 'dot': true}}
```

The response:
```
{"errors":[
  "Gateway gate2 has no outgoing flow.",
  "Gateway gate2 has less than three flows."]}
```