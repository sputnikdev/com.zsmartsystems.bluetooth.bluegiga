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
 * Class to implement the BlueGiga command <b>userWriteResponse</b>.
 * <p>
 * This command is used by the GATT server to acknowledge to the remote device that the
 * attribute's value was written. This feature again allows the user application to
 * acknowledged the attribute write operations instead of the Smart stack doing it
 * automatically. Bluetooth The command should be used when a event is received where the
 * reason why value has changed Value corresponds to
 * attributes_attribute_change_reason_write_request_user. This response must be sent
 * within 30 seconds or otherwise a timeout will occur.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaUserWriteResponseResponse extends BlueGigaResponse {
    public static int COMMAND_CLASS = 0x02;
    public static int COMMAND_METHOD = 0x04;

    /**
     * Response constructor
     */
    public BlueGigaUserWriteResponseResponse(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        // Deserialize the fields
    }


    @Override
    public String toString() {
        return "BlueGigaUserWriteResponseResponse []";
    }
}