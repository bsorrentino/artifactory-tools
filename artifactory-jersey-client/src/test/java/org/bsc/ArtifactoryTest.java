package org.bsc;

import java.net.URISyntaxException;
import java.util.Calendar;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.stream.JsonGenerator;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.bsc.functional.F2;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.jsonp.JsonProcessingFeature;

public class ArtifactoryTest {

	static java.net.URI baseUri;
	
	static {

		try {
			baseUri = new java.net.URI( "http://support.softphone.it/artifactory/api");
		} catch (URISyntaxException e) {
			e.printStackTrace();
			System.exit(-1);
		}

	}
	static final HttpAuthenticationFeature feature = 
			HttpAuthenticationFeature.basicBuilder()
		    						.nonPreemptive()
		    						.credentials("bsorrentino", "BactiuSP")
		    						.build();
	static 	final Client client = ClientBuilder
			.newClient()
			.register(feature)
			.register(JsonProcessingFeature.class)
			.property(JsonGenerator.PRETTY_PRINTING, true)
			;



	public static void main(String[] args) {
		//mainDelete(args);
		mainSearch(args);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void mainDelete(String[] args) {
		JsonObject resultObject = ArtifactoryApi
				.search(client, baseUri)
				.artifact()
				.getAsVndOrgJfrogArtifactorySearchArtifactSearchResultJson(
												"mgwt", 
												"private-snapshot-repository", 
												JsonObject.class);
		
		ArtifactoryUtils.forEachResults(resultObject, new F2<Void,Integer, JsonObject>() {

			@Override
			public Void f(Integer i, JsonObject p) {
				System.out.printf("url=[%s]\n", p.getString("uri"));

				
				ArtifactoryUtils.deleteArtifactFromUri(client, p.getString("uri").replace("/api/storage/", "/"));
				return null;
			}
			
		});
		
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void mainSearch(String[] args) {

		
		
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
		JsonObject resultObject = ArtifactoryApi
			.search(client, baseUri)
			.artifact()
			.getAsVndOrgJfrogArtifactorySearchArtifactSearchResultJson(
											"commons-services", 
											"private-snapshot-repository", 
											JsonObject.class);

		JsonArray result = resultObject.getJsonArray("results");
		
		System.out.printf("result.size=%d\n", result.size());
		
		ArtifactoryUtils.forEachResults(result, new F2<Void,Integer, JsonObject>() {

			@Override
			public Void f(Integer i, JsonObject p) {
				System.out.printf("result[%d]\n%s\n", 
						i, p.toString());
				return null;
			}
			
		});
		}
		{
		
		Calendar c = Calendar.getInstance();
		
		c.set(2012, 0, 1);
		JsonObject resultObject = ArtifactoryApi
			.search(client, baseUri)
			.usage()
			.getAsVndOrgJfrogArtifactorySearchArtifactUsageResultJson(
					c.getTimeInMillis(), 
					"private-snapshot-repository", 
					JsonObject.class)
			;
		JsonArray result = resultObject.getJsonArray("results");
		
		System.out.printf("result.size=%d\n", 
				result.size());
		
		ArtifactoryUtils.forEachResults(result, new F2<Void,Integer, JsonObject>() {

			@Override
			public Void f(Integer i, JsonObject p) {
				System.out.printf("result[%d]\n%s\n", 
						i, p.toString());
				return null;
			}
			
		});
		
		}
	}
}
