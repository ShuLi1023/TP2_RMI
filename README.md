# TP2_RMI
Part 1: Hello World RMI vs hello world Socket
• For RMI, you need to be running three processes
● The Client
● The Server
● The Object Registry, rmiregistry, which is like a DNS service for objects
•You also need TCP/IP active
•The class that defines the server object should extend UnicastRemoteObject
● This makes a connection with exactly one other computer
● If you must extend some other class, you can use exportObject() instead
● Sun does not provide a MulticastRemoteObject class
•The server class needs to register its server object:
● String url = "rmi://" + host + ":" + port + "/" + objectName ;
•The default port is 1099
● Naming.rebind(url, object );
•Every remotely available method must throw a RemoteException (because connections can
fail)
•Every remotely available method should be synchronized

Part 2: Student Score RMI
We want to create an application that allows us to calculate the scores of the students
using RMI. This application has two interfaces: StudentInterface.java and
PromotionInterface.java
The interface StudentInterface.java allows the client to access to the student
information: name, age,Id, scores….Each student passes many exams and each exam
is associated with a score and a coefficient (a double between 0 and 1). This interface
proposes three methods:
1. add_exam: adds an exam to a student. An exam has a name, a score and a
coefficient.
2. print_exams: sends a string (list of exams) to the client.
3. calculate_ average: calculates the average score.
The interface PromotionInterface.java allows to:
● Create a new student (method add_student)
● Find a student (method get_student). As this method return a reference to an
object, the client can ask to calculate the average score of the student.
● Calculate the average score of all the promotion (method promotion_score)
Design this application using RMI, identify all the needed java classes and the data
model(without using a database). You should use both RemoteObject and serializable
objects.

Part 3: Matrix multiplication
Matrix multiplication MM is an important operation of linear algebra. It is widely used in many
systems and sometimes it is expensive for some applications when size is large (eg image
processing for self-driving cars).
In this part you need to implement a distributed Application using JAVA RMI to reduce the cost
of the calculation of this operation.
As shown in the hint of the part 2 you are to implement the following step using RMI:
Step 1: Interface (Matrix definition and operation )
Step 2: Implementation MatrixMultiplication.java
Step 3: Server MatrixServer.java
Step 4: Client ClientMultiplication.java
