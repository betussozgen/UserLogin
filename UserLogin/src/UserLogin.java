//Kullanıcıdan veri alabilmek için Scanner sınıfını dahil ediyoruz.
import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {

        //Kullanıcıdan kullanıcı adı ve şifre için değişkenleri tanımladık.
        String userName;
        String password;
        //String deneme;
        String dene;
        //String newPassword;

        //Burada user name ve password sabit değişkenlerdir.(örn:PI=3.14)
        //Sabitler için screaming snake case şeklinde yazıldı. > örn: HELLO_WORLD
        String USER_NAME = "patika";
        String PASSWORD = "java123";

        int select;

        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter User Name: ");
        userName = input.nextLine();

        System.out.print("Please enter password: ");
        password = input.nextLine();


        //kullanıcı adı doğru şifre doğru ----- giriş başarılı
        //kullanıcı adı doğru şifre yanlış----- giriş olmadı şifre yanlış
        //şifre sıfırlamak istiyor mu? ---- evetse ---- şifreler aynı olmasın
        //                                              ---- şifreler aynı ise ---- şifre oluşturulamadı.--- Tekrar deneyin
        //                                                   şifreler farklı ise ---- şifre oluşturuldu.
        //                               ---- hayırsa --- programdan çıkış yapılsın.
        //kullanıcı adı yanlış şifre doğru ------ giriş olmadı kullanıcı adı yanlış
        //kullanıcı adı yanlış şifre yanlış ---- giriş olmadı hepsi yanlış


            if (userName.equals(USER_NAME) && password.equals(PASSWORD)) {
                System.out.println("Login Successful ! ");
            } else if (userName.equals(USER_NAME) && !password.equals(PASSWORD)) {
                System.out.println("Wrong Password ");
                System.out.println("Do you want to reset password? \nIf you want choose 1\nIf you dont want choose 2");

                select = input.nextInt();


                switch (select) {
                    case 1:
                        System.out.println("Welcome to password change screen");
                        System.out.println("Please the new password you choose is not the same !!!!");

                        //Bu yorum satırını açınca hata almıyorum. Ama kapatınca "enter new password" yazısının girdisini beklemeden program sonlanıyor.
                        //System.out.println("Enter : ");
                        //deneme = input.nextLine();


                        System.out.println("Enter new password: ");
                        String newPassword = input.nextLine();

                        if (newPassword.equals(PASSWORD) || newPassword.equals(password)) {
                            System.out.println("Passwords are the same. Failed to create password. Try again.");

                        } else {
                            System.out.println("New password created !.");
                            password = newPassword;
                            System.out.println("Password: " + password);
                            System.out.println("Exiting the program...");
                        }
                        break;
                    case 2:
                        System.out.println("Exiting the program...");
                        break;
                }

            } else if (!userName.equals(USER_NAME) && password.equals(PASSWORD)) {
                System.out.println("Wrong User Name");
            } else {
                System.out.println("All information is wrong");
            }


        }

}
