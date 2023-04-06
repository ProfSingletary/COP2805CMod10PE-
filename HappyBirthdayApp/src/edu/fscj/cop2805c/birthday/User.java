// User.java
// D. Singletary
// 2/15/23
// Class which represents a user

// D. Singletary
// 2/26/23
// Added Locale property

package edu.fscj.cop2805c.birthday;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Locale;

public class User implements Serializable {
    private static Integer id = 0; // primary key
    private String fName;
    private String lName;
    private String email;
    Locale locale;
    private ZonedDateTime birthday;

    public User(String fName, String lName, String email, Locale locale,
                ZonedDateTime birthday) {
        id++;
        this.lName = lName;
        this.fName = fName;
        this.email = email;
        this.locale = locale;
        this.birthday = birthday;
    }

    public Integer getId() { return id; }

    public String getName() {
        return fName + " " + lName;
    }

    public String getLName() { return lName; }

    public String getFName() { return fName; }

    public String getEmail() { return email; }

    public Locale getLocale() {
        return locale;
    }

    public ZonedDateTime getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        String s = "User: " + this.getName() + ", Birthday: " + this.birthday;
        return s;
    }
}
