/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2011-2012 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * http://glassfish.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package jaxrs.examples.client.webdav;

import java.net.URI;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Configurable;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.UriBuilder;

/**
 * Example of Client extension to support WebDAV.
 *
 * @author Marek Potociar
 */
public class WebDavClient implements Client {

    @Override
    public void close() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WebDavTarget target(String uri) throws IllegalArgumentException, NullPointerException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WebDavTarget target(URI uri) throws NullPointerException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WebDavTarget target(UriBuilder uriBuilder) throws NullPointerException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WebDavTarget target(Link link) throws NullPointerException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Invocation.Builder invocation(Link link) throws NullPointerException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Map<String, Object> getProperties() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getProperty(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WebDavClient setProperty(String name, Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<Class<?>> getProviderClasses() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<Object> getProviderInstances() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WebDavClient register(Class<?> providerClass) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WebDavClient register(Class<?> providerClass, int bindingPriority) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WebDavClient register(Class<?> providerClass, Class<?>... contracts) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WebDavClient register(Class<?> providerClass, int bindingPriority, Class<?>... contracts) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WebDavClient register(Object provider) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WebDavClient register(Object provider, int bindingPriority) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WebDavClient register(Object provider, Class<?>... contracts) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WebDavClient register(Object provider, int bindingPriority, Class<?>... contracts) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WebDavClient updateFrom(Configurable configurable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
