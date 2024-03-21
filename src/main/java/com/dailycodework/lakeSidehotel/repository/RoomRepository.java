package com.dailycodework.lakeSidehotel.repository;

import com.dailycodework.lakeSidehotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room ,Long> {
}
