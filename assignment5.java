package FinalAssignmet;

public class assignment5 {

//	"Create Constructor overloading  program atleast one constructor have seven parameters in it"
	private int param1;
    private int param2;
    private int param3;
    private int param4;
    private int param5;
    private int param6;
    private int param7;

   
    public assignment5() {
        
    }

    
    public assignment5(int param1) {
        this.param1 = param1;
    }

    
    public assignment5(int param1, int param2) {
        this(param1);
        this.param2 = param2;
    }

    
    public assignment5(int param1, int param2, int param3) {
        this(param1, param2); 
        this.param3 = param3;
    }

    
    public assignment5(int param1, int param2, int param3, int param4) {
        this(param1, param2, param3); 
        this.param4 = param4;
    }

    
    public assignment5(int param1, int param2, int param3, int param4, int param5) {
        this(param1, param2, param3, param4); 
        this.param5 = param5;
    }


    public assignment5(int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param1, param2, param3, param4, param5); 
        this.param6 = param6;
    }

    
    public assignment5(int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param1, param2, param3, param4, param5, param6); 
        this.param7 = param7;
    }

   	

	public static void main(String[] args) 
	{
		

	}

}
