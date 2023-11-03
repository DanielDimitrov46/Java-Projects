import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {


    public static void main(String[] args) throws IOException {
        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Advertisment> advertismentArrayList = new ArrayList<Advertisment>();
        ArrayList<Users> usersArrayList = new ArrayList<>();
        Advertisment defaultAd = new Advertisment("Looking for front-end dev!", "Lidl Digital", "Front-end",
                "We are looking for somebody who is comunnicative and want to work with big and fresh team. You must have worked with Bootstrap and Front-end frameworks!",
                2500, "Sofia", "Daniel Dimitrov");
        Users defaultUsers = new Users("DanielDimitrov46", "781203daniBG");
        advertismentArrayList.add(defaultAd);
        usersArrayList.add(defaultUsers);


        boolean flag = false;
        while (true) {
            if (!flag) {
                System.out.println("Please login before start using our app!");
                String username = myReader.readLine();
                String password = myReader.readLine();
                for (Users user : usersArrayList) {
                    if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                        flag = true;
                        System.out.println("You have been logged in!");
                    }
                }
            }else{
                System.out.println("You can register if you want! Type register if you!");
                String command = myReader.readLine();
                command = command.toLowerCase();
                if (command.equals("register")){
                    String username = myReader.readLine();
                    String password = myReader.readLine();
                    String email = myReader.readLine();
                    String dateOfBirth = myReader.readLine();
                }
            }

            if (flag) {
                String command = myReader.readLine();
        command = command.toLowerCase();
                switch (command) {
                    case "add advertisment":
                        String nameOfAd = myReader.readLine();
                        String nameOfAdvertiser = myReader.readLine();
                        String position = myReader.readLine();
                        String description = myReader.readLine();
                        double salary = Double.parseDouble(myReader.readLine());
                        String city = myReader.readLine();
                        String contact = myReader.readLine();
                        Advertisment newAd = new Advertisment(nameOfAd, nameOfAdvertiser, position, description, salary, city, contact);
                        advertismentArrayList.add(newAd);
                        System.out.println("You successfully added a new add");
                        break;
                    case "visit advertisment":
                        for (int i = 0; i < advertismentArrayList.size(); i++) {
                            Advertisment curr = advertismentArrayList.get(i);
                            System.out.println(curr.toString());
                        }
                        break;
                    default:
                        System.out.println("You enter wrong option!");
                        break;
                }

                command = myReader.readLine();
                command = command.toLowerCase();
            } else {
                System.out.println("Wrong creditionals!\nTry again!");
            }
        }
    }
}
