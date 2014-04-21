Project_5
=========
Visitor Pattern:

The Visitor is known as a behavioural pattern, as it's used to manage algorithms, relationships and responsibilities between objects. The definition of Visitor provided in the original Gang of Four book on Design Patterns states:
Allows for one or more operation to be applied to a set of objects at runtime, decoupling the     operations from the object structure.
Visitor pattern creates an external class (usually a visitor interface and it's implementations) to use data in other class thereby providing additional features to a class without changing the object structure itself. The core of visitor pattern is the "Visitor" interface that defines the visit method for each of the ConcreteElement classes on the other hand each of the ConcreteElement classes implement the "Element" interface (or more specifically the accept method) thereby providing a way to the ConcreteVisitors to access and run the required operation on the element. 

Further information about the visitor pattern can be found at:

http://java.dzone.com/articles/design-patterns-visitor
http://www.tutorialspoint.com/design_pattern/visitor_pattern.html

Implementation details:
We've implemented a ComputerPart interface defining accept operation. Classes Keyboard, Mouse, Monitor and Computer implement this interface. We'll define another interface ComputerPartVisitor which will define a visitor class operations. Computer uses concrete visitor to do corresponding action.


Fascade Pattern:

In short, Fascade pattern provides a simpler, easier to use and single point of entry to the client thereby hiding the details of the underlying complex system. This pattern belongs to the structural pattern categories as it adds an interface to an existing system to hide its complexities. Fascade pattern adds a fascade class which provides a singular interface to the client by delegating client requests to the appropriate objects to achieve a certain functionality. Additional details about this type of pattern can be found at,

http://www.tutorialspoint.com/design_pattern/facade_pattern.htm
http://en.wikipedia.org/wiki/Facade_pattern

Implementation details:

The CPU, HardDrive and Memory.java are the basic java classes and the Fascade.java class is the class the client interacts with to achieve a required functionality.
