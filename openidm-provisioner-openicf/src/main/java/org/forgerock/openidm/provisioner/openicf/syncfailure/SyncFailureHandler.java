/*
 * Copyright 2013-2015 ForgeRock, AS.
 *
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 */
package org.forgerock.openidm.provisioner.openicf.syncfailure;

import java.util.Map;

import org.forgerock.services.context.Context;

/**
 * A handler interface for liveSync failures.
 *
 */
public interface SyncFailureHandler
{
    /**
     * Handle the sync failure.
     *
     * @param context the request context associated with the invocation
     * @param syncFailure contains the sync failure data
     * @param failureCause the cause of the exception
     * @throws SyncHandlerException when retries are not exceeded
     */
    void invoke(Context context, Map<String, Object> syncFailure, Exception failureCause)
        throws SyncHandlerException;
}
