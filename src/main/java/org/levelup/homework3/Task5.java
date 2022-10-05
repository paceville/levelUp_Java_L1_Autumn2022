package org.levelup.homework3;

public class Task5 {
    public static void main(String[] args) {
        User poweruser = new User();
        poweruser.setFirstName("Mickey");
        poweruser.setLastName("Mouse");
        poweruser.setAge(32);

        User admin = new User();
        admin.setFirstName("Donald");
        admin.setLastName("Duck");
        admin.setAge(34);

        User tester = new User();
        tester.setFirstName("Minie");
        tester.setLastName("Mouse");
        tester.setAge(31);

        User customer = new User();
        customer.setFirstName("Daisy");
        customer.setLastName("Duck");
        customer.setAge(29);

        User[] users = {poweruser, admin, tester, customer};

        for (int i = 0; i < users.length; i++) {
            System.out.println("Last name: " + users[i].getLastName()
                    + ", name: " + users[i].getFirstName()
                    + "-" + users[i].getAge());
        }
    }
}
