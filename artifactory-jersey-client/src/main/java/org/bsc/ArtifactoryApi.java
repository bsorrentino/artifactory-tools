
package org.bsc;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.api.uri.UriTemplate;

@Generated(value = {
    "wadl|file:/Volumes/SSD/Users/softphone/WORKSPACES/INCUBATOR/artifactory-poc/artifactory-jersey-client/src/main/wadl/artifactory.wadl"
}, comments = "wadl2java, http://wadl.java.net", date = "2014-01-08T00:58:40.793+01:00")
public class ArtifactoryApi {

    /**
     * The base URI for the resource represented by this proxy
     * 
     */
    public final static URI BASE_URI;

    static {
        URI originalURI = URI.create("http://support.softphone.it/artifactory/api/");
        // Look up to see if we have any indirection in the local copy
        // of META-INF/java-rs-catalog.xml file, assuming it will be in the
        // oasis:name:tc:entity:xmlns:xml:catalog namespace or similar duck type
        java.io.InputStream is = ArtifactoryApi.class.getResourceAsStream("/META-INF/jax-rs-catalog.xml");
        if (is!=null) {
            try {
                // Ignore the namespace in the catalog, can't use wildcard until
                // we are sure we have XPath 2.0
                String found = javax.xml.xpath.XPathFactory.newInstance().newXPath().evaluate(
                    "/*[name(.) = 'catalog']/*[name(.) = 'uri' and @name ='" + originalURI +"']/@uri", 
                    new org.xml.sax.InputSource(is)); 
                if (found!=null && found.length()>0) {
                    originalURI = java.net.URI.create(found);
                }
                
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            finally {
                try {
                    is.close();
                } catch (java.io.IOException e) {
                }
            }
        }
        BASE_URI = originalURI;
    }

    public static ArtifactoryApi.Search search(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ArtifactoryApi.Search(client, baseURI);
    }

    /**
     * Template method to allow tooling to customize the new Client
     * 
     */
    private static void customizeClientConfiguration(ClientConfig cc) {
		cc.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		
    }

    /**
     * Template method to allow tooling to override Client factory
     * 
     */
    private static com.sun.jersey.api.client.Client createClientInstance(ClientConfig cc) {
        return com.sun.jersey.api.client.Client.create(cc);
    }

    /**
     * Create a new Client instance
     * 
     */
    public static com.sun.jersey.api.client.Client createClient() {
        ClientConfig cc = new DefaultClientConfig();
        customizeClientConfiguration(cc);
        return createClientInstance(cc);
    }

    public static ArtifactoryApi.Search search() {
        return search(createClient(), BASE_URI);
    }

    public static ArtifactoryApi.Search search(com.sun.jersey.api.client.Client client) {
        return search(client, BASE_URI);
    }

    public static ArtifactoryApi.Traffic traffic(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ArtifactoryApi.Traffic(client, baseURI);
    }

    public static ArtifactoryApi.Traffic traffic() {
        return traffic(createClient(), BASE_URI);
    }

    public static ArtifactoryApi.Traffic traffic(com.sun.jersey.api.client.Client client) {
        return traffic(client, BASE_URI);
    }

    public static ArtifactoryApi.System system(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ArtifactoryApi.System(client, baseURI);
    }

    public static ArtifactoryApi.System system() {
        return system(createClient(), BASE_URI);
    }

    public static ArtifactoryApi.System system(com.sun.jersey.api.client.Client client) {
        return system(client, BASE_URI);
    }

    public static ArtifactoryApi.Storage storage(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ArtifactoryApi.Storage(client, baseURI);
    }

    public static ArtifactoryApi.Storage storage() {
        return storage(createClient(), BASE_URI);
    }

    public static ArtifactoryApi.Storage storage(com.sun.jersey.api.client.Client client) {
        return storage(client, BASE_URI);
    }

    public static ArtifactoryApi.Move move(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ArtifactoryApi.Move(client, baseURI);
    }

    public static ArtifactoryApi.Move move() {
        return move(createClient(), BASE_URI);
    }

    public static ArtifactoryApi.Move move(com.sun.jersey.api.client.Client client) {
        return move(client, BASE_URI);
    }

    public static ArtifactoryApi.Download download(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ArtifactoryApi.Download(client, baseURI);
    }

    public static ArtifactoryApi.Download download() {
        return download(createClient(), BASE_URI);
    }

    public static ArtifactoryApi.Download download(com.sun.jersey.api.client.Client client) {
        return download(client, BASE_URI);
    }

    public static ArtifactoryApi.Repositories repositories(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ArtifactoryApi.Repositories(client, baseURI);
    }

    public static ArtifactoryApi.Repositories repositories() {
        return repositories(createClient(), BASE_URI);
    }

    public static ArtifactoryApi.Repositories repositories(com.sun.jersey.api.client.Client client) {
        return repositories(client, BASE_URI);
    }

    public static ArtifactoryApi.Build build(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ArtifactoryApi.Build(client, baseURI);
    }

    public static ArtifactoryApi.Build build() {
        return build(createClient(), BASE_URI);
    }

    public static ArtifactoryApi.Build build(com.sun.jersey.api.client.Client client) {
        return build(client, BASE_URI);
    }

    public static ArtifactoryApi.SystemVersion systemVersion(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ArtifactoryApi.SystemVersion(client, baseURI);
    }

    public static ArtifactoryApi.SystemVersion systemVersion() {
        return systemVersion(createClient(), BASE_URI);
    }

    public static ArtifactoryApi.SystemVersion systemVersion(com.sun.jersey.api.client.Client client) {
        return systemVersion(client, BASE_URI);
    }

    public static ArtifactoryApi.Copy copy(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ArtifactoryApi.Copy(client, baseURI);
    }

    public static ArtifactoryApi.Copy copy() {
        return copy(createClient(), BASE_URI);
    }

    public static ArtifactoryApi.Copy copy(com.sun.jersey.api.client.Client client) {
        return copy(client, BASE_URI);
    }

    public static class Build {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Build(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Build(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("build");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T putVndOrgJfrogBuildBuildInfoJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.type("application/vnd.org.jfrog.build.BuildInfo+json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T putVndOrgJfrogBuildBuildInfoJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.type("application/vnd.org.jfrog.build.BuildInfo+json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T putVndOrgJfrogArtifactoryJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.type("application/vnd.org.jfrog.artifactory+json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T putVndOrgJfrogArtifactoryJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.type("application/vnd.org.jfrog.artifactory+json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T putJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.type("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T putJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.type("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T getAsVndOrgJfrogBuildBuildsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.build.Builds+json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsVndOrgJfrogBuildBuildsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.build.Builds+json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public ArtifactoryApi.Build.Name name(String name) {
            return new ArtifactoryApi.Build.Name(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), name);
        }

        public ArtifactoryApi.Build.NameBuildNumber nameBuildNumber(String name, String buildnumber) {
            return new ArtifactoryApi.Build.NameBuildNumber(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), name, buildnumber);
        }

        public static class Name {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Name(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Name(com.sun.jersey.api.client.Client client, URI baseUri, String name) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/{name}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("name", name);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Name(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/build/{name}");
                } else {
                    template.append("build/{name}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get name
             * 
             */
            public String getName() {
                return ((String) _templateAndMatrixParameterValues.get("name"));
            }

            /**
             * Duplicate state and set name
             * 
             */
            public ArtifactoryApi.Build.Name setName(String name) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("name", name);
                return new ArtifactoryApi.Build.Name(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsVndOrgJfrogBuildBuildsByNameJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.build.BuildsByName+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogBuildBuildsByNameJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.build.BuildsByName+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class NameBuildNumber {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private NameBuildNumber(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public NameBuildNumber(com.sun.jersey.api.client.Client client, URI baseUri, String name, String buildnumber) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/{name}/{buildNumber}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("name", name);
                _templateAndMatrixParameterValues.put("buildNumber", buildnumber);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public NameBuildNumber(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/build/{name}/{buildNumber}");
                } else {
                    template.append("build/{name}/{buildNumber}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get name
             * 
             */
            public String getName() {
                return ((String) _templateAndMatrixParameterValues.get("name"));
            }

            /**
             * Duplicate state and set name
             * 
             */
            public ArtifactoryApi.Build.NameBuildNumber setName(String name) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("name", name);
                return new ArtifactoryApi.Build.NameBuildNumber(_client, copyUriBuilder, copyMap);
            }

            /**
             * Get buildNumber
             * 
             */
            public String getBuildnumber() {
                return ((String) _templateAndMatrixParameterValues.get("buildNumber"));
            }

            /**
             * Duplicate state and set buildNumber
             * 
             */
            public ArtifactoryApi.Build.NameBuildNumber setBuildnumber(String buildnumber) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("buildNumber", buildnumber);
                return new ArtifactoryApi.Build.NameBuildNumber(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsVndOrgJfrogBuildBuildInfoJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.build.BuildInfo+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogBuildBuildInfoJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.build.BuildInfo+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Copy {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Copy(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Copy(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("copy");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ArtifactoryApi.Copy.Path path(String path) {
            return new ArtifactoryApi.Copy.Path(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), path);
        }

        public static class Path {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Path(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Path(com.sun.jersey.api.client.Client client, URI baseUri, String path) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{path: .+}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("path", path);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Path(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/copy/{path: .+}");
                } else {
                    template.append("copy/{path: .+}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get path
             * 
             */
            public String getPath() {
                return ((String) _templateAndMatrixParameterValues.get("path"));
            }

            /**
             * Duplicate state and set path
             * 
             */
            public ArtifactoryApi.Copy.Path setPath(String path) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("path", path);
                return new ArtifactoryApi.Copy.Path(_client, copyUriBuilder, copyMap);
            }

            public<T >T postAsVndOrgJfrogArtifactoryStorageCopyOrMoveResultJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.CopyOrMoveResult+json");
                resourceBuilder = resourceBuilder.type("*/*");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T postAsVndOrgJfrogArtifactoryStorageCopyOrMoveResultJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.CopyOrMoveResult+json");
                resourceBuilder = resourceBuilder.type("*/*");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Download {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Download(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Download(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("download");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ArtifactoryApi.Download.Path path(String path) {
            return new ArtifactoryApi.Download.Path(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), path);
        }

        public static class Path {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Path(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Path(com.sun.jersey.api.client.Client client, URI baseUri, String path) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{path: .+}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("path", path);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Path(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/download/{path: .+}");
                } else {
                    template.append("download/{path: .+}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get path
             * 
             */
            public String getPath() {
                return ((String) _templateAndMatrixParameterValues.get("path"));
            }

            /**
             * Duplicate state and set path
             * 
             */
            public ArtifactoryApi.Download.Path setPath(String path) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("path", path);
                return new ArtifactoryApi.Download.Path(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsOctetStream(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/octet-stream");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsOctetStream(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/octet-stream");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsOctetStream(String content, Integer mark, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (content == null) {
                }
                if (content!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("content", content);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("content", ((Object[]) null));
                }
                if (mark == null) {
                }
                if (mark!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mark", mark);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mark", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/octet-stream");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsOctetStream(String content, Integer mark, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (content == null) {
                }
                if (content!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("content", content);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("content", ((Object[]) null));
                }
                if (mark == null) {
                }
                if (mark!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mark", mark);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mark", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/octet-stream");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsTextPlain(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsTextPlain(String content, Integer mark, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (content == null) {
                }
                if (content!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("content", content);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("content", ((Object[]) null));
                }
                if (mark == null) {
                }
                if (mark!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mark", mark);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mark", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsTextPlain(String content, Integer mark, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (content == null) {
                }
                if (content!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("content", content);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("content", ((Object[]) null));
                }
                if (mark == null) {
                }
                if (mark!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mark", mark);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mark", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Move {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Move(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Move(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("move");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ArtifactoryApi.Move.Path path(String path) {
            return new ArtifactoryApi.Move.Path(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), path);
        }

        public static class Path {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Path(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Path(com.sun.jersey.api.client.Client client, URI baseUri, String path) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{path: .+}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("path", path);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Path(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/move/{path: .+}");
                } else {
                    template.append("move/{path: .+}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get path
             * 
             */
            public String getPath() {
                return ((String) _templateAndMatrixParameterValues.get("path"));
            }

            /**
             * Duplicate state and set path
             * 
             */
            public ArtifactoryApi.Move.Path setPath(String path) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("path", path);
                return new ArtifactoryApi.Move.Path(_client, copyUriBuilder, copyMap);
            }

            public<T >T postAsVndOrgJfrogArtifactoryStorageCopyOrMoveResultJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.CopyOrMoveResult+json");
                resourceBuilder = resourceBuilder.type("*/*");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T postAsVndOrgJfrogArtifactoryStorageCopyOrMoveResultJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.CopyOrMoveResult+json");
                resourceBuilder = resourceBuilder.type("*/*");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Repositories {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Repositories(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Repositories(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("repositories");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsVndOrgJfrogArtifactoryRepositoriesRepositoryDetailsListJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.repositories.RepositoryDetailsList+json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsVndOrgJfrogArtifactoryRepositoriesRepositoryDetailsListJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.repositories.RepositoryDetailsList+json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T getAsVndOrgJfrogArtifactoryRepositoriesRepositoryDetailsListJson(String type, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (type == null) {
            }
            if (type!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("type", type);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("type", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.repositories.RepositoryDetailsList+json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsVndOrgJfrogArtifactoryRepositoriesRepositoryDetailsListJson(String type, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (type == null) {
            }
            if (type!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("type", type);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("type", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.repositories.RepositoryDetailsList+json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T postXWwwFormUrlencoded(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.type("application/x-www-form-urlencoded");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T postXWwwFormUrlencoded(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.type("application/x-www-form-urlencoded");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public ArtifactoryApi.Repositories.RepoKeyConfiguration repoKeyConfiguration(String repokey) {
            return new ArtifactoryApi.Repositories.RepoKeyConfiguration(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), repokey);
        }

        public static class RepoKeyConfiguration {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private RepoKeyConfiguration(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public RepoKeyConfiguration(com.sun.jersey.api.client.Client client, URI baseUri, String repokey) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{repoKey}/configuration");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("repoKey", repokey);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public RepoKeyConfiguration(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/repositories/{repoKey}/configuration");
                } else {
                    template.append("repositories/{repoKey}/configuration");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get repoKey
             * 
             */
            public String getRepokey() {
                return ((String) _templateAndMatrixParameterValues.get("repoKey"));
            }

            /**
             * Duplicate state and set repoKey
             * 
             */
            public ArtifactoryApi.Repositories.RepoKeyConfiguration setRepokey(String repokey) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("repoKey", repokey);
                return new ArtifactoryApi.Repositories.RepoKeyConfiguration(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsVndOrgJfrogArtifactoryRepositoriesRepositoryConfigurationJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.repositories.RepositoryConfiguration+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryRepositoriesRepositoryConfigurationJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.repositories.RepositoryConfiguration+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Search {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Search(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Search(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("search");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ArtifactoryApi.Search.Artifact artifact() {
            return new ArtifactoryApi.Search.Artifact(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ArtifactoryApi.Search.Archive archive() {
            return new ArtifactoryApi.Search.Archive(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ArtifactoryApi.Search.Gavc gavc() {
            return new ArtifactoryApi.Search.Gavc(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ArtifactoryApi.Search.Prop prop() {
            return new ArtifactoryApi.Search.Prop(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ArtifactoryApi.Search.Xpath xpath() {
            return new ArtifactoryApi.Search.Xpath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ArtifactoryApi.Search.Usage usage() {
            return new ArtifactoryApi.Search.Usage(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ArtifactoryApi.Search.Creation creation() {
            return new ArtifactoryApi.Search.Creation(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public static class Archive {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Archive(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Archive(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("archive");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArchiveEntrySearchResultJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArchiveEntrySearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArchiveEntrySearchResultJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArchiveEntrySearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArchiveEntrySearchResultJson(String name, String repos, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (name == null) {
                }
                if (name!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("name", name);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("name", ((Object[]) null));
                }
                if (repos == null) {
                }
                if (repos!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", repos);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArchiveEntrySearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArchiveEntrySearchResultJson(String name, String repos, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (name == null) {
                }
                if (name!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("name", name);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("name", ((Object[]) null));
                }
                if (repos == null) {
                }
                if (repos!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", repos);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArchiveEntrySearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Artifact {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Artifact(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Artifact(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("artifact");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactSearchResultJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArtifactSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactSearchResultJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArtifactSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactSearchResultJson(String name, String repos, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (name == null) {
                }
                if (name!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("name", name);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("name", ((Object[]) null));
                }
                if (repos == null) {
                }
                if (repos!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", repos);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArtifactSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactSearchResultJson(String name, String repos, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (name == null) {
                }
                if (name!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("name", name);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("name", ((Object[]) null));
                }
                if (repos == null) {
                }
                if (repos!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", repos);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArtifactSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Creation {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Creation(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Creation(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("creation");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactCreationResultJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArtifactCreationResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactCreationResultJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArtifactCreationResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactCreationResultJson(Long from, Long to, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (from == null) {
                }
                if (from!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("from", from);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("from", ((Object[]) null));
                }
                if (to == null) {
                }
                if (to!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("to", to);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("to", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArtifactCreationResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactCreationResultJson(Long from, Long to, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (from == null) {
                }
                if (from!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("from", from);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("from", ((Object[]) null));
                }
                if (to == null) {
                }
                if (to!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("to", to);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("to", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArtifactCreationResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Gavc {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Gavc(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Gavc(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("gavc");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchGavcSearchResultJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.GavcSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchGavcSearchResultJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.GavcSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchGavcSearchResultJson(String g, String a, String v, String c, String repos, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (g == null) {
                }
                if (g!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("g", g);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("g", ((Object[]) null));
                }
                if (a == null) {
                }
                if (a!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("a", a);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("a", ((Object[]) null));
                }
                if (v == null) {
                }
                if (v!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("v", v);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("v", ((Object[]) null));
                }
                if (c == null) {
                }
                if (c!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("c", c);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("c", ((Object[]) null));
                }
                if (repos == null) {
                }
                if (repos!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", repos);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.GavcSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchGavcSearchResultJson(String g, String a, String v, String c, String repos, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (g == null) {
                }
                if (g!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("g", g);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("g", ((Object[]) null));
                }
                if (a == null) {
                }
                if (a!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("a", a);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("a", ((Object[]) null));
                }
                if (v == null) {
                }
                if (v!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("v", v);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("v", ((Object[]) null));
                }
                if (c == null) {
                }
                if (c!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("c", c);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("c", ((Object[]) null));
                }
                if (repos == null) {
                }
                if (repos!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", repos);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.GavcSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Prop {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Prop(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Prop(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("prop");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchMetadataSearchResultJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.MetadataSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchMetadataSearchResultJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.MetadataSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchMetadataSearchResultJson(String repos, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (repos == null) {
                }
                if (repos!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", repos);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.MetadataSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchMetadataSearchResultJson(String repos, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (repos == null) {
                }
                if (repos!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", repos);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.MetadataSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Usage {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Usage(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Usage(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("usage");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactUsageResultJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArtifactUsageResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactUsageResultJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArtifactUsageResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactUsageResultJson(Long notusedsince, String repos, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (notusedsince == null) {
                }
                if (notusedsince!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("notUsedSince", notusedsince);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("notUsedSince", ((Object[]) null));
                }
                if (repos == null) {
                }
                if (repos!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", repos);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArtifactUsageResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactUsageResultJson(Long notusedsince, String repos, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (notusedsince == null) {
                }
                if (notusedsince!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("notUsedSince", notusedsince);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("notUsedSince", ((Object[]) null));
                }
                if (repos == null) {
                }
                if (repos!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", repos);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.ArtifactUsageResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Xpath {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Xpath(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Xpath(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("xpath");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchXpathSearchResultJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.XpathSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchXpathSearchResultJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.XpathSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchXpathSearchResultJson(String name, String metadata, String xpath, String val, String repos, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (name == null) {
                }
                if (name!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("name", name);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("name", ((Object[]) null));
                }
                if (metadata == null) {
                }
                if (metadata!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("metadata", metadata);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("metadata", ((Object[]) null));
                }
                if (xpath == null) {
                }
                if (xpath!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("xpath", xpath);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("xpath", ((Object[]) null));
                }
                if (val == null) {
                }
                if (val!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("val", val);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("val", ((Object[]) null));
                }
                if (repos == null) {
                }
                if (repos!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", repos);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.XpathSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchXpathSearchResultJson(String name, String metadata, String xpath, String val, String repos, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (name == null) {
                }
                if (name!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("name", name);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("name", ((Object[]) null));
                }
                if (metadata == null) {
                }
                if (metadata!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("metadata", metadata);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("metadata", ((Object[]) null));
                }
                if (xpath == null) {
                }
                if (xpath!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("xpath", xpath);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("xpath", ((Object[]) null));
                }
                if (val == null) {
                }
                if (val!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("val", val);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("val", ((Object[]) null));
                }
                if (repos == null) {
                }
                if (repos!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", repos);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.search.XpathSearchResult+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Storage {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Storage(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Storage(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("storage");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ArtifactoryApi.Storage.Path path(String path) {
            return new ArtifactoryApi.Storage.Path(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), path);
        }

        public static class Path {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Path(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Path(com.sun.jersey.api.client.Client client, URI baseUri, String path) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{path: .+}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("path", path);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Path(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/storage/{path: .+}");
                } else {
                    template.append("storage/{path: .+}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get path
             * 
             */
            public String getPath() {
                return ((String) _templateAndMatrixParameterValues.get("path"));
            }

            /**
             * Duplicate state and set path
             * 
             */
            public ArtifactoryApi.Storage.Path setPath(String path) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("path", path);
                return new ArtifactoryApi.Storage.Path(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageFolderInfoJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.FolderInfo+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageFolderInfoJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.FolderInfo+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageFolderInfoJson(String mdns, String md, String properties, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (mdns == null) {
                }
                if (mdns!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", mdns);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", ((Object[]) null));
                }
                if (md == null) {
                }
                if (md!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", md);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", ((Object[]) null));
                }
                if (properties == null) {
                }
                if (properties!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", properties);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.FolderInfo+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageFolderInfoJson(String mdns, String md, String properties, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (mdns == null) {
                }
                if (mdns!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", mdns);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", ((Object[]) null));
                }
                if (md == null) {
                }
                if (md!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", md);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", ((Object[]) null));
                }
                if (properties == null) {
                }
                if (properties!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", properties);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.FolderInfo+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageFileInfoJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.FileInfo+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageFileInfoJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.FileInfo+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageFileInfoJson(String mdns, String md, String properties, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (mdns == null) {
                }
                if (mdns!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", mdns);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", ((Object[]) null));
                }
                if (md == null) {
                }
                if (md!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", md);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", ((Object[]) null));
                }
                if (properties == null) {
                }
                if (properties!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", properties);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.FileInfo+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageFileInfoJson(String mdns, String md, String properties, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (mdns == null) {
                }
                if (mdns!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", mdns);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", ((Object[]) null));
                }
                if (md == null) {
                }
                if (md!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", md);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", ((Object[]) null));
                }
                if (properties == null) {
                }
                if (properties!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", properties);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.FileInfo+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemMetadataNamesJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.ItemMetadataNames+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemMetadataNamesJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.ItemMetadataNames+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemMetadataNamesJson(String mdns, String md, String properties, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (mdns == null) {
                }
                if (mdns!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", mdns);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", ((Object[]) null));
                }
                if (md == null) {
                }
                if (md!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", md);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", ((Object[]) null));
                }
                if (properties == null) {
                }
                if (properties!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", properties);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.ItemMetadataNames+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemMetadataNamesJson(String mdns, String md, String properties, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (mdns == null) {
                }
                if (mdns!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", mdns);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", ((Object[]) null));
                }
                if (md == null) {
                }
                if (md!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", md);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", ((Object[]) null));
                }
                if (properties == null) {
                }
                if (properties!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", properties);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.ItemMetadataNames+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemPropertiesJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.ItemProperties+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemPropertiesJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.ItemProperties+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemPropertiesJson(String mdns, String md, String properties, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (mdns == null) {
                }
                if (mdns!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", mdns);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", ((Object[]) null));
                }
                if (md == null) {
                }
                if (md!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", md);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", ((Object[]) null));
                }
                if (properties == null) {
                }
                if (properties!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", properties);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.ItemProperties+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemPropertiesJson(String mdns, String md, String properties, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (mdns == null) {
                }
                if (mdns!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", mdns);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", ((Object[]) null));
                }
                if (md == null) {
                }
                if (md!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", md);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", ((Object[]) null));
                }
                if (properties == null) {
                }
                if (properties!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", properties);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.ItemProperties+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemMetadataJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.ItemMetadata+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemMetadataJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.ItemMetadata+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemMetadataJson(String mdns, String md, String properties, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (mdns == null) {
                }
                if (mdns!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", mdns);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", ((Object[]) null));
                }
                if (md == null) {
                }
                if (md!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", md);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", ((Object[]) null));
                }
                if (properties == null) {
                }
                if (properties!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", properties);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.ItemMetadata+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemMetadataJson(String mdns, String md, String properties, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (mdns == null) {
                }
                if (mdns!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", mdns);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("mdns", ((Object[]) null));
                }
                if (md == null) {
                }
                if (md!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", md);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("md", ((Object[]) null));
                }
                if (properties == null) {
                }
                if (properties!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", properties);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("properties", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.storage.ItemMetadata+json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class System {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private System(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public System(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("system");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsXml(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/xml");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsXml(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/xml");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public ArtifactoryApi.System.Import importData() {
            return new ArtifactoryApi.System.Import(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ArtifactoryApi.System.Export export() {
            return new ArtifactoryApi.System.Export(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ArtifactoryApi.System.Configuration configuration() {
            return new ArtifactoryApi.System.Configuration(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ArtifactoryApi.System.Security security() {
            return new ArtifactoryApi.System.Security(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ArtifactoryApi.System.Storage storage() {
            return new ArtifactoryApi.System.Storage(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public static class Configuration {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Configuration(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Configuration(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("configuration");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T postXmlAsTextPlain(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                resourceBuilder = resourceBuilder.type("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T postXmlAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                resourceBuilder = resourceBuilder.type("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsXml(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public ArtifactoryApi.System.Configuration.RemoteRepositories remoteRepositories() {
                return new ArtifactoryApi.System.Configuration.RemoteRepositories(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            }

            public static class RemoteRepositories {

                private com.sun.jersey.api.client.Client _client;
                private UriBuilder _uriBuilder;
                private Map<String, Object> _templateAndMatrixParameterValues;

                private RemoteRepositories(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                    _client = client;
                    _uriBuilder = uriBuilder.clone();
                    _templateAndMatrixParameterValues = map;
                }

                /**
                 * Create new instance using existing Client instance, and a base URI and any parameters
                 * 
                 */
                public RemoteRepositories(com.sun.jersey.api.client.Client client, URI baseUri) {
                    _client = client;
                    _uriBuilder = UriBuilder.fromUri(baseUri);
                    _uriBuilder = _uriBuilder.path("remoteRepositories");
                    _templateAndMatrixParameterValues = new HashMap<String, Object>();
                }

                public<T >T putXml(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                    resourceBuilder = resourceBuilder.type("application/xml");
                    com.sun.jersey.api.client.ClientResponse response;
                    response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                    return response.getEntity(returnType);
                }

                public<T >T putXml(Object input, Class<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                    resourceBuilder = resourceBuilder.type("application/xml");
                    com.sun.jersey.api.client.ClientResponse response;
                    response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                    if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                        if (response.getStatus()>= 400) {
                            throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                        }
                    }
                    if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                        return response.getEntity(returnType);
                    } else {
                        return returnType.cast(response);
                    }
                }

            }

        }

        public static class Export {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Export(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Export(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("export");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsXml(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T postXml(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.type("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T postXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.type("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Import {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Import(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Import(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("import");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsXml(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T postXmlAs(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("*/*");
                resourceBuilder = resourceBuilder.type("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T postXmlAs(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("*/*");
                resourceBuilder = resourceBuilder.type("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Security {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Security(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Security(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("security");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsXml(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T postXmlAsTextPlain(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                resourceBuilder = resourceBuilder.type("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T postXmlAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                resourceBuilder = resourceBuilder.type("application/xml");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public ArtifactoryApi.System.Security.Logout logout() {
                return new ArtifactoryApi.System.Security.Logout(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            }

            public ArtifactoryApi.System.Security.PasswordPolicyPolicyName passwordPolicyPolicyName(String policyname) {
                return new ArtifactoryApi.System.Security.PasswordPolicyPolicyName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), policyname);
            }

            public static class Logout {

                private com.sun.jersey.api.client.Client _client;
                private UriBuilder _uriBuilder;
                private Map<String, Object> _templateAndMatrixParameterValues;

                private Logout(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                    _client = client;
                    _uriBuilder = uriBuilder.clone();
                    _templateAndMatrixParameterValues = map;
                }

                /**
                 * Create new instance using existing Client instance, and a base URI and any parameters
                 * 
                 */
                public Logout(com.sun.jersey.api.client.Client client, URI baseUri) {
                    _client = client;
                    _uriBuilder = UriBuilder.fromUri(baseUri);
                    _uriBuilder = _uriBuilder.path("logout");
                    _templateAndMatrixParameterValues = new HashMap<String, Object>();
                }

                public com.sun.jersey.api.client.ClientResponse postAsClientResponse() {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                    com.sun.jersey.api.client.ClientResponse response;
                    response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                    return response.getEntity(com.sun.jersey.api.client.ClientResponse.class);
                }

                public<T >T post(com.sun.jersey.api.client.GenericType<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                    com.sun.jersey.api.client.ClientResponse response;
                    response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                    return response.getEntity(returnType);
                }

                public<T >T post(Class<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                    com.sun.jersey.api.client.ClientResponse response;
                    response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
                    if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                        if (response.getStatus()>= 400) {
                            throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                        }
                    }
                    if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                        return response.getEntity(returnType);
                    } else {
                        return returnType.cast(response);
                    }
                }

            }

            public static class PasswordPolicyPolicyName {

                private com.sun.jersey.api.client.Client _client;
                private UriBuilder _uriBuilder;
                private Map<String, Object> _templateAndMatrixParameterValues;

                private PasswordPolicyPolicyName(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                    _client = client;
                    _uriBuilder = uriBuilder.clone();
                    _templateAndMatrixParameterValues = map;
                }

                /**
                 * Create new instance using existing Client instance, and a base URI and any parameters
                 * 
                 */
                public PasswordPolicyPolicyName(com.sun.jersey.api.client.Client client, URI baseUri, String policyname) {
                    _client = client;
                    _uriBuilder = UriBuilder.fromUri(baseUri);
                    _uriBuilder = _uriBuilder.path("passwordPolicy/{policyName}");
                    _templateAndMatrixParameterValues = new HashMap<String, Object>();
                    _templateAndMatrixParameterValues.put("policyName", policyname);
                }

                /**
                 * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
                 * 
                 */
                public PasswordPolicyPolicyName(com.sun.jersey.api.client.Client client, URI uri) {
                    _client = client;
                    StringBuilder template = new StringBuilder(BASE_URI.toString());
                    if (template.charAt((template.length()- 1))!= '/') {
                        template.append("/system/security/passwordPolicy/{policyName}");
                    } else {
                        template.append("system/security/passwordPolicy/{policyName}");
                    }
                    _uriBuilder = UriBuilder.fromPath(template.toString());
                    _templateAndMatrixParameterValues = new HashMap<String, Object>();
                    UriTemplate uriTemplate = new UriTemplate(template.toString());
                    HashMap<String, String> parameters = new HashMap<String, String>();
                    uriTemplate.match(uri.toString(), parameters);
                    _templateAndMatrixParameterValues.putAll(parameters);
                }

                /**
                 * Get policyName
                 * 
                 */
                public String getPolicyname() {
                    return ((String) _templateAndMatrixParameterValues.get("policyName"));
                }

                /**
                 * Duplicate state and set policyName
                 * 
                 */
                public ArtifactoryApi.System.Security.PasswordPolicyPolicyName setPolicyname(String policyname) {
                    Map<String, Object> copyMap;
                    copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                    UriBuilder copyUriBuilder = _uriBuilder.clone();
                    copyMap.put("policyName", policyname);
                    return new ArtifactoryApi.System.Security.PasswordPolicyPolicyName(_client, copyUriBuilder, copyMap);
                }

                public com.sun.jersey.api.client.ClientResponse postAsClientResponse() {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                    com.sun.jersey.api.client.ClientResponse response;
                    response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                    return response.getEntity(com.sun.jersey.api.client.ClientResponse.class);
                }

                public<T >T post(com.sun.jersey.api.client.GenericType<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                    com.sun.jersey.api.client.ClientResponse response;
                    response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                    return response.getEntity(returnType);
                }

                public<T >T post(Class<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                    com.sun.jersey.api.client.ClientResponse response;
                    response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
                    if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                        if (response.getStatus()>= 400) {
                            throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                        }
                    }
                    if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                        return response.getEntity(returnType);
                    } else {
                        return returnType.cast(response);
                    }
                }

            }

        }

        public static class Storage {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Storage(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Storage(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("storage");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public ArtifactoryApi.System.Storage.Size size() {
                return new ArtifactoryApi.System.Storage.Size(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            }

            public ArtifactoryApi.System.Storage.Compress compress() {
                return new ArtifactoryApi.System.Storage.Compress(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            }

            public static class Compress {

                private com.sun.jersey.api.client.Client _client;
                private UriBuilder _uriBuilder;
                private Map<String, Object> _templateAndMatrixParameterValues;

                private Compress(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                    _client = client;
                    _uriBuilder = uriBuilder.clone();
                    _templateAndMatrixParameterValues = map;
                }

                /**
                 * Create new instance using existing Client instance, and a base URI and any parameters
                 * 
                 */
                public Compress(com.sun.jersey.api.client.Client client, URI baseUri) {
                    _client = client;
                    _uriBuilder = UriBuilder.fromUri(baseUri);
                    _uriBuilder = _uriBuilder.path("compress");
                    _templateAndMatrixParameterValues = new HashMap<String, Object>();
                }

                public<T >T postAsXml(com.sun.jersey.api.client.GenericType<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                    resourceBuilder = resourceBuilder.accept("application/xml");
                    com.sun.jersey.api.client.ClientResponse response;
                    response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                    return response.getEntity(returnType);
                }

                public<T >T postAsXml(Class<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                    resourceBuilder = resourceBuilder.accept("application/xml");
                    com.sun.jersey.api.client.ClientResponse response;
                    response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
                    if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                        if (response.getStatus()>= 400) {
                            throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                        }
                    }
                    if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                        return response.getEntity(returnType);
                    } else {
                        return returnType.cast(response);
                    }
                }

            }

            public static class Size {

                private com.sun.jersey.api.client.Client _client;
                private UriBuilder _uriBuilder;
                private Map<String, Object> _templateAndMatrixParameterValues;

                private Size(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                    _client = client;
                    _uriBuilder = uriBuilder.clone();
                    _templateAndMatrixParameterValues = map;
                }

                /**
                 * Create new instance using existing Client instance, and a base URI and any parameters
                 * 
                 */
                public Size(com.sun.jersey.api.client.Client client, URI baseUri) {
                    _client = client;
                    _uriBuilder = UriBuilder.fromUri(baseUri);
                    _uriBuilder = _uriBuilder.path("size");
                    _templateAndMatrixParameterValues = new HashMap<String, Object>();
                }

                public<T >T getAsTextPlain(com.sun.jersey.api.client.GenericType<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                    resourceBuilder = resourceBuilder.accept("text/plain");
                    com.sun.jersey.api.client.ClientResponse response;
                    response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                    return response.getEntity(returnType);
                }

                public<T >T getAsTextPlain(Class<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                    resourceBuilder = resourceBuilder.accept("text/plain");
                    com.sun.jersey.api.client.ClientResponse response;
                    response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                    if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                        if (response.getStatus()>= 400) {
                            throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                        }
                    }
                    if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                        return response.getEntity(returnType);
                    } else {
                        return returnType.cast(response);
                    }
                }

            }

        }

    }

    public static class SystemVersion {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private SystemVersion(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public SystemVersion(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("system/version");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsVndOrgJfrogArtifactorySystemVersionJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.system.Version+json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsVndOrgJfrogArtifactorySystemVersionJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/vnd.org.jfrog.artifactory.system.Version+json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

    }

    public static class Traffic {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Traffic(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Traffic(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("traffic");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ArtifactoryApi.Traffic.Stream stream() {
            return new ArtifactoryApi.Traffic.Stream(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public static class Stream {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Stream(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Stream(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("stream");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsTextPlain(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsTextPlain(Long start, Long end, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (start == null) {
                }
                if (start!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("start", start);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("start", ((Object[]) null));
                }
                if (end == null) {
                }
                if (end!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("end", end);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("end", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsTextPlain(Long start, Long end, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (start == null) {
                }
                if (start!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("start", start);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("start", ((Object[]) null));
                }
                if (end == null) {
                }
                if (end!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("end", end);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("end", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }


    /**
     * Workaround for JAX_RS_SPEC-312
     * 
     */
    public static class WebApplicationExceptionMessage
        extends WebApplicationException
    {


        public WebApplicationExceptionMessage(Response response) {
            super(response);
        }

        /**
         * Workaround for JAX_RS_SPEC-312
         * 
         */
        public String getMessage() {
            Response response = getResponse();
            Response.Status status = Response.Status.fromStatusCode(response.getStatus());
            if (status!= null) {
                return (response.getStatus()+(" "+ status.getReasonPhrase()));
            } else {
                return Integer.toString(response.getStatus());
            }
        }

        public String toString() {
            String s = "javax.ws.rs.WebApplicationException";
            String message = getLocalizedMessage();
            return (s +(": "+ message));
        }

    }

}
