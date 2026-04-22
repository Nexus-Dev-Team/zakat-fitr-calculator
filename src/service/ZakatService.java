package service;

public class ZakatService {
    
    public static double calculate(int familyMembers, double kiloPerPerson) {
        // if (familyMembers <= 0 || kiloPerPerson <= 0)
        //     throw new IllegalArgumentException("Values must be greater than 0 ");
        return familyMembers * kiloPerPerson;
    }
}
