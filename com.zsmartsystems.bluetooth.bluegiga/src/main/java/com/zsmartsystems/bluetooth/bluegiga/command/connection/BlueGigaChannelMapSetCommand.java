/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.command.connection;

import com.zsmartsystems.bluetooth.bluegiga.BlueGigaCommand;

/**
 * Class to implement the BlueGiga command <b>channelMapSet</b>.
 * <p>
 * This command can be used to set the new Channel Map.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaChannelMapSetCommand extends BlueGigaCommand {
    public static int COMMAND_CLASS = 0x03;
    public static int COMMAND_METHOD = 0x05;

    /**
     * Connection handle.
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int connection;

    /**
     * New Channel Map. Channel Map is 5 bytes array. Each bit corresponds to one channel. 0-bit
     * corresponds to 0 channel. Channel range: 0-36
     * <p>
     * BlueGiga API type is <i>uint8array</i> - Java type is {@link int[]}
     */
    private int[] map;
    /**
     * Connection handle.
     *
     * @param connection the connection to set as {@link int}
     */
    public void setConnection(int connection) {
        this.connection = connection;
    }

    /**
     * New Channel Map. Channel Map is 5 bytes array. Each bit corresponds to one channel. 0-bit
     * corresponds to 0 channel. Channel range: 0-36
     *
     * @param map the map to set as {@link int[]}
     */
    public void setMap(int[] map) {
        this.map = map;
    }


    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(COMMAND_CLASS, COMMAND_METHOD);

        // Serialize the fields
        serializeUInt8(connection);
        serializeUInt8Array(map);

        return getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaChannelMapSetCommand [connection=");
        builder.append(connection);
        builder.append(", map=");
        builder.append(map);
        builder.append("]");
        return builder.toString();
    }
}
