package org.scoula.travel.dao;

import org.scoula.travel.domain.TravelImageVO;
import org.scoula.travel.domain.TravelVO;

public interface TravelDao {
    void insert(TravelVO travel);

    void insertImage(TravelImageVO imageVO); //예외처리 안하네? -> runtime exception으로 교체하겠구나!
}
