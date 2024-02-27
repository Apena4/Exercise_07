public class Business extends Contact{
    private int phoneNum;

    public Business(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Business(String name, String email, int phoneNum) {
        super(name, email);
        this.phoneNum = phoneNum;
    }

    @Override
    public void display() {
        System.out.println(getName()+" "+getEmail()+" "+"Phone Number info: "+ phoneNum);
    }
}
