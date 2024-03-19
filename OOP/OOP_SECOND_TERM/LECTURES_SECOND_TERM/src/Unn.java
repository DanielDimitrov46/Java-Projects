class UnsuccessfulAuthMock extends User {
    public UnsuccessfulAuthMock() {
        super("", "");
    }

    @Override
    public boolean authenticate(String password) {
        return false;
    }
}