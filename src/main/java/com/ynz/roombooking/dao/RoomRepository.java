package com.ynz.roombooking.dao;

import com.ynz.roombooking.domain.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room,Integer> {
}
