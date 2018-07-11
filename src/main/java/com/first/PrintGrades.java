package com.first;

public class PrintGrades {

    public String print(int grade) {
        if (grade > 93)
            return "You got an A!";
        else if (grade > 83)
            return "You got a B!";
        else if (grade > 73)
            return "You got a C!";
        else
            return "You need to study more";
    }

    public String stringMethods() {

        String line = "You got Distinction";
        final char c = line.charAt(5);
        return String.valueOf(c);
    }

    public boolean stringMethods2(String s) {

        String line = "You got Distinction";
        final boolean c = line.equalsIgnoreCase(s);
        return c;
    }
}
