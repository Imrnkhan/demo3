module com.example.demo3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.demo3 to javafx.fxml;
    exports com.example.demo3;
//    requires eu.hansolo.fx.countries;
//    requires eu.hansolo.fx.heatmap;
//    requires eu.hansolo.toolboxfx;
//    requires eu.hansolo.toolbox;
}

