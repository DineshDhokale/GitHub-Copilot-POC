GitHub Copilot Overview

1.Its uses large language model to make predictions based on the context we provide to it
2.In background it uses GPT 3.5 & 4
3.Its trained on free code available on GitHub:
•	As its trained on lot of data so it’s good in giving better suggestions for Java, python , Javascript languages etc.
•	Not good suggestions for isolate use cases or unused languages.

What Can co-pilot Do

•	On the basis of keywords provide it can be helpful for: 
1. Faster code autocomplete
2. Get simple Solutions quickly
3. Explain and document code
4. Explain error messages
5. Generate tests
6. Generate boiler plate code


How does copilot work?

 





Conclusions:
1.	It will help us to write better test & improve the test coverage, but after suggested code we always to need to review & test it.
2.	It will help us to complete test script much faster than our normal ways as we need to give context and it will write code for it.
3.	It can help us to optimise our code & also it can help us to solve errors we getting.
4.	It can help to translate our tests from one programming language to another so it will help us in case of framework migration.
5.	it will be helpful to create documentation for our test functions.
6.	It will help us to generate test data on providing sample test data.
7.	It can also suggest good locator strategies & can create dynamic element for our existing locators.
8.	As per all above points, GitHub copilot can help us to create & maintain robust automation framework.
9.	It does not have the capability to dynamically check DOM element updates or update framework locators accordingly. It primarily helps with writing code snippets and suggesting completions based on the context provided.

Screenshot :  


Other Screenshots:

It helped with creation of registration test for below URL: https://parabank.parasoft.com/parabank/register.htm
I just put this above URL and asked copilot to write test script for registration and it provided with locator id but as few locator don’t have id attributes so its not able to find locator as per dom structure as mentioned in 9th Point.
 

So here I tried to fixed this error with copilot & it suggested missing dependencies here and after added it fine now as per below image.


 

 

Its creating POM pages as per elements mentioned, 
 
 

Final Run:  

