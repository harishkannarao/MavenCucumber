# MavenCucumber
Reference repository for Maven, Surefire, Failsafe, JUnit and TestNG integration

### Maven command to run cucumber tests
mvn clean install

### Maven command to run specific cucumber tests by tag
mvn clean install -Dcucumber.options="--tags @sanity"

### Maven command to run specific feature file
mvn clean install -Dcucumber.options="classpath:com/harishkannarao/cucumber/service/CustomerServiceExtended.feature"

### Maven command to run specific scenario in a feature file by line number
mvn clean install -Dcucumber.options="classpath:com/harishkannarao/cucumber/service/CustomService.feature:7"

### Maven command to run specific scenario by name
mvn clean install -Dcucumber.options="--name 'should return null for name as null' "
