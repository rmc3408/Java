# java
Java lectures from Centennial 



## Week 04






## Week 03

- Array
To pass an array argument to a method, specify the name of the
array without any brackets.

Since every array object “knows” its own length, we need not
pass the array length as an additional argument.

To receive an array, the method’s parameter list must specify an array parameter.

When an argument to a method is an entire array or an individual array element of a reference type, the called method receives a copy of the reference.

When an argument to a method is an individual array element of a primitive type, the called method receives a copy of the
element’s value.



** Method call stack. Is the order methods are pile in memory.
mehtod how program return to caller. (PILE of DISHES)

Fist is push onto bottom of pile. Lat item onto stack(on top) will be the first to be called (popped out). 

Argument promotion - converting an argument’s value, method receive parameter integers but will return double. They are automatic converted.


* Non-static methods are typically called instance methods.
Call by `ObjectName.method` 

* Static method wii be a method performs a task that does not depend on an object. Just to perform tasks.
Call by `ClassName.Method`
if in same class, just method name.

To perform tasks:
One example is static predefined class Math = `Math.pow`

- If a boolean is concatenated with a String, the boolean is converted to the String "true" or "false".

When an object is concatenated with a String, the object’s toString method is implicitly called to obtain the String representation of the object






## Week 02
_import_ used to predefined methods and classes available in the Java Application Programming Interface and in other class libraries

classes are typically grouped into __packages__ so that they can be imported into programs and reused

Classes and methods help you modularize a program by separating its tasks into self-contained units.


_public_ = to be access from other areas, classes.
_private_ = variables will be only access by same class methods


methods = acess modifier + Static(or not) + Return type

Constructor = To create a object. 
If a class does not define constructors, the compiler provides a default constructor with no parameters. But if you declare, default is not created.






## Week 01
Scanner out = Display data to screen or printer

Scanner in = Get USER input from object, file, mouse , keyboard


* Class name = Capital letter in every word - Pascal casing
* variable = caMel Casing.
* Always contain only one main method       
* string in quotation marks = string literal and have null as default.

        
