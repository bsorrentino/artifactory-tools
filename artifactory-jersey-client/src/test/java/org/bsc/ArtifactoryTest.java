package org.bsc;

import java.util.Calendar;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.stream.JsonGenerator;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.bsc.SupportSoftphoneIt_ArtifactoryApi.Repositories;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.jsonp.JsonProcessingFeature;

public class ArtifactoryTest {

	public static void main(String[] args) {

		
		final HttpAuthenticationFeature feature = 
				HttpAuthenticationFeature.basicBuilder()
			    						.nonPreemptive()
			    						.credentials("bsorrentino", "BactiuSP")
			    						.build();
		final Client client = ClientBuilder
								.newClient()
								.register(feature)
								.register(JsonProcessingFeature.class)
								.property(JsonGenerator.PRETTY_PRINTING, true)
								;

		
		
		final Repositories repos = SupportSoftphoneIt_ArtifactoryApi.repositories(client);
		
		{
		JsonArray result = repos.getAsVndOrgJfrogArtifactoryRepositoriesRepositoryDetailsListJson( "LOCAL", JsonArray.class);
		
		System.out.printf("result.size=%d\n", 
				result.size());
		
		for( int i=0; i<result.size(); ++i ) {
			
			final JsonObject o = result.getJsonObject(i);
			
			System.out.printf("result[%d]\n%s\n", 
					i, o.toString());
			
		}}

		{
		
		JsonObject resultObject = SupportSoftphoneIt_ArtifactoryApi
			.search(client)
			.artifact()
			.getAsVndOrgJfrogArtifactorySearchArtifactSearchResultJson(
											"commons-services", 
											"private-internal-repository", 
											JsonObject.class);

		JsonArray result = resultObject.getJsonArray("results");
		
		System.out.printf("result.size=%d\n", 
				result.size());
		
		for( int i=0; i<result.size(); ++i ) {
			
			final JsonObject o = result.getJsonObject(i);
			
			System.out.printf("result[%d]\n%s\n", 
					i, o.toString());
			
		}}
		
		
		{
		
		Calendar c = Calendar.getInstance();
		
		c.set(2012, 0, 1);
		JsonObject resultObject = SupportSoftphoneIt_ArtifactoryApi
			.search(client)
			.usage()
			.getAsVndOrgJfrogArtifactorySearchArtifactUsageResultJson(
					c.getTimeInMillis(), 
					"private-internal-repository", 
					JsonObject.class)
			;
		JsonArray result = resultObject.getJsonArray("results");
		
		System.out.printf("result.size=%d\n", 
				result.size());
		
		for( int i=0; i<result.size(); ++i ) {
			
			final JsonObject o = result.getJsonObject(i);
			
			System.out.printf("result[%d]\n%s\n", 
					i, o.toString());
			
		}}
	}

}
