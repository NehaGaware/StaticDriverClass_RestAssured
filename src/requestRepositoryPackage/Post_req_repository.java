package requestRepositoryPackage;

public class Post_req_repository {
	public static String base_URI() 
	{
		String baseURI = "https://reqres.in/";
		return baseURI;
	}
	
	public static String post_resource() 
	{
		String resource ="/api/users";
		return resource;
	}
	
	
	public static String Post_req_tc_1()
	{
		String requestbody="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		return requestbody;
	}
}

