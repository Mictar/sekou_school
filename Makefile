app=sk/App.java

gui_rep=sk/gui/
gui_make="$(gui_rep)/Makefile"

App.class : $(app) fenetre
	java "$(app)"

fenetre :
	make -C $(gui_rep)

clean:
	make -C $(gui_rep) clean