package org.levelup.homework4;

public class Application {

    public static void main(String[] args) {
        Phone testPhone = new Phone();
        Phone iPhone = new Phone("11111", Phone.ModelTypes.IPHONE, 350.5);
        Phone android = new Phone("22222", Phone.ModelTypes.ANDROID, 400);
        Phone windowsPhone = new Phone("33333", Phone.ModelTypes.WINDOWSPHONE, 370);
        Phone symbian = new Phone("44444", Phone.ModelTypes.SYMBIAN);

        iPhone.printPhoneInfo();
        iPhone.receiveCall("John", android.getNumber());

        String[] numbers = {android.getNumber(), windowsPhone.getNumber(), symbian.getNumber()};

        iPhone.sendMessages(numbers);
    }
}
