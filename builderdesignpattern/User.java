package sevensem.builderdesignpattern;

public class User {

    private final int userId;
    private final String userName;
    private final String userAddress;
    private final int phone;
    private final String email;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }

    private User(userBuilder builder){
        this.userId=builder.userId;
        this.email=builder.email;
        this.phone=builder.phone;
        this.userAddress=builder.userAddress;
        this.userName=builder.userName;

    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    static  class userBuilder{

        private  int userId;
        private  String userName;
        private  String userAddress;
        private  int phone;
        private  String email;

        public userBuilder(){

        }

        public userBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public userBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public userBuilder setUserAddress(String userAddress) {
            this.userAddress = userAddress;
            return this;
        }

        public userBuilder setPhone(int phone) {
            this.phone = phone;
            return this;
        }

        public userBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build(){
            User user  =new User(this);
            return user;

        }


    }

}
