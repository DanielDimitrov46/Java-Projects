package test;

public class Book {
    private String title;
    private String author;
    private  String publisher;
    private String publishYear;
    private int id;


public Book(String title, String author, String publisher,String publisherYear,int id){
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.publishYear= publisherYear;
    this.id = id;
}

public  void setTitle(String title){
    this.title = title;
}

public  String getTitle(){
    return title;
}


public void setAuthor(String author){
    this.author = author;
}

public String getAuthor(){
    return author;
}

public void setPublisher(String publisher){
    this.publisher = publisher;
}

public String getPublisher(){
    return publisher;
}

public void setPublishYear(String publishYear){
    this.publishYear = publishYear;
}

public String getPublishYear(){
     return publishYear;
}

public void setId(int id){
    this.id = id;

}

public int getId(){
        return id;

}

    @Override
    public String toString() {
        return getTitle() + "" +  getAuthor() + "" ;
    }
}