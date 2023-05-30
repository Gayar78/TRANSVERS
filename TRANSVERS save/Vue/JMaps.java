package Vue;
import java.util.HashMap;
import java.util.Map;
import Vue.*;
import Modele.*;
import controlleur.*;

public class JMaps{
	Map<String, JAccueil> MapAccueil;
	Map<String, JProjet> MapProjet;
	Map<String, JTableau> MapTableau;
	Map<String, JListeCarte> MapListeCarte;
	Map<String, JCarte> MapCarte;
	
	JMaps(){
		MapAccueil = new HashMap<>();
		MapProjet = new HashMap<>();
		MapTableau = new HashMap<>();
		MapListeCarte = new HashMap<>();
		MapCarte = new HashMap<>();
	}
	
	public void Ajoute(JBoite B) {
		if(B instanceof JAccueil ) {
			JAccueil A = (JAccueil) B;
			MapAccueil.put(A.getNom(), A);
		}
		else if(B instanceof JProjet ) {
			JProjet P = (JProjet) B;
			MapProjet.put(P.getNom(), P);
		}
		if(B instanceof JTableau ) {
			JTableau T = (JTableau) B;
			MapTableau.put(T.getNom(), T);
		}
		if(B instanceof JListeCarte ) {
			JListeCarte LC = (JListeCarte) B;
			MapListeCarte.put(LC.getNom(), LC);
		}
		if(B instanceof JCarte ) {
			JCarte C = (JCarte) B;
			MapCarte.put(C.getNom(), C);
		}
	}
	
	public JAccueil getMapAccueil(String key){
		return MapAccueil.get(key);
	}
	
	public JProjet getMapProjet(String key){
		return MapProjet.get(key);
	}

	public JTableau getMapTableau(String key){
		return MapTableau.get(key);
	}

	public JListeCarte getMapListeCarte(String key){
		return MapListeCarte.get(key);
	}

	public JCarte getMapCarte(String key){
		return MapCarte.get(key);
	}
}
