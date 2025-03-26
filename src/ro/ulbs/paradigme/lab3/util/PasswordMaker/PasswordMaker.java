package ro.ulbs.paradigme.lab3.util.PasswordMaker;

public class PasswordMaker{
    private static final StringRandomizer StringRandomizer = new StringRandomizer();
    private double MAGIC_NUMBER;
    private String magicString;
    private String name;

    public PasswordMaker(String name) {
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPassword() {
        MAGIC_NUMBER = Math.random() * 5 + 5;
        magicString = StringRandomizer.getRandomString((int) MAGIC_NUMBER);
        StringBuilder random10Chars = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            int index = (int) (Math.random() * magicString.length());
            random10Chars.append(magicString.charAt(index));
        }
        String nameLengthString = String.valueOf(name.length());
        int randomInt = (int) (Math.random() * 51);
        return magicString + random10Chars.toString() + nameLengthString + randomInt;
    }


}

