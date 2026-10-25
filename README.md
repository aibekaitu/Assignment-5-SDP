# Fencing Training System

## Project Overview
A Java application demonstrating the Strategy Design Pattern
using different fencing training algorithms.

## Design Pattern
Strategy Pattern (Behavioral)

## Strategies
1. SpeedTrainingStrategy - speed training
2. AccuracyTrainingStrategy - accuracy training
3. EnduranceTrainingStrategy - endurance training

## Architecture
- TrainingStrategy - Strategy Interface
- SpeedTrainingStrategy - Concrete Strategy
- AccuracyTrainingStrategy - Concrete Strategy
- EnduranceTrainingStrategy - Concrete Strategy
- FencingTraining - Context
- Main - Client

## Clean Code Principles
1. Single Responsibility - each strategy has one responsibility.
2. Open/Closed Principle - new strategies can be added without modifying the Context.
3. Meaningful Names - classes and methods have clear names.
4. Polymorphism - algorithms are selected without if/switch on strategy types.
5. Dependency on Abstractions - Context depends on the interface.

## How to Run
1. Open the project in IntelliJ IDEA.
2. Use Java 17 or newer.
3. Run Main.java.
4. Select a strategy from the console menu.
