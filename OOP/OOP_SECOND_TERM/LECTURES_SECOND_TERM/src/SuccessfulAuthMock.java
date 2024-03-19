class SuccessfulAuthMock extends User {
    public SuccessfulAuthMock() {
        super("", "");
    }

    @Override
    public boolean authenticate(String password) {
        return true;
    }
}