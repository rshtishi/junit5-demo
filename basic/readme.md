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
- Test Instance Lifecycle (e.g `GradeServiceTest.java`)
- Testing Exception (e.g `Calculator.java (method: throwExceptionWhenDivideByZero)`)
- Nested Tests (e.g `BankAccountTest.java`)
- Dependency Injection for Constructor and Methods (e.g.`UserServiceTest.java` )
- Test Interfaces And Default Methods (e.g. `CanSumTest.java`, `CanSumTabulationImplTest.java`
  , `CanSumRecursiveImplTest.java`)
- Repeated Tests (e.g. `TicketSalesSystemTest.java`)
- Parameterized Tests with `@ValueSource` (e.g. `StringUtilTest.java`)
- Parameterized Tests with `@NullSource` and `@EmptySource` (e.g. `StringUtilTest.java`)
- Parameterized Tests with `@EnumSource` (e.g. `OrderServiceTest.java`)
- Parameterized Tests with `@MethodSource` (e.g. `StringUtilTest.java`)
- Parameterized Tests with `@CsvSource` (e.g. `ShoppingCartTest.java`)
- Parameterized Tests with `@ArgumentSource` (e.g. `TemperatureConverterTest.java`)
- Implicit Argument Conversion in parameterized tests (e.g. `FileUtilsTest.java`, `BookTest.java`)
- Explicit Argument Conversion in parameterized tests (e.g. `PersonTest.java`)
- Argument Accessor in parameterized tests (e.g. `ShippingCostCalculatorTest.java`)
- Argument Aggregators in parameterized tests (e.g. `RectangleTest.java`)
- Customizing Naming Display (e.g. `RectangleTest.java`)
- Parameterized Tests Lifecyle and Interoperability (e.g. `RectangleTest.java`)
- Test Templates (e.g. `SortAlgorythmTest.java`)
- Dynamic Tests (e.g. `PrimeNumberCheckerTest.java`)
- Dynamic Tests with URI Test Sources (e.g. `WebPageFetcherTest.java`)
- Timeout (e.g. `ExternalApiServiceTest.java`)
- Timeout on repeated tests (e.g. `ExternalApiServiceTest.java`)
- Timeout on parameterized tests (e.g.`ExternalApiServiceTest.java`)
- Timeout on dynamic tests (e.g. `ExternalApiServiceTest.java`)
- Parallel Execution (e.g. `CheckingAccountTest.java`)
- Synchronization with parallel execution (e.g. `SharedResourceTest.java`)
- Built-in Extensions  `@TempDir` (e.g. `FileCreatorTest.java`)
- Declarative Extension Registration (e.g. `CalcualtorTestWithLogging.java`)
- Programmatic Extension Registration (e.g )
