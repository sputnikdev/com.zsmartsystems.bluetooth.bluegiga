/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.command.attributedb;

import com.zsmartsystems.bluetooth.bluegiga.BlueGigaCommand;

/**
 * Class to implement the BlueGiga command <b>sendAttributes</b>.
 * <p>
 * This command will send an attribute value, identified by handle, via a notification or an
 * indication to a remote device, but does not modify the current corresponding value in the
 * local GATT database. If this attribute, identified by handle, does not have notification or
 * indication property, or no remote device has registered for notifications or indications
 * of this attribute, then an error will be returned.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaSendAttributesCommand extends BlueGigaCommand {
    public static int COMMAND_CLASS = 0x02;
    public static int COMMAND_METHOD = 0x02;

    /**
     * Connection handle to send to. Use 0xFF to send to all connected clients which have subscribed
     * to receive the notifications or indications. An error is returned as soon as the first failed
     * transmission occurs.
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int connection;

    /**
     * Attribute handle to send.
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     */
    private int handle;

    /**
     * Data to send
     * <p>
     * BlueGiga API type is <i>uint8array</i> - Java type is {@link int[]}
     */
    private int[] value;
    /**
     * Connection handle to send to. Use 0xFF to send to all connected clients which have subscribed
     * to receive the notifications or indications. An error is returned as soon as the first failed
     * transmission occurs.
     *
     * @param connection the connection to set as {@link int}
     */
    public void setConnection(int connection) {
        this.connection = connection;
    }

    /**
     * Attribute handle to send.
     *
     * @param handle the handle to set as {@link int}
     */
    public void setHandle(int handle) {
        this.handle = handle;
    }

    /**
     * Data to send
     *
     * @param value the value to set as {@link int[]}
     */
    public void setValue(int[] value) {
        this.value = value;
    }


    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(COMMAND_CLASS, COMMAND_METHOD);

        // Serialize the fields
        serializeUInt8(connection);
        serializeUInt16(handle);
        serializeUInt8Array(value);

        return getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaSendAttributesCommand [connection=");
        builder.append(connection);
        builder.append(", handle=");
        builder.append(handle);
        builder.append(", value=");
        builder.append(value);
        builder.append("]");
        return builder.toString();
    }
}
