import java.util.ArrayList;

public class Pictures {
    private static Picture[] pictures = new Picture[10];

    public Pictures(Picture[] pictures) {
        this.pictures = pictures;
    }

    public Picture[] getPictures() {
        return pictures;
    }

    public void setPictures(Picture[] pictures) {
        this.pictures = pictures;
    }

    public void addPicture(Picture picture) {
        for (int i = 0; i < pictures.length; i++) {
            if (pictures[i] != null) {
                Picture curr = pictures[i];
                if (curr.getName().equals(picture.getName())) {
                    System.out.println(curr);
                    System.out.println("This picture already exists!");
                }
            } else {
                pictures[i] = picture;
                break;
            }
        }
    }

    public void search(String author) {
        if (author.isEmpty()) {
            for (Picture curr : pictures) {
                System.out.println(curr);
            }
        } else {
            for (int i = 0; i < pictures.length; i++) {
                if (pictures[i] != null) {
                    Picture curr = pictures[i];
                    if (curr.getName().equals(author)) {
                        System.out.println(curr);
                    }
                    break;
                }
            }

        }

    }

    public ArrayList<Picture> mostExpensive() {
        ArrayList<Picture> mostExpensive = new ArrayList<>();
        Picture max = pictures[0];
        for (int i = 0; i < pictures.length; i++) {
            if (pictures[i] != null) {
                Picture curr = pictures[i];
                if (curr.getPrice() > max.getPrice()) {
                    max = curr;
                }
            }
        }
        mostExpensive.add(max);
        return mostExpensive;
    }

    public static double averagePrice(String author) {
        double sum = 0;
        int counterForMatch = 0;
        if (author.isEmpty()) {
            for (Picture curr : pictures) {
                sum += curr.getPrice();
            }
            sum = sum / pictures.length;
        } else {
            for (int i = 0; i < pictures.length; i++) {
            if (pictures[i] != null) {
                Picture curr = pictures[i];
                if (curr.getAuthor().equals(author)) {
                    sum += curr.getPrice();
                    counterForMatch++;
                }
            }
        }
//            for (Picture curr : pictures) {
//                if (curr.getName().equals(author)) {
//                    sum += curr.getPrice();
//                    counterForMatch++;
//                }
//            }
            sum = sum / counterForMatch;
        }
        return sum;

    }
}

