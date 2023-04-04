
class User {

    private Integer openID = 1;
    public String account;
    private String pwd;
    private String token = "token";

    public void setOpenID(Integer openID) {
        this.openID = openID;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }




    public String getMd5Pwd() {
        return hash(pwd);
    }

    private String hash(String pwd) {
        return pwd+"qq";
    }

    public Integer getOpenID() {
        return openID;
    }
}
