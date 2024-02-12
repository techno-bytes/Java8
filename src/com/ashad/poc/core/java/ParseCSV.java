package com.ashad.poc.core.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParseCSV {

    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
        Map<String, Map<String, List<String>>> map = new HashMap<>();
        Map<String, List<String>> dataMap = new HashMap<>();
        Map<String, Integer> colunIndexMap = new HashMap<>();
        try {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("D:\\JavaProject\\CSVDemo.csv"));
            int rowIndex = 1;
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] employee = line.split(splitBy);    // use comma as separator`
                buildIndexMap(employee, colunIndexMap);
                System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] + "]");
                List<String> codes = new ArrayList<>();
//                for (String emp : employee) {
                    String frequency = employee[colunIndexMap.get("Frequesncy")];
                    if ("monthly".equalsIgnoreCase(frequency)) {
                        String countryCode = employee[colunIndexMap.get("CountryCode")];
                        String code = employee[colunIndexMap.get("Code")];
                        codes.add(code);
                        Map<String, List<String>> stringStringMap = map.get(frequency);
                        if (stringStringMap == null || stringStringMap.isEmpty()) {
                            dataMap.put(countryCode, codes);
                            map.put(frequency, dataMap);
                        } else {
                            codes = stringStringMap.get(countryCode);
                            codes.add(code);
                        }
                    }
//                }

            }
            System.out.print("map >>>> "+map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void buildIndexMap(String[] employee, Map<String, Integer> colunIndexMap) {
        int rowIndex = 1;
        int columnIndex = 0;
        for (String emp : employee) {
            if (rowIndex == 1) {
                colunIndexMap.put(emp, columnIndex);
                columnIndex++;
            }
        }
    }
}

