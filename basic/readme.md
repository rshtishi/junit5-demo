#JUNIT 5

**JUnit 5** is made up of three sub-projects; the **JUnit Platform** serves as a foundation for launching testing frameworks, the 
**JUnit Jupiter** adds a programming model and extension model for writing tests and extensions, and the **JUnit Vintage** provides a 
TestEngine for running JUnit 3 and 4 based tests. It also has support in popular IDEs and build tools like IntelliJ, Eclipse, 
Gradle, etc.

*In order to use JUnit 5 you need to have Java 8 or higher runtime environment.*

In JUnit 5, the test class is not required to have constraints(JUnit 4) below: 

- to have public access modifier(can have protected or package protected access modifiers)
- to have a public no-args constructor

Also, the test methods are not required to:

- to be public (can have protected or package protected access modifiers)
- to have no arguments

### Content

- Writing the simplest test with JUnit 5 (e.g. `CalculatorTest.java (method:sumReturnedWhenTwoNumbersAreAdded)` )
- Providing meaningful names to test methods in JUnit 5 (e.g. `MoneyTest.java (method:constructorShouldSetAmountAndCCY)`)
- Testing exceptions (e.g. `MoneyTest.java (method:constructorShouldExceptionWithAmountInvalidMessageWheAmountIsInvalid)`)
- Disabling tests (e.g. `CalculatorTest.java (method:productReturnedWhenTwoNumbersAreMultiplied)`)
- Conditional Test Execution (e.g. `FileSystemTest.java (method:whenOSisLinuxThenGetOperatingSystemWillReturnLinux)`)


