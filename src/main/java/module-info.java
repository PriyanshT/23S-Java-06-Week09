module com.georgiancollege.week9part2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.georgiancollege.week9part2 to javafx.fxml;
    exports com.georgiancollege.week9part2;
}