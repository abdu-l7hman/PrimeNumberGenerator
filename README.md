# Prime Number Generator - CS285 Project

## Description
This project tests **10 different formulas** that generate prime numbers. Each formula is evaluated for its effectiveness, efficiency, and range of prime numbers it can generate. The program allows users to:
- View statistics about the formulas.
- Test individual formulas for prime number generation.
- Determine the fastest and most effective formula.

## Features
- **Test 10 Prime Number Generating Formulas**
- **Find the Largest Prime Number Generated**
- **Identify the Most Efficient Formula**
- **Check the First Non-Prime Number Generated**

## How to Run
1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/PrimeNumberGenerator.git
   ```
2. **Navigate to the project directory**:
   ```bash
   cd PrimeNumberGenerator
   ```
3. **Compile the Java program**:
   ```bash
   javac Cs285Github.java
   ```
4. **Run the program**:
   ```bash
   java Cs285Github
   ```

## Usage
When the program starts, you will be prompted to choose an option:
1. **Statistics Mode** – View general statistics about the formulas.
2. **Function Testing Mode** – Enter a function number (1-10) to analyze its prime generation.

## Prime Number Formulas
The program tests the following mathematical formulas:

| Function Number | Formula |
|----------------|---------|
| 1 | `4(n^5 - 133n^4 + 6729n^3 - 158379n^2 + 1720294n - 6823316)` |
| 2 | `36(n^6 - 126n^5 + 6217n^4 - 153066n^3 + 1987786n^2 - 13055316n + 34747236)` |
| 3 | `n^4 - 97n^3 + 3294n^2 - 45458n + 213589` |
| 4 | `n^5 - 99n^4 + 3588n^3 - 56822n^2 + 348272n - 286397` |
| 5 | `-66n^3 + 3845n^2 - 60897n + 251831` |
| 6 | `36n^2 - 810n + 2753` |
| 7 | `3n^3 - 183n^2 + 3318n - 18757` |
| 8 | `47n^2 - 1701n + 10181` |
| 9 | `103n^2 - 4707n + 50383` |
| 10 | `n^2 - n + 41` |

## Project Structure
```
PrimeNumberGenerator/
│-- Cs285Github.java  # Main Java Program
│-- README.md         # Project Documentation
```

## Future Enhancements
- Optimize the algorithms for faster execution.
- Implement a graphical interface for better user interaction.
- Compare results with known prime number sequences.

## License
This project is open-source and available for educational purposes. Contributions are welcome!

