# JUNIT 5

**JUnit 5** is made up of three sub-projects; the **JUnit Platform** serves as a foundation for launching testing
frameworks, the
**JUnit Jupiter** adds a programming model and extension model for writing tests and extensions, and the **JUnit
Vintage** provides a TestEngine for running JUnit 3 and 4 based tests. It also has support in popular IDEs and build
tools like IntelliJ, Eclipse, Gradle, etc.

*In order to use JUnit 5 you need to have Java 8 or higher runtime environment.*

In JUnit 5, the test class is not required to have constraints(JUnit 4) below:

- to have public access modifier(can have protected or package protected access modifiers)
- to have a public no-args constructor

Also, the test methods are not required to:

- to be public (can have protected or package protected access modifiers)
- to have no arguments

### Content

- Writing the simplest test with JUnit 5 (e.g. `CalculatorTest.java (method: sumReturnedWhenTwoNumbersAreAdded)` )
- Providing meaningful names to test methods in JUnit 5 (
  e.g. `MoneyTest.java (method: constructorShouldSetAmountAndCCY)`)
- Testing exceptions (
  e.g. `MoneyTest.java (method: constructorShouldExceptionWithAmountInvalidMessageWheAmountIsInvalid)`)
- Disabling tests (e.g. `CalculatorTest.java (method: productReturnedWhenTwoNumbersAreMultiplied)`)
- OS Conditional test execution (
  e.g. `FileSystemTest.java (method: whenOSisLinuxThenGetOperatingSystemWillReturnLinux)`)
- OS Condition test execution with composite annotation (
  e.g. `FileSystemTest.java (method: whenOSisWindowsThenGetOperatingSystemWillReturnWindows)`)
- JRE Condition Test execution (e.g. `FileUtilsTest.java`)
- System Property Condition (e.g. `CalculatorTest.java (method: quotientReturnWhenTwoNumberAreDivided)`)
- Environment Variable Condition (
  e.g. `TextProcessorTest.java (method: whenTextProvidedThenCountWordWillReturnWordCount`)
- Filter By Tag (e.g. `TaxCalculatorTest.java (method: whenAmountIsMinimalWage_thenNoTaxIsApplied)`)
- Test Execution Order (e.g. `FactorialTest.java)`)
- JUnit 5 LifeCycle (e.g `MailServerTest.java`)
- Test instance lifecycle (e.g `GradeServiceTest.java`)
- Testing exception (e.g `Calculator.java (method: throwExceptionWhenDivideByZero)`)
- Nested tests (e.g `BankAccountTest.java`)
- Dependency injection for constructor and methods (e.g.`UserServiceTest.java` )
- Test interfaces And default methods (e.g. `CanSumTest.java`, `CanSumTabulationImplTest.java`
  , `CanSumRecursiveImplTest.java`)
- Repeated tests (e.g. `TicketSalesSystemTest.java`)
- Parameterized tests with `@ValueSource` (e.g. `StringUtilTest.java`)
- Parameterized tests with `@NullSource` and `@EmptySource` (e.g. `StringUtilTest.java`)
- Parameterized tests with `@EnumSource` (e.g. `OrderServiceTest.java`)
- Parameterized tests with `@MethodSource` (e.g. `StringUtilTest.java`)
- Parameterized tests with `@CsvSource` (e.g. `ShoppingCartTest.java`)
- Parameterized tests with `@ArgumentSource` (e.g. `TemperatureConverterTest.java`)
- Implicit argument conversion in parameterized tests (e.g. `FileUtilsTest.java`, `BookTest.java`)
- Explicit argument conversion in parameterized tests (e.g. `PersonTest.java`)
- Argument accessor in parameterized tests (e.g. `ShippingCostCalculatorTest.java`)
- Argument aggregators in parameterized tests (e.g. `RectangleTest.java`)
- Customizing naming display (e.g. `RectangleTest.java`)
- Parameterized tests lifecyle and interoperability (e.g. `RectangleTest.java`)
- Test templates (e.g. `SortAlgorythmTest.java`)
- Dynamic tests (e.g. `PrimeNumberCheckerTest.java`)
- Dynamic tests with URI Test Sources (e.g. `WebPageFetcherTest.java`)
- Timeout (e.g. `ExternalApiServiceTest.java`)
- Timeout on repeated tests (e.g. `ExternalApiServiceTest.java`)
- Timeout on parameterized tests (e.g.`ExternalApiServiceTest.java`)
- Timeout on dynamic tests (e.g. `ExternalApiServiceTest.java`)
- Parallel execution (e.g. `CheckingAccountTest.java`)
- Synchronization with parallel execution (e.g. `SharedResourceTest.java`)
- Built-in extensions  `@TempDir` (e.g. `FileCreatorTest.java`)
- Declarative extension registration (e.g. `CalculatorTestWithLogging.java`)
- Declarative extension registration with parameters (e.g. ``)
- Programmatic extension registration using static field (e.g `CalculatorTestWithTiming.java`)
- Programmatic extension registration using instance field (e.g `CalculatorTestWithLogger.java`)
- 
