# Java-Calculator
A Java Calculator I built in order to practice and improve my understanding of Java software development

![calculatorgif](https://user-images.githubusercontent.com/20666753/52526177-123f7f80-2c83-11e9-87eb-7fa0dbf88713.gif)


Here's the blueprint I made while working on this program. Outlining all the features that I want in a program is very important for developing software properly:
------------------
| GUI Calculator V 1.0 |
------------------
These are some of the blueprints, you can see more insights that I discovered in the comments of the GUI class document. For example, I needed to make a prev_sign variable that would track the previous calculation sign button that was pressed in order to tell let the program know what to do when the = button was pressed.
 
 * sign buttons do calculations, back & forth double String parsing required
	* will need to use nested if statements to achieve desired effect 
	* steps in calculation
			 * 		first number
			 * 		choose calculation
			 * 		second number
			 * 		commit/enter calculation
* So I will need an equals to button
			 * 
* I might need 2 numberStrings or 2 variables for 1st and 2nd numbers in calculation

* Steps:
			 * 1. trigger + sign button
			 * 2. parse numberString into double, sto currentTotal variable
			 * 3. clear HUD
			 * 4. other numbers are entered 
			 * 5.
			 * 		a. if = is pressed, output to HUD currentTotal + numString, then clear currentTotal
			 * 		b. if + is pressed, add numString to currentTotal, clear HUD

 ------------------
 ------------------
 ------------------
 | GUI Calculator V 0.1 |
 ------------------
 
 * [ ] Front side deals with graphics 
 * [ ] Back side deals with calculations
 
 ----steps----
 * [X] 1. I need to setup the calculations
 * [ ] 2. Make functional program without GUI
   * [X] a. Add choice when to exit (loop otherwise)
   * [X] b. Deal with zero division
   * [ ] c. Be able to instantiate variables (setters, getters for vars)
 * [ ] 3. Then setup GUI
 -------------------------
 | Types of Calculations |
 -------------------------
 * [X] Addition, Subtractions, Multiplication, Division, Modulus, Exponent, Exponent 2, 
 * [ ] variables (set | reset| multiple variables no limit?)
 -----------------------
 | Other functionality |
 -----------------------
 * [X] able to do 1 calculation after another
 * [ ] Compound calculations
 * [ ] exit button
 * [ ] Duplicate calculator? (opt.)
