# Template Engine

- [Template Engine](#template-engine)
  - [Requirements](#requirements)
    - [possible tests](#possible-tests)

## Requirements 
- The system replaces variable placeholders like ${firstname} and ${lastname} from a template with values provided at runtime
- The system attempts to send a template with some variables not populated will raise an error
- The system silently ignores values for variables that aren't found from the template
- The system supports full Latin-l character set in templates
- The system supports full Latin-l character set in variable values

### possible tests
- Evaluating template "Hello, ${name}" with the value "Reader" for variable "name" results in the string "Hello, Reader"
- Evaluating template "${greeting}, ${name}" with values "Hi" and "Reader", respectively, results in the string "Hi, Reader"
- Evaluating template "$Hello, ${name}" with no value for variable "name" raises a MissingValueError
- Evaluating template "Hello, ${name}" with values "Hi" and "Reader" for variables "doesnotexist" and "name", respectively, results in the string "Hello, Reader"

<!--
:%s/\(Sample \(Input\|Output\) \d:\)\n\(.*\)/```\r\r**\1**\r```\3/gc
<details>
<summary></summary>

## 
### description

### solution

</details>
-->

