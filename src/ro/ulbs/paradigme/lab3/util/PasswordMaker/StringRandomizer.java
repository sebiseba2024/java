package ro.ulbs.paradigme.lab3.util.PasswordMaker;

public class StringRandomizer {

    public StringRandomizer() {
    }

    public String getRandomString(int length) {
        String randomString = "";
        for (int i = 0; i < length; i++) {
            randomString += (char) (Math.random() * 26 + 'a');
        }
        return randomString;
    }

}
