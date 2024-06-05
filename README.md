# BeeTest

## But du test

Pour ce test, tu devras implémenter 2 vues !

L'UI de l'application ne t'es est pas imposée, laisses parler ta créativité. Cependant ce n'est pas l'élément principal sur lequel tu seras jugé.

Chaque view sera associée à un ViewModel

### EquipmentList

- La première vue devra afficher la liste des équipements.
- Les équipement sont définis dans le fichier Equipment.json, la class EquipmentDatasource dispose d'une fonction static permettant de retourner le contenu brut de ce fichier, sous forme Data. A toi de parser ce contenu.
- Dans cette liste on ne voudra afficher que le nom des équipements.
- Sur le tap d'un équipement, on naviguera sur la vue suivante

### EquipmentDetails

- Sur cette vue on affichera le nom de l'équipement ainsi que son type
