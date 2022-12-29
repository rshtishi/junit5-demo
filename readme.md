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