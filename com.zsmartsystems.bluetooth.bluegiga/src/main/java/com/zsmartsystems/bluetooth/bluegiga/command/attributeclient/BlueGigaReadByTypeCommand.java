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
 * Class to implement the BlueGiga command <b>readByType</b>.
 * <p>
 * The command reads the value of each attribute of a given type (UUID) and in a given attribute
 * handle range. The command can for example be used to discover the characteristic
 * declarations (UUID: 0x2803) within a service.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaReadByTypeCommand extends BlueGigaCommand {
    public static int COMMAND_CLASS = 0x04;
    public static int COMMAND_METHOD = 0x02;

    /**
     * Connection handle
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int connection;

    /**
     * First attribute handle
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     */
    private int start;

    /**
     * Last attribute handle
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     */
    private int end;

    /**
     * Attribute type (UUID)
     * <p>
     * BlueGiga API type is <i>uint8array</i> - Java type is {@link int[]}
     */
    private int[] uint8array;

    /**
     * Connection handle
     *
     * @param connection the connection to set as {@link int}
     */
    public void setConnection(int connection) {
        this.connection = connection;
    }
    /**
     * First attribute handle
     *
     * @param start the start to set as {@link int}
     */
    public void setStart(int start) {
        this.start = start;
    }
    /**
     * Last attribute handle
     *
     * @param end the end to set as {@link int}
     */
    public void setEnd(int end) {
        this.end = end;
    }
    /**
     * Attribute type (UUID)
     *
     * @param uint8array the uint8array to set as {@link int[]}
     */
    public void setUint8array(int[] uint8array) {
        this.uint8array = uint8array;
    }

    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(COMMAND_CLASS, COMMAND_METHOD);

        // Serialize the fields
        serializeUInt8(connection);
        serializeUInt16(start);
        serializeUInt16(end);
        serializeUInt8Array(uint8array);

        return getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaReadByTypeCommand [connection=");
        builder.append(connection);
        builder.append(", start=");
        builder.append(start);
        builder.append(", end=");
        builder.append(end);
        builder.append(", uint8array=");
        for (int c = 0; c < uint8array.length; c++) {
            if (c > 0) {
                builder.append(' ');
            }
            builder.append(String.format("%02X", uint8array[c]));
        }
        builder.append(']');
        return builder.toString();
    }
}
