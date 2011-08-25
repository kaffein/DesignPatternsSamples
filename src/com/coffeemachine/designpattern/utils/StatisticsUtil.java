package com.coffeemachine.designpattern.utils;


import java.util.List;
/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/25/11
 * Time: 10:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class StatisticsUtil {

    public static float getAverage(List<Float> list) {
        float sum = 0;
        for(Float item : list) {
            sum += item;
        }

        return sum / list.size();
    }
}
