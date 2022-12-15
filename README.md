# Esercizio classe astratte | Regina reginella

Modellizzazione e simulare il gioco di regina/reginella https://it.wikipedia.org/wiki/Regina_reginella

Dopo aver stabilito il numero dei giocatori, ognuno chiederà al proprio turno alla regina quanti passi fare. Questa ( simulata tramite una doppia estrazione random) risponderà con il numero di passi e quale animale.

Ogni giocatore partirà da una posizione iniziale pari a zero e vincerà il primo che giungerà dalla regina ossia a distanza 10mt.

I giocatori dovranno muoversi secondo i passi specifici dell’animale scelto di volta in volta.


| Animali        | Passi                       |
|-------------|--------------------------------|
|ELEFANTE     |1 mt in avanti per passo        |
|FORMICA      |10 cm in avanti per passo       |
|CANGURO	    |40 cm in avanti per passo       |
|GHIRO        |Rimane fermo                    |
|GAMBERO      |20 cm indietro per passo        |
|CAVALLO	    |50 cm in avanti per passo       |


# SUGGERIMENTI:
Si crei una classe astratta Animale con attributi Nome e età ( quelli del giocatore) con un metodo astratto siMuove() ed un metodo concreto per stampare gli attributi.
Questo venga esplicitato al corretto livello di animale.
Per i giocatori possiamo pensare di creare un Array di animali (da notare che a ogni passo l’animale cambia).
Bisogna pensare bene come e dove registrare le posizioni del giocatore e i suoi progressi.
Il gioco si conclude al raggiungimento da parte di un giocatore dei 10 mt.
