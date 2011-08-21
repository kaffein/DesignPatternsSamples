package com.coffeemachine.designpattern.decorators.javaio;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/21/11
 * Time: 1:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class InputTest {

    public static void main(String[] args) {
        int c;

        try{
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(System.getProperty("user.dir") + "/src/com/coffeemachine/designpattern/decorators/javaio" + "/test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
