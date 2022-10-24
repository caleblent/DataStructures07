# Project 7 - Machine Learning

Think of an animal.  In this project, we will write a program that will try to guess that animal. The program will ask the user a series of yes and no questions, and will eventually make its best guess.   Best of all, it will learn from each run, getting smarter with each wrong guess.

If the program guesses your animal, success! However, if the program gets it wrong, the program will:

* Ask the user what animal they were thinking of
* Ask the user to supply a question who's answer is yes for the animal that the computer guessed, and no for the animal that the user wanted instead

Either way, the program will start the game over, this time with an additional animal that it knows about.

Your program should start with a single yes/no question, with two possible animal guesses (one for yes, one for no). It should then build up questions and possible answers the more the user uses the program. You do not need to store data to a file or anything, so quitting the program will lose any knowledge that has built up.

* You can pick whatever you want for your initial question and two initial animals. After that it is up to the user to supply the animals and questions. Try to pick an initial question that splits a good set of animals roughly in half.

You are to create a specialized binary tree structure to help you with this program. For each question, there are two allowed answers. You start with a question, and you end when you no longer have another question to ask (at which point you have one animal that you can guess based on the path you followed to that point).

It is strongly advised that you carefully consider how you divide your code up into different classes and methods. If you try to do this all in one class (or worse, all in one method), you will produce confusing code that is difficult to work with.

* Make your backing tree structure a class
* Make your user interface (Scanner and System.out related code in this case) a class
* Let your tree handle its own logic (which will be directly related to animals)
* Expose a friendly interface (public methods) for your tree class, hiding as many of the details from your user interface class as possible
* Make sure you can handle the user entering inappropriate data. However, you can assume that the user won't lie in response to a question.

---

# Sample run:

```
Think of an animal.  Let's see if I can guess it!
Can your animal fly? (Y/N)
N
You were thinking of a dog. Am I correct? (Y/N)
N
Darn! What animal were you thinking of?
cat
What is a question that has an answer of yes for dog and no for a cat?
Does your animal bark?
Let's try again!
Think of an animal.  Let's see if I can guess it!
Can your animal fly? (Y/N)
Y
You were thinking of an eagle. Am I correct? (Y/N)
N
Darn! What animal were you thinking of?
parakeet
What is a question that has an answer of yes for a eagle and no for a parakeet?
Is your animal a bird of prey?
Let's try again!
Think of an animal.  Let's see if I can guess it!
Can your animal fly? (Y/N)
N
Does your animal bark? (Y/N)
Y
You were thinking of an eagle. Am I correct? (Y/N)
Y
Hurray!  I got it!
Let's play again!
Think of an animal.  Let's see if I can guess it!
[etc]
```
