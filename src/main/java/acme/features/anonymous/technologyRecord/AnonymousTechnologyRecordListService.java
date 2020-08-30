
package acme.features.anonymous.technologyRecord;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.technologyRecords.TechnologyRecord;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousTechnologyRecordListService implements AbstractListService<Anonymous, TechnologyRecord> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AnonymousTechnologyRecordRepository repository;

	// AbstractListService<Administrator,Shout> Interface ---------------------------------------------------------


	@Override
	public boolean authorise(final Request<TechnologyRecord> request) {
		assert request != null;

		return true;
	}

	@Override
	public Collection<TechnologyRecord> findMany(final Request<TechnologyRecord> request) {
		assert request != null;
		Collection<TechnologyRecord> result;
		result = this.repository.findMany();
		return result;
	}

	@Override
	public void unbind(final Request<TechnologyRecord> request, final TechnologyRecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "inventor", "stars", "activitySector");

	}
}
