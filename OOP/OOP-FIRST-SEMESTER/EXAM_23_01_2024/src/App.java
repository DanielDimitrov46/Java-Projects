public class App {
    public static void main(String[] args) {
        Picture picture1 = new Picture("Mona Liza","Picaso",2500,1900,1);
        Picture picture2 = new Picture("Tajnata Vecherq","Kameliq",3000,1800,2);
        System.out.println(picture2);
        Picture[] allPictures = new Picture[10];
        Pictures pictures = new Pictures(allPictures);
        pictures.addPicture(picture1);
        pictures.search("Kameliq");
        System.out.println(pictures.mostExpensive());
        System.out.println(Pictures.averagePrice("Picaso"));
    }
}