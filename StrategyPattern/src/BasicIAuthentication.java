 public class BasicIAuthentication implements IAuthenticationStrategy {
    private User exUser;
    @Override
    public boolean authenticate(User user) {
        // Authenticate using basic authentication
        if (user.account == exUser.account && user.getMd5Pwd() == exUser.getMd5Pwd()) {
            System.out.println("authenticated success");
            return true;
        } else {
            System.out.println("failed to authenticate");
            return false;
        }
    }
}
