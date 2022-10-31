package com.example.pr1_4;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label LBL_res_pr;
    @FXML
    private Label LBL_res_sum;
    @FXML
    private TextField TF_n;
    @FXML
    private TextArea TA_mas;

    @FXML
    protected void onHelloButtonClick() {
        int n, sum = 0, pr = 1;
        int[] mas;
        TA_mas.setText("");
        try{
            n = Integer.parseInt(TF_n.getText());
            mas = new int[n];
            for(int i = 0; i < n; i++){
                mas[i] = 1 + (int) (Math.random() * 200);
                if(mas[i] < 50)
                    pr*=mas[i];
                else if(mas[i]>100)
                    sum+=mas[i];
                TA_mas.setText(TA_mas.getText()+mas[i]+"\n");
            }
            LBL_res_pr.setText("Произведение: "+pr);
            LBL_res_sum.setText("Сумма: "+sum);
            if(sum == 0){
                LBL_res_sum.setText("Элементов >100 не найдено!");
            }
            if(pr == 0){
                LBL_res_pr.setText("Элементов <50 не найдено!");
            }
        } catch (Exception e){
            ALARM("Проверьте правильность введенных данных!");
        }
    }

    private void ALARM(String s){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Внимание!");
        alert.setHeaderText(null);
        alert.setContentText(s);
        alert.showAndWait();
    }
}