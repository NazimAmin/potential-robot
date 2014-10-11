package sokoban.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import application.Main.SokobanPropertyType;
import properties_manager.PropertiesManager;
import sokoban.ui.SokobanUI;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
public class SokobanFileLoader {


    /**
     * This program serves as a level editor for the Sokoban game. It is capable of
     * making and saving new levels.
     * <p>
     * Note that we have designed this level editor such that the entire program is
     * defined inside this one class using inner classes for all event handlers and
     * the renderer.
     *
     * @author Paul Fodor
     */
    // INITIALIZATION CONSTANTS

    // AND HERE IS THE GRID WE'RE MAKING
    private int gridColumns;
    private int gridRows;
    private int grid[][];


    // TEXTUAL CONSTANTS
    private final String APP_TITLE = "Sokoban Level Editor";
    private final String OPEN_BUTTON_TEXT = "Open level binary file";
    private final String SAVE_AS_BUTTON_TEXT = "Save level binary file";
    private final String UPDATE_GRID_BUTTON_TEXT = "Update Grid";
    private final String COLUMNS_LABEL_TEXT = "Columns: ";
    private final String ROWS_LABEL_TEXT = "Rows: ";
    private final String SOK_FILE_EXTENSION = ".sok";
    private final String OPEN_FILE_ERROR_FEEDBACK_TEXT = "File not loaded: .sok files only";
    private final String SAVE_AS_ERROR_FEEDBACK_TEXT = "File not saved: must use .sok file extension";
    private final String FILE_LOADING_SUCCESS_TEXT = " loaded successfully";
    private final String FILE_READING_ERROR_TEXT = "Error reading from ";
    private final String FILE_WRITING_ERROR_TEXT = "Error writing to ";

    private final String SOKOBAN_DATA_DIR = "../Sokoban_draft/data/";

    // CONSTANTS FOR FORMATTING THE GRID
    private final Font GRID_FONT = new Font("monospaced", 36);
    public SokobanFileLoader(){

    }


}