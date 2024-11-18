package forMyOwnPractice.OtherSpecialMethods.Enums.Practice1;

enum Level {
    LOW, MEDIUM, HIGH;
}

public class EnumWithSwitch {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;

        // Switch statement using enum
        switch (level) {
            case LOW:
                System.out.println("Low level");
                break;

            case MEDIUM:
                System.out.println("Medium level");
                break;

            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
