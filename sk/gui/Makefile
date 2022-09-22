# fichier de la fenetre principale
fenetre=FenetrePrincipale.java

# fichier de theme de l'application
theme=Theme.java

# fichier de la calculatrice
calculatrice=Calculatrice.java

# fichier de Menu
menu=Menu.java

preview=Preview.java

tab=Ktable.java
# fichier de setting
FenetrePrincipale.class: $(fenetre) Ktable.class Menu.class Calculatrice.class Preview.class
	javac FenetrePrincipale.java

#Theme.class: Theme.java
#	javac Theme.java

Ktable.class: $(tab)
	javac $(tab)

Menu.class: $(menu)
	javac $(menu)

Preview.class: $(preview)
	javac $(preview)
	
Calculatrice.class : $(calculatrice)
	javac ../../$(calculatrice)

clean: 
	rm *.class