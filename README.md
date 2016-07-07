# dynamic-string
a tool to append dynamic sql


When we write sql, if variable a is not null ,we should append a string to the sql, and if variable is null then we ignore that.
This lead to a lot of code .

use this tool just <code> dynamicStringAppend.appendIfNotNull(toAppend,checkVariable) </code> can do what we want do
