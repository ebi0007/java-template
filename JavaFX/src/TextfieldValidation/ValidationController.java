package TextfieldValidation;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.NumberValidator;
import com.jfoenix.validation.RequiredFieldValidator;
import de.jensd.fx.glyphs.GlyphIconName;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconName;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Font;


import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

import static de.jensd.fx.glyphs.fontawesome.FontAwesomeIconName.EXCLAMATION;
import static de.jensd.fx.glyphs.fontawesome.FontAwesomeIconName.EXCLAMATION_CIRCLE;

public class ValidationController implements Initializable {
    @FXML
    private JFXTextField Passwordtext;
    @FXML
    private JFXTextField StudentID;
    @FXML
    private FontAwesomeIcon aa;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /// *********textfield khali nabashad  baraye Student ID*********************
        RequiredFieldValidator validator = new RequiredFieldValidator(); // baraye khali nabudan

        validator.setMessage("Cannot Be Empty !");

        FontAwesomeIcon warnIcon = new FontAwesomeIcon();
        warnIcon.setIcon(EXCLAMATION_CIRCLE);
        validator.setIcon(warnIcon);

        StudentID.getValidators().add(validator);
        StudentID.focusedProperty().addListener((o,oldVal,newVal)->{
            if(!newVal) StudentID.validate();
        });
        /// *********textfield adad bashad.*********************
        NumberValidator validator2 = new NumberValidator(); //baraye adad

        validator2.setMessage("Only Number !");
        StudentID.getValidators().add(validator2);
        StudentID.focusedProperty().addListener((o,oldVal,newVal)->{
            if(!newVal) StudentID.validate();
        });


        /// *********textfield khali nabashad  baraye password*********************
        RequiredFieldValidator validator1 = new RequiredFieldValidator();
        validator1.setMessage("Cannot Be Empty !");
        Passwordtext.getValidators().add(validator1);
        Passwordtext.focusedProperty().addListener((o,oldVal,newVal)->{
            if(!newVal) Passwordtext.validate();
        });

    }
}
