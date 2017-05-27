/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.command.gap;

import com.zsmartsystems.bluetooth.bluegiga.BlueGigaResponse;
import com.zsmartsystems.bluetooth.bluegiga.enumeration.BgApiResponse;

/**
 * Class to implement the BlueGiga command <b>connectDirect</b>.
 * <p>
 * This command will start the GAP direct connection establishment procedure to a dedicated
 * Smart Bluetooth device. The module will enter a state where it continuously scans for the
 * connectable advertisement packets Bluetooth from the remote device which matches the
 * Bluetooth address gives as a parameter. Upon receiving the advertisement packet, the
 * module will send a connection request packet to the target device to imitate a Bluetooth
 * connection. A successful connection will bi indicated by a event. Status If the device is
 * configured to support more than one connection, the smallest connection interval which is
 * divisible by maximum_connections * 2.5ms will be selected. Thus, it is important to provide
 * minimum and maximum connection intervals so that such a connection interval is available
 * within the range. The connection establishment procedure can be cancelled with End
 * Procedure command.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaConnectDirectResponse extends BlueGigaResponse {
    public static int COMMAND_CLASS = 0x06;
    public static int COMMAND_METHOD = 0x03;

    /**
     * 0 : procedure was successfully started Non-zero: An error occurred
     * <p>
     * BlueGiga API type is <i>BgApiResponse</i> - Java type is {@link BgApiResponse}
     */
    private BgApiResponse result;

    /**
     * Connection handle that is reserved for new connection
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int connection_handle;

    /**
     * Response constructor
     */
    public BlueGigaConnectDirectResponse(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        // Deserialize the fields
        result = deserializeBgApiResponse();
        connection_handle = deserializeUInt8();
    }

    /**
     * 0 : procedure was successfully started Non-zero: An error occurred
     * <p>
     * BlueGiga API type is <i>BgApiResponse</i> - Java type is {@link BgApiResponse}
     *
     * @return the current result as {@link BgApiResponse}
     */
    public BgApiResponse getResult() {
        return result;
    }

    /**
     * Connection handle that is reserved for new connection
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     *
     * @return the current connection_handle as {@link int}
     */
    public int getConnection_handle() {
        return connection_handle;
    }


    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaConnectDirectResponse [result=");
        builder.append(result);
        builder.append(", connection_handle=");
        builder.append(connection_handle);
        builder.append("]");
        return builder.toString();
    }
}