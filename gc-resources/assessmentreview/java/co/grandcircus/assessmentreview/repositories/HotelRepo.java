package co.grandcircus.assessmentreview.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.grandcircus.assessmentreview.entities.Hotel;

@Repository
public interface HotelRepo extends JpaRepository<Hotel,Long>{

	@Query(value= "SELECT DISTINCT city FROM hotel", nativeQuery = true)
	List<String> findAllCity();
	
	List<Hotel> findAll();
	List<Hotel> findHotelByCity(String city);
	
}
