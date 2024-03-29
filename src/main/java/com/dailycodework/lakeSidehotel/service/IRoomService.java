package com.dailycodework.lakeSidehotel.service;

import com.dailycodework.lakeSidehotel.model.Room;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public interface IRoomService {
    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws Exception;
    List<String> getAllRoomTypes();
    List<Room> getAllRooms();
    byte[] getRoomPhotoByRoomId(Long roomId) throws SQLException;
    void deleteRoom(Long roomId);
    Room updateRoom(Long roomId, String roomType, BigDecimal roomPrice, byte[] photoBytes);
    Optional<Room> getRoomById(Long roomId);
}
