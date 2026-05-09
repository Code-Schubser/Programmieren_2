## Git Spiel
1. Der merge findet normal statt, keine Konflikte
2. Auch hier findet der merge normall statt da es keine konflikte inherhalb der Datei gbit
3. Wenn wir einen Commit im Master branch haben der an gleicher Stelle in einer Datei wie der end Branch haben
dann entsteht ein Mergekonflikt. Wenn sie identisch ist, gibts kein Konflikt
4. Erst auf end switchen, rebase auf master, wechseln auf master, merge mit end
Allerdings erhalte ich schon beim rebase einen Konflikt, wahrscheinlich weil git probiert den tag10 auf den Master zu packen und sich nicht entscheiden kann
geändert habe ich allerdings nur den dmg-wert von sword

## Katzen-Café
# gradle
1. Forken des Repositories im GitHub
2. Clonen des Forks
3. Im Projektordner gradle init
4. Ordnerstruktur herstellen (doppelten src entfernen, spotless und tests konfiguieren (template benutzen)

# JUnit
Die von mir verwendeten Testfälle testen die Funktionalität der Methoden und Prüfen ob der zurückgegebene Wert
der  Erwartung enspricht
