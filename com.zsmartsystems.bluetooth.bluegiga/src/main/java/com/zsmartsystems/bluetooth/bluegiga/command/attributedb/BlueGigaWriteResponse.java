/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.command.attributedb;

import com.zsmartsystems.bluetooth.bluegiga.BlueGigaResponse;

/**
 * Class to implement the BlueGiga command <b>write</b>.
 * <p>
 * This command writes an attribute's value to the local database.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaWriteResponse extends BlueGigaResponse {
    public static int COMMAND_CLASS = 0x02;
    public static int COMMAND_METHOD = 0x00;

    /**
     * 0: the write was successful. Non-zero: An error occurred
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     */
    private int result;

    /**
     * Response constructor
     */
    public BlueGigaWriteResponse(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        // Deserialize the fields
        result = deserializeUInt16();
    }

    /**
     * 0: the write was successful. Non-zero: An error occurred
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     *
     * @return the current result as {@link int}
     */
    public int getResult() {
        return result;
    }


    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaWriteResponse [result=");
        builder.append(result);
        builder.append("]");
        return builder.toString();
    }
}
