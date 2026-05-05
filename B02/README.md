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
1. Testklassen werden nicht ins passende Verzeichnis gebracht außerdem kennt er die Libarys nicht...

An dieser Stelle weis ich nicht wie ich weiter arbeiten soll, außerdem wird mir nicht klar von welchen für die CI Aufgabe gesprochen wird, wir haben hier doch garnicht mit Git gearbeitet im Katzen-Café...

