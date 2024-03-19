public interface ValidateISSN {

    public static boolean validateISSN(String ISSN) throws WrongISSNException {
        if (ISSN.length()<8){
            throw new WrongISSNException("The number is not correct length!");
        }else{
            return true;
        }
    }
}
