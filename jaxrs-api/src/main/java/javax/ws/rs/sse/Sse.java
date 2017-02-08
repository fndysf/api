/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2015-2017 Oracle and/or its affiliates. All rights reserved.
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
package javax.ws.rs.sse;

/**
 * Server-side injectable Server-Sent Event Context.
 * <p>
 * The context provides a way to create {@link OutboundSseEvent} and {@link SseBroadcaster}.
 *
 * @author Marek Potociar (marek.potociar at oracle.com)
 * @since 2.1
 */
public interface Sse {

    /**
     * Get a new SSE outbound event builder.
     *
     * @return SSE outbound event builder.
     */
    OutboundSseEvent.Builder newEvent();

    /**
     * Create new {@link OutboundSseEvent} from provided data.
     * <p>
     * The data can be string only and must not be null.
     *
     * @param data event data.
     * @return created {@code OutboundSseEvent}.
     */
    default OutboundSseEvent newDataEvent(String data) {
        if (data == null) {
            throw new IllegalArgumentException("Parameter 'data' must not be null.");
        }

        return newEvent().data(String.class, data).build();
    }

    /**
     * Create new {@link OutboundSseEvent} from provided data and name.
     *
     * @param data event data.
     * @param name event name. (see {@link OutboundSseEvent#getName()}).
     * @return created {@code OutboundSseEvent}.
     */
    default OutboundSseEvent newDataEvent(String data, String name) {
        if (data == null) {
            throw new IllegalArgumentException("Parameter 'data' must not be null.");
        }

        if (name == null) {
            throw new IllegalArgumentException("Parameter 'name' must not be null.");
        }

        return newEvent().data(String.class, data).name(name).build();
    }

    /**
     * Get a new SSE broadcaster.
     *
     * @return new SSE broadcaster instance.
     */
    SseBroadcaster newBroadcaster();
}
