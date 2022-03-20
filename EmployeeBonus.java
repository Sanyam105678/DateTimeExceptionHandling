package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class EmployeeBonus {


    public double bonus(String jdate) throws InvalidAgeException {
        LocalDate cd = LocalDate.now();
        try {
            LocalDate jd = LocalDate.parse(jdate);
            if (jd.isAfter(cd))
                throw new InvalidAgeException("Age should not be in the future");
            if (ChronoUnit.DAYS.between(jd, cd) < 365)
                return 5000;
            else if (ChronoUnit.DAYS.between(jd, cd) >= 365 && ChronoUnit.DAYS.between(jd, cd)<2*365)
                return 8000;
            else
                return 10000;

        } catch (DateTimeParseException e) {
            throw new InvalidAgeException("Please pass the date in correct format");
        }



    }

}

