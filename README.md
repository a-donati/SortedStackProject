# Sorted Stack Program

This program allows users to manage a Stack of integers through command line input. Users can continue to add integers, and the program will keep them sorted. The user has the option to 'pop' the last item off of the stack. This is a modification of a previous project titled `SortedLinkedList`.

# Updates for Stack Modification 
-Update package name from sortedLinkedList to sortedStack
-Update file names to sortedStack
-Change import java.util.LinkedList to java.util.Stack
-Update LinkedList<> instances to Stack<>
-Update UML class diagram

## Prerequisites

- Java Development Kit (JDK) installed on your system.
- A command line interface (Terminal, Command Prompt, etc.) to run commands.

## File Structure
SortedStackProject/
└── sortedStack/
    ├── InputHandler.java
    ├── SortedStackManager.java
    └── Main.java

## Compilation

To compile the program, follow these steps:

1. Open your command line interface.
2. Navigate to the `sortedstack` directory where the Java files are located, in this case within `donati4`.
3. Run the following command to compile all files:
`javac *.java`


This will generate the .class files for each Java file.

After this step is completed, run the program with the following command:
`java Main.java`

Follow the on screen instructions to add integers to the stack. Type 'exit' to end the program.


# Generating Java Docs

- To generate JavaDocs for this program, do the following:
1. Ensure you are in the `sortedstack` directory.
2. Run the following command:
`javadoc *.java -d doc`

This command will create a doc directory containing the generated JavaDocs.

