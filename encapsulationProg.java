package exception;
class amazonApplication
{
	private String un = "test@product.com";

	public String getUn()
	{
		return un;
		
	}
	public void setUn(String un)
	{
		this.un=un;
	}
}
public class encapsulationProg {
	
	public static void main(String args[])
	{
		amazonApplication a = new amazonApplication();
		a.setUn("gohh@google.com");
		System.out.println(a.getUn());
}
}
