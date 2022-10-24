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

**NOTE: make sure that when entering questions, you end it with a question mark (?), as that is how the program determines if it's another question or if it's an animal entry.** *(See Playthrough1 for an example of how this can happen.)*

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

---

# Playthroughs

##### Playthrough 1

```
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
y
Were you thinking of: a mouse?
n
Darn! what was it?
horse
What is a question that is a NO for horse but a YES for mouse?
Does it get caught in household traps?
Let's try again!
==========================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
y
Does it get caught in household traps? (Y/N)
n
Were you thinking of: a horse?
n
Darn! what was it?
grizzly bear
What is a question that is a YES for grizzly bear but a NO for horse?
Is it hunted in Montana?
Let's try again!
==========================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
y
Does it get caught in household traps? (Y/N)
n
Is it hunted in Montana? (Y/N)
n
Were you thinking of: a horse?
n
Darn! what was it?
pirhanna
What is a question that is a YES for pirhanna but a NO for horse?
Does it swim in water and bite people?
Let's try again!
==========================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
n
Were you thinking of: a skunk?
n
Darn! what was it?
toad
What is a question that is a NO for toad but a YES for skunk?
Does it spray smelly stuff?
Let's try again!
==========================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
n
Does it spray smelly stuff? (Y/N)
y
Were you thinking of: a skunk?
n
Darn! what was it?
venomous spider
What is a question that is a NO for venomous spider but a YES for skunk?
Does it have black and white stripes
Let's try again!
==========================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
n
Does it spray smelly stuff? (Y/N)
n
Were you thinking of: a toad?
y
Hurray! I got it
Let's play again...
==========================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
n
Does it spray smelly stuff? (Y/N)
n
Were you thinking of: a toad?
n
Darn! what was it?
snake
What is a question that is a YES for snake but a NO for toad?
Is it a reptile?
Let's try again!
==========================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
n
Does it spray smelly stuff? (Y/N)
n
Is it a reptile? (Y/N)
n
Were you thinking of: a toad?
n
Darn! what was it?
salamander
What is a question that is a YES for salamander but a NO for toad?
Does it have a long tail?
Let's try again!
==========================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
n
Does it spray smelly stuff? (Y/N)
y
Were you thinking of: a Does it have black and white stripes?
y
Hurray! I got it
Let's play again...
```

##### Playthrough2

```
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
y
Were you thinking of: a mouse?
y
Hurray! I got it
Let's play again...
========================================================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
n
Were you thinking of: a skunk?
n
Darn! what was it?
wolf
What is a question that is a YES for wolf but a NO for skunk?
Does it eat deer?
Let's try again!
========================================================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
n
Does it eat deer? (Y/N)
y
Were you thinking of: a wolf?
n
Darn! what was it?
grizzly bear
What is a question that is a YES for grizzly bear but a NO for wolf?
Does it eat salmon?
Let's try again!
========================================================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
n
Does it eat deer? (Y/N)
n
Were you thinking of: a skunk?
n
Darn! what was it?
tuna
What is a question that is a YES for tuna but a NO for skunk?
Does it live in the water?
Let's try again!
========================================================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
n
Does it eat deer? (Y/N)
n
Does it live in the water? (Y/N)
y
Were you thinking of: a tuna?
n
Darn! what was it?
goldfish
What is a question that is a YES for goldfish but a NO for tuna?
Is it a bright orange color?
Let's try again!
========================================================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
y
Were you thinking of: a mouse?
n
Darn! what was it?
dog
What is a question that is a YES for dog but a NO for mouse?
Is it man's best friend?
Let's try again!
========================================================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
asdf
asd
f\
yeah
Is it man's best friend? (Y/N)
n
Were you thinking of: a mouse?
n
Darn! what was it?
house cat
What is a question that is a NO for house cat but a YES for mouse?
Does it eat mice?
Let's try again!
========================================================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
y
Is it man's best friend? (Y/N)
n
Does it eat mice? (Y/N)
y
Were you thinking of: a mouse?
n
Darn! what was it?
raccoon
What is a question that is a NO for raccoon but a YES for mouse?
Does it breed very fast?
Let's try again!
```

##### Playthrough 3

```
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
n
Were you thinking of: a skunk?
uhhhhhh yes
ummmmmm yeah
 yeah
 yes
 Y
 y
 N
yNooooooooooo
Hurray! I got it
Let's play again...
========================================================================
Think of an animal. Let's see if I can guess it!
Does this animal love cheese? (Y/N)
n
Were you thinking of: a skunk?
asdfasdf
1234567
!@#$%^&*
\m\d/wef/\31
y
Hurray! I got it
Let's play again...
```
