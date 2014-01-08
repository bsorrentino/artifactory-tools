package org.bsc;

import javax.ws.rs.core.Response;

import org.bsc.ArtifactoryApi.WebApplicationExceptionMessage;
import org.bsc.functional.F2;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class ArtifactoryUtils {

	protected ArtifactoryUtils() {
	}

	/**
	 * 
	 * @param resultsObject
	 * @param functor
	 * @throws JSONException 
	 */
	public static void forEachResults( JSONArray result, F2<Void,Integer,JSONObject> functor ) throws JSONException {
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
			for( int i=1; i<=result.length(); ++i ) {
				
				final JSONObject o = result.getJSONObject(i);
				
				functor.f( i, o );
			}
		}
		
	}
	
	/**
	 * 
	 * @param resultsObject
	 * @param functor
	 * @throws JSONException 
	 */
	public static void forEachResults( JSONObject resultsObject, F2<Void,Integer,JSONObject> functor ) throws JSONException {
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
		
		forEachResults(resultsObject.getJSONArray("results"), functor);
		
		
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
		
        final ClientResponse response  = 
        		client.resource(uri)
        		.accept("application/vnd.org.jfrog.artifactory.search.ArtifactSearchResult+json")
        		.delete(ClientResponse.class);
        
        if (response.getStatus()>= 400) {
            throw new WebApplicationExceptionMessage(Response.status(response.getStatus()).build());
        }
		
	}
}
