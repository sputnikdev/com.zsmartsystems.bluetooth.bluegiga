package com.zsmartsystems.bluetooth.bluegiga;

import com.zsmartsystems.bluetooth.bluegiga.enumeration.BgApiResponse;

public class BlueGigaResponse extends BlueGigaPacket {
    private int[] buffer = new int[131];
    private int position = 0;

    protected BlueGigaResponse(int[] inputBuffer) {
        // TODO Auto-generated constructor stub
        buffer = inputBuffer;
        position = 4;
    }

    /**
     * Reads a int8 from the output stream
     *
     * @return value read from input
     */
    protected int deserializeInt8() {
        return buffer[position++];
    }

    /**
     * Reads a uint8 from the output stream
     *
     * @return value read from input
     */
    protected int deserializeUInt8() {
        return buffer[position++];
    }

    /**
     * Reads a uint16 from the output stream
     *
     * @return value read from input
     */
    protected int deserializeUInt16() {
        return buffer[position++] + (buffer[position++] << 8);
    }

    protected BgApiResponse deserializeBgApiResponse() {
        return BgApiResponse.getBgApiResponse(deserializeUInt16());
    }

    protected long deserializeUInt32() {
        return buffer[position++] + (buffer[position++] << 8) + (buffer[position++] << 16) + (buffer[position++] << 24);
    }

    protected int[] deserializeUInt8Array() {
        int length = buffer[position++];
        int[] val = new int[length];

        for (int cnt = 0; cnt < length; cnt++) {
            val[cnt] = deserializeUInt8();
        }

        return val;
    }

    protected String deserializeAddress() {
        StringBuilder builder = new StringBuilder();

        for (int cnt = 0; cnt < 6; cnt++) {
            if (cnt > 0) {
                builder.append(":");
            }
            builder.append(String.format("%02x", buffer[position++]));
        }

        return builder.toString();
    }
}