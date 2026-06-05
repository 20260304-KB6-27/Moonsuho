package org.scoula.travel.dao;

import org.scoula.travel.domain.TravelImageVO;
import org.scoula.travel.domain.TravelVO;

import java.util.*;

public interface TravelDao {
    void insert(TravelVO travel);

    void insertImage(TravelImageVO image); //예외처리 안하네? -> runtime exception으로 교체하겠구나!

    int getTotalCount(); // 전체 데이터 건수 얻기

    List<String> getDistricts(); //권역 목록 얻기

    List<TravelVO> getTravels(); //전체 목록 얻기

    List<TravelVO> getTravels(int page); // 페이지별 목록 얻기

    List<TravelVO> getTravels(String district);//특정 권역의 목록 얻기

    Optional<TravelVO> getTravel(Long no); // 관광지 정보 하나 얻기


}
