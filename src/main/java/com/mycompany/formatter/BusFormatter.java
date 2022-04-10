/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formatter;

import com.mycompany.pojo.Bus;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author Quoc
 */
public class BusFormatter implements Formatter<Bus>{

    @Override
    public String print(Bus t, Locale locale) {
        return String.valueOf(t.getId());
    }

    @Override
    public Bus parse(String string, Locale locale) throws ParseException {
        Bus b = new Bus();
        b.setId(Integer.parseInt(string));
        return b;
    }
    
}
