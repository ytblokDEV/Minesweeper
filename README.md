
# Minesweeper — TODO 💣
Development roadmap for a Minesweeper game written in Java using Swing.
## Main Tasks

- [ ] **Prevent revealing already revealed cells** — Check `isRevealed()` and `isFlagged()` before revealing a cell.
- [ ] **Move the flag counter to `Board`** — Remove `AtomicInteger` from the GUI and calculate the remaining mine counter based on the board state.
- [ ] **Implement a `JButton[][]` array** — Allow the GUI to update buttons without requiring the player to click them.
- [ ] **Implement flood fill** — Automatically reveal neighboring cells when a cell has zero adjacent mines, while checking boundaries, flags, and already revealed cells.
- [ ] **Implement game over logic** — Reveal all mines and disable further interaction when the player clicks a mine.
- [ ] **Implement win detection** — Detect when all non-mine cells have been revealed.
- [ ] **Add a restart feature** — Generate a new board and reset cells, flags, and the GUI.
- [ ] **Refactor the GUI to use instance methods** — Replace static fields and methods with an instance-based design, such as `new GUI(board)`.
- [ ] **Improve the user interface** — Add better colors, revealed cell styling, a mine counter, and responsive board sizing.

## Optional Features

- [ ] Add a game timer.
- [ ] Add difficulty levels with different board sizes and mine counts.
- [ ] Save and display best completion times.
