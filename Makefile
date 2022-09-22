# application principale de l'application
app=sk/App.java
appc=sk/App.class

gui_rep=sk/gui

# menu de l'application
menu=$(gui_rep)/Menu.java
menuc=$(gui_rep)/Menu.class

# table de l'application
table=$(gui_rep)/Ktable.java
tablec=$(gui_rep)/Ktable.class

# fenetre de l'application
fenetre=$(gui_rep)/FenetrePrincipale.java
fenetrec=$(gui_rep)/FenetrePrincipale.class

# calculatrice de l'application
calculatrice=$(gui_rep)/Calculatrice.java
calculatricec=$(gui_rep)/Calculatrice.class

App.class : $(app) $(fenetrec)
	javac $(app)

$(fenetrec): $(fenetre) $(menuc) $(tablec) $(calculatricec)
	javac $(fenetre)

$(menuc): $(menu)
	javac $(menu)

$(tablec): $(table)
	javac $(table)

$(calculatricec): $(calculatrice)
	javac $(calculatrice)


run:
	java sk/App



clean:
	rm sk/*.class $(gui_rep)/*.class