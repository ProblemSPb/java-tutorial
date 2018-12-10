public class NormalMember extends InheritanceDemo {

    // child constructors
    public NormalMember() {
        System.out.println("Child constructor with no parameter.");
    }

    public NormalMember(String pName, int pMemberID, int pMemberSince) {
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child constructor with 3 parameters.");
    }

    @Override
    public void calculateAnnualFee() {
        annualFee = (1 - 0.01 * getDiscount())*(100 + 12 * 30);
    }
}

// Child class for InheritanceDemo