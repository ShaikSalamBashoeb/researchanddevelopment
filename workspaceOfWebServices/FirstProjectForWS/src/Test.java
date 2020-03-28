import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;



public class Test {

	public static void main(String[] args) {

		GeoIPService g = new GeoIPService();
		GeoIPServiceSoap geoIPServiceSoap = g.getGeoIPServiceSoap();
		String ipAddress = "74.125.200.139";
		GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
		System.out.println(geoIP.getCountryName());
	}

}
