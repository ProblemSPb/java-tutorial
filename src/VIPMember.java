public class VIPMember extends InheritanceDemo {

    public VIPMember(String pName, int pMemberID, int pmemberSince) {

        super(pName, pMemberID, pmemberSince);
        System.out.println("Child constructor with 3 parameters.");
    }

    @Override

    public void calculateAnnualFee( ) {

        annualFee = (1 - 0.01 * getDiscount()) * 1200;
    }
}

// Child class for InheritanceDemo