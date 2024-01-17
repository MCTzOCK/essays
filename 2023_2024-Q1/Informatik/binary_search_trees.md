# Binäre Suchbäume

## Sortierung
In einem Binärensuchbaum werden die Daten lexikografisch gespeichert.
Der Linke Teilbaum enthält nur Einträge, die lexikografisch kleiner sind, als der aktuelle Knoten.
Der rechte Teilbaum enthält nur Einträge, die lexikografisch größer sind, als der aktuelle Knoten.

## Suchen von Daten
Um einen Eintrag zu suchen, wird der Baum von der Wurzel aus durchlaufen.
Ist der aktuelle Knoten der gesuchte Eintrag, wird dieser zurückgegeben.
Ist der aktuelle Knoten lexikografisch kleiner als der gesuchte Eintrag, wird der linke Teilbaum durchsucht.
Ist der aktuelle Knoten lexikografisch größer als der gesuchte Eintrag, wird der rechte Teilbaum durchsucht.
Ist der aktuelle Knoten ein Blatt, wurde der gesuchte Eintrag nicht gefunden.
Die maximale Anzahl an Vergleichen ist die TIefe des Baumes + 1.

## Einfügen von Daten
Die lexikografische Ordnung darf beim Einfügen von Daten nicht verletzt werden.
Es wird die passende Position für den neuen Eintrag gesucht.
Dies funktioniert auf die gleiche Weise, wie das Suchen von Daten.
Das Element wird dort eingefügt, wo der Suchalgorithmus abbricht (leerer Teilbaum).

## Löschen von Daten
Wenn die zu löschenden Daten ein Blatt sind, wird dieses einfach gelöscht, da es keine Nachfolger besitzt.
Wenn die zu löschenden Daten Nachfolger besitzen, rückt der Nachfolger an die Stelle des zu löschenden Knotens.
Hierbei darf es nur einen Teilbaum geben, der nicht leer ist.
Gibt es zwei Teilbäume, muss die passende Stelle im Baum gefunden werden, an dem jeder Teilbaum eingefügt werden kann.
Dies ist entweder das Maximum des linken Teilbaums oder das Minimum des rechten Teilbaums.

## Modelierung

+-----------------------------------ContentType---+
|               BinarySearchTree                  |
|-------------------------------------------------|
| - root: Node                                    |
| - leftTree: BinarySearchTree<ContentType>       |
| - rightTree: BinarySearchTree<ContentType>      |
| - content: ContentType                          |
|-------------------------------------------------|
| + BinarySearchTree()                            |
| + BinarySearchTree(data: ContentType)           |
| + insert(data: ContentType): void               |
| + search(data: ContentType): Node               |
| + remove(data: ContentType): void               |
| + isEmpty(): boolean                            |
| + getContent(): ContentType                     |
| + getLeftTree(): BinarySearchTree<ContentType>  |
| + getRightTree(): BinarySearchTree<ContentType> |
+-------------------------------------------------+
