package org.bsc;

import java.net.URISyntaxException;
import java.util.Calendar;

import org.bsc.functional.F2;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.filter.ClientFilter;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

public class ArtifactoryTest {

	static java.net.URI baseUri;
	static 	Client client;
	
	static {

		try {
			baseUri = new java.net.URI( "http://support.softphone.it/artifactory/api");
		} catch (URISyntaxException e) {
			e.printStackTrace();
			System.exit(-1);
		}

		 
		final  ClientFilter authFilter = new HTTPBasicAuthFilter("bsorrentino", "BactiuSP");

		client = ArtifactoryApi.createClient();
		client.addFilter( authFilter );
		
	}
	



	public static void main(String[] args) throws Exception {
		//mainDelete(args);
		mainSearch(args);
	}
	
	/**
	 * 
	 * @param args
	 * @throws JSONException 
	 */
	public static void mainDelete(String[] args) throws JSONException {
		JSONObject resultObject = ArtifactoryApi
				.search(client, baseUri)
				.artifact()
				.getAsVndOrgJfrogArtifactorySearchArtifactSearchResultJson(
												"mgwt", 
												"private-snapshot-repository", 
												JSONObject.class);
		
		
		ArtifactoryUtils.forEachResults(resultObject, new F2<Void,Integer, JSONObject>() {

			@Override
			public Void f(Integer i, JSONObject p) {
				try {
					System.out.printf("url=[%s]\n", p.getString("uri"));
				
					ArtifactoryUtils.deleteArtifactFromUri(client, p.getString("uri").replace("/api/storage/", "/"));

				} catch (JSONException e) {
					e.printStackTrace();
				}

				
				return null;
			}
			
		});
		
	}
	
	/**
	 * 
	 * @param args
	 * @throws JSONException 
	 */
	public static void mainSearch(String[] args) throws JSONException {

		
		
		/*{
		final Repositories repos = SupportSoftphoneIt_ArtifactoryApi.repositories(client);
		
		JsonArray result = repos.getAsVndOrgJfrogArtifactoryRepositoriesRepositoryDetailsListJson( "LOCAL", JsonArray.class);
		
		System.out.printf("result.size=%d\n", 
				result.size());
		
		for( int i=0; i<result.size(); ++i ) {
			
			final JsonObject o = result.getJsonObject(i);
			
			System.out.printf("result[%d]\n%s\n", 
					i, o.toString());
			
		}}*/

		{
		JSONObject resultObject = ArtifactoryApi
			.search(client, baseUri)
			.artifact()
			.getAsVndOrgJfrogArtifactorySearchArtifactSearchResultJson(
											"commons-services", 
											"private-snapshot-repository", 
											JSONObject.class);

		JSONArray result = resultObject.getJSONArray("results");
		
		System.out.printf("result.size=%d\n", result.length());
		
		ArtifactoryUtils.forEachResults(result, new F2<Void,Integer, JSONObject>() {

			@Override
			public Void f(Integer i, JSONObject p) {
				System.out.printf("result[%d]\n%s\n", 
						i, p.toString());
				return null;
			}
			
		});
		}
		{
		
		Calendar c = Calendar.getInstance();
		
		c.set(2012, 0, 1);
		JSONObject resultObject = ArtifactoryApi
			.search(client, baseUri)
			.usage()
			.getAsVndOrgJfrogArtifactorySearchArtifactUsageResultJson(
					c.getTimeInMillis(), 
					"private-snapshot-repository", 
					JSONObject.class)
			;
		JSONArray result = resultObject.getJSONArray("results");
		
		System.out.printf("result.size=%d\n", 
				result.length());
		
		ArtifactoryUtils.forEachResults(result, new F2<Void,Integer, JSONObject>() {

			@Override
			public Void f(Integer i, JSONObject p) {
				System.out.printf("result[%d]\n%s\n", 
						i, p.toString());
				return null;
			}
			
		});
		
		}
	}
}
