### Java Variable
* Variables are container for storing data values.

* In Java, different types of variables 
1. byte
2. short
3. int
4. long
5. float 
6. double
7. boolean
8. char

#### Declaring variable 
* To crate a variable, you mush specify the type and assign it a value

type variableName = value;

* The equal sign is used to assign values to the variable.

``` int age = 22; ```

* You can also declare variable without assign value, and assign value later.

``` int age; ```
``` age = 22 ```

* If you assign a new value to existing variable, it will overwrite previous value

``` int age = 22; ```
``` age = 26; ```

#### Final variable
* If you don't want others to overwrite existing value, use final keyword.

``` final int age = 22; ```
``` age = 25; ``` it will generate an error.

### Identifiers
* All java variables must be identified with unique names.
* This unique names called identifiers.
* Identifiers can be short (like x, a) or more descriptive names in order to create understandable and maintainable code.

#### The general rules for naming variable are 
* Names can be contain letter, digits, underscore, and dollar signs
* Names must begin with a letter
* Names should start with a lowercase letter and can't contain whitespace
* Names can also begin with $ and _
* Names are case sensitive.
* Reserved word can't be used as names

