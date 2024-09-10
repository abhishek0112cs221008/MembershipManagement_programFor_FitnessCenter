package src;
public class Member {

    char memberType;
    int memberId;
    String name;
    double fees;

    Member(char pMemberType, int pMemberId, String pName, double pFees) {
        memberType = pMemberType;
        memberId = pMemberId;
        name = pName;
        fees = pFees;
    }

    public void setMemberType(char memberType) {
        this.memberType = memberType;
    }

    public char getMemberType() {
        return memberType;
    }

    public void setMemberID(int pMemberID) {
        memberId = pMemberID;
    }

    public int getMemberID() {
        return memberId;
    }

    public void setName(String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }

    public void setFees(double pFees) {
        fees = pFees;
    }

    public double getFees() {
        return fees;
    }

    @Override
    public String toString() {
        return memberType + ", " + memberId + ", " + name + ", " + fees;
    }
}
