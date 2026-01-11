# OOPS:

```java
public class MyHome{
    int length;
    int breadth;
    String nameOfHouse;
    String locationOfHouse;
    int[] rooms;

    public int dimensions(int len ,int bre){
        int area = len * bre;
        return area;
    }
    public String address(){
        nameOfHouse = "RahulSampoorn";
        locationOfHouse = "Kharai, Pune, Maharastra";
        return nameOfHouse + " " + locationOfHouse;
    }
    public static void main(String[] args){
        MyHome rahulHome = new MyHome();
        rahulHome.length = 40;
        rahulHome.breadth = 70;
        System.out.println(rahulHome.dimensions(rahulHome.length, rahulHome.breadth));
    }
}
```

1. What is OOPS?
- OOPs stands for Object Oriented Programming.
- OOPs is a programming philosophy/pattern/paradigm based on concept of "Objects".

2. What is Object?
- Self contained bundle that is present in computer memory.
- It has 3 parts:
    - **State**: Assigning/Allocating memory in the RAM.
    - **Behaviour**: 
        - Methods that operate on State
        - Actions/function a object can perform
        - Defines once in a class but executes/run per object
    - **Identity**: It is what distinguishes one object from another

3. What is class?
- A class is a user defined data type that act as blueprint/template for creating an object.   
`public class MyHome`
- **public**: An access modifier (who can see this class).
- **class**: The keyword used to create a class.
- **MyHome**: The name of the class (should always start with an Uppercase letter in Java)

5. What does class contains?
- **Fields**:
    - Fields are variables or Attribute that are declared inside the class but outside method. 
    - It represents the "State" or data of the object.
    - Known by many names like Properties(in C# & Python), Data Members(In C++), Member Variable, Global variable(technically wrong)
    - There are 2 types of Field based on where it is stored:
        - **Instance Fields (Non-Static)**: Each object has a unique value. Stored in Heap.
        - **Class Field (Static)**: Only one copy shared with every object. Stored in *Method Area*

- **Methods**: These define the Behavior (e.g., void calculateArea()).
- **Constructors**: Used to initialize new objects (e.g., Home()).
- **Static Variables/Methods**: Parts that belong to the Class itself (Method Area).
- **Blocks & Nested Classes**: Code that runs when the class is loaded.

6. What is the difference between *Field* and *Local variable*?

|Field|Local Variable|
|---|---|
|Inside class, outside method | Inside a method |
|Stored in Heap | Stored in Stack |
|Default value can be (0, null, false) | No default value(must be initilized)
|Lives as long as object lives | Lives till method is running |


6. Can a class be private?  
- The 'top level class' cannot be *private* but can be *default*(Can be accessed within the package) or *public*
- The inner class can be private, public, protected or default
```java
    class MyHome{
        private class MyRoom{}
    }
```

8. What is *static* varibale? 
- A Class variable(never instance variable) whose value is shared with every object and allocated memory when class is loaded, even without initilizing the object.
- Stored in *Method Area*
- It can be changed by the Object of the class
- To make it immutable use *final* keyword 
```java
public class MyHome{
    public static final int windowLength;
}
```

9. What are the different types of JVM Memory?
- There are 3 types of memory in JVM:
    - **Method Area**: 
        - Also called Metaspace or Class Level Memory.
        - Created: When a JVM loads the .class file
        - It has a **state**(Assigning memory in the RAM) that is **shared state** or **Global State**
        - This state is different from *object state*(Where memory is allocated when you create an object)
        - You **can** say it is *stateless* if you don't have **static** variable.
    - **Heap**: 
        - Region for all objects and their instance variables
        - Shared across all threads(Like a Google Notebook)
        - Dynamic allocation (objects can be allocated anywhere)
        - Garbage collected (automatically freed when unused)
        - Larger size (default based on system memory)
    - **Stack**: 
        - Region for method execution and local variables
        - Thread-specific (each thread has its own stack) (Obsidian)
        - LIFO (Last-In-First-Out) structure
        - Fast access (just push/pop operations)
        - Limited size (default ~1MB, can be configured)

10. How memory is De-Allocated?
- Stack -> Heap -> Method Area
- As soon as the method ends(retun or "}") the execution Stack get deleted immediately
- The heap object is deleted next. Here the GC(Garbage Collector) looks for object whose reference(remote control) is no longer present
- Then comes Method Area. Here when the JVM itself shuts down all the static variable and class template is deleted.

11. Where does the method, instance variable(field), static variable, local variable, source code, bytecode reside?
- *Method* reside in Stack when they are executed or called by Object else it will stay in Method Area
- *local variable* reside in Stack
- *Field* or *instance variable* are present in heap
- *static* variable are stored in the Method Area
- If a *instance variable* is initilized then it will store the data in Method Area as part of *constant pool*
- *source code* reside in hard disk/SSD
- *bytecode* reside in hard disk/SSD

12. What is Data?
- Values stored in memory that describe the object
- This data lives in Instance Variable

>[!Note]   
> .class file can be in KBs as it is just the instruction. But the object created from the instructions/class takes MBs and GBs of RAM.
> Memory is not allocated during complication but during *Runtime*(Run or Execute)
> `MyHome rahulHome;` -> It is a reference variable
> `new MyHome();` -> It is a object
> `MyHome apurvHome = rahulHome` -> Both Reference point to same object

