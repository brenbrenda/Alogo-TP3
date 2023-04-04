class OAuthIAuthentication implements IAuthenticationStrategy {
    @Override
    public boolean authenticate(User user) {
        // Authenticate using OAuth authentication to map the backend api
        if (user.getToken() == "token") {
            System.out.println("authenticated success");
            return true;
        } else {
            System.out.println("failed to authenticate");
            return false;
        }
    }
}

