package sevensem.prototypedesignpattern;

public class DBConnection implements Cloneable {

    private String url;
    private String userName;
    private String passWord;
    private String data;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        data = data;
    }

    public void LoadData(){
        this.data="Database Data are important";
        //this will take time to load
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "DBConnection{" +
                "url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
