/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
/**
 *
 * @author SISTEM
 */
public class HelloWord extends Application {    
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;       
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("JavaFX Welcome");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.BASELINE_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Scene scene = new Scene(grid, 550, 300);
        primaryStage.setScene(scene);
        
        Text scenetitle = new Text("Sign In");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Label nim = new Label ("NIM:");
        grid.add(nim, 0, 1);        
        TextField UserTextField = new TextField();
        grid.add(UserTextField, 1, 1);
         UserTextField.setDisable(true); 
      
        
        Label name = new Label("Nama:");
        grid.add(name, 0, 2);        
        TextField UserTextField2 = new TextField();
        grid.add(UserTextField2, 1, 2);
         UserTextField2.setDisable(true);
         
        
        Label faculty = new Label("Fakultas:");
        grid.add(faculty, 0, 3);
        TextField UserTextField3 = new TextField();
        grid.add(UserTextField3, 1, 3);
         UserTextField3.setDisable(true);
        
        Label major = new Label("Jurusan:");
        grid.add(major, 0, 4);
        TextField UserTextField4 = new TextField();
        grid.add(UserTextField4, 1, 4);
         UserTextField4.setDisable(true);
        
        Label omah = new Label("Alamat:");
        grid.add(omah, 4, 1);
        TextField UserTextField5 = new TextField();
        grid.add(UserTextField5, 5, 1);
        UserTextField5.setDisable(true);
        
        Label city = new Label("Kota:");
        grid.add(city, 4, 2);
        TextField UserTextField6 = new TextField();
        grid.add(UserTextField6, 5, 2);
        UserTextField6.setDisable(true);
        
        
        
        Label hobi = new Label("hobi:");
        grid.add(hobi, 4, 3);
        TextField UserTextField8 = new TextField();
        grid.add(UserTextField8, 5, 3);    
        UserTextField8.setDisable(true);
        
        Button del = new Button("Delete");
        HBox size1 = new HBox(10);
        size1.setAlignment(Pos.BOTTOM_RIGHT);
        size1.getChildren().add(del);
        grid.add(size1, 4, 6);
        del.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
              UserTextField.setText("");
              UserTextField2.setText("");
              UserTextField3.setText("");
              UserTextField4.setText("");
              UserTextField5.setText("");
              UserTextField6.setText("");
              
              UserTextField8.setText("");
              
            }
        });
        
        
        Button NEW = new Button("New");
        HBox size2 = new HBox(10);
        size2.setAlignment(Pos.BOTTOM_RIGHT);
        size2.getChildren().add(NEW);
        grid.add(size2, 5, 7);
       NEW.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
              mboh w = new mboh();
            }
        });
        
        Label sex = new Label("Jenis Kelamin");
        grid.add(sex, 0, 5);
        RadioButton lk = new RadioButton("Laki-laki");
        RadioButton pr = new RadioButton("Perempuan");
        ToggleGroup kelaminGroup = new ToggleGroup();
        lk.setToggleGroup(kelaminGroup);
        pr.setToggleGroup(kelaminGroup);
        pr.setDisable(true); 
        lk.setDisable(true);
        grid.add(lk, 1, 5);
        grid.add(pr, 1, 6);
        
         Button edit = new Button("EDIT");
        HBox size3 = new HBox(10);
        size3.setAlignment(Pos.BOTTOM_RIGHT);
        size3.getChildren().add(edit);
        grid.add(size3, 4, 7);
        edit.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
              UserTextField.setDisable(false);
              UserTextField2.setDisable(false);
              UserTextField3.setDisable(false);
              UserTextField4.setDisable(false);
              UserTextField5.setDisable(false);
              UserTextField6.setDisable(false);
              
              UserTextField8.setDisable(false);
              pr.setDisable(false); 
              lk.setDisable(false);
            }
        });
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 5, 6);
          btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                a = UserTextField.getText();
                b = UserTextField2.getText();
                c = UserTextField3.getText();
                d = UserTextField4.getText();
                e = UserTextField5.getText();
                f = UserTextField6.getText();
              
                h = UserTextField8.getText();
                
                if(lk.isSelected()){
                i = lk.getText();
                }else if(pr.isSelected()){
                i = pr.getText();
                }
                Welcome wc = new Welcome(a,b,c,d,e,f,h,i);
                
                
            }
        });
        
        primaryStage.show();
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

     //To change body of generated methods, choose Tools | Templates
}
    
