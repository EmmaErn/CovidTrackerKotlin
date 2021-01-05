# Covid Tracker version FRANCE DOMTOM
- Une application par Emma Ernult
## Presentation
Application android codé en Kotlin utilisant une architecture MVVM

Application permettant de tracker la progression du covid-19 dans les régions DOMTOM en temps réel car l'API est mis à jour quotidiennement.

## Prérequis
- Installation d'Android Studio
- Une connexion internet

## Consignes respectées
- Ecran avec une liste d'élément
- Appel WebService à une API Rest
- Fonctions supplémentaires :
  - Architecture MVVM
  - Creation de compte
  - Ecran de detail
    
 ## Fonctionnalités
 ### Ecran Acceuil
 
  - Ecran affichant un login Screen
  
  ![Image of Home](https://github.com/EmmaErn/CovidTrackerKotlin/blob/master/HomeScreen.PNG)
  
### Error database

  - Voici ce qui se passe lorsqu'on utilise un username qui n'est pas dans la database
  
  ![Image of error](https://github.com/EmmaErn/CovidTrackerKotlin/blob/master/ErrorHome.PNG)
  
 ### Test de connexion
  - Pour créer un username il suffit de remplir le login name ensuite appuyer sur créer un compte
 
  - Connexion avec username dans la database
  
  ![Image of success](https://github.com/EmmaErn/CovidTrackerKotlin/blob/master/SuccessHome.png)
  
  - Suite à la connexion la liste s'affiche dans notre recycler view
  
  ![Image of full](https://github.com/EmmaErn/CovidTrackerKotlin/blob/master/RecyclerView.PNG)
  
  - Lorsqu'on clique sur une celulle on peut voir la progression du virus dans la province en question avec la date 
  
  ![Image of detail](https://github.com/EmmaErn/CovidTrackerKotlin/blob/master/DetailRecyclerView.PNG)


  
  
  
  
