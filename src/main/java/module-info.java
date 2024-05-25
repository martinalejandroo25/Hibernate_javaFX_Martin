module com.example.hibernate_javafx_martin {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.sql;
    requires java.desktop;

    opens com.example.hibernate_javafx_martin to javafx.fxml;
    opens com.example.hibernate_javafx_martin.controllers to javafx.fxml;
    opens com.example.hibernate_javafx_martin.models to org.hibernate.orm.core;

    exports com.example.hibernate_javafx_martin;
    exports com.example.hibernate_javafx_martin.controllers;
    exports com.example.hibernate_javafx_martin.models;
}
