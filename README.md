# Interlag_Akurey
Internlang is a programming  metalanguage capable to generate code for java, c#, typescript, and python


# Solution description

Well, for start with the creation of the solution of the problem I needed read several times the case description,
the most important that the description give me was the possibility of scaling in the program, so was neccesary build all with a low
level of coupling, and later to thinking it a time I concluded that this was a problem for
the OOP. With this paradigm I was going to be sure that with the poliformism the program was have a good possibility of scaling.

So, the solution is the next:

We need three interfaces, I_Transpilator, I_UIGenerator, _ ItypeLanguage. The first two components are our start point, 
I_Transpilator is the base of the programming languages into Interlang and I_UIGenerator is the base of the GUIs.
For create a new language or GUI is neccesary implements this interfaces, in this way we can be sure that all the
new languages accomplish with the characteristics that our solution define and at the same time in the case that another
developer would be who create the new language, the system guide him/her with the steps to proceed, in another words,
will be neccesary implement the abstract methods. Every language has a different behavior so doing a mandatory the implementation  
of the methods the developers must needed only display de behavior of the language in the functions. It is similar what happens
with the GUIs there is a interface with the same objective of the before but with the functions that corresponding with the user
interface, so we can call this part as one extension that we decided include in Interlag. The last interface mentioned is for apply it
in typed programming languages.

I decided use abstract classes and not only the interfaces, this because I wanted avoid all the repeated code possible, and while
I was working in the solution I noticed that some syntax languages are very similar between them, starting for java and C# where there 
are a lot of things that use the same syntax. Then, I created a abstract class that would have the functions with the same behavior
in the languages, like the syntax of "if", in this way I was save code lines and at the same time save me time. And I included in the 
abstract class the common attributes between the subclasses. I did this for both parts of the problem, the GUIs and the programming languages,
but was most usefull for the programming languages, the only benefit that I got with the GUIs was write the attributes in the abstrac class.

With all the before implemented I only needed create new classes, extend of the corresponding abstract class and implement all the methods that
 the program asked me that developed. 

For control the type of language to chosen I implemented the classes factory, they try to follow the concepts of the Factory method pattern but 
missing some parts for achive simulated the behavior of this method. For example, missing another interface but this is only a Skeleton of the solution
and I think that was better use my time in other areas and at the same time let this propuse for more forward. The idea in this classes is that the user
give a enum that reference the language/GUIs type that he/she wants.

Finally I decided build a little prototype of the solution where with one input the program return an output in the destiny language, so I implemented 
a MVC structure in my program and created a humble screen to see with what happen with the logic. As is logical I had to created a 
reader input for do that and an improvised syntax of Interlag, this last thing are very basic by time topics, so the reader only works good if we
 introduce a valid input and in the contrary case is possible that we will se things without sense.

Observations: I only could develop one GUI, java swing, I wanted implemented too TKinter of Python, but I didn't have so many time. 
In the same folder where is this file, you can find txt to test the experiment

# Interlag transpiler code to the next languages

Java
C#
Python
Typescript

# In this version only implemented the functions:

Declare variable
Declare function
If-else
While
For
Imports
Declare class
End statement

GUI:

Create screen
Create button
Create label
Create input
Create selector
Create panel
initGUI

# Location Code

All the code you can find in the "src" folder.

Interlag_Akurey -> Interlag -> src

# Running code

If you want to run the code of the project, only you will review if the JDK version is available in your machine. In case positive only build the project and
run it.

# Platform where was developed the test 

Java, Apache Netbeans, JDK 1.8

# If you will want run my experiment to test the logic, I would be pleased

The .jar file is in "dist" folder.

Interlag_Akurey -> Interlag -> dist

# Syntax of the experiment 

# Declare class

    class name_class
    end

# Declare function

    funct name_function param1 param2 ...
    end

# If-else 

    if value1 ==/!=/<=/>=/</> value2
    end
    else
    end


# While

    while value1 ==/!=/<=/>=/</> value2
    end

# For

    for item set
    end

# Imports

    import name_library


# End statement

    end

# Create screen

    GUI screen result_variable name_screen

# Create button

    
    GUI button result_variable button_text

# Create label

    GUI label result_variable label_text

# Create input

    GUI input result_variable

# Create selector

    GUI selector result_variable

# Create panel

    GUI panel result_variable

# initGUI   , it is recommend execute this function before of other function to the GUI enviroment

    initGUI

# How can test the experiment 

    The easiest way is the next:

    1. Run the jar that be in the "dist" folder
    2. Open any example file, they are in the same folder of this file.
    3. Copy the code that in into file.
    4. Page the code in the left textField of the screen
    5. Choose the destiny language with the first selector
    6. The only GUI that works is Swing so it is better that you won't change the second selector
    7. Push translate

    The code must appear in the right textField