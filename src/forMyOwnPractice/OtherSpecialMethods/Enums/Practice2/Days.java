package forMyOwnPractice.OtherSpecialMethods.Enums.Practice2;

public enum Days {
        SUNDAY(false), MONDAY(true), TUESDAY(true), WEDNESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false);

        //Enhancing code
        private final boolean isWeekDay;

    Days(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public String getType(){
            return isWeekDay ? "Weekday" : "Weekend";
    }
}

/*
---> Create an enum called Day that represents the days of the week.
Write a program that prints out all the days of the week from this enum.

--->  Enhance the Day enum by adding an attribute that indicates whether it is a weekday or weekend.
 Add a method in the enum that returns whether it's a weekday or weekend, and
write a program to print out each day along with its type.
 */
