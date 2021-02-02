package br.com.ibpt.apiibpt.utils;

import br.com.ibpt.apiibpt.model.Ibpt;
import java.lang.reflect.Field;

public class Utils {
    public static void main(String[] args) {
        Class<Ibpt> aClass = Ibpt.class;
        Field[] declaredFields = aClass.getDeclaredFields();
        String json = "{\n";
        for (Field declaredField : declaredFields) {
            String type = declaredField.getType().toString();
            if (type.contains("java.lang.String")) {
                json += "\"" + declaredField.getName() + "\"" + " : \"\",\n";
            }else{
                json += "\"" + declaredField.getName() + "\"" + " : 0,\n";
            }
        }
        System.out.println(json + "\n}");
    }
}
