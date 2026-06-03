package org.scoula.travel;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class CSVTest1 {
    public static void main(String[] args) throws Exception {
        CSVReader csvReader = new CSVReader(new FileReader("travel.csv"));
        String[] line;
        while((line = csvReader.readNext()) !=null){
            System.out.println(String.join(",", line));
        }
        /*
        readNext() 결과는 내부적으로 이
         line[0] = "1";
         line[1] = "수도권";
         line[2] = "인천 개항장역사문화공간";
         line[3] = "인천광역시 중구";
        * */
        // 이 case는  불편!! -> VO방식으로 사용
    }
}
