package placement;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Certificate_Service_Controller
{
	@Autowired(required=true)
	private Certificate_Service service;
	@GetMapping("/certificateservice")
	public java.util.List<Certificate> list()
	{
	return service.listAll();
	}
	@GetMapping("/certificateservice/{st_id}")
	public ResponseEntity<Certificate> get(@PathVariable Integer cf_id)
	{
	try
	{
	Certificate stud=service.get(cf_id);
	return new ResponseEntity<Certificate>(stud,HttpStatus.OK);
	}
	catch(NoResultException e)
	{
	return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
	}
	}
	@PostMapping("/certificateservice")
	public void add(@RequestBody Certificate stud)
	{
	service.save(stud);
	}
	@PutMapping("/certificateservice/{cf_id}")
	public ResponseEntity<?> update(@RequestBody Certificate stud, @PathVariable Integer
	cf_id)
	{
	Certificate existstud=service.get(cf_id);
	service.save(existstud);
	return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/certificateservice/{cf_id}")
	public void delete(@PathVariable Integer cf_id)
	{
	service.delete(cf_id);
	}
}
