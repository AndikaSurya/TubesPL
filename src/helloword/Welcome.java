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
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javax.swing.JOptionPane;

public class Welcome {
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    public Welcome(String z, String x, String v, String p, String n, String m,  String k, String j){
    GridPane gridBaru = new GridPane();
        gridBaru.setAlignment(Pos.CENTER);
        
        gridBaru.setHgap(10);
        gridBaru.setVgap(10);
        gridBaru.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(gridBaru, 550, 300);
        Stage secondStage = new Stage();
        secondStage.setTitle("Hello");
        secondStage.setScene(scene);
        
         Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridBaru.add(scenetitle, 0, 0, 2, 1);
        
        Label nim = new Label ("NIM:");
        gridBaru.add(nim, 0, 1);        
        TextField UserTextField = new TextField(z);
        gridBaru.add(UserTextField, 1, 1);
        UserTextField.setDisable(true);
        
        Label name = new Label("Nama:");
        gridBaru.add(name, 0, 2);        
        TextField UserTextField2 = new TextField(x);
        gridBaru.add(UserTextField2, 1, 2);
        UserTextField2.setDisable(true);
        
        Label faculty = new Label("Fakultas:");
        gridBaru.add(faculty, 0, 3);
        TextField UserTextField3 = new TextField(v);
        gridBaru.add(UserTextField3, 1, 3);
        UserTextField3.setDisable(true);
        
        Label major = new Label("Jurusan:");
        gridBaru.add(major, 0, 4);
        TextField UserTextField4 = new TextField(p);
        gridBaru.add(UserTextField4, 1, 4);
        UserTextField4.setDisable(true);
        
        Label omah = new Label("Alamat:");
        gridBaru.add(omah, 4, 1);
        TextField UserTextField5 = new TextField(n);
        gridBaru.add(UserTextField5, 5, 1);
        UserTextField5.setDisable(true);
       
        Label city = new Label("Kota:");
        gridBaru.add(city, 4, 2);
        TextField UserTextField6 = new TextField(m);
        gridBaru.add(UserTextField6, 5, 2);
        UserTextField6.setDisable(true);
        
        
        
        Label hobi = new Label("hobi:");
        gridBaru.add(hobi, 4, 3);
        TextField UserTextField8 = new TextField(k);
        gridBaru.add(UserTextField8, 5, 3);   
        UserTextField8.setDisable(true);
        
        Label sex = new Label("Jenis Kelamin");
        gridBaru.add(sex, 0, 5);
        TextField UserTextField9 = new TextField(j);
        gridBaru.add(UserTextField9, 1, 5);  
        UserTextField9.setDisable(true);
        
         Button NEW = new Button("New");
        HBox size2 = new HBox(10);
        size2.setAlignment(Pos.BOTTOM_RIGHT);
        size2.getChildren().add(NEW);
        gridBaru.add(size2, 5, 6);
        NEW.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
              mboh w = new mboh();
            }
        });
        
        Button exit = new Button("EXIT");
        HBox size3 = new HBox(10);
        size3.setAlignment(Pos.BOTTOM_RIGHT);
        size3.getChildren().add(exit);
        gridBaru.add(size3, 4, 6);
        exit.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
              System.exit(0);
            }
        });
        
         Button edit = new Button("EDIT");
        HBox size4 = new HBox(10);
        size4.setAlignment(Pos.BOTTOM_RIGHT);
        size4.getChildren().add(edit);
        gridBaru.add(size4, 5, 7);
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
                UserTextField9.setDisable(false);
            }
        });
        Button update = new Button("Update");
        HBox sizeP = new HBox(10);
        sizeP.setAlignment(Pos.BOTTOM_RIGHT);
        sizeP.getChildren().add(update);
        gridBaru.add(sizeP, 4, 7);
       update.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
              a = UserTextField.getText();
                b = UserTextField2.getText();
                c = UserTextField3.getText();
                d = UserTextField4.getText();
                e = UserTextField5.getText();
                f = UserTextField6.getText();
              
                h = UserTextField8.getText();  
                i = UserTextField9.getText();  
                  
                
           
                Welcome wc = new Welcome(a,b,c,d,e,f,h,i);
            }
        });
       
       Button confirm = new Button("Konfirmasi");
       HBox sizeL = new HBox(10);
       sizeL.setAlignment(Pos.BASELINE_RIGHT);
       sizeL.getChildren().add(confirm);
       gridBaru.add(sizeL, 0, 7);
       confirm.setOnAction( e -> isInt(UserTextField, UserTextField.getText()));
       
      
         secondStage.show();
         
}
private boolean isInt(TextField nim, String nomer){
        try{
            int siswa = Integer.parseInt(nim.getText());
            JOptionPane.showMessageDialog(null,"Welcome "+siswa);
            return true;    
        }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Error: "+nomer+" is not a number");
            return false;
        }
        
       }
    
}