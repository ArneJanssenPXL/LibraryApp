package be.pxl.researchproject.api.request;

public class AuthorRequest {
    private String firstName;
    private String lastName;
    private int numberOfBooks;
    private String company;

    public AuthorRequest() {
    }

    public AuthorRequest(String firstName, String lastName, int numberOfBooks, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfBooks = numberOfBooks;
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public String getCompany(){
        return company;
    }
}
