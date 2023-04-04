public class AuthProgram {

    public void main(String[] argv) {

        User newUser = new User();
        newUser.setPwd("pwd");
        IAuthenticationStrategy basic = new BasicIAuthentication();

        basic.authenticate(newUser);


    }
}
