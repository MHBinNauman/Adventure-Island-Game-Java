# Adventure-Island-Game-Java
Java adventure island game. Classes are built, but functionality is incomplete. Demonstrates Java class usage.

# Game Overview
This is a simple text-based adventure game written in Java. The game allows the player to navigate through a storyline, making choices and interacting with the environment to progress.

# Game Storyline
The player wakes up on a beach with 25% health and finds a map. The player must navigate to the forest to eat fruit, which increases their health. They then search for a sword, add it to their inventory, and proceed to the cave. Before entering the cave, the player uses a health kit to restore their health to 100. Inside the cave, the player must kill a monster with their sword, which requires three strikes. If the player succeeds, they win the game.

# Game Code
The game code is written in Java and utilizes the Scanner class for user input. The game runs in an infinite loop, allowing the player to play again or exit the game.

# Issues with the Current Code
The current code has several issues:

The Player class is not defined.
The Player objects (john, ben, stacy) are declared within the switch statement and are not accessible outside of it.
The game logic is not implemented.
The else if (play_decision.equals("p")) condition is incorrect, as it should be else if (play_decision.equals("e")) to exit the game.
Proposed Solution
