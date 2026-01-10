package W4Day1.IfElse2;

public class WindSpeed {
    public static void main(String[] args) {
        double speed = 45.0; // Example wind speed in km/h
        String category = "Unknown";

        if (speed < 1) {
            category = "Calm";
        } else if (speed >= 4 && speed <= 7) {
            category = "Light Breeze";
        } else if (speed >= 13 && speed <= 18) {
            category = "Moderate Breeze";
        } else if (speed >= 25 && speed <= 31) {
            category = "Strong Breeze";
        } else if (speed >= 39 && speed <= 46) {
            category = "Gale";
        } else if (speed >= 55 && speed <= 63) {
            category = "Storm";
        } else if (speed >= 74) {
            category = "Hurricane";
        }

        System.out.println("Wind Speed: " + speed + " km/h");
        System.out.println("Category: " + category);
    }
}
