package Tomov.Company;

public class Company {
    private String nameOfCompany;
    private String dateOfCreation;
    private String bulstat;

    public Company(String nameOfCompany, String dateOfCreation, String bulstat){
        this.setNameOfCompany(nameOfCompany);
        this.setDateOfCreation(dateOfCreation);
        this.setBulstat(bulstat);

    }
    public void setNameOfCompany(String nameOfCompany){
        this.nameOfCompany = nameOfCompany;
    }

    public String getNameOfCompany(){
        return nameOfCompany;
    }
    public void setDateOfCreation(String dateOfCreation){
        this.dateOfCreation = dateOfCreation;
    }
    public String getDateOfCreation(){
        return dateOfCreation;
    }
    public void setBulstat(String bulstat){
        if(bulstat.length() == 10){
            this.bulstat = bulstat;
        }
    }
    public String getBulstat(){
        return bulstat;
    }

}
