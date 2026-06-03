package org.scoula.travel;

import com.opencsv.bean.CsvToBeanBuilder;
import org.scoula.travel.domain.TravelVO;

import java.io.FileReader;
import java.util.List;

// csv 파일을 읽어서 TravelVO 객체 리스트로 변환한 뒤 출력
public class CSVTest2 {
    /*
    * CsvToBeanBuilder : csv 데이터를 java 객체로 자동 변환
    *
    * new CsvToBeanBuilder<변환할클래스타입>(new FileReader("읽을CSV파일경로"))
    * withType(객체 타입.class) : CSV 데이터를 어떤 클래스 타입으로 변환할지 지정
    * build() : 위에서 설정한 내용을 바탕으로 실제 CSV 변환기를 만드는 코드
    * parse() : CSV 파일을 실제로 읽고, 각 줄을 TravelVO 객체로 변환
    * */
    public static void main(String[] args) throws Exception {
        List<TravelVO> travels = new CsvToBeanBuilder<TravelVO>(new FileReader("travel.csv"))
                .withType(TravelVO.class)
                .build()
                .parse();
        travels.forEach(travel -> {
            System.out.println(travel);
        });
        /*
        * 참조표현 가능
        * forEach(System.out::println)
        * */

    }
}
