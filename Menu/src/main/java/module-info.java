module com.mycompany.menu {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.menu to javafx.fxml;
    exports com.mycompany.menu;
}
