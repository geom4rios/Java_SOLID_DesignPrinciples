# SOLID

- S - Single Responsibility
- O - Open for extension close for modification
- L - Liskov Substitution Principle (LSP)
- I - Interface Segregation Principle  (ISP)
- D - Dependency Inversion Principle

# Explanation of each definition

## Single Responsibility

Each class should change for one reason and one reason only

## Open for extension and close for modification

This means that your class should be easy to modify in order to add new functionality but even when adding new functionality
we should not have to change what is already implemented

## Liskov Substitution Principle

As per LSP we should design our classes so that the client dependencies can be substituted with subclasses without the client 
knowing about the change.

If a subtype of the supertype does something that the client of the supertype does not expect, then this is in violation of LSP.

Derived classes should never do less than their base class.

## Interface Segregation Principle (ISP)

The Interface Segregation Principle (ISP) states that clients should not be forced to depend up interface members they do not
use. When we have non-cohesive interfaces, the ISP guides us to create multiple, smaller, cohesive interfaces.

Basically what it says is to keep your interfaces very precise so that every class that will implement an interface 
MUST implement the methods of the interface. Otherwise create multiple interfaces.

## Dependency Inversion Principle

This principle offers a way to decouple software modules. Simply put, dependency inversion principle means that developers
should "depend on abstractions, not on concretions"

Try to implement your classes in a very general way.