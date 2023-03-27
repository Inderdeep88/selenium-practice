# selenium-practice

### To create selenium grid using docker compose
`cd dockerFiles/`

`docker-compose up`


### Local webdriver execution:
`mvn clean test -DsuiteXmlFile=RegistrationSuite.xml -Dbrowser=chrome -Dhost=local`


### Remote webdriver execution on Selenium Grid:
`mvn clean test -DsuiteXmlFile=RegistrationSuite.xml -Dbrowser=chrome -Dhost=grid -DhubUrl=localhost`


**browser** values:
- chrome
- firefox

**host** values:
- local
- grid
