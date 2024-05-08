# DummyBox - uCard

This Java program includes functionalities for creating a profile card, calculating age, displaying birthdate information, determining horoscope, calculating area (for square, rectangle, and circle), calculating Body Mass Index (BMI), and an example of a dice game (Craps).

## How to Use

1. Include the `uCard` class in your project.
2. Create an object of `uCard`.
3. Create a profile card using the `create_card()` method.
4. Use other methods to perform desired operations.

## Methods

- `create_card()`: Creates a profile card.
- `age(int year)`: Calculates age.
- `birthDay(int year, int month, int day)`: Displays birthdate information.
- `horoscope(int day, int month)`: Determines horoscope based on birthdate.
- `area_calculation()`: Calculates area (for square, rectangle, and circle).
- `bmi_calculation()`: Calculates Body Mass Index (BMI).
- `crapsGame()`: Provides an example of a dice game.

## Examples

```java
// Creating a profile card
uCard example = new uCard();
example.create_card();

// Calculating age
example.age(1990);

// Displaying birthdate information
example.birthDay(1990, 5, 21);

// Determining horoscope
example.horoscope(21, 5);

// Calculating area
example.area_calculation();

// Calculating Body Mass Index (BMI)
example.bmi_calculation();

// Example of a dice game
example.crapsGame();
