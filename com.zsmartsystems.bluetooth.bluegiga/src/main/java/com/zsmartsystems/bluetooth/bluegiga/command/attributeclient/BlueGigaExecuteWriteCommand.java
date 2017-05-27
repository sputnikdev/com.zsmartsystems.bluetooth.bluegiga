/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.command.attributeclient;

import com.zsmartsystems.bluetooth.bluegiga.BlueGigaCommand;

/**
 * Class to implement the BlueGiga command <b>executeWrite</b>.
 * <p>
 * This command can be used to execute or cancel a previously queued prepare_write command on a
 * remote device
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaExecuteWriteCommand extends BlueGigaCommand {
    public static int COMMAND_CLASS = 0x04;
    public static int COMMAND_METHOD = 0x0A;

    /**
     * Connection handle
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int connection;

    /**
     * 1: commits queued writes, 0: cancels queued writes
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int commit;
    /**
     * Connection handle
     *
     * @param connection the connection to set as {@link int}
     */
    public void setConnection(int connection) {
        this.connection = connection;
    }

    /**
     * 1: commits queued writes, 0: cancels queued writes
     *
     * @param commit the commit to set as {@link int}
     */
    public void setCommit(int commit) {
        this.commit = commit;
    }


    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(COMMAND_CLASS, COMMAND_METHOD);

        // Serialize the fields
        serializeUInt8(connection);
        serializeUInt8(commit);

        return getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaExecuteWriteCommand [connection=");
        builder.append(connection);
        builder.append(", commit=");
        builder.append(commit);
        builder.append("]");
        return builder.toString();
    }
}
