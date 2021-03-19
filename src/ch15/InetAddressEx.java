package ch15;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

//InetAddress
// - ip주소를 다루기 위한 클래스 
public class InetAddressEx {

	public static void main(String[] args) {
		try {
			InetAddress local =	InetAddress.getLocalHost();
			System.out.println("myCom IPv4 주소 : " +local.getHostAddress());
			System.out.println();
			String host = "www.coupang.com";
			InetAddress[] inetArr = InetAddress.getAllByName(host);
			for(InetAddress temp :inetArr) {
				System.out.println(host + " 의 IP " + temp.getHostAddress());
			}
			System.out.println(Arrays.toString(inetArr));
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}

}
