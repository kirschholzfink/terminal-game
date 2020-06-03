# terminal-game

This application simulates a small console game.

A player is spawned in a labyrinth that is randomly populated with walls.
Before launching the game, a recursive algorithm will make sure that this labyrinth is "solvable" at all, e.g.,
whether the path from start to target is not entirely obstructed by walls.
The player has to avoid enemies moving around the labyrinth randomly.
In case the player meets an enemy, he/she will die and be respawned.

The simulation includes player and enemy movement through the labyrinth and is terminated by the player winning the game.
