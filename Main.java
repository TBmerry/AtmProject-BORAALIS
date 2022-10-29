import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int girisHakki = 5;
        int bakiye = 0;
        int select;

        while(girisHakki > 0){
            System.out.print("Kullanıcı Adı Giriniz : ");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz : ");
            password = input.nextLine();

            if (userName.equals("Bora") && password.equals("6677")){
                System.out.println("Giriş Başarılı. X Bankasına Hoşgeldiniz Efendim");
                do {
                    System.out.println("1- Para Yatırma\n2- Para Çekme\n3- Bakiye Sorgulama\n4- Çıkış Yapmak");
                    System.out.println("Lütfen Yapmak İstediğiniz işlemi seçiniz :");
                    select = input.nextInt();
                switch (select){
                    case 1:
                        System.out.println("Yatırmak İstediğiniz Miktarı Giriniz : ");
                        int price = input.nextInt();
                        bakiye += price;
                        System.out.println("Para Yatırdıktan Sonra Bakiyeniz : " + bakiye);
                        break;
                    case 2:
                        System.out.println("Çekmek İstediğiniz Tutarı Giriniz : ");
                        price = input.nextInt();
                        if (price > bakiye){
                            System.out.println("Bakiyenizde Yeterli Para Bulunmamaktadır!!!");
                        }else{
                            bakiye -= price;
                            System.out.println("Para Çekildikten Sonra Bakiyeniz : " + bakiye);
                        }
                        break;
                    case 3:
                        System.out.println("Mevcut Bakiyeniz : " + bakiye);
                        break;
                }
                }while (select != 4);
                System.out.println("İyi Günler Dileriz.");
                break;
            }else {
                girisHakki--;
                System.out.println("Hatalı Kullanıcı Adı ve Şifre Girdiniz. ");
                if (girisHakki == 0){
                    System.out.println("Hesabınız Bloke Edilmiştir!! En Yakın Şubemize Başvurunuz.");
                }else{
                    System.out.println("Kalan Giriş Hakkınız : " + girisHakki);
                }

            }
        }
    }
}