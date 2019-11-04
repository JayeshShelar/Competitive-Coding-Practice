import java.net.*;

class InetAddressDemo
{
	public static void main(String args[]) throws Exception
	{
		InetAddress addr=InetAddress.getLocalHost();
		System.out.println(addr);
		
		addr=InetAddress.getByName("google.com");
		System.out.println(addr);
		
		InetAddress s[]=InetAddress.getAllByName("youtube.com");
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
			
		}
		System.out.println();
		String st=addr.getHostName();
		System.out.println(st);
		System.out.println();
		
		boolean k=addr.equals("google.com");
		System.out.println(k);
	}
}