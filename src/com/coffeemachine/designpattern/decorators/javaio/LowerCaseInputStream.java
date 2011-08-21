package com.coffeemachine.designpattern.decorators.javaio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/21/11
 * Time: 12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] bytes, int offset, int len) throws IOException {
        int result = super.read(bytes, offset, len);
        for (int i = offset;  i < offset + result; i++) {
            bytes[i] = (byte) Character.toLowerCase((char) bytes[i]);
        }

        return result;
    }
}
