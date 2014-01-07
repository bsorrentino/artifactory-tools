package org.bsc;

import javax.json.JsonArray;
import javax.json.JsonObject;

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
}
