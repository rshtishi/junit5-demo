# Testing with junit 5

Before proceeding with the types of the developer's tests we need to clarify two important terms that we will use when 
discussing testing issue.

- SUT (System Under Test) is the part of system that is being tested. The test type determines the granularity of the SUT 
that can vary from single class to a whole application.
- DOC (Dependent On Component) is the dependency(collaborator) required SUT to fulfill his duties. In most cases it has
the same granularity as the SUT.

 We have various kinds of test:
 
- Unit Test is focused on testing the functionality of single class as independent entity from other DOC(collaborators).
The testing of SUT is done on isolation from other part of system, all DOC(collaborators) of the SUT are replaced by test
double. They run incredibly quickly, and are executed frequently.


- Integration Test is focused on testing the integration of different modules. Also, this includes modules that you do not
have control. E.g. the connection between the spring container and your business classes.  Integration tests run much more 
slowly than unit tests. They usually require some resources (e.g. an  application context) to be set up before they can be
executed, and their execution involves calling some DOC that tend to respond slowly (e.g. databases, file system or 
web services). In order to verify the  results of integration tests, it is often necessary to look into external resources
(e.g. issue an SQL query).


- End-to-End Tests is focused on testing if whole application works from client's point of view. They put the whole application
under test by mimicking the way the user would use it. As such they extend across all layers. End-to-end tests usually 
require a significant amount of time to execute themselves.




When writing tests for legacy code that doesn't follow proper OO rules then we have two choices:
- sacrifice OO rules to achieve the testability of code
- refactor the legacy code to adhere to OO rules to make it more testable


The first approach is often the fastest solution, but it may lead to a codebase that is difficult to maintain and debug. The 
second option requires more effort upfront, but can result in a cleaner, easier-to-maintain codebase. Ultimately, it depends
on the context of the legacy code and what will best serve your project's needs.

### Tools

- Testing Frameworks(e.g. JUnit, TestNG)
- Mock Library(e.g. Mockito, PowerMock, EasyMock, Spock, Unitils Mock)
- Matchers Libraries (e.g. Hamcrest, AssertJ, FestAssert)


## Unit Test

Unit tests are a way of verifying that classes work as expected, by testing the logic within them in isolation. Unit tests 
should be focused on single classes, and should not include external services or databases. They provide precise feedback on
code quality and can help to pinpoint bugs quickly before they spread throughout the system. Additionally, unit tests serve 
as live documentation for code and can even be used as a design activity. Finally, it is the responsibility of developers to 
ensure unit tests are done properly.

Interactions between a system under test (SUT) and its client can be divided into two categories: direct, which involve the 
SUT and its client directly, and indirect, which involve the SUT and other DOCs. These interactions can also be categorized 
as inputs (the SUT receiving some message) or outputs (the SUT sending a message). Direct inputs are used to set the state 
of the SUT while indirect outputs are used to verify that it is working correctly.

 | type of interaction |  involved parties | description |
 | ------------------- | ----------------- | ----------- |
 | direct input |  Test class & SUT | Test class calls the method of SUT|
 | direct output | Test class & SUT | Values returned by the SUT to the Test class after the call of the SUT method |
 | indirect output |  SUT & DOC | SUT passes argument to one of its collaborators(DOCs) |
 | indirect input | SUT & DOC | Value returned to the SUT by the collaborators(DOCs) after it called DOCs method|


