<div id="badges-row1" align="center">
    <a href="https://github.com/The-Learners-Circle/our-blog">
        <img alt="logo" src="docs/img/android-chrome-192x192.png" height="99">
    </a>
</div>

<div id="badges-row1" align="center">
  <img src="https://img.shields.io/github/followers/The-Learners-Circle?logo=github"/>
</div>

<div id="badges-row2" align="center">
    <a href="https://discord.gg/dDbxfdjb">
          <img src="https://img.shields.io/discord/102860784329052160?logo=discord&logoColor=f5f5f5&label=discord"/>
    </a>
</div>

# Our Blog - Learn programming by this project
We will build a team blog platform. In the process of building this application, the following are what you will learn in here:
- JavaScript 
- React
- Java
- SpringBoot
- Maven
- Mysql
- Others

# Prerequisites
## Java Installation
 
 Hey King here. So how to install Java?  Well this depends on your operating system.  So here I will talk about the process that I used for my operating system which is Ubuntu, a linux based operating system.

So there are two things that you have to think about.  Where to download Java and how to actually use it in your ide.

I downloaded Java from the official source which is Oracle: [Oracle java download page](https://www.oracle.com/java/technologies/downloads/#jdk21-linux).
![Screenshot of Java Download page](JavaDownloadsPage.png?raw=true "Java Downloads Page")

I downloaded the version for my machine which is 64bit cpu with debian based linux installed.  The link is highlighted in the screenshot.![Screenshot of Java Download page](JavaDownloadsPage2.png?raw=true "Java Downloads Page 2")
![Screenshot of Java Download page](JavaInstallationGuide.png?raw=true "Java Downloads Page")
On the next screen click the Linux link between Windows and macOs, which will take you to the instructions for your system.![Java Installation Guide](JavaInstallationGuide2.png?raw=true "Java Installation Guide")
![Screenshot of Java Download page](JavaInstallationGuide3.png?raw=true "Java Downloads Page")

From there you just follow the instructions.  One hiccup I had was that it gave me an error in the terminal the first time I tried to install the download.  It basically said that the package didn't exist.  Apparently it was because the package wasn't in the location that it was looking.  I decided to move the download to the home directory and then tried the instructions agains and everything worked.

The second thing you have to think about is your IDE.  Is it setup for Java.  I google Java for VS code and found the following website: https://code.visualstudio.com/docs/java/java-debugging.![Java VS code](JavaVScodeExtension1.png?raw=true "Java Downloads Page")

I clicked the purple button right below the header that says Install.  ![Screenshot of Java Download page](JavaVScodeExtension2.png?raw=true "Java Downloads Page")

Bonus tip.  Now how to start learning Java?  I'm taking a free mooc by the University of Helsinki.  Yes that's the Helsinki that's in Finland, but don't worry because the course is in English.

## Spring Boot
If you want to build a server in Java, [Spring](https://spring.io/projects/spring-framework) is the most popular framework in the world. Try to learn it later.
I think it is the most difficult part of Java web development. But don't worry. As the project progresses, you will slowly understand how it is used. 
How to install it? There is no need to download it to your machine, just load it into your project via your package management tool. And we will use the latest version 3.2.3.

## Maven Installation
### About maven
Maybe you haven't heard of [Maven](https://maven.apache.org/). Take it easy, it is just a package management tool. Let me talk about it tirelessly and vividly.
There is a difference between Java and other languages. Java doesn't have its own package management tool.
In comparison, golang has 'go mod', python has 'pip', rust has 'cargo', node has npm, etc.

Why do we need a package management tool? Imagine this situation: One day, we need a tool to process something about date and there is already ready-made open source code. We will download the source code and compile into our project. It's so stupid.
But if someone has uploaded the public code to somewhere where we can get the code from directly when we use it, it's amazing. 

For example, I want to use a collection utils supported by Google, I just need do it by this in Maven:
```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-collections4</artifactId>
    <version>4.4</version>
</dependency>
```
Then, when we compile the project before running, Maven will download the source code and compile it into our project. And the somewhere is the [Maven Repository](https://maven.apache.org/repositories/index.html).

That's why every language needs the package management tool. In Java world, there are two tools to let you choose: Maven or Gradle.

Why choose Maven? There is no particular reason to choose one or the other. Maven and Gradle are both easy to use. Once you master one, the other will come naturally to you.

### Installation
Sorry again. No detailed installation tutorial here. Try to google it. Remember, If you have a problem that you can't solve, tell me.
[Official download address](https://maven.apache.org/)
Remember to download the versions later than 3.6.3, as Springboot 3.2.3 requires Maven 3.6.3 or later.

## JavaScript
// todo later
## React
// todo later

# How to start
// todo later
## run the backend locally
## run the frontend locally
## deploy backend on linux server
## deploy frontend on linux server

# How to contribute your code
> I assume you know git - the version control tool.

I recommend you to use pull request to contribute your code. If everyone has access to the main branch, it will be chaotic in a complex project.
Maybe you can refer to this [tutorial](https://opensource.guide/how-to-contribute/#opening-an-issue).

I want to mock the real process of contributing code in open source world, it will be very helpful for you.

Maybe, right now you don't know anything about web development, you don't think you could contribute your power. Never think that! 

For example: If you find that some statements in the Readme file are not fluent or contain typos, just correct it and create a pr.

How the hell to create a pr?
1. Fork the repository of this organization to your own repositories.
2. clone your owen repository to your local machine.
3. Checkout a new branch from the main branch. If you want to fix typos, you can name it 'fix/typos'; If you want to add a new feature, you can name it 'feat/a new feature'.
4. Commit your code and push it to your own gitHub repository.
5. Then you can open pull request. For example below.
![img.png](./docs/img/openpr.png)

Just to try it! There must be many errors in Readme file, cause of my poor English!

# Project directory structure
// todo later
