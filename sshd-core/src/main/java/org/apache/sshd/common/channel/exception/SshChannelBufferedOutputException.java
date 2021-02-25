/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.sshd.common.channel.exception;

/**
 * Used by the {@code BufferedIoOutputStream} to signal a non-recoverable error
 *
 * @author <a href="mailto:dev@mina.apache.org">Apache MINA SSHD Project</a>
 */
public class SshChannelBufferedOutputException extends SshChannelException {
    private static final long serialVersionUID = -8663890657820958046L;

    public SshChannelBufferedOutputException(int channelId, String message) {
        this(channelId, message, null);
    }

    public SshChannelBufferedOutputException(int channelId, Throwable cause) {
        this(channelId, cause.getMessage(), cause);
    }

    public SshChannelBufferedOutputException(int channelId, String message, Throwable cause) {
        super(channelId, message, cause);
    }
}
