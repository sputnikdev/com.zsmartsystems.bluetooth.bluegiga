/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.command.system;

import com.zsmartsystems.bluetooth.bluegiga.BlueGigaResponse;

/**
 * Class to implement the BlueGiga command <b>endpointWatermarkTxEvent</b>.
 * <p>
 * This event is generated when the transmit (outgoing) buffer of the endpoint has free space
 * for a number of bytes equal or higher than the value defined by the command Endpoint Set
 * Watermarks. When there is enough free space, data can be sent out of the endpoint by the
 * command Endpoint Tx.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaEndpointWatermarkTxEvent extends BlueGigaResponse {
    public static int COMMAND_CLASS = 0x00;
    public static int COMMAND_METHOD = 0x03;

    /**
     * Endpoint index where data was sent
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int endpoint;

    /**
     * Space available
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int data;

    /**
     * Event constructor
     */
    public BlueGigaEndpointWatermarkTxEvent(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        event = (inputBuffer[0] & 0x80) != 0;

        // Deserialize the fields
        endpoint = deserializeUInt8();
        data = deserializeUInt8();
    }

    /**
     * Endpoint index where data was sent
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     *
     * @return the current endpoint as {@link int}
     */
    public int getEndpoint() {
        return endpoint;
    }
    /**
     * Space available
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     *
     * @return the current data as {@link int}
     */
    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaEndpointWatermarkTxEvent [endpoint=");
        builder.append(endpoint);
        builder.append(", data=");
        builder.append(data);
        builder.append(']');
        return builder.toString();
    }
}
