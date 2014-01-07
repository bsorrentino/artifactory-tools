
package org.bsc;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

public class ArtifactoryApi {

    /**
     * The base URI for the resource represented by this proxy
     * 
     
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
    */
    
    public static ArtifactoryApi.Search search(Client client, URI baseURI) {
        return new ArtifactoryApi.Search(client, baseURI);
    }

    public static ArtifactoryApi.Traffic traffic(Client client, URI baseURI) {
        return new ArtifactoryApi.Traffic(client, baseURI);
    }

    public static ArtifactoryApi.System system(Client client, URI baseURI) {
        return new ArtifactoryApi.System(client, baseURI);
    }

    public static ArtifactoryApi.Storage storage(Client client, URI baseURI) {
        return new ArtifactoryApi.Storage(client, baseURI);
    }

    public static ArtifactoryApi.Move move(Client client, URI baseURI) {
        return new ArtifactoryApi.Move(client, baseURI);
    }

    public static ArtifactoryApi.Download download(Client client, URI baseURI) {
        return new ArtifactoryApi.Download(client, baseURI);
    }

    public static ArtifactoryApi.Repositories repositories(Client client, URI baseURI) {
        return new ArtifactoryApi.Repositories(client, baseURI);
    }


    public static ArtifactoryApi.Build build(Client client, URI baseURI) {
        return new ArtifactoryApi.Build(client, baseURI);
    }

    public static ArtifactoryApi.SystemVersion systemVersion(Client client, URI baseURI) {
        return new ArtifactoryApi.SystemVersion(client, baseURI);
    }

    public static ArtifactoryApi.Copy copy(Client client, URI baseURI) {
        return new ArtifactoryApi.Copy(client, baseURI);
    }

    public static class Build {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Build(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("build");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T putVndOrgJfrogBuildBuildInfoJson(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("PUT", Entity.entity(input, "application/vnd.org.jfrog.build.BuildInfo+json")).invoke();
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T putVndOrgJfrogBuildBuildInfoJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("PUT", Entity.entity(input, "application/vnd.org.jfrog.build.BuildInfo+json")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T putVndOrgJfrogArtifactoryJson(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("PUT", Entity.entity(input, "application/vnd.org.jfrog.artifactory+json")).invoke();
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T putVndOrgJfrogArtifactoryJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("PUT", Entity.entity(input, "application/vnd.org.jfrog.artifactory+json")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T putJson(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("PUT", Entity.entity(input, "application/json")).invoke();
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T putJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("PUT", Entity.entity(input, "application/json")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T getAsVndOrgJfrogBuildBuildsJson(GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.build.Builds+json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T getAsVndOrgJfrogBuildBuildsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.build.Builds+json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
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

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Name(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Name(Client client, URI baseUri, String name) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/{name}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("name", name);
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

            public<T >T getAsVndOrgJfrogBuildBuildsByNameJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.build.BuildsByName+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogBuildBuildsByNameJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.build.BuildsByName+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class NameBuildNumber {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private NameBuildNumber(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public NameBuildNumber(Client client, URI baseUri, String name, String buildnumber) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/{name}/{buildNumber}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("name", name);
                _templateAndMatrixParameterValues.put("buildNumber", buildnumber);
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

            public<T >T getAsVndOrgJfrogBuildBuildInfoJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.build.BuildInfo+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogBuildBuildInfoJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.build.BuildInfo+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Copy {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Copy(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("copy");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ArtifactoryApi.Copy.Path path(String path) {
            return new ArtifactoryApi.Copy.Path(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), path);
        }

        public static class Path {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Path(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Path(Client client, URI baseUri, String path) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{path: .+}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("path", path);
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

            public<T >T postAsVndOrgJfrogArtifactoryStorageCopyOrMoveResultJson(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.CopyOrMoveResult+json");
                Response response;
                response = resourceBuilder.build("POST", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T postAsVndOrgJfrogArtifactoryStorageCopyOrMoveResultJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.CopyOrMoveResult+json");
                Response response;
                response = resourceBuilder.build("POST", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Download {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

         /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Download(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("download");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ArtifactoryApi.Download.Path path(String path) {
            return new ArtifactoryApi.Download.Path(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), path);
        }

        public static class Path {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Path(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Path(Client client, URI baseUri, String path) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{path: .+}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("path", path);
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

            public<T >T getAsOctetStream(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/octet-stream");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsOctetStream(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/octet-stream");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsOctetStream(String content, Integer mark, GenericType<T> returnType) {
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/octet-stream");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/octet-stream");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsTextPlain(String content, Integer mark, GenericType<T> returnType) {
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Move {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Move(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("move");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ArtifactoryApi.Move.Path path(String path) {
            return new ArtifactoryApi.Move.Path(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), path);
        }

        public static class Path {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Path(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Path(Client client, URI baseUri, String path) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{path: .+}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("path", path);
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

            public<T >T postAsVndOrgJfrogArtifactoryStorageCopyOrMoveResultJson(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.CopyOrMoveResult+json");
                Response response;
                response = resourceBuilder.build("POST", Entity.entity(input, "*/*")).invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T postAsVndOrgJfrogArtifactoryStorageCopyOrMoveResultJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.CopyOrMoveResult+json");
                Response response;
                response = resourceBuilder.build("POST", Entity.entity(input, "*/*")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Repositories {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Repositories(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("repositories");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsVndOrgJfrogArtifactoryRepositoriesRepositoryDetailsListJson(GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.repositories.RepositoryDetailsList+json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T getAsVndOrgJfrogArtifactoryRepositoriesRepositoryDetailsListJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.repositories.RepositoryDetailsList+json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T getAsVndOrgJfrogArtifactoryRepositoriesRepositoryDetailsListJson(String type, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (type == null) {
            }
            if (type!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("type", type);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("type", ((Object[]) null));
            }
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.repositories.RepositoryDetailsList+json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
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
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.repositories.RepositoryDetailsList+json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T postXWwwFormUrlencoded(Object input, GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/x-www-form-urlencoded")).invoke();
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T postXWwwFormUrlencoded(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
            Response response;
            response = resourceBuilder.build("POST", Entity.entity(input, "application/x-www-form-urlencoded")).invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public ArtifactoryApi.Repositories.RepoKeyConfiguration repoKeyConfiguration(String repokey) {
            return new ArtifactoryApi.Repositories.RepoKeyConfiguration(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), repokey);
        }

        public static class RepoKeyConfiguration {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private RepoKeyConfiguration(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public RepoKeyConfiguration(Client client, URI baseUri, String repokey) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{repoKey}/configuration");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("repoKey", repokey);
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

            public<T >T getAsVndOrgJfrogArtifactoryRepositoriesRepositoryConfigurationJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.repositories.RepositoryConfiguration+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryRepositoriesRepositoryConfigurationJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.repositories.RepositoryConfiguration+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Search {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Search(Client client, URI baseUri) {
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

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Archive(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("archive");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArchiveEntrySearchResultJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArchiveEntrySearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArchiveEntrySearchResultJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArchiveEntrySearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArchiveEntrySearchResultJson(String name, String repos, GenericType<T> returnType) {
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArchiveEntrySearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArchiveEntrySearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Artifact {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Artifact(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("artifact");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactSearchResultJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArtifactSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactSearchResultJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArtifactSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactSearchResultJson(String name, String repos, GenericType<T> returnType) {
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArtifactSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArtifactSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Creation {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Creation(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("creation");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactCreationResultJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArtifactCreationResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactCreationResultJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArtifactCreationResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactCreationResultJson(Long from, Long to, GenericType<T> returnType) {
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArtifactCreationResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArtifactCreationResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Gavc {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Gavc(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("gavc");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchGavcSearchResultJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.GavcSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchGavcSearchResultJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.GavcSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchGavcSearchResultJson(String g, String a, String v, String c, String repos, GenericType<T> returnType) {
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.GavcSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.GavcSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Prop {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Prop(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("prop");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchMetadataSearchResultJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.MetadataSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchMetadataSearchResultJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.MetadataSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchMetadataSearchResultJson(String repos, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (repos == null) {
                }
                if (repos!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", repos);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("repos", ((Object[]) null));
                }
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.MetadataSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.MetadataSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Usage {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Usage(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("usage");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactUsageResultJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArtifactUsageResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactUsageResultJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArtifactUsageResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchArtifactUsageResultJson(Long notusedsince, String repos, GenericType<T> returnType) {
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArtifactUsageResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.ArtifactUsageResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Xpath {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Xpath(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("xpath");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchXpathSearchResultJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.XpathSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchXpathSearchResultJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.XpathSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactorySearchXpathSearchResultJson(String name, String metadata, String xpath, String val, String repos, GenericType<T> returnType) {
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.XpathSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.search.XpathSearchResult+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Storage {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Storage(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("storage");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ArtifactoryApi.Storage.Path path(String path) {
            return new ArtifactoryApi.Storage.Path(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), path);
        }

        public static class Path {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Path(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Path(Client client, URI baseUri, String path) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{path: .+}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("path", path);
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

            public<T >T getAsVndOrgJfrogArtifactoryStorageFolderInfoJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.FolderInfo+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageFolderInfoJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.FolderInfo+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageFolderInfoJson(String mdns, String md, String properties, GenericType<T> returnType) {
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.FolderInfo+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.FolderInfo+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageFileInfoJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.FileInfo+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageFileInfoJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.FileInfo+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageFileInfoJson(String mdns, String md, String properties, GenericType<T> returnType) {
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.FileInfo+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.FileInfo+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemMetadataNamesJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.ItemMetadataNames+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemMetadataNamesJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.ItemMetadataNames+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemMetadataNamesJson(String mdns, String md, String properties, GenericType<T> returnType) {
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.ItemMetadataNames+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.ItemMetadataNames+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemPropertiesJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.ItemProperties+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemPropertiesJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.ItemProperties+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemPropertiesJson(String mdns, String md, String properties, GenericType<T> returnType) {
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.ItemProperties+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.ItemProperties+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemMetadataJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.ItemMetadata+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemMetadataJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.ItemMetadata+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsVndOrgJfrogArtifactoryStorageItemMetadataJson(String mdns, String md, String properties, GenericType<T> returnType) {
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.ItemMetadata+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.storage.ItemMetadata+json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class System {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public System(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("system");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsXml(GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T getAsXml(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
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

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Configuration(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("configuration");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T postXmlAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T postXmlAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public ArtifactoryApi.System.Configuration.RemoteRepositories remoteRepositories() {
                return new ArtifactoryApi.System.Configuration.RemoteRepositories(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            }

            public static class RemoteRepositories {

                private Client _client;
                private UriBuilder _uriBuilder;
                private Map<String, Object> _templateAndMatrixParameterValues;

                /**
                 * Create new instance using existing Client instance, and a base URI and any parameters
                 * 
                 */
                public RemoteRepositories(Client client, URI baseUri) {
                    _client = client;
                    _uriBuilder = UriBuilder.fromUri(baseUri);
                    _uriBuilder = _uriBuilder.path("remoteRepositories");
                    _templateAndMatrixParameterValues = new HashMap<String, Object>();
                }

                public<T >T putXml(Object input, GenericType<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                    Response response;
                    response = resourceBuilder.build("PUT", Entity.entity(input, "application/xml")).invoke();
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                    return response.readEntity(returnType);
                }

                public<T >T putXml(Object input, Class<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                    Response response;
                    response = resourceBuilder.build("PUT", Entity.entity(input, "application/xml")).invoke();
                    if (!Response.class.isAssignableFrom(returnType)) {
                        if (response.getStatus()>= 400) {
                            throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                        }
                    }
                    if (!Response.class.isAssignableFrom(returnType)) {
                        return response.readEntity(returnType);
                    } else {
                        return returnType.cast(response);
                    }
                }

            }

        }

        public static class Export {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Export(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("export");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T postXml(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T postXml(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                Response response;
                response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Import {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Import(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("import");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T postXmlAs(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T postXmlAs(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
                Response response;
                response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Security {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Security(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("security");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T postXmlAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T postXmlAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("POST", Entity.entity(input, "application/xml")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
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

                private Client _client;
                private UriBuilder _uriBuilder;
                private Map<String, Object> _templateAndMatrixParameterValues;

                /**
                 * Create new instance using existing Client instance, and a base URI and any parameters
                 * 
                 */
                public Logout(Client client, URI baseUri) {
                    _client = client;
                    _uriBuilder = UriBuilder.fromUri(baseUri);
                    _uriBuilder = _uriBuilder.path("logout");
                    _templateAndMatrixParameterValues = new HashMap<String, Object>();
                }

                public Response post() {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                    Response response;
                    response = resourceBuilder.build("POST").invoke();
                    return response;
                }

                public<T >T post(GenericType<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                    Response response;
                    response = resourceBuilder.build("POST").invoke();
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                    return response.readEntity(returnType);
                }

                public<T >T post(Class<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                    Response response;
                    response = resourceBuilder.build("POST").invoke();
                    if (!Response.class.isAssignableFrom(returnType)) {
                        if (response.getStatus()>= 400) {
                            throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                        }
                    }
                    if (!Response.class.isAssignableFrom(returnType)) {
                        return response.readEntity(returnType);
                    } else {
                        return returnType.cast(response);
                    }
                }

            }

            public static class PasswordPolicyPolicyName {

                private Client _client;
                private UriBuilder _uriBuilder;
                private Map<String, Object> _templateAndMatrixParameterValues;

                private PasswordPolicyPolicyName(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                    _client = client;
                    _uriBuilder = uriBuilder.clone();
                    _templateAndMatrixParameterValues = map;
                }

                /**
                 * Create new instance using existing Client instance, and a base URI and any parameters
                 * 
                 */
                public PasswordPolicyPolicyName(Client client, URI baseUri, String policyname) {
                    _client = client;
                    _uriBuilder = UriBuilder.fromUri(baseUri);
                    _uriBuilder = _uriBuilder.path("passwordPolicy/{policyName}");
                    _templateAndMatrixParameterValues = new HashMap<String, Object>();
                    _templateAndMatrixParameterValues.put("policyName", policyname);
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

                public Response post() {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                    Response response;
                    response = resourceBuilder.build("POST").invoke();
                    return response;
                }

                public<T >T post(GenericType<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                    Response response;
                    response = resourceBuilder.build("POST").invoke();
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                    return response.readEntity(returnType);
                }

                public<T >T post(Class<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
                    Response response;
                    response = resourceBuilder.build("POST").invoke();
                    if (!Response.class.isAssignableFrom(returnType)) {
                        if (response.getStatus()>= 400) {
                            throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                        }
                    }
                    if (!Response.class.isAssignableFrom(returnType)) {
                        return response.readEntity(returnType);
                    } else {
                        return returnType.cast(response);
                    }
                }

            }

        }

        public static class Storage {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Storage(Client client, URI baseUri) {
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

                private Client _client;
                private UriBuilder _uriBuilder;
                private Map<String, Object> _templateAndMatrixParameterValues;

                /**
                 * Create new instance using existing Client instance, and a base URI and any parameters
                 * 
                 */
                public Compress(Client client, URI baseUri) {
                    _client = client;
                    _uriBuilder = UriBuilder.fromUri(baseUri);
                    _uriBuilder = _uriBuilder.path("compress");
                    _templateAndMatrixParameterValues = new HashMap<String, Object>();
                }

                public<T >T postAsXml(GenericType<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                    Response response;
                    response = resourceBuilder.build("POST").invoke();
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                    return response.readEntity(returnType);
                }

                public<T >T postAsXml(Class<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                    Response response;
                    response = resourceBuilder.build("POST").invoke();
                    if (!Response.class.isAssignableFrom(returnType)) {
                        if (response.getStatus()>= 400) {
                            throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                        }
                    }
                    if (!Response.class.isAssignableFrom(returnType)) {
                        return response.readEntity(returnType);
                    } else {
                        return returnType.cast(response);
                    }
                }

            }

            public static class Size {

                private Client _client;
                private UriBuilder _uriBuilder;
                private Map<String, Object> _templateAndMatrixParameterValues;

                /**
                 * Create new instance using existing Client instance, and a base URI and any parameters
                 * 
                 */
                public Size(Client client, URI baseUri) {
                    _client = client;
                    _uriBuilder = UriBuilder.fromUri(baseUri);
                    _uriBuilder = _uriBuilder.path("size");
                    _templateAndMatrixParameterValues = new HashMap<String, Object>();
                }

                public<T >T getAsTextPlain(GenericType<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                    Response response;
                    response = resourceBuilder.build("GET").invoke();
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                    return response.readEntity(returnType);
                }

                public<T >T getAsTextPlain(Class<T> returnType) {
                    UriBuilder localUriBuilder = _uriBuilder.clone();
                    WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                    Response response;
                    response = resourceBuilder.build("GET").invoke();
                    if (!Response.class.isAssignableFrom(returnType)) {
                        if (response.getStatus()>= 400) {
                            throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                        }
                    }
                    if (!Response.class.isAssignableFrom(returnType)) {
                        return response.readEntity(returnType);
                    } else {
                        return returnType.cast(response);
                    }
                }

            }

        }

    }

    public static class SystemVersion {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public SystemVersion(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("system/version");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsVndOrgJfrogArtifactorySystemVersionJson(GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.system.Version+json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus()>= 400) {
                throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public<T >T getAsVndOrgJfrogArtifactorySystemVersionJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/vnd.org.jfrog.artifactory.system.Version+json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

    }

    public static class Traffic {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Traffic(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("traffic");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ArtifactoryApi.Traffic.Stream stream() {
            return new ArtifactoryApi.Traffic.Stream(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public static class Stream {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Stream(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("stream");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsTextPlain(Long start, Long end, GenericType<T> returnType) {
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
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
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ArtifactoryApi.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
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
    @SuppressWarnings("serial")
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
