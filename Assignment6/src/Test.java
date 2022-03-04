
public class Test {
	private int test_code;
	private String description;
    private int no_of_candidate;
    private int CenterReq;
    
    public int CALCNTR(int no_of_candidate)
    {
    CenterReq = (no_of_candidate/100+1);
    return CenterReq;
    }
    public void SCHEDULE(int testcd, String des, int no_candidate)
    {
	 test_code = testcd;
	 no_of_candidate = no_candidate;
	 CenterReq = CALCNTR(no_candidate);
	 description = des;
    }
    public void DISPTEST()
    {
    	System.out.println("Test Code : "+test_code);
    	System.out.println("Description : "+description);
    	System.out.println("No. of Candidates: "+no_of_candidate);
    	System.out.println("Centers Required :"+CenterReq);
    }
	public static void main(String[] args) {
		
		Test t=new Test();
		t.SCHEDULE(101, "Calculating Centers", 2000);
		t.DISPTEST();
		

	}

}
