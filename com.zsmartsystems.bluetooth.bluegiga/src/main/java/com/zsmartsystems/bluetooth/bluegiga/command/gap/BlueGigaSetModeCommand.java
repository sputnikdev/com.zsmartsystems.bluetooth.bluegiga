/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.command.gap;

import com.zsmartsystems.bluetooth.bluegiga.BlueGigaCommand;
import com.zsmartsystems.bluetooth.bluegiga.enumeration.GapConnectableMode;
import com.zsmartsystems.bluetooth.bluegiga.enumeration.GapDiscoverableMode;

/**
 * Class to implement the BlueGiga command <b>setMode</b>.
 * <p>
 * This command configures the current GAP discoverability and connectability modes. It can
 * be used to enable advertisements and/or allow connection. The command is also meant to fully
 * stop advertising, when using gap_non_discoverable and gap_non_connectable.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaSetModeCommand extends BlueGigaCommand {
    public static int COMMAND_CLASS = 0x06;
    public static int COMMAND_METHOD = 0x01;

    /**
     * see:GAP Discoverable Mode
     * <p>
     * BlueGiga API type is <i>GapDiscoverableMode</i> - Java type is {@link GapDiscoverableMode}
     */
    private GapDiscoverableMode discover;

    /**
     * see:GAP Connectable Mode
     * <p>
     * BlueGiga API type is <i>GapConnectableMode</i> - Java type is {@link GapConnectableMode}
     */
    private GapConnectableMode connect;

    /**
     * see:GAP Discoverable Mode
     *
     * @param discover the discover to set as {@link GapDiscoverableMode}
     */
    public void setDiscover(GapDiscoverableMode discover) {
        this.discover = discover;
    }
    /**
     * see:GAP Connectable Mode
     *
     * @param connect the connect to set as {@link GapConnectableMode}
     */
    public void setConnect(GapConnectableMode connect) {
        this.connect = connect;
    }

    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(COMMAND_CLASS, COMMAND_METHOD);

        // Serialize the fields
        serializeGapDiscoverableMode(discover);
        serializeGapConnectableMode(connect);

        return getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaSetModeCommand [discover=");
        builder.append(discover);
        builder.append(", connect=");
        builder.append(connect);
        builder.append(']');
        return builder.toString();
    }
}
