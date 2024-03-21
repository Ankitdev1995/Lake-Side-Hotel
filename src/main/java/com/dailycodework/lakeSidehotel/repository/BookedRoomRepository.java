package com.dailycodework.lakeSidehotel.repository;

import com.dailycodework.lakeSidehotel.model.BookedRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookedRoomRepository extends JpaRepository<BookedRoom , Integer> {
}
