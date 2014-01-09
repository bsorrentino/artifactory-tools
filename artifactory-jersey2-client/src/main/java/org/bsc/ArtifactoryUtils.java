package org.bsc;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;

import org.bsc.ArtifactoryApi.WebApplicationExceptionMessage;
import org.bsc.functional.F2;

public class ArtifactoryUtils {

	protected ArtifactoryUtils() {
	}

	/**
	 * 
	 * @param resultsObject
	 * @param functor
	 */
	public static void forEachResults( JsonArray result, F2<Void,Integer,JsonObject> functor ) {
		{
		final String msg = "resultsObject is null!";
		assert result != null : msg;
		if( result == null ) {
			throw new IllegalArgumentException(msg);
		}}
		{
		final String msg = "functor is null!";
		assert functor != null : msg;
		if( functor == null ) {
			throw new IllegalArgumentException(msg);
		}}
		
		
		if( result != null ) {
			for( int i=0; i<result.size(); ++i ) {
				
				final JsonObject o = result.getJsonObject(i);
				
				functor.f( i, o );
			}
		}
		
	}
	
	/**
	 * 
	 * @param resultsObject
	 * @param functor
	 */
	public static void forEachResults( JsonObject resultsObject, F2<Void,Integer,JsonObject> functor ) {
		{
		final String msg = "resultsObject is null!";
		assert resultsObject != null : msg;
		if( resultsObject == null ) {
			throw new IllegalArgumentException(msg);
		}}
		{
		final String msg = "functor is null!";
		assert functor != null : msg;
		if( functor == null ) {
			throw new IllegalArgumentException(msg);
		}}
		
		forEachResults(resultsObject.getJsonArray("results"), functor);
		
		
	}
	
	/**
	 * 
	 * @param client
	 * @param uri
	 * @return
	 */
	public static void deleteArtifactFromUri( Client client , String uri ) {
		{
		final String msg = "client is null!";
		assert client != null : msg;
		if( client == null ) {
			throw new IllegalArgumentException(msg);
		}}
		{
		final String msg = "uri is null!";
		assert uri != null : msg;
		if( uri == null ) {
			throw new IllegalArgumentException(msg);
		}}
		
        final Response response  = 
        		client.target(uri)
        		.request("application/vnd.org.jfrog.artifactory.search.ArtifactSearchResult+json")
        		.build("DELETE").invoke();
        
        if (response.getStatus()>= 400) {
            throw new WebApplicationExceptionMessage(response);
        }
		
	}
}
