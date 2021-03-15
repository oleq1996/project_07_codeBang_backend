package codeBang.cinema.testApi.repositories;

import codeBang.cinema.testApi.domains.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Integer> {
}
