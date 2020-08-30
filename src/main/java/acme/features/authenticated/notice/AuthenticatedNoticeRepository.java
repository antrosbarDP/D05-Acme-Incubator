
package acme.features.authenticated.notice;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.notices.Notice;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedNoticeRepository extends AbstractRepository {

	@Query("select n from Notice n where NOW() <= n.deadline ")
	Collection<Notice> findMany();

	@Query("select n from Notice n where n.id=?1")
	Notice findOneById(int id);
}
