/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.command.attributeclient;

import com.zsmartsystems.bluetooth.bluegiga.BlueGigaResponse;

/**
 * Class to implement the BlueGiga command <b>readMultipleResponseEvent</b>.
 * <p>
 * This event is a response to a Read Multiple request.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaReadMultipleResponseEvent extends BlueGigaResponse {
    public static int COMMAND_CLASS = 0x04;
    public static int COMMAND_METHOD = 0x00;

    /**
     * Connection handle
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int connection;

    /**
     * This array contains the concatenated data from the multiple attributes that have been read,
     * up to 22 bytes.
     * <p>
     * BlueGiga API type is <i>uint8array</i> - Java type is {@link int[]}
     */
    private int[] handles;

    /**
     * Event constructor
     */
    public BlueGigaReadMultipleResponseEvent(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        // Deserialize the fields
        connection = deserializeUInt8();
        handles = deserializeUInt8Array();
    }

    /**
     * Connection handle
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     *
     * @return the current connection as {@link int}
     */
    public int getConnection() {
        return connection;
    }

    /**
     * This array contains the concatenated data from the multiple attributes that have been read,
     * up to 22 bytes.
     * <p>
     * BlueGiga API type is <i>uint8array</i> - Java type is {@link int[]}
     *
     * @return the current handles as {@link int[]}
     */
    public int[] getHandles() {
        return handles;
    }


    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaReadMultipleResponseEvent [connection=");
        builder.append(connection);
        builder.append(", handles=");
        builder.append(handles);
        builder.append("]");
        return builder.toString();
    }
}
