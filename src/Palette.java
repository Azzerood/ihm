import java.awt.Color;

import javax.swing.JColorChooser;
import javax.swing.JPanel;
 

 
public class Palette {
	public Palette(JPanel rectangle){
			JColorChooser colorpicker=new JColorChooser();
			colorpicker.getPreviewPanel().setVisible(false);
            colorpicker.getPreviewPanel().getParent().setVisible(false);
            Color background = colorpicker.showDialog(null, "Palette de couleurs", null);
                if (background != null) {
                   rectangle.setBackground(background);
                }    
        
	}
    
}