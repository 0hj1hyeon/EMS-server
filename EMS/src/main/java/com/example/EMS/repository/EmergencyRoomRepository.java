package com.example.EMS.repository;

import com.example.EMS.domain.EmergencyRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface EmergencyRoomRepository extends JpaRepository<EmergencyRoom, Long> {

    // 특정 이름으로 검색하는 메소드
    List<EmergencyRoom> findByName(String name);

    // 특정 위치와 가까운 응급실을 찾는 메소드 (예시)
    List<EmergencyRoom> findByLatitudeAndLongitude(BigDecimal latitude, BigDecimal longitude);
}