package com.example.hibernate_javafx_martin.controllers;

import com.example.hibernate_javafx_martin.dao.jugadorDAO;
import com.example.hibernate_javafx_martin.models.Jugador;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class JugadorController {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtAlias;
    @FXML
    private TextField txtEdad;
    @FXML
    private Button btnSave;
    @FXML
    private TableView<Jugador> tableJugadores;

    private jugadorDAO jugadorDAO1 = new jugadorDAO();

    @FXML
    private void initialize() {
        loadJugadores();
    }
    @FXML
    private void handleSave(){
        String nombre = txtNombre.getText();
        String alias = txtAlias.getText();
        int edad = Integer.parseInt(txtEdad.getText());

        Jugador jugador = new Jugador();
        jugador.setNombre(nombre);
        jugador.setAlias(alias);
        jugador.setEdad(edad);

        jugadorDAO1.save(jugador);
        loadJugadores();
    }

    private void loadJugadores() {
        tableJugadores.getItems().setAll(jugadorDAO1.findAll());
    }

}
