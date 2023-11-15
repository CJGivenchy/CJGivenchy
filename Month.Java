public class Month {
    private int monthNumber;

    // No-arg constructor
    public Month() {
        this.monthNumber = 1;
    }

    // Constructor with month number as argument
    public Month(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            this.monthNumber = 1;
        } else {
            this.monthNumber = monthNumber;
        }
    }

    // Constructor with month name as argument
    public Month(String monthName) {
        // Convert the month name to lowercase and compare
        switch (monthName.toLowerCase()) {
            case "january":
                this.monthNumber = 1;
                break;
            case "february":
                this.monthNumber = 2;
                break;
            case "march":
                this.monthNumber = 3;
                break;
            case "april":
                this.monthNumber = 4;
                break;
            case "may":
                this.monthNumber = 5;
                break;
            case "june":
                this.monthNumber = 6;
                break;
            case "july":
                this.monthNumber = 7;
                break;
            case "august":
                this.monthNumber = 8;
                break;
            case "september":
                this.monthNumber = 9;
                break;
            case "october":
                this.monthNumber = 10;
                break;
            case "november":
                this.monthNumber = 11;
                break;
            case "december":
                this.monthNumber = 12;
                break;
            default:
                this.monthNumber = 1; // Default to January if the name is not recognized
        }
    }

    // Setter for monthNumber
    public void setMonthNumber(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            this.monthNumber = monthNumber;
        } else {
            this.monthNumber = 1;
        }
    }

    // Getter for monthNumber
    public int getMonthNumber() {
        return this.monthNumber;
    }

    // Getter for month name
    public String getMonthName() {
        switch (this.monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid Month";
        }
    }

    // toString method returns the month name
    @Override
    public String toString() {
        return getMonthName();
    }

    // equals method to compare Month objects
    public boolean equals(Month otherMonth) {
        return this.monthNumber == otherMonth.getMonthNumber();
    }

    // greaterThan method to compare Month objects
    public boolean greaterThan(Month otherMonth) {
        return this.monthNumber > otherMonth.getMonthNumber();
    }

    // lessThan method to compare Month objects
    public boolean lessThan(Month otherMonth) {
        return this.monthNumber < otherMonth.getMonthNumber();
    }
}
