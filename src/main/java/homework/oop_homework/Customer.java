package homework.oop_homework;

public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;

    // Getters
    public String getName() { return name; }

    public boolean isMember() {
        return member;
    }

    public String getMemberType() { return memberType; }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMember(boolean member) { this.member = member; }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    // Constructor
    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, boolean member, String memberType) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer {" +
                "name = '" + name + '\'' +
                ", member = " + member +
                ", memberType = '" + memberType + '\'' +
                '}';
    }
}