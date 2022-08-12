Simple Demo for REST API testing

Test Framework Used as below:
1. Rest Assured
2. Cucumber
3. Cucumber Maven Reporting


You can generate your all test cases including Smoke, Regression and Sanity Test Case in one single command line in Non- GUI Mode



https://user-images.githubusercontent.com/33825536/184308171-bc8c783e-e4f9-4ae2-a7dc-d7e862dcf5df.mov

<img width="1422" alt="Screenshot 2022-08-12 at 1 11 21 PM" src="https://user-images.githubusercontent.com/33825536/184308200-9f1d543c-8444-420b-9166-3f0e316eb87c.png">
<img width="1413" alt="Screenshot 2022-08-12 at 1 11 10 PM" src="https://user-images.githubusercontent.com/33825536/184308204-b7d700aa-21d0-4c30-a0f2-6884d4e8aeed.png">


Just simple steps you need to follow:

For Mac user:
1. Install Maven using brew
2. Open terminal -> cd the project location
3. Run command -> mvn test verify


Solution:

I have keep this Test Framework structure easy:
1. Feature directory: List all test cases and scenarios
2. StepDefinition directory: Contains all methods to assert or verify the UAT

Result will be generated and save under Target folder
