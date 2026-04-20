# zakat-fitr-calculator

A Java console application that calculates the required amount of food for Zakat Al-Fitr based on the number of family members and the selected food type.

Built by **Team Nexus** as a structured team project applying core Java and OOP concepts.

---

## How It Works

1. The program launches a welcome screen
2. You enter the number of family members
3. You choose a food type from the menu
4. The program calculates and displays the total kilograms required
5. You can run another calculation or exit

---

## Food Categories

| Food    | Kg per Person |
|---------|--------------|
| Rice    | 2.30 kg      |
| Flour   | 2.00 kg      |
| Lentils | 2.10 kg      |
| Wheat   | 2.04 kg      |

---

## Project Structure

```
src/
├── Main.java
├── controller/
│   └── AppController.java
├── ui/
│   ├── Screen.java          # abstract base class
│   ├── MainScreen.java
│   ├── InputScreen.java
│   ├── MenuScreen.java
│   └── ResultScreen.java
├── service/
│   └── ZakatService.java
├── model/
│   └── Category.java
├── console/
│   └── ConsoleHelper.java
└── data/
    └── FoodData.java
```

---

## Key Design Decisions

- **Layered architecture** — UI, Controller, Service, Model, and Data are fully separated. No screen performs logic and no service touches the console.
- **Abstract screen base** — All screens extend `Screen.java` and implement `show()`, keeping display code consistent and predictable.
- **Static helper class** — `ConsoleHelper` centralizes all console I/O with overloaded `readNumber` methods for `int`, `float`, and `double`, plus validated range reading, `pause()`, and a cross-platform `clear()` that works on both Windows and Unix.
- **Immutable data model** — `Category` is a `final` class. Food data lives in `FoodData` as a static list initialized once at startup.
- **Single calculation point** — `ZakatService.calculate()` is the only place in the codebase where the math happens: `familyMembers × kiloPerPerson`.
- **Repeat loop** — The app wraps the full cycle in a `do-while` loop, letting users run multiple calculations without restarting.

---

## Requirements

- Java 8 or higher
- No external dependencies

---

## How to Run

```bash
# Compile
javac -d out -sourcepath src src/Main.java

# Run
java -cp out Main
```

---

## Team

| Name | Role |
|------|------|
| Hamza Waleed | Team Leader |
| Omar Kamal | Back-End Lead |
| Ayoub Elashry | Front-End Lead |
| Ibraheem Daif | Tester |
| Mohamed Fawzy | Back-End Developer |
| Abd-Alrahman El-Habashy | Back-End Developer |
| Asim Abd-Alkarim | Back-End Developer |
| Adam Hasan | Back-End Developer |
| Yousef El-Sisi | Front-End Developer |
| Adham Mohamed | Front-End Developer |
| Mohamed Haytham | Front-End Developer |
| Ahmed Omar | Front-End Developer |

---

*Team Nexus — 2026*