package HangMan.ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class HelpHyperlinkListener  {
	private HangManUI ui;
    private String[] urls;
    private String[] imageFiles;
    private Image[] images;
    private Hyperlink[] hpls;
    private String[] captions;
	
	public HelpHyperlinkListener(HangManUI initUI){
		ui = initUI;
		
          final WebView browser = new WebView();
          final WebEngine webEngine = browser.getEngine();
 
        for (int i = 0; i < captions.length; i++) {
            final Hyperlink hpl = hpls[i] = new Hyperlink(captions[i]);
 
            final Image image = images[i] =
                    new Image(getClass().getResourceAsStream(imageFiles[i]));
            hpl.setGraphic(new ImageView (image));
            hpl.setFont(Font.font("Arial", 14));
            final String url = urls[i];
 
            hpl.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                    webEngine.load(url);
                }
            });}
	}
}
