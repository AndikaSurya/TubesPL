/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloword;

/**
 *
 * @author SISTEM
 */
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class mboh {
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
  
    String h;
    String i;
    public mboh() {
        GridPane gridBaru = new GridPane();
        gridBaru.setAlignment(Pos.CENTER);
        gridBaru.setHgap(10);
        gridBaru.setVgap(10);
        gridBaru.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(gridBaru, 500, 300);
        Stage secondStage = new Stage();
        secondStage.setTitle("Hello");
        secondStage.setScene(scene);
        
        Text scenetitle = new Text("Sign In");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridBaru.add(scenetitle, 0, 0, 2, 1);
//        
         Label nim = new Label ("NIM:");
        gridBaru.add(nim, 0, 1);        
        TextField UserTextField = new TextField();
        gridBaru.add(UserTextField, 1, 1);
        UserTextField.setDisable(true);
        
        Label name = new Label("Nama:");
        gridBaru.add(name, 0, 2);        
        TextField UserTextField2 = new TextField();
        gridBaru.add(UserTextField2, 1, 2);
        UserTextField2.setDisable(true);
        
        Label faculty = new Label("Fakultas:");
        gridBaru.add(faculty, 0, 3);
        TextField UserTextField3 = new TextField();
        gridBaru.add(UserTextField3, 1, 3);
        UserTextField3.setDisable(true);
        
        Label major = new Label("Jurusan:");
        gridBaru.add(major, 0, 4);
        TextField UserTextField4 = new TextField();
        gridBaru.add(UserTextField4, 1, 4);
        UserTextField4.setDisable(true);
        
        Label omah = new Label("Alamat:");
        gridBaru.add(omah, 4, 1);
        TextField UserTextField5 = new TextField();
        gridBaru.add(UserTextField5, 5, 1);
        UserTextField5.setDisable(true);
       
        Label city = new Label("Kota:");
        gridBaru.add(city, 4, 2);
        TextField UserTextField6 = new TextField();
        gridBaru.add(UserTextField6, 5, 2);
        UserTextField6.setDisable(true);
        
        
        
        Label hobi = new Label("hobi:");
        gridBaru.add(hobi, 4, 3);
        TextField UserTextField8 = new TextField();
        gridBaru.add(UserTextField8, 5, 3);   
        UserTextField8.setDisable(true);
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        gridBaru.add(hbBtn, 5, 6);
        
        
        Button del = new Button("Delete");
        HBox size1 = new HBox(10);
        size1.setAlignment(Pos.BOTTOM_RIGHT);
        size1.getChildren().add(del);
        gridBaru.add(size1, 4, 6);
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
        gridBaru.add(size2, 5, 7);
        NEW.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
              mboh w = new mboh();
            }
        });
        
        
        RadioButton lk = new RadioButton("Laki-laki");
        RadioButton pr = new RadioButton("Perempuan");
        ToggleGroup kelaminGroup = new ToggleGroup();
        lk.setToggleGroup(kelaminGroup);
        pr.setToggleGroup(kelaminGroup);
        pr.setDisable(true); 
        lk.setDisable(true);
        gridBaru.add(lk, 1, 5);
        gridBaru.add(pr, 1, 6);
        
        Button edit = new Button("EDIT");
        HBox size3 = new HBox(10);
        size3.setAlignment(Pos.BOTTOM_RIGHT);
        size3.getChildren().add(edit);
        gridBaru.add(size3, 4, 7);
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
                }
                else if(pr.isSelected()){
                i = pr.getText();
                }
           
                Welcome wc = new Welcome(a,b,c,d,e,f,h,i);
            }
        });
        
        secondStage.show();
    }
}

