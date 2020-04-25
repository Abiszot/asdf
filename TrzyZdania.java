package pl.zdania;

public class TrzyZdania {
    public static void main(String[] args) {
        String message = "Słonecznie chyba jest\"string\".";
        String message1 = "Ale może być i deszczowo\"string\".";
        String message2 = "Czasem może padać śnieg\"string\".";
        int lenght = message.length() + message1 .length() + message2.length();
        System.out.println(message+message1+message2);
        System.out.println("Suma znaków = " + lenght);
    }
}

