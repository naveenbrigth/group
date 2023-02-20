package placement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Certificate_Service
{
	@Autowired
	private Certificate_Service_Repository repo;
	public List<Certificate> listAll()
	{
	return repo.findAll();
	}
	public void save(Certificate cf)
	{
	repo.save(cf);
	}
	public Certificate get(Integer cf_id)
	{
	return repo.findById(cf_id).get();
	}
	public void delete(Integer cf_id)
	{
	repo.deleteById(cf_id);
	}

}
