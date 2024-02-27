class Contact {
    private String name;
    private String email;

    public static int numOfContacts;

    public Contact(){numOfContacts++;}

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
        numOfContacts++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getNumOfContacts() {
        return numOfContacts;
    }

    public static void setNumOfContacts(int numOfContacts) {
        Contact.numOfContacts = numOfContacts;
    }
    public void display(){
        System.out.println("This is da info: "+name +" / "+email);
    }
}
