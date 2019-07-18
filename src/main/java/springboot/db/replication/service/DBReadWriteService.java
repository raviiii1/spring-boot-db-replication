package springboot.db.replication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springboot.db.replication.dao.Person;
import springboot.db.replication.repository.DBReadWriteRepository;

@Service
public class DBReadWriteService {

	@Autowired
	private DBReadWriteRepository dbReadWriteRepository;
	
	@Transactional(readOnly = true)
	public Person getPersonById(Long id) {
		springboot.db.replication.entity.Person p = dbReadWriteRepository.findById(id).get();
		Person pDao = new Person();
		pDao.setEmpid(p.getEmpid());
		pDao.setId(p.getId());
		pDao.setName(p.getName());
		return pDao;
	}
	
	@Transactional(readOnly = false)
	public void savePerson(Person pDao) {
		dbReadWriteRepository.save(new springboot.db.replication.entity.Person(null, pDao.getName(), pDao.getEmpid()));
	}
	
}
