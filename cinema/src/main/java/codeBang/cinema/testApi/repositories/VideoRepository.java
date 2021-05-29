package codeBang.cinema.testApi.repositories;

import codeBang.cinema.testApi.domains.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video,Integer> {

}