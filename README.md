# Java lectures from Centennial 




## Week 05

* Inheritance = specialization = Is-a relatioship
``` extends ```
inherits all members = fields and methods.
protected members also have package access.

direct superclass = has extends

indirect superclass = like Object class



1) Superclass = more general.
2) subclass = more specific.

Is-a = inheritance.
has-a = Composition.

implicitly is when invokes for example, class Object’s default constructor.
do not need say "extends Object". 

_Main Issue_ = A subclass can inherit methods that it does not need.


* protected keyword
Access only inside same class, subclass or package.. but not external.


* private keyword
Hide from subclass.
Access only inside same class, not Subclass , neither external.


* @Overrides 
To override any method from a superclass method. OPTIONAL label.

Afer override, the method from superclass can be accessed with `super.method()`

```
@Overrides
public String toString() 
{ return " "; }
```








## Week 04

* final
constant are immunatable, high security level
`` private final int num = 1; ``


* Garbage collection
Every object uses system resources, such as memory. When there are no more references to an object, the object is eligible to be collected.
Dont use finalize, Use Close

* ENUM are reference type, like classes. Write in lowercase!!!

``` public enum ListOfOption ```

they are final(constant) and static. 
You cannot create object.

We can have fields, methods of class Enum.



- Composition = Has a relationship. 
ex: employee get time from Time3 class.

- Is-a relationship = Inheritance
ex: users extends employees.


* Overloaded constructors enable objects of a class to be initialized in different ways depending of type, number, order
Methods or Constructors --> Differentiate by (1) type, (2) number of parameters and (3) order.


When it does not declare a constructor, so the compiler supplies a default constructor with no parameters. HOVEWER, Once you declare any constructors in a class, the compiler will not provide a default constructor



__Exceptions__
throw + TYPE + "msg"; - throws an exception string message returned to the calling method.

_TRY_ and _CATCH_ is a block to Test and what to do in case error.



* If clients dont need to know how and hide methods and variables, say PRIVATE. Only the object create (myRaphaelAccount) will see those variables and specific methods. 


* Every object can access a reference to itself with keyword
_this_ , every object is created in that class. Can be reference as this.

YOu can using 'this' to initialize and invoke constructor
``` this(0, 0, 0); ``` 



---- A source-code file can contain only one public class 

---- Non-public classes can be used only by other classes in
the same package. (Like Math is the main class... and have non-public as Pow, max, square,...)


----- OBJECT - instance variable 
Instance Variable = Attributes, Properties, Fields, Member Variables, State.

````
Point m = new Point();
        m.x =2;
        m.y =5;
````

##### NO Properties with GET and SET, instead they call methods

* Set methods are called MUTATOR methods
* Get methods are called ACESSOR methods or query methods

Used to attempts to modify the variable’s value 








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



***** Stack an Heap *****
How code is organized.

_Stack_ = Is the order methods are pile of reference in memory.
_Heap_ is large portion of memory = where data is saved.


Method how program return to caller. (PILE of DISHES)

Fist is push onto bottom of pile. Lat item onto stack(on top) will be the first to be called (popped out). 

1) Argument promotion - converting an argument’s value, method receive parameter integers but will return double. They are automatic converted.



--- the term __"class member"__ is used to specifically refer to static methods and static variables.
--- the term __"class variable"__ is used to specifically refer to static fields.

A ``static import`` declaration enables you to import the static members of a class or interface 

* Non-static methods are typically called instance methods.
Call by `ObjectName.method` 

* Static method wii be a method performs a task that does not depend on an object. Just to perform tasks and no object.So, do not have `this`
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

__Access modifiers__   
_public_ = to be access from other areas, classes.
_private_ = variables will be only access by same class methods


methods = acess modifier + Static(or not) + Return type + nameCamelCasing

* Constructor = To instantiate a object. After new Keyword.
If a class does not define constructors, the compiler provides a default constructor with no parameters. But if you declare, default is not created.






## Week 01

* Primitives just assign a value
datatype primitive = byte, short, int, double, float, char, long and boolean.


* Objects are bundle of state and behaviour.
* Objects created using new keyword.

Object type is called a class.
datatype reference. - string, array, class, Enum.

data is reference where object exist.



-----------
Scanner out = Display data to screen or printer
Scanner in = Get USER input from object, file, mouse , keyboard

Em prinln....
%4.1f --> 4 space before number
%-4.1f --> 4 space after number
%04.1f --> zero in 4 space before number

* Class name = Capital letter in every word - Pascal casing
* variable = caMel Casing.
* Always contain only one main method       
* string in quotation marks = string literal and have null as default.

        
