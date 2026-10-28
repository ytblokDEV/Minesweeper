# Minesweeper
## Najbliższe zadania

- [ ] **Zablokować ponowne odkrywanie pola** — sprawdzać `isRevealed()` i `isFlagged()` przed odkryciem.
- [ ] **Przenieść licznik flag do `Board`** — zrezygnować z `AtomicInteger` w GUI; obliczać pozostałą liczbę flag na podstawie stanu planszy.
- [ ] **Dodać tablicę `JButton[][]`** — umożliwić aktualizowanie przycisków bez ich bezpośredniego kliknięcia.
- [ ] **Zaimplementować flood fill** — gdy odkryte pole ma 0 sąsiednich min, odkrywać kolejne sąsiednie pola (z kontrolą granic, flag i pól już odkrytych).
- [ ] **Dodać przegraną** — po trafieniu na minę pokazać miny i zablokować dalszą grę.
- [ ] **Dodać zwycięstwo** — wykrywać, kiedy wszystkie pola bez min są odkryte.
- [ ] **Dodać restart gry** — wygenerować nową planszę, zresetować stan komórek, flag i interfejsu.
- [ ] **Przerobić GUI na niestatyczne** — np. `new GUI(board)` zamiast statycznych pól i metod.
- [ ] **Poprawić wygląd GUI** — kolory, wygląd odkrytych pól, licznik i skalowanie planszy.

## Opcjonalnie — później

- [ ] Timer rozgrywki.
- [ ] Poziomy trudności (liczba pól i min).
- [ ] Zapisywanie najlepszych czasów.

