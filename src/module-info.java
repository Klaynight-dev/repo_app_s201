/**
 * 
 */
/**
 * 
 */
module VraiSAEDOO {
	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens controleur to javafx.graphics, javafx.base, javafx.controls;
	opens modele to javafx.graphics, javafx.base, javafx.controls;
	opens vue to javafx.graphics, javafx.base, javafx.controls, javafx.fxml;
}