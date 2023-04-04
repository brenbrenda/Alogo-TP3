public class DigestAuthentication {
    private User exUser;
    public boolean authenticate(User user) {

        System.out.println("digest Authentication");

        if (user.getOpenID() == exUser.getOpenID()) {
            System.out.println("authenticated success");
            return true;
        } else {
            System.out.println("failed to authenticate");
            return false;
        }
    }
}
