package client.application;

import client.Controller.ClientRootController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientAppMain extends Application{

	public static void main(String[] args) {
		launch(args);

	}
//ä�� ��� ���ñݾ� �����ϴ¹���� �ִ��� �󸶸� ������ �ִ���
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loder = new FXMLLoader(getClass().getResource("../View/root.fxml"));
		Parent root = loder.load();
		ClientRootController rootController = loder.getController();
		rootController.stage = stage;
		
		
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		stage.setResizable(false);
		stage.setTitle("�α���");
		stage.setScene(scene);
		stage.show();
		
	}

}
